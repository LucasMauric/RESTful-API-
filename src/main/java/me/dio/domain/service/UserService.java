package me.dio.domain.service;

import me.dio.domain.model.User;
import me.dio.domain.model.form.UserSignup;

public interface UserService {
    User findById(Long id);
    User createUser(UserSignup userSignup);

}
