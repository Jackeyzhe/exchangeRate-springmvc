package com.jack.web.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class ScheduledSpider {

    @Scheduled(cron = "0 0 * * * ? ")
//    @Scheduled(cron = "0 * * * * ? ")
    public void run() {
        System.out.println("start scheduled .................");
        try {
            Runtime.getRuntime().exec("python /home/jackeyzhe/IdeaProjects/exchangeRate-springmvc/src/main/webapp/python/exchangerate.py");
//            Runtime.getRuntime().exec("python /webapp/python/exchangerate.py");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("stop scheduled .................");
    }
}
