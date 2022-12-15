package com.example.Apigestionregions.modele;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Regions")
@NoArgsConstructor
@Getter
@Setter

public class Regions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRegions;
    private String codeRegions,nomRegion,superficie,langue,domaine,image;


    @ManyToOne
private  Pays pays;

    @ManyToOne
    private  Population population;

    @JsonIgnore
    @OneToMany(mappedBy = "regions", cascade = CascadeType.ALL)
    List<Sitetouristique> sitetouristiques = new ArrayList<>();
}
