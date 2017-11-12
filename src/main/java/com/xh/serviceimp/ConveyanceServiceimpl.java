package com.xh.serviceimp;

import com.xh.mapper.pojo.ConveyanceMapper;
import com.xh.po.Transport;
import com.xh.po.vo.StringAndString;
import com.xh.po.vo.TotalMessage;
import com.xh.service.ConveyanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConveyanceServiceimpl implements ConveyanceService{
    @Autowired
   private ConveyanceMapper conveyanceMapper;
    //删除物流根据id
    public void deleteByPrimaryKey(Integer transportid) {
        conveyanceMapper.deleteByPrimaryKey(transportid);
    }

    //插物流根据id
    public void insert(Transport record) {
      conveyanceMapper.insert(record);
    }

    //插入物流信息
    public void insertSelective(Transport record) {
       conveyanceMapper.insertSelective(record);
    }

    //根据Id查询物流
    public Transport selectByPrimaryKey(Integer transportid) {

        return conveyanceMapper.selectByPrimaryKey(transportid);
    }

    //根据id更新物流信息
    public void updateByPrimaryKeySelective(Transport record) {
        conveyanceMapper.updateByPrimaryKeySelective(record);
    }
    //更新物流信息
    public void updateByPrimaryKey(Transport record) {
     conveyanceMapper.updateByPrimaryKey(record);
    }
    //查询所有物流信息
    public List<Transport> QuerryAllTranSport() {
        List<Transport> transports=conveyanceMapper.QuerryAllTranSport();
        return transports;
    }

    @Override
    public List<Transport> QueryTransportConfuse(StringAndString stringAndString) {
      List<Transport> transports=conveyanceMapper.QueryTransportConfuse(stringAndString);
        return transports;
    }

    @Override
    public TotalMessage totalTransport() {
       TotalMessage totalMessage= conveyanceMapper.totalTransport();
        return totalMessage;
    }


}
