package com.example.kapsejlads.model;

import jakarta.persistence.*;

@Entity
public class SailRacingDate
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;

    @ManyToOne
    @JoinColumn(name = "sailRacing", referencedColumnName = "id")
    private SailRacing sailRacing;
}
