package com.dlithe.car.serviceimp;

import com.dlithe.car.dto.PatientDetailsRequest;
import com.dlithe.car.dto.ProductDetails;
import com.dlithe.car.dto.UserDetails;
import com.dlithe.car.entity.User;
import com.dlithe.car.repository.UserDAO;
import com.dlithe.car.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TestSeviceImpl implements TestService {

    @Autowired
    private UserDAO userDAO;

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
        } else {
            return "give name for the car";
        }
    }

    @Override
    public String registerPatient(PatientDetailsRequest patientDetailsRequest) {


        User user = new User();

        user.setName(patientDetailsRequest.getName());

        user.setAge(patientDetailsRequest.getAge());

        userDAO.save(user);

        return "saved successfully";
    }

    @Override
    public UserDetails getUserDetails(int id) {
        ProductDetails productDetailsResponce =new ProductDetails();
        ProductDetails productDetailsResponce1 =new ProductDetails();
        List<ProductDetails> review = new ArrayList<ProductDetails>();

            Optional<User> user= userDAO.findById(id);

            User user1=user.get();

            UserDetails userDetails= new UserDetails();
            userDetails.setName((user1.getName()));
            userDetails.setAge(user1.getAge());

            productDetailsResponce.setProductName("titan");
            productDetailsResponce.setPrice(100);
            productDetailsResponce.setRatings(5);
            productDetailsResponce.setDescription("good");

            productDetailsResponce1.setProductName("fasttack");
            productDetailsResponce1.setPrice(100);
            productDetailsResponce1.setRatings(5);
            productDetailsResponce1.setDescription("Best");
            review.add(productDetailsResponce);
            review.add(productDetailsResponce1);

            userDetails.setProductReview(review);
            return  userDetails;

    }




   /* @Override
    public List<UserDetails> getUserDetails() {
        List<UserDetails> userDetailsList =new ArrayList<>();

        List<User>  userList= userDAO.findAll();

        for(User user:userList){
            UserDetails userDetails= new UserDetails();
            userDetails.setName((user.getName()));
            userDetails.setAge(user.getAge());
            userDetails.setId(user.getId());
        }
        return userDetailsList;
    }*/


}



