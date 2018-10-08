package cn.xuexi.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lenzhao
 * @date 2018/9/10 下午2:01
 * @description TODO
 */
@EnableEurekaServer
@SpringBootApplication
public class YmsEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YmsEurekaApplication.class, args);
    }
}
