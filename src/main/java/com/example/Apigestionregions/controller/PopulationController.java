package com.example.Apigestionregions.controller;

import com.example.Apigestionregions.modele.Pays;
import com.example.Apigestionregions.modele.Population;
import com.example.Apigestionregions.service.PaysServImplement;
import com.example.Apigestionregions.service.PopServImplement;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/population")
@Api(value = "hello", description = "Toutes les opérations en relations avec la Population")
public class PopulationController {
    @Autowired
    private PopServImplement popServImplement;

    @ApiOperation(value = "Ajout de population")
    @PostMapping("/creation")
    public Population creation(@RequestBody Population population){
        return  popServImplement.ajouterPopulation(population);
    }

    @ApiOperation(value = "Affichage de la liste de la population")
    @GetMapping("/afficher")
    public List<Population> afficher(){
        return  popServImplement.affichagePopu();
    }

    @ApiOperation(value = "Modification de la population")
    @PutMapping("/modifier/{idPop}")
    public Population modifer(@PathVariable Long idPop ,@RequestBody Population population){
        return  popServImplement.modifierPopu(idPop,population);
    }

    @ApiOperation(value = "Suppression de population")
    @DeleteMapping("/supprimer/{idPop}")
    public String supprimer(@PathVariable Long idPop){
        return  popServImplement.DeletePopu(idPop);
    }
}
