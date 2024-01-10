package com.example.kapsejlads.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class SailRacingParticipant
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sailRacingParticipant")
    private Set<SailRacingDate> sailRacingDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sailRacingParticipant")
    private Set<Sailboat> sailboat;

    private int points;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Set<SailRacingDate> getSailRacingDate()
    {
        return sailRacingDate;
    }

    public void setSailRacingDate(Set<SailRacingDate> sailRacingDate)
    {
        this.sailRacingDate = sailRacingDate;
    }

    public Set<Sailboat> getSailboat()
    {
        return sailboat;
    }

    public void setSailboat(Set<Sailboat> sailboat)
    {
        this.sailboat = sailboat;
    }

    public int getPoints()
    {
        return points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }
}
