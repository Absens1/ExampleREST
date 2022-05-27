package ru.absens.lt.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.absens.lt.models.Test2;
import ru.absens.lt.repositories.Test2Repository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Test2Service {
    private final Test2Repository test2Repository;

    public List<Test2> findAll() {
        return test2Repository.findAll();
    }
    public Optional<Test2> findById(Long id) {
        return test2Repository.findById(id);
    }
}
