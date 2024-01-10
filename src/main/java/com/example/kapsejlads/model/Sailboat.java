package com.example.kapsejlads.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Sailboat
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String boatType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sailboat")
    private Set<SailRacingParticipant> sailRacingParticipant;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;  }

    public String getBoatType()
    {
        return boatType;
    }

    public void setBoatType(String boatType)
    {
        this.boatType = boatType;
    }

    public Set<SailRacingParticipant> getSailRacingParticipant()
    {
        return sailRacingParticipant;
    }

    public void setSailRacingParticipant(Set<SailRacingParticipant> sailRacingParticipant)
    {
        this.sailRacingParticipant = sailRacingParticipant;
    }
}
