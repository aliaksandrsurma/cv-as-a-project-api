package com.asurma.cvasap.api.controller;

import com.asurma.cvasap.api.model.Project;
import com.asurma.cvasap.api.model.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/projects")
public class ProjectEndpointController {

    @Autowired
    private ProjectsRepository repository;

    @GetMapping(params = "all")
    public @ResponseBody Iterable<Project> getProjects(@RequestParam("all") String all) {
        return repository.findAll();
    }

}
