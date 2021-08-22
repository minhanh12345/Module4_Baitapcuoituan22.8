package controller;

import model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.I_Staff_Service;
import validate.ValidateStaff;

import javax.validation.Valid;

@Controller
public class controller {
    @Autowired
    I_Staff_Service i_staff_service;
    @Autowired
    ValidateStaff validateStaff;

    @GetMapping("/show")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("show");
        modelAndView.addObject("list", i_staff_service.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView getCreate() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("staff", new Staff());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView postCreate(@Valid @ModelAttribute Staff staff, BindingResult bindingResult) {
        validateStaff.validate(staff, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("create");
            modelAndView.addObject("staff", staff);
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("redirect:/show");
        i_staff_service.save(staff);
        return modelAndView;
    }

    @GetMapping("/edit")
    public ModelAndView getEdit(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("staff", i_staff_service.findById(id));
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView postEdit(@ModelAttribute Staff staff) {
        ModelAndView modelAndView = new ModelAndView("redirect:/show");
        i_staff_service.edit(staff);
        return modelAndView;
    }

    @GetMapping("/delete")
    public ModelAndView getDelete(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/show");
        i_staff_service.delete(i_staff_service.findById(id));
        return modelAndView;
    }

    @GetMapping("/showDetail")
    public ModelAndView getShowDetail(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("showDetail");
        modelAndView.addObject("staff", i_staff_service.findById(id));
        return modelAndView;
    }

    @PostMapping("/showDetail")
    public ModelAndView postShowDetail() {
        return new ModelAndView("redirect:/show");
    }
}
