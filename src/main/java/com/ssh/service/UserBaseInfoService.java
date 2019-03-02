package com.ssh.service;

import java.util.List;

import com.ssh.entity.UserBaseInfo;

/**
 * @author hbd(modify)
 * Service接口
 */
public interface UserBaseInfoService {

    /**
     * 查询用户信息
     *
     * @return
     */
    public List<UserBaseInfo> findUserBaseInfo();

}
