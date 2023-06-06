package com.example.brainstorm;

import org.springframework.stereotype.Component;

@Component //marks the class as spring bean makes it available for DI
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Daily Cricket workout";
    }
}
