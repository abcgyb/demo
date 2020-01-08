package com.example.demoshiro.controller;

import com.example.demoshiro.dto.Student;
import com.example.demoshiro.dto.User;
import com.example.demoshiro.mapper.UserMapper;
import com.example.demoshiro.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: StudentController
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2018-11-13 16:39
 * @Version 1.0
 **/
@Controller
@RequestMapping("/gyb")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private UserMapper userMapper;

    /**
     * @return java.util.List<com.example.demo.animal.Student>
     * @Author GaoYueBin
     * @Description 根据名称查询学生信息
     * @Date 2018/11/14 9:30
     * @Param [name]
     **/
    @ApiOperation(value = "查询学生信息", notes = "查询学生信息")
    @PostMapping(value = "/query")
    @ResponseBody
    public List<Student> query(String name) {
        System.out.printf("此处是测试代码-----");
        return studentService.query(name);
    }

    @RequestMapping(value = "/queryShiro")
    @ResponseBody
    public User queryShiro(String name) {
        System.out.printf("此处是测试代码-----");
        return userMapper.findByUserName(name);
    }

    /**
     * @return void
     * @Author GaoYueBin
     * @Description 根据学生姓名更新学生信息
     * @Date 2018/11/14 9:34
     * @Param [name]
     **/
    @RequestMapping("/update")
    @ResponseBody
    public String updateInfoByName(String name) {
        try {
            studentService.update(name);
            return "更新成功！";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "更新失败！";
    }

    /**
     * @return
     * @Author GaoYueBin
     * @Description 跳转到freemark界面
     * @Date 2018/11/27 17:07
     * @Param
     **/
    @RequestMapping("/info")
    public String showInfo(String name, Model model) {
        Map<String, String> result = new HashMap<>();
        result.put("name", name);
        model.addAllAttributes(result);
        return "freemark";
    }

    /**
     * @return
     * @Author GaoYueBin
     * @Description 跳转到freemark界面
     * @Date 2018/11/27 17:13
     * @Param
     **/
    @RequestMapping(value = "/toDemo")
    public ModelAndView toDemo() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "jack");
        mv.setViewName("freemark");
        return mv;
    }

    /**
     * @return java.lang.String
     * @Author GaoYueBin
     * @Description 测试全局异常捕获
     * @Date 2019/7/3 15:48
     * @Param []
     **/
    @RequestMapping("/testExc")
    @ResponseBody
    public String testExc() {
        List<String> strings = new ArrayList<>();
        System.out.println(strings.get(3));
        return strings.get(3);
    }

}
