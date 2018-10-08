package cn.xuexi.provider.service;

import cn.xuexi.provider.model.domain.User;
import cn.xuexi.provider.model.dto.UserDto;
import cn.xuexi.provider.model.vo.UserVo;

/**
 * @author lenzhao
 * @date 2018/9/10 上午11:51
 * @description TODO
 */
public interface UserService {

    UserVo getUserVoById(Long userId);

    void saveUser(User user);
}
