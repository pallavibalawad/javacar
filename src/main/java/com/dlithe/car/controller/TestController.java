package com.dlithe.car.controller;


import com.dlithe.car.dto.PatientDetailsRequest;
import com.dlithe.car.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

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










}
