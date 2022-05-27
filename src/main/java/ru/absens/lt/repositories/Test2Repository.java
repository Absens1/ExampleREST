package ru.absens.lt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.absens.lt.models.Test1;
import ru.absens.lt.models.Test2;

import java.util.List;

@Repository
public interface Test2Repository extends JpaRepository<Test2, Long>, JpaSpecificationExecutor<Test2> { }