package spt.schedule.demo.demos.web;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TestDingshi {
    /**
     * 定时任务方法
     * @Scheduled:设置定时任务
     * cron属性：cron表达式。定时任务触发是时间的一个字符串表达形式
     */
    //@Scheduled(cron="0/2 * * * * ?") //每个2秒执行一次
    @Scheduled(cron="0 48 10 * * *") //每天8：25分秒执行一次
    //@Scheduled(cron="0 0/5 * * * *")  //每5分钟执行一次
    // @Scheduled(cron="0 5 * * * *") //每小时第5分钟执行
    public void scheduledMethod(){
        System.out.println("定时器被触发"+new Date());
    }

}
