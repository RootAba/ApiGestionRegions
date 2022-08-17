package com.example.Apigestionregions.modele;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Regions")
@NoArgsConstructor
@Getter
@Setter

public class Regions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRegions;
    private String codeRegions,nomRegion,superficie,langue,domaine;

    @ManyToOne
private  Pays pays;

    @ManyToOne
    private  Population population;
}
