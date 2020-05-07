package com.neu.hrm01.controller;

import com.neu.hrm01.entity.Course;
import com.neu.hrm01.entity.Event;
import com.neu.hrm01.service.CourseService;
import com.neu.hrm01.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private EventService eventService;

    @Autowired
    private CourseService courseService;

    @RequestMapping("/events")
    public String allEvents(Model model) {
        List<Event> events = eventService.getAllEvent();
        model.addAttribute("events", events);
        return "allEvents";
    }

    @RequestMapping("/event/{id}")
    public String showEvent(@PathVariable("id") Integer id, Model model) {
        Event event = eventService.getById(id);
        model.addAttribute("event", event);
        return "showEvent";
    }

    @RequestMapping("/course/{id}")
    public String showCourse(@PathVariable("id") Integer id, Model model) {
        Course course = courseService.getById(id);
        model.addAttribute("course", course);
        return "showCourse";
    }

    @RequestMapping("/professional-development")
    public String proDev(Model model) {
        List<Course> pdCourse = courseService.getByType(0);
        model.addAttribute("courses", pdCourse);
        return "programs/pro-dev";
    }

    @RequestMapping("/leadership-training")
    public String leaTra(Model model) {
        List<Course> ltCourse = courseService.getByType(1);
        model.addAttribute("courses", ltCourse);
        return "programs/lea-tra";
    }

    @RequestMapping("/team-development")
    public String tmDev(Model model) {
        List<Course> tdCourse = courseService.getByType(2);
        model.addAttribute("courses", tdCourse);
        return "programs/tm-dev";
    }

}
