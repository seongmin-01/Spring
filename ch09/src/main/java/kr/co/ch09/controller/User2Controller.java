package kr.co.ch09.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// REST API 서비스 컨트롤러 어노테이션
@Slf4j
@RequiredArgsConstructor
@RestController
public class User2Controller {

    @GetMapping("/user2")
    public void list() {

    }

    public void user() {}

    public void register() {}

    public void modify() {}

    public void delete() {}
}
