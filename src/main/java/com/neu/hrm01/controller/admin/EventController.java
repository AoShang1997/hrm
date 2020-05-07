package com.neu.hrm01.controller.admin;

import com.neu.hrm01.entity.Event;
import com.neu.hrm01.entity.User;
import com.neu.hrm01.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RequestMapping("/admin")
@Controller
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    public String allEvents(Model model) {
        List<Event> events = eventService.getAllEvent();
        model.addAttribute("events", events);
        return "admin/event/list";
    }

    @GetMapping("/event")
    public String toAddPage(Model model) {
        return "admin/event/add";
    }

    @GetMapping("/event/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        Event event = eventService.getById(id);
        model.addAttribute("event", event);
        return "admin/event/add";
    }

    @PostMapping("/event")
    public String addEmp(Event event, RedirectAttributes redirectAttributes) {
        System.out.println("--------------"+event);
        eventService.addEvent(event);
        redirectAttributes.addFlashAttribute("msg", "Event Addition Successful");
        return "redirect:/admin/events";
    }

    @PutMapping("/event")
    public String updateEmp(Event event, RedirectAttributes redirectAttributes) {
        System.out.println("-------333-------"+event);
        eventService.update(event);
        redirectAttributes.addFlashAttribute("msg", "Event Update Successful");
        return "redirect:/admin/events";
    }

    @DeleteMapping("/event/{id}")
    public String deleteEmp(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
        eventService.delete(id);
        redirectAttributes.addFlashAttribute("msg", "Event Deletion Successful");
        return "redirect:/admin/events";
    }

}
