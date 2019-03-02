package com.ssh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.ssh.service.UserBaseInfoService;
import org.springframework.stereotype.Service;

import com.ssh.dao.UserBaseInfoDao;
import com.ssh.entity.UserBaseInfo;

/**
 * @author hbd(modify)
 * Service实现
 */
@Service("UserService")
public class UserBaseInfoServiceImpl implements UserBaseInfoService {

    @Resource(name = "UserBaseInfoDao")
    private UserBaseInfoDao usesBaseInfoDao;

    @Override
    public List<UserBaseInfo> findUserBaseInfo(){
        return usesBaseInfoDao.findUserBaseInfo();
    }

}
