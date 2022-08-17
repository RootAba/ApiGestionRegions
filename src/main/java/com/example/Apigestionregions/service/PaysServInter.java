package com.example.Apigestionregions.service;

import com.example.Apigestionregions.modele.Pays;
import com.example.Apigestionregions.modele.Regions;

import java.util.List;

public interface PaysServInter {

    Pays ajouterPays(Pays pays);

    List<Pays> affichagePays();

    //Methode de modif
    Pays modifierPays(Long idPays,Pays pays);

    String DeletePays(Long idPays);


}
