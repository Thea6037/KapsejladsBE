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
    @JoinColumn(name = "sailRacingParticipant", referencedColumnName = "id")
    private SailRacingParticipant sailRacingParticipant;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public SailRacingParticipant getSailRacing()
    {
        return sailRacingParticipant;
    }

    public void setSailRacing(SailRacingParticipant sailRacingParticipant)
    {
        this.sailRacingParticipant = sailRacingParticipant;
    }
}
