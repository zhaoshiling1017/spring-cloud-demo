package cn.xuexi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author lenzhao
 * @date 2018/9/10 下午2:53
 * @description TODO
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class YmsConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YmsConsumerApplication.class, args);
    }
}
