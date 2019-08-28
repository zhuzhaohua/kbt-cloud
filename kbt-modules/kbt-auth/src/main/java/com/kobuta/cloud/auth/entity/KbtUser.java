package com.kobuta.cloud.auth.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "kbt_user")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class KbtUser implements Serializable {

	private static final long serialVersionUID = 3736492191027800076L;

	@Id
	@GeneratedValue(generator = "jpa-uuid")
    private Long id;
	
    @Column(name = "username",nullable = false)
    private String userName;

    @Column(name = "password",nullable = false)
    private String password;
    
    @Column(name = "nickname")
    private String nickName;
    
    @Column(name = "enabled")
    private int enabled;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "avatar",nullable = false)
    private String avatar;
    
    @Column(name = "regTime")
    private Date regTime;

    @Column(name = "roles")
	private String roles;
}
