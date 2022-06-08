package com.dc18669.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 声明为Spring MVC 的控制器，并作为Bean 注册道Servlet容器中
@Controller
public class HelloController {

    // 声明式依赖
    @Autowired
    private JdbcTemplateService jdbcTemplateService;

    // 声明根路径请求使用该方法处理逻辑
    @RequestMapping("/")
    public String index(Model model) {
        String name = jdbcTemplateService.getName(1);
        System.out.println("=========================== name : " + name);
        model.addAttribute("name",name);
        return "index";
    }
}