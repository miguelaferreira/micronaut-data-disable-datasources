package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

@MicronautTest(environments = "db")
class SomeRepositoryTest {

    @Test
    void test(SomeRepository repository) {
        final List<DbEntity> all = repository.findAll();

        Assertions.assertTrue(all.isEmpty());
    }
}
