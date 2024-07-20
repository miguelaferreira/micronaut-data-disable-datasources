package com.example;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

@MappedEntity
public record DbEntity(
        @Id
        @GeneratedValue(GeneratedValue.Type.AUTO)
        long id,
        String name
) {
}
