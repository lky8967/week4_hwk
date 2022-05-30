package com.sparta.springcore.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PasswordCk {
    private String password;



    public PasswordCk (String password){
        this.password = password;
    }
}
