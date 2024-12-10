package me.dio.domain.model.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserSignin {
    @NotEmpty
    @Size(min = 5, max = 20)
    private String username;
    @NotEmpty
    private String password;

}
