package com.example.helloSpringBoot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {
    // @DeleteMapping("/{email}")
    // public String deleteMember(@PathVariable String email) {
    //     return email;
    // }

    @DeleteMapping("")
    public String deleteMember(@RequestParam String email) {
        return email;
    }
}
