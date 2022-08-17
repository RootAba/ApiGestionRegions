package com.example.Apigestionregions.repository;

import com.example.Apigestionregions.modele.Population;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopRepository extends JpaRepository<Population,Long> {
}
