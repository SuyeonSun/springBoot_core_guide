package com.example.helloSpringBoot.controller;

import com.example.helloSpringBoot.dto.MemberDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    private final Logger LOGGER = LoggerFactory.getLogger(GetController.class);

    @GetMapping("/hello")
    public String getHello() {
        LOGGER.info("getHello 메서드가 호출되었습니다.");
        return "Hello World";
    }

    // PathVariable
    @GetMapping("/{name}")
    public String getName(@PathVariable String name) {
        LOGGER.info("@PathVariable을 통해 들어온 값: {}", name);
        return name;
    }

    // RequestParam
    @GetMapping("/company")
    public String getOrganization(@RequestParam String company, @RequestParam String team) {
        return company + team;
    }

    // 만약 쿼리 스트링에 어떤 값이 들어올지 모른다면 Map 사용
    // ex) id 값이 필수 값이 아닌 경우
    @GetMapping("/requestParamMap")
    public String getRequestParamMap(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();
        param.forEach((key, value) -> sb.append(key + " : " + value + "\n"));
        return sb.toString();
    }

    @GetMapping("/member")
    public MemberDto getMember(MemberDto member) {
        return member;
    }
}
