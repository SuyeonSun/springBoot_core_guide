package com.example.helloSpringBoot.controller;

import com.example.helloSpringBoot.dto.MemberDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {
    @PostMapping("/addMember")
    public MemberDto addMember(@RequestBody MemberDto member) {
        return member;
    }
}
