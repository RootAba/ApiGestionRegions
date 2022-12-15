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
public class Commentaires {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcom;
    private String contenucom;
    @ManyToOne
    private User user;


    @ManyToOne
    private Sitetouristique sitetouristique;
}
