package com.example.Apigestionregions.repository;

import com.example.Apigestionregions.modele.Regions;
import com.example.Apigestionregions.modele.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String username);
}
