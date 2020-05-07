package com.neu.hrm01.controller;

import com.neu.hrm01.entity.User;
import com.neu.hrm01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user,
                        Map<String, Object> map, HttpSession session) {
        System.out.println(user);
        if (userService.login(user) == 1) {
            session.setAttribute("loginUser", user.getEmail());
            return "redirect:/index.html";
        } else {
            map.put("msg", "Wrong password");
            return "login";
        }
    }

}
