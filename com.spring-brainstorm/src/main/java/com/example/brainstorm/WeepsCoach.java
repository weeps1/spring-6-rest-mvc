package com.example.brainstorm;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Weeps")
public class WeepsCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Weeps Coach";
    }
}
