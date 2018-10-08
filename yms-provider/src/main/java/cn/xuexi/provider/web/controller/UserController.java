package cn.xuexi.provider.web.controller;

import cn.xuexi.common.core.controller.BaseController;
import cn.xuexi.common.wrapper.WrapMapper;
import cn.xuexi.common.wrapper.Wrapper;
import cn.xuexi.provider.model.domain.User;
import cn.xuexi.provider.model.dto.UserDto;
import cn.xuexi.provider.model.vo.UserVo;
import cn.xuexi.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.BeanUtils;


/**
 * @author lenzhao
 * @date 2018/9/10 下午12:01
 * @description TODO
 */
@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/queryById/{id}")
    public Wrapper<UserVo> queryUserVoById(@PathVariable Long id) {
        UserVo userVo = userService.getUserVoById(id);
        return WrapMapper.ok(userVo);
    }

    @PostMapping(value = "/save")
    public Wrapper saveUser(@RequestBody UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        userService.saveUser(user);
        return WrapMapper.ok();
    }

}
