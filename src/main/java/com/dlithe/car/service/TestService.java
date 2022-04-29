package com.dlithe.car.service;

import com.dlithe.car.dto.PatientDetailsRequest;
import com.dlithe.car.dto.UserDetails;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestService {

    String fetchCarDetails( String carName);

    String registerPatient(PatientDetailsRequest patientDetailsRequest);



    UserDetails getUserDetails(int userid);

}
