package io.zipcoder.viewcafe_application.services;

import io.zipcoder.viewcafe_application.repositories.UserRepository;

public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }
}
