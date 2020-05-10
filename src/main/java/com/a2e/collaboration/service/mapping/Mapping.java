package com.a2e.collaboration.service.mapping;

import com.a2e.collaboration.controllers.commons.UserDTO;
import com.a2e.collaboration.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Random;

@Service
public class Mapping {

    public void mapNewUser(UserDTO userDTO, User user){
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        Calendar date = Calendar.getInstance();
        user.setCreatedOn(date.getTime());
        user.setIsAactive(true);
        user.setIsProspect(true);
        user.setUpdatedOn(date.getTime());
        user.setLastLogin(date.getTime());
        Random random = new Random();
        String otp = String.format("%06d", random.nextInt(1000000));
        user.setUniqueCode("123456");
        date.add(Calendar.MINUTE, 15);
        user.setUniqueCodeExpiration(date.getTime());
    }
}
