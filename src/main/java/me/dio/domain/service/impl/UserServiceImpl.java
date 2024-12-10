package me.dio.domain.service.impl;

import me.dio.domain.model.Account;
import me.dio.domain.model.User;

import me.dio.domain.model.form.UserSignin;
import me.dio.domain.model.form.UserSignup;
import me.dio.domain.repository.AccountRepository;
import me.dio.domain.repository.UserRepository;
import me.dio.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public User createUser(UserSignup userSignup) {
        Optional<User> user = userRepository.findById(userSignup.getId());
        User novoUsuario = new User();
       if(user.isPresent()){
           new IllegalArgumentException("Usuário já existe na base de dados!");
       }else{
           novoUsuario.setName(userSignup.getName());
           novoUsuario.setPassword(userSignup.getPassword());
           Optional<Account> account = accountRepository.findById(userSignup.getAccount().getId());

           if(account.isEmpty()){
               Account account1 = new Account();
               account1.setId(userSignup.getAccount().getId());
               account1.setAgency(userSignup.getAccount().getAgency());
               account1.setBalance(userSignup.getAccount().getBalance());
               account1.setLimit(userSignup.getAccount().getLimit());
               account1.setNumber(userSignup.getAccount().getNumber());
               novoUsuario.setAccount(account1);
           }


       }

        return null;
    }
}
