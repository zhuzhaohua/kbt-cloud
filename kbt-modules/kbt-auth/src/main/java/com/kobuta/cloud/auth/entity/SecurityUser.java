package com.kobuta.cloud.auth.entity;

import java.util.Collections;

public class SecurityUser extends org.springframework.security.core.userdetails.User {

    public SecurityUser(String userName, String password) {
        super(userName, password,true,true,true,true, Collections.emptySet());
    }
}
