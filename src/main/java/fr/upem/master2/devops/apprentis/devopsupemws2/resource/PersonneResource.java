package fr.upem.master2.devops.apprentis.devopsupemws2.resource;

import fr.upem.master2.devops.apprentis.devopsupemws2.model.Personne;
import fr.upem.master2.devops.apprentis.devopsupemws2.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
public class PersonneResource {

    @Autowired
    private PersonneService personneService;

    @GetMapping("/personnes")
    public Iterable<Personne> getAll() {
        return personneService.getAll();
    }

    @PostMapping("/personnes")
    public Personne postPersonne(@RequestBody Personne personne){
        return personneService.createPersonne(personne);
    }

    @GetMapping("personnes/{id}")
    public Personne getOne(@PathVariable Long id){
        return personneService.getPersonne(id);

    }



}
