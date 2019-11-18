package fr.upem.master2.devops.apprentis.devopsupemws2.repository;

import fr.upem.master2.devops.apprentis.devopsupemws2.model.Personne;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PersonneRepository {

    private Map<Long, Personne> personnes = new HashMap<>();

    private Long ids = 0L;

    public Iterable<Personne> findAll(){
        return new ArrayList<>(personnes.values());
    }

    public Personne save(Personne personne) {
        personne.setId(ids++);
        personnes.put(personne.getId(), personne);
        return personne;
    }

    public Personne getOne(Long id) {
        return personnes.get(id);
    }
}
