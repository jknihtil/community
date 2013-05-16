package org.openinfinity.web.controller;

///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package org.openinfinity.web.controller;
//
//import java.util.Locale;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
///**
// *
// * @author jknihtil
// */
//@Controller
//@RequestMapping(value = "/moderator")
//public class ModeratorController {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
//
//    @RequestMapping(method = RequestMethod.GET)
//    public String moderatorHome(Model model) {
//        LOGGER.info("Moderator page requested");
//
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        String name = auth.getName();
//        model.addAttribute("username", name);
//        
//        return "moderator/moderator";
//    }
//}
