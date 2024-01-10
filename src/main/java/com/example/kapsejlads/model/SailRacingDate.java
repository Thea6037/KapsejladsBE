package com.example.kapsejlads.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class SailRacingDate
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sailRacingDate")
    private Set<SailRacingParticipant> sailRacingParticipant;

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

    public Set<SailRacingParticipant> getSailRacingParticipant()
    {
        return sailRacingParticipant;
    }

    public void setSailRacingParticipant(Set<SailRacingParticipant> sailRacingParticipant)
    {
        this.sailRacingParticipant = sailRacingParticipant;
    }
}
