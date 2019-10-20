package com.controller.people;

import com.domain.people.Learner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.service.people.LearnerService;

import java.util.List;

@Controller
public class LearnerController {

    @Autowired
    private LearnerService service;

    @RequestMapping("/learner")
    public String LearnerPage(Model model) {
        List<Learner> listLearners = service.listAll();
        model.addAttribute("listLearners", listLearners);

        return "LearnerPage";
    }

    @RequestMapping("/learner/new")
    public String showNewLearnerPage(Model model) {
        Learner learner = new Learner();
        model.addAttribute("learner", learner);

        return "NewLearnerPage";
    }

    @RequestMapping(value = "/learner/new/save", method = RequestMethod.POST)
    public String saveLearner(@ModelAttribute("learner") Learner learner) {
        service.save(learner);

        return "redirect:/learner";
    }

    @GetMapping("/learner/edit/{id}")
    public String showEditLearner(@PathVariable("id") String id, Model model) {
        Learner learner = service.get(id);

        model.addAttribute("learner", learner);
        return "EditLearner";
    }

    @RequestMapping(value = "/learner/edit/save", method = RequestMethod.POST)
    public String saveEditedLearner(@ModelAttribute("learner") Learner learner) {
        service.save(learner);

        return "redirect:/learner";
    }

    @RequestMapping("/learner/delete/{id}")
    public String deleteLearner(@PathVariable(name = "id") String id) {
        service.delete(id);
        return "redirect:/learner";
    }


}


