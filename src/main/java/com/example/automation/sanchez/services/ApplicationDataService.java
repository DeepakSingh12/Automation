package com.example.automation.sanchez.services;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.github.javafaker.Faker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class ApplicationDataService {
    
    @Autowired
    private Faker faker;

    private String applicationName;

    public String getApplicationName() {
        

        //return this.applicationName;

        return  this.applicationName == null ? "What's Watt" : this.applicationName;
    }

  
    public String getTimeComp() {
        SimpleDateFormat time_format = new SimpleDateFormat("HH-mm-ss");
        String timeComp = time_format.format(Calendar.getInstance().getTime());
        return timeComp;
    }


    public void setApplicationName() {
        this.applicationName = faker.funnyName().name();
    }

    
}
