package com.example.demo.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final FlywaySchemaHistoryRepository flywaySchemaHistoryRepository;

    public AdminController(FlywaySchemaHistoryRepository flywaySchemaHistoryRepository) {
        this.flywaySchemaHistoryRepository = flywaySchemaHistoryRepository;
    }

    @GetMapping(path = "")
    public String index(Model model) {
        model.addAttribute("flywaySchemaHistory", flywaySchemaHistoryRepository.findAll());
        return "admin/index";
    }

}
