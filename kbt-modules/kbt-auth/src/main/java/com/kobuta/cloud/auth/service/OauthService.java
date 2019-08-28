package com.kobuta.cloud.auth.service;

import com.kobuta.cloud.auth.entity.SecurityUser;
import com.kobuta.cloud.auth.entity.KbtUser;
import com.kobuta.cloud.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.stereotype.Service;

@Service
public class OauthService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    @Qualifier("consumerTokenServices")
    ConsumerTokenServices consumerTokenServices;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        KbtUser kbtUser = this.findByUserName(s);

        return new SecurityUser(kbtUser.getUserName(), kbtUser.getPassword());
    }

    public KbtUser findByUserName(String username) {
        KbtUser kbtUser = userRepository.findByUserName(username);

        return kbtUser;
    }

    public boolean revokeToken(String token) {

        return consumerTokenServices.revokeToken(token);
    }
}
