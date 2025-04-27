package com.portfolio.TaskManagerApplication.service;

import com.portfolio.TaskManagerApplication.model.User;
import com.portfolio.TaskManagerApplication.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getCurrentUser() {
        return (User) org.springframework.security.core.context.SecurityContextHolder
                .getContext().getAuthentication().getPrincipal();
    }
}