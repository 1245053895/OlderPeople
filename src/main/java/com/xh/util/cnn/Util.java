package com.xh.util.cnn;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.xh.util.cnn.Layer.Size;

public class Util {

    private static Random r=new Random(2);

    public static double[][] randomMatrix(int x, int y) {
        double[][] matrix=new double[x][y]; //matrix 矩阵的意思
        int tag=1;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                matrix[i][j]=(r.nextDouble()-0.05)/10;
            }
        }
        return matrix;
    }

    /**
     * 随机初始化一维向量
     * @param len
     * @return
     */
    public static double[] randomArray(int len) {
        double[] data=new double[len];
        for(int i=0;i<len;i++){
            data[i]=0;
        }
        return data;
    }

    public static int[] randomPerm(int size, int batchSize) {
        Set<Integer> set=new HashSet<Integer>();
        while(set.size()<batchSize){
            set.add(r.nextInt(size));//返回一个大于等于0,小于size的整数
        }
        int[] randPerm=new int[batchSize];
        int i=0;
        for(Integer value:set){
            randPerm[i++]=value;
        }
        return randPerm;
    }
    /**
     * 计算valid模式的卷积
     * @param matrix
     * @param kernel
     * @return
     */
    public static double[][] convnValid(double[][] matrix, double[][] kernel) {
        //kernel = rot180(kernel);
        int m=matrix.length;
        int n=matrix[0].length;
        final int km=kernel.length;
        final int kn=kernel[0].length;
        final int kns=n-kn+1;
        final int kms=m-km+1;
        final double [][] outMatrix=new double[kms][kns];
        for(int i=0;i<kms;i++){
            for(int j=0;j<kns;j++){
                double sum=0.0;
                for(int ki=0;ki<km;ki++){
                    for(int kj=0;kj<kn;kj++){
                        sum+=matrix[i+ki][j+kj]*kernel[ki][kj];
                    }
                    outMatrix[i][j]=sum;
                }
            }
        }
        return outMatrix;
    }
    /**
     * 两个维度相同的矩阵对应元素操作,得到的结果方法mb中，即mb[i][j] = (op_a ma[i][j]) op (op_b mb[i][j])
     * @param ma
     * @param mb
     * @param operatorB
     *            在第mb矩阵上的操作
     * @param operatorA
     *            在ma矩阵元素上的操作
     * @param operator
     * @return
     */
    public static double[][] matrixOp(final double[][] ma,final double[][] mb, final Operator operatorA, Operator operatorB,
                                      OperatorOnTwo operator) {
        final int m=ma.length;
        int n=ma[0].length;
        if(m!=mb.length||n!=mb[0].length){
            throw new RuntimeException("两个矩阵大小不一致 ma.length:" + ma.length
                    + "  mb.length:" + mb.length);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                double a=ma[i][j];
                if(operatorA!=null){
                    a=operatorA.process(a);
                }
                double b=mb[i][j];
                if(operatorB!=null){
                    b=operatorB.process(b);
                }
                mb[i][j]=operator.process(a, b);
            }
        }
        return mb;
    }

    public static double[][] matrixOp(final double[][] ma, Operator operator) {
        final int m=ma.length;
        final int n=ma[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ma[i][j]=operator.process(ma[i][j]);
            }
        }
        return ma;
    }

    public static double[][] sum(double[][][][] errors, int j) {
        int m=errors[0][j].length;
        int n=errors[0][j][0].length;
        double[][] result=new double[m][n];
        for(int mi=0;mi<m;mi++){
            for(int nj=0;nj<n;nj++){
                double sum=0;
                for(int i=0;i<errors.length;i++){
                    sum+=errors[i][j][mi][nj];
                }
                result[mi][nj]=sum;
            }
        }
        return result;
    }

    public static double sum(double[][] error) {
        int m=error.length;
        int n=error[0].length;
        double sum=0.0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=error[i][j];
            }
        }
        return sum;
    }

    public static double sigmod(double x) {
        return 1/(1+Math.pow(Math.E, -x));
    }

    public static double[][] scaleMatrix(final double[][] matrix, Size scale) {
        int m=matrix.length;
        int n=matrix[0].length;
        final int sm=m/scale.x;
        final int sn=n/scale.y;
        final double[][] outMatrix=new double[sm][sn];
        if(sm*scale.x!=m||sn*scale.y!=n){
            throw new RuntimeException("scale不能整除matrix");
        }
        final int size=scale.x*scale.y;
        for(int i=0;i<sm;i++){
            for(int j=0;j<sn;j++){
                double sum=0.0;
                for(int si=i*scale.x;si<(i+1)*scale.x;si++){
                    for(int sj=j*scale.y;sj<(j+1)*scale.y;sj++){
                        sum+=matrix[si][sj];
                    }
                }
                outMatrix[i][j]=sum/size;
            }
        }
        return outMatrix;
    }

    public static int getMaxIndex(double[] out) {
        double max=out[0];
        int index=0;
        for(int i=1;i<out.length;i++){
            if(out[i]>max){
                max=out[i];
                index=i;
            }
        }
        return index;
    }
    /**
     * 对矩阵进行180度旋转,是在matrix的副本上复制，不会对原来的矩阵进行修改
     * @param matrix
     * @return
     */
    public static double[][] rot180(double[][] matrix) {
        matrix = cloneMatrix(matrix);
        int m = matrix.length;
        int n = matrix[0].length;
        // 按列对称进行交换
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n / 2; j++) {
                double tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = tmp;
            }
        }
        // 按行对称进行交换
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m / 2; i++) {
                double tmp = matrix[i][j];
                matrix[i][j] = matrix[m - 1 - i][j];
                matrix[m - 1 - i][j] = tmp;
            }
        }
        return matrix;
    }
    /**
     * 复制矩阵
     * @param matrix
     * @return
     */
    public static double[][] cloneMatrix(double[][] matrix) {
        final int m = matrix.length;
        int n = matrix[0].length;
        final double[][] outMatrix = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                outMatrix[i][j] = matrix[i][j];
            }
        }
        return outMatrix;
    }

    public static double[][] convnFull(double[][] matrix, double[][] kernel) {
        int m = matrix.length;
        int n = matrix[0].length;
        final int km = kernel.length;
        final int kn = kernel[0].length;
        // 扩展矩阵
        final double[][] extendMatrix = new double[m + 2 * (km - 1)][n + 2
                * (kn - 1)];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                extendMatrix[i + km - 1][j + kn - 1] = matrix[i][j];
        }
        return convnValid(extendMatrix, kernel);
    }
    /**
     * 克罗内克积,对矩阵进行扩展
     * @param nextError
     * @param scale
     * @return
     */
    public static double[][] kronecker(double[][] matrix, Size scale) {
        final int m = matrix.length;
        int n = matrix[0].length;
        final double[][] outMatrix = new double[m * scale.x][n * scale.y];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int ki = i * scale.x; ki < (i + 1) * scale.x; ki++) {
                    for (int kj = j * scale.y; kj < (j + 1) * scale.y; kj++) {
                        outMatrix[ki][kj] = matrix[i][j];
                    }
                }
            }
        }
        return outMatrix;
    }



}

