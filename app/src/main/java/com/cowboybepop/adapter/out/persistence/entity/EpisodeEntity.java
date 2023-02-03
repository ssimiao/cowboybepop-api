package com.cowboybepop.adapter.out.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class EpisodeEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String japaneseTitle;

    @Column
    private Integer nextEpisodeId;

    @Column
    private LocalDate airDate;
}


