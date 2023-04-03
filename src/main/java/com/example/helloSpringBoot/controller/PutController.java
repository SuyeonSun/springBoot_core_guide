package com.example.helloSpringBoot.controller;

import com.example.helloSpringBoot.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {
    @PutMapping("/modifyMember")
    public ResponseEntity<MemberDto> modifyMember(@RequestBody MemberDto member) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(member);
    }
}
