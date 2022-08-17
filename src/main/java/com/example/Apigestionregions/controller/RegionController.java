package com.example.Apigestionregions.controller;


import com.example.Apigestionregions.modele.Regions;
import com.example.Apigestionregions.service.RegionServImplement;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regions")

@Api(value = "hello", description = "Toutes les opérations concernant la table Région")
public class RegionController {
@Autowired
private RegionServImplement reSeImpt;

    @ApiOperation(value = "Ajout de region en tenant compte du pays et de la population")
    @PostMapping("/creation")
public Regions creation(@RequestBody Regions region){
    return  reSeImpt.AjoutRegion(region);
}

    @ApiOperation(value = "Affichage de la liste des régions avec Pays")
    @GetMapping("/afficher")
public List<Regions> afficher(){
    return  reSeImpt.affichageRegions();
}

    @ApiOperation(value = "Modification  d'une  region en tenant compte du pays et de la population")
@PutMapping("/modifier/{idRegion}")
public Regions modifer(@PathVariable Long idRegion,@RequestBody Regions regions){
    return  reSeImpt.modifierRegion(idRegion,regions);
}
    @ApiOperation(value = "Suppression d'une région")
@DeleteMapping("/supprimer/{idRegion}")
public String supprimer(@PathVariable Long idRegion){
    return  reSeImpt.Delete(idRegion);
}


}
