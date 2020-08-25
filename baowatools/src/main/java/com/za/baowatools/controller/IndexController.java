package com.za.baowatools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST }, origins = "*")
public class IndexController {
    @RequestMapping(value =  {"/setRuleFast","/setRuleFast.html"})
    public String setRuleFast(Model model)
    {
        return "setRule";
    }
    @RequestMapping(value =  {"/index","/index.html"})
    public String index(Model  model)
    {
        return "indexWeb";
    }
}
