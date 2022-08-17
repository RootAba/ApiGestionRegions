package com.example.Apigestionregions.controller;

import com.example.Apigestionregions.modele.Pays;
import com.example.Apigestionregions.modele.Regions;
import com.example.Apigestionregions.service.PaysServImplement;
import com.example.Apigestionregions.service.RegionServImplement;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pays")
@Api(value = "hello", description = "Sample hello world application")
public class PaysController {

    @Autowired
    private PaysServImplement paysSeImpt;
    @ApiOperation(value = "Ajout de Pays")
    @PostMapping("/creation")
    public Pays creation(@RequestBody Pays pays){
        return  paysSeImpt.ajouterPays(pays);
    }
    @ApiOperation(value = "Affichage de la liste des Pays")
    @GetMapping("/afficher")
    public List<Pays> afficher(){
        return  paysSeImpt.affichagePays();
    }

    @ApiOperation(value = "Moficiationcd d'un Pays")

    @PutMapping("/modifier/{idPays}")
    public Pays modifer(@PathVariable Long idPays,@RequestBody Pays pays){
        return  paysSeImpt.modifierPays(idPays,pays);
    }


    @ApiOperation(value = "Suppression d'un Pays")
    @DeleteMapping("/supprimer/{idPays}")
    public String supprimer(@PathVariable Long idPays){
        return  paysSeImpt.DeletePays(idPays);
    }

}
