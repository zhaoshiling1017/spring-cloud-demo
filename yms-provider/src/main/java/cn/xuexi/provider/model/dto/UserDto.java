package cn.xuexi.provider.model.dto;

import java.io.Serializable;

/**
 * @author lenzhao
 * @date 2018/9/10 下午12:07
 * @description TODO
 */
public class UserDto implements Serializable {

    private Long id;
    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
