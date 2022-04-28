package com.dlithe.car.service;

import com.dlithe.car.dto.PatientDetailsRequest;
import org.springframework.stereotype.Component;

@Component
public interface TestService {

    String fetchCarDetails( String carName);

    String registerPatient(PatientDetailsRequest patientDetailsRequest);
}
