package com.xh.TimerTask;

import com.xh.po.User;
import com.xh.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;
import java.util.TimerTask;

import javax.servlet.ServletContext;

/**
 * 继承 定时器任务类
 *
 */

public class MyTask extends TimerTask {

    public MyTask() {
        super();
    }

    /** 这个代表3点钟的时候执行任务 */
    private static final int C_SCHEDULE_HOUR = 12;

    private static boolean isRunning = false;

    private ServletContext context = null;

    public MyTask(ServletContext context) {
        this.context = context;
    }

 @Autowired
 private UserMessageService userMessageService;
    public void run() {
        Calendar cal = Calendar.getInstance();
        if (!isRunning) {

                isRunning = true;
                context.log("开始执行指定任务");

                /**
                 * 此处写执行任务代码
                 */
                // new YouCode().changeState();
                User user=new User();
                user.setUserA("1");
                userMessageService.updateByPrimaryKeySelective(user);
                isRunning = false;
                context.log("指定任务执行结束");

        } else {
            context.log("上一次任务执行还未结束");
        }
    }

}