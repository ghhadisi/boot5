package com.hss.boot5.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * https://www.jianshu.com/p/c7492aeb35a1
 *
 * cron属性
 *
 * 这是一个时间表达式，可以通过简单的配置就能完成各种时间的配置，我们通过CRON表达式几乎可以完成任意的时间搭配，它包含了六或七个域：
 * Seconds : 可出现", - * /"四个字符，有效范围为0-59的整数
 * Minutes : 可出现", - * /"四个字符，有效范围为0-59的整数
 *Hours : 可出现", - * /"四个字符，有效范围为0-23的整数
 *DayofMonth : 可出现", - * / ? L W C"八个字符，有效范围为0-31的整数
 *Month : 可出现", - * /"四个字符，有效范围为1-12的整数或JAN-DEc
 * DayofWeek : 可出现", - * / ? L C #"四个字符，有效范围为1-7的整数或SUN-SAT两个范围。1表示星期天，2表示星期一， 依次类推
 *Year : 可出现", - * /"四个字符，有效范围为1970-2099年
 *
 *
 * fixedRate属性
 *
 * 该属性的含义是上一个调用开始后再次调用的延时（不用等待上一次调用完成），
 * 这样就会存在重复执行的问题，所以不是建议使用，
 *
 * fixedDelay属性
 *
 * 该属性的功效与上面的fixedRate则是相反的，配置了该属性后会等到方法执行完成后延迟配置的时间再次执行该方法。
 *
 * initialDelay属性
 *
 * 该属性跟上面的fixedDelay、fixedRate有着密切的关系，为什么这么说呢？该属性的作用是第一次执行延迟时间，
 * 只是做延迟的设定，并不会控制其他逻辑，所以要配合fixedDelay或者fixedRate来使用，
 */
@Component
public class PrintTask {
    //每小时10分钟执行一次
    @Scheduled(cron="0 0 12 * * ?")//每天中午十二点触发
    //fixedRate = 1000
    //fixedDelay  = 2000
    //fixedDelay  = 2000, initialDelay = 5000
//    @Scheduled(fixedDelay  = 2000, initialDelay = 5000)
    public void cron() {
        System.out.println("执行测试cron时间:" + new Date(System.currentTimeMillis()));
    }
}
