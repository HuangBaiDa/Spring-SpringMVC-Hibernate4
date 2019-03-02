package com.ssh.dao;

import java.util.List;

import com.ssh.entity.UserBaseInfo;

/**
 * @author hbd(modify)
 * Dao接口
 */
public interface UserBaseInfoDao {

    /**
     * 查询用户信息
     * @return
     */
    public List<UserBaseInfo> findUserBaseInfo();

}
