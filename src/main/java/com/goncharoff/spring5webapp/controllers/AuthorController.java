package com.goncharoff.spring5webapp.controlelrs;

import com.goncharoff.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        System.out.println(authorRepository.findAll());

        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
