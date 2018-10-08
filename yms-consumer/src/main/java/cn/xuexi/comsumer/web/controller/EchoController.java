package cn.xuexi.comsumer.web.controller;

import cn.xuexi.common.core.controller.BaseController;
import cn.xuexi.common.wrapper.WrapMapper;
import cn.xuexi.common.wrapper.Wrapper;
import cn.xuexi.provider.service.EchoFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lenzhao
 * @date 2018/9/10 下午3:25
 * @description TODO
 */
@RestController
@RequestMapping(value = "/echo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class EchoController extends BaseController {

    @Autowired
    private EchoFeignApi echoFeignApi;

    @GetMapping(value = "/{str}")
    public Wrapper<String> echo(@PathVariable("str") String str) {
        String string = echoFeignApi.echo(str);
        return WrapMapper.ok(string);
    }
}
