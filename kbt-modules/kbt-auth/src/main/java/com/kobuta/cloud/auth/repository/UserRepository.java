package com.kobuta.cloud.auth.repository;

import com.kobuta.cloud.auth.entity.KbtUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<KbtUser,Long> {
	
	KbtUser findByUserName(String userName);

}