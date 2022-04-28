package com.dlithe.car.serviceimp;

import com.dlithe.car.dto.PatientDetailsRequest;
import com.dlithe.car.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestSeviceImpl implements TestService {
    @Override
    public String fetchCarDetails(String carName) {

        if (carName != null) {

            switch (carName) {
                case "BMW":
                    return "Best car";
                case "B":
                    return "Good Car";
                default:
                    return "no car found ";
            }
        } else
        {
            return "give name for the car";
        }



    }

    @Override
    public String registerPatient(PatientDetailsRequest patientDetailsRequest) {
        System.out.println(patientDetailsRequest);
        return null;
    }
}
