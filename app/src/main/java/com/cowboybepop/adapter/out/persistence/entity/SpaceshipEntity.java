package com.cowboybepop.adapter.out.persistence.entity;

import jakarta.persistence.*;

@Entity
public class SpaceshipEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String type;

    @Column
    private Integer crewSize;

    @Column
    private String status;
}
