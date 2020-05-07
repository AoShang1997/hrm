package com.neu.hrm01.controller.admin;

import com.neu.hrm01.entity.User;
import com.neu.hrm01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RequestMapping("/admin")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String allUser(Model model) {
        List<User> users = userService.allUser();
        model.addAttribute("users", users);
        return "admin/user/list";
    }

    @GetMapping("/user")
    public String toAddPage(Model model) {
        return "admin/user/add";
    }

    @GetMapping("/user/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "admin/user/add";
    }

    @PostMapping("/user")
    public String addEmp(User user, RedirectAttributes redirectAttributes) {
        System.out.println("--------------"+user);
        int result = userService.register(user);
        if (result == 0) {
            redirectAttributes.addFlashAttribute("msg", "Error, the email has been registered");
            return "redirect:/admin/user";
        } else {
            redirectAttributes.addFlashAttribute("msg", "User Addition Successful");
            return "redirect:/admin/users";
        }
    }

    @PutMapping("/user")
    public String updateEmp(User user, RedirectAttributes redirectAttributes) {
        System.out.println("------1111--------"+user);
        userService.update(user);
        redirectAttributes.addFlashAttribute("msg", "User Update Successful");
        return "redirect:/admin/users";
    }

    @DeleteMapping("/user/{id}")
    public String deleteEmp(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
        userService.delete(id);
        redirectAttributes.addFlashAttribute("msg", "User Deletion Successful");
        return "redirect:/admin/users";
    }

}
