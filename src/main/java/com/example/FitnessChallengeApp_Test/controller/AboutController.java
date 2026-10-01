package com.example.FitnessChallengeApp_Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String showAbout(Model model) {
        model.addAttribute("pageTitle", "Welcome to the FitSquad Hub!");
        model.addAttribute("appName", "FitSquad Hub");
        model.addAttribute("tagline", "Community fitness quests that turn workouts into shared adventures.");
        model.addAttribute("description",
                "FitSquad Hub is a community fitness challenge platform designed to help squad members " +
                "track workouts, earn XP reward points, and stay accountable across monthly quests. " +
                "Whether you are just starting out or pushing advanced limits, every challenge is built " +
                "around clear duration goals and progressive difficulty tiers from Beginner to Advanced.");
        model.addAttribute("mission",
                "Our mission is to make consistency rewarding: log your sessions, climb the leaderboard, " +
                "and celebrate progress with a supportive community that keeps you motivated week after week.");
        return "about";
    }
}