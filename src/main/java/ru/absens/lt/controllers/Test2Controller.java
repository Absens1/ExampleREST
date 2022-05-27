package ru.absens.lt.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.absens.lt.dtos.Test2Dto;
import ru.absens.lt.services.Test2Service;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test2")
public class Test2Controller {
    private final Test2Service test2Service;

    @GetMapping
    public List<Test2Dto> getAllTests2() {
        return test2Service.findAll().stream().map(Test2Dto::new).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Test2Dto getOneTest2ById(@PathVariable Long id) {
        return test2Service.findById(id).map(Test2Dto::new).orElseThrow();
    }
}