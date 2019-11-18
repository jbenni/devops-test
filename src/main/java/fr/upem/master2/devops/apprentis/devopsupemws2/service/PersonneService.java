package fr.upem.master2.devops.apprentis.devopsupemws2.service;

import fr.upem.master2.devops.apprentis.devopsupemws2.model.Personne;
import fr.upem.master2.devops.apprentis.devopsupemws2.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonneService {
    @Autowired
    private PersonneRepository personneRepository;

    public Iterable<Personne> getAll(){
        return personneRepository.findAll();
    }

    public Personne createPersonne(Personne personne) {
        return personneRepository.save(personne);
    }

    public Personne getPersonne(Long id) {
        return personneRepository.getOne(id);
    }
}
