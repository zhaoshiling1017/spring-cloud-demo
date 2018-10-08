package cn.xuexi.provider.service.impl;

import cn.xuexi.provider.model.domain.User;
import cn.xuexi.provider.model.vo.UserVo;
import cn.xuexi.provider.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * @author lenzhao
 * @date 2018/9/10 上午11:53
 * @description TODO
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserVo getUserVoById(Long userId) {
        User user = new User();
        user.setId(userId);
        user.setUserName("lenzhao");
        user.setPassword("123456");
        ModelMapper modelMapper = new ModelMapper();
        UserVo userVo = modelMapper.map(user, UserVo.class);
        return userVo;
    }

    @Override
    public void saveUser(final User user) {
        System.out.println("user save...");
    }
}
