package com.example.kapsejlads.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class SailRacingParticipant
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "sailRacingDate", referencedColumnName = "id")
    private SailRacingDate sailRacingDate;

    @ManyToOne
    @JoinColumn(name = "sailboat", referencedColumnName = "id")
    private Sailboat sailboat;

    private int points;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }


    public int getPoints()
    {
        return points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }

    public SailRacingDate getSailRacingDate()
    {
        return sailRacingDate;
    }

    public void setSailRacingDate(SailRacingDate sailRacingDate)
    {
        this.sailRacingDate = sailRacingDate;
    }

    public Sailboat getSailboat()
    {
        return sailboat;
    }

    public void setSailboat(Sailboat sailboat)
    {
        this.sailboat = sailboat;
    }
}
