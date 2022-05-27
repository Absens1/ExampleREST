package ru.absens.lt.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.absens.lt.dtos.Test1Dto;
import ru.absens.lt.services.Test1Service;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test1")
public class Test1Controller {
    private final Test1Service test1Service;

    @GetMapping
    public List<Test1Dto> getAllTests1() {
        return test1Service.findAll().stream().map(Test1Dto::new).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Test1Dto getOneTest1ById(@PathVariable Long id) {
        return test1Service.findById(id).map(Test1Dto::new).orElseThrow();
    }
}
