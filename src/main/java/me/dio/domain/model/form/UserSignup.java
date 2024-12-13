package me.dio.domain.model.form;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import me.dio.domain.model.Account;
import me.dio.domain.model.Card;
import me.dio.domain.model.Feature;
import me.dio.domain.model.New;

import java.util.List;

@Data
public class UserSignup {

    private Long id;
    @NotEmpty
    @Size(min = 5, max = 20)
    private String name;
    @NotEmpty
    private String password;


    @NotEmpty
    private Account account;
    @NotEmpty
    private List<Feature> features;
    @NotEmpty
    private Card card;
    @NotEmpty
    private List<New> news;




}
