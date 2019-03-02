package com.ssh.controller;

import com.ssh.service.UserBaseInfoService;
import com.ssh.entity.UserBaseInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hbd(modify)
 * 控制器
 */
@Controller
@RequestMapping(value = "/spring")
public class SpringController {

    @Resource(name = "UserService")
    private UserBaseInfoService userBaseInfoBiz;

    /**
     * 测试SpringMVC
     *
     * @return
     */
    @RequestMapping(value = "/test", method = {RequestMethod.POST, RequestMethod.GET})
    public String hello() {
        return "/test";
    }

    /**
     * 测试查询
     *
     * @return
     */
    @RequestMapping(value = "/list", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView userList() {
        Map<String, Object> map = new HashMap<>();
        List<UserBaseInfo> userBaseInfos = userBaseInfoBiz.findUserBaseInfo();
        if (userBaseInfos != null) {
            for (UserBaseInfo userBaseInfo : userBaseInfos) {
                System.out.println(userBaseInfo.getName());
            }
        }
        map.put("user", userBaseInfos.get(0));
        return new ModelAndView("list", map);
    }

}
