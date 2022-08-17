package com.example.Apigestionregions.service;

import com.example.Apigestionregions.modele.Pays;
import com.example.Apigestionregions.modele.Population;

import java.util.List;

public interface PopServInter {


    Population ajouterPopulation(Population population);

    List<Population> affichagePopu();

    //Methode de modif
    Population modifierPopu(Long idPop,Population population);

    String DeletePopu(Long idPop);
}
