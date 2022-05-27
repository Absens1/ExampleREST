package ru.absens.lt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.absens.lt.models.Test1;

@Repository
public interface Test1Repository extends JpaRepository<Test1, Long>, JpaSpecificationExecutor<Test1> { }