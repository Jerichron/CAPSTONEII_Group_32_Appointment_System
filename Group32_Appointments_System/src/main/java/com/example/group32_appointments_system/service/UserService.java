package com.example.group32_appointments_system.service;

import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.example.group32_appointments_system.dto.UserRegistrationDto;
import com.example.group32_appointments_system.model.User;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
    List<User> getAll();
}
