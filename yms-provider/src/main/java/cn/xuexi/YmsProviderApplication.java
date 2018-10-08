package cn.xuexi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author lenzhao
 * @date 2018/9/10 下午1:55
 * @description TODO
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class YmsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(YmsProviderApplication.class, args);
    }
}
