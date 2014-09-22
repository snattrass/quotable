package com.squidstorm.psst.controllers;

import com.squidstorm.psst.domain.Quote;
import com.squidstorm.psst.service.QuoteRepository;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController
{
    @Autowired
    QuoteRepository quoteRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String weclome(Model model) {
        model.addAttribute("welcome_msg", "Why hellllooooo there");
        model.addAttribute("quotes",getAll());
        return "home";
    }

    public List<Quote> getAll() {
        Iterable<Quote> quotes = quoteRepository.findAll();
        return IteratorUtils.toList(quotes.iterator());
    }
}
