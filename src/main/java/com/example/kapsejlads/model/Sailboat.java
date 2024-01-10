package com.example.kapsejlads.model;

import jakarta.persistence.*;

@Entity
public class Sailboat
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String boatType;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getBoatType()
    {
        return boatType;
    }

    public void setBoatType(String boatType)
    {
        this.boatType = boatType;
    }
}
