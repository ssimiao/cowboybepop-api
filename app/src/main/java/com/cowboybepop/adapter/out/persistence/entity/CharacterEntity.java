package com.cowboybepop.adapter.out.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CharacterEntity {

    @Id
    @GeneratedValue
    private Long id;
}
