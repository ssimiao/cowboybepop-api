package com.cowboybepop.adapter.out.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class CharacterEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate dateOfBirth;

    @Column
    private Short age;

    @Column
    private String height;

    @Column
    private String hairColor;

    @Column
    private String planetOfOrigin;

    @OneToMany
    private List<SpaceshipEntity> spaceshipEntity;

    @Column
    private String bloodTyoe;

    @ManyToMany
    private List<EpisodeEntity> episodes;

    @Column
    private String status;
}



