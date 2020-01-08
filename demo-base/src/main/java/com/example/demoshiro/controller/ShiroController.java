package com.example.demoshiro.controller;

import com.example.demoshiro.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ShiroController
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-07-08 17:25
 * @Version 1.0
 **/
@Slf4j
@Controller
public class ShiroController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/logout")
    public String logout() {
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            subject.logout();
        }

        return "login";
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String admin() {
        return "success admin";
    }

    @RequestMapping("/unauthorize")
    public String unauthorize() {
        return "unauthorize";
    }

    @RequestMapping("/loginUser")
    public String loginUser(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpSession session) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();

        try {
            subject.login(token);
            User user = (User) subject.getPrincipal();
            session.setAttribute("user", user);
            return "index";
        } catch (Exception e) {
            log.error("验证不通过: {}", e.getMessage());
            return "login";
        }
    }

    /**
     * @return java.lang.String
     * @Author GaoYueBin
     * @Description 测试全局异常捕获
     * @Date 2019/7/3 15:48
     * @Param []
     **/
    @RequestMapping("/testExc1")
    @ResponseBody
    public String testExc() {
        List<String> strings = new ArrayList<>();
        System.out.println(strings.get(3));
        return strings.get(3);
    }
}
