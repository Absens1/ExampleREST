package ru.absens.lt.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.absens.lt.models.Test1;
import ru.absens.lt.repositories.Test1Repository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Test1Service {
    private final Test1Repository test1Repository;

    public List<Test1> findAll() { return test1Repository.findAll(); }
    public Optional<Test1> findById(Long id) {
        return test1Repository.findById(id);
    }
}
