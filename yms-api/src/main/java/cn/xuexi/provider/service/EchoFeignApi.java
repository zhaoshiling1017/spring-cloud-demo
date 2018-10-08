package cn.xuexi.provider.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lenzhao
 * @date 2018/9/10 上午11:23
 * @description EchoFeignApi
 */
@FeignClient(value = "yms-provider")
public interface EchoFeignApi {

    /**
     * @author lenzhao
     * @date 2018/9/10 上午11:22
     * @description echo print
     * @param
     * @return
     */
    @GetMapping(value = "/api/echo/{str}")
    String echo(@PathVariable("str") String str);
}
