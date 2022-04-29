package com.dlithe.car.controller;


import com.dlithe.car.dto.PatientDetailsRequest;
import com.dlithe.car.dto.UserDetails;
import com.dlithe.car.service.TestService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("fetch-car-details/{carName}")
        public String method1(@PathVariable String carName){

        String result= testService.fetchCarDetails(carName);
        return result;
    }

    @PostMapping("register-patient")
    public String registerPatient(@RequestBody PatientDetailsRequest patientDetailsRequest){
        return testService.registerPatient(patientDetailsRequest);
    }

    @GetMapping("get-users/{userid}")
    public UserDetails fetachUserDetails(@PathVariable int userid)
    {
        return testService.getUserDetails(userid);

    }









}
