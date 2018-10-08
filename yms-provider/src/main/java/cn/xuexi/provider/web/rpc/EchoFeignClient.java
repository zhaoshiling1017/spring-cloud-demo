package cn.xuexi.provider.web.rpc;

import cn.xuexi.provider.service.EchoFeignApi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lenzhao
 * @date 2018/9/10 上午11:55
 * @description TODO
 */
@RestController
public class EchoFeignClient implements EchoFeignApi {

    @Override
    public String echo(@PathVariable("str") String str) {
        return str;
    }

}
