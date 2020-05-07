package com.neu.hrm01.controller.admin;

import com.neu.hrm01.entity.Course;
import com.neu.hrm01.entity.Event;
import com.neu.hrm01.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RequestMapping("/admin")
@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public String allCourses(Model model) {
        List<Course> courses = courseService.getAllCourse();
        model.addAttribute("courses", courses);
        return "admin/course/list";
    }

    @GetMapping("/course")
    public String toAddPage(Model model) {
        return "admin/course/add";
    }

    @GetMapping("/course/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        Course course = courseService.getById(id);
        model.addAttribute("course", course);
        return "admin/course/add";
    }

    @PostMapping("/course")
    public String addEmp(Course course, RedirectAttributes redirectAttributes) {
        System.out.println("--------------"+course);
        courseService.addCourse(course);
        redirectAttributes.addFlashAttribute("msg", "course Addition Successful");
        return "redirect:/admin/courses";
    }

    @PutMapping("/course")
    public String updateEmp(Course course, RedirectAttributes redirectAttributes) {
        System.out.println("--------------"+course);
        courseService.update(course);
        redirectAttributes.addFlashAttribute("msg", "Course Update Successful");
        return "redirect:/admin/courses";
    }

    @DeleteMapping("/course/{id}")
    public String deleteEmp(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
        courseService.delete(id);
        redirectAttributes.addFlashAttribute("msg", "Course Deletion Successful");
        return "redirect:/admin/courses";
    }

}
