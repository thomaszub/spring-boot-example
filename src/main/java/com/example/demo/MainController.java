package com.example.demo;

import com.example.demo.admin.SearchFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.stream.StreamSupport;

@Controller
@RequestMapping("")
public class MainController {

    private UsersRepository userRepositories;

    public MainController(UsersRepository userRepositories) {
        this.userRepositories = userRepositories;
    }

    @GetMapping(path = "")
    public String index(@ModelAttribute SearchFilter searchFilter, Model model) {
        var users = StreamSupport.stream(userRepositories.findAll().spliterator(), false)
                .filter(user -> user.getUsername().contains(searchFilter.getName()))
                .toList();
        model.addAttribute("users", users);
        System.out.println(searchFilter.getName());
        return "index"; // Name des HTML Schemas.
    }

    @GetMapping(path = "/user")
    public String user(Model model) {
        var newUser = new NewUserRequest();
        model.addAttribute("user", newUser);
        return "user-form";
    }

    @PostMapping(path = "/user")
    public RedirectView userSubmit(@ModelAttribute NewUserRequest request, Model model) {
        var newUser = new User(request.getName() + " " + request.getSurname(), request.getPassword(), request.getEmail());
        userRepositories.save(newUser);
        return new RedirectView("");
    }
}
