package com.example.kapsejlads;

import com.example.kapsejlads.model.SailRacingDate;
import com.example.kapsejlads.model.Sailboat;
import com.example.kapsejlads.repository.SailRacingDateRepo;
import com.example.kapsejlads.repository.SailboatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner
{

    @Autowired
    private SailboatRepo sailboatRepo;

    @Autowired
    private SailRacingDateRepo sailRacingDateRepo;

    @Override
    public void run(String... args) throws Exception
    {
        Sailboat bigBoat = new Sailboat();
        bigBoat.setBoatType("40foot+");
        sailboatRepo.save(bigBoat);

        Sailboat mediumBoat = new Sailboat();
        mediumBoat.setBoatType("25-40foot");
        sailboatRepo.save(mediumBoat);

        Sailboat smallBoat = new Sailboat();
        smallBoat.setBoatType("25foot-");
        sailboatRepo.save(smallBoat);

        SailRacingDate sailRacingDate = new SailRacingDate();
        sailRacingDate.setDate("22-04-2024");
        sailRacingDateRepo.save(sailRacingDate);

    }


}