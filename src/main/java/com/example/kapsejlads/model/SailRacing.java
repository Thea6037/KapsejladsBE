package com.example.kapsejlads.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

@Entity
public class SailRacing
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sailRacing")
    private Set<SailRacingDate> sailRacingDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sailRacing")
    private Set<Sailboat> sailboat;
}
