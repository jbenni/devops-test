package fr.upem.master2.devops.apprentis.devopsupemws2.resource;



import fr.upem.master2.devops.apprentis.devopsupemws2.model.Personne;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class PersonneResourceTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    void getAll() {
        List<Personne> personnes = this.restTemplate.getForObject("http://localhost:" + port + "/personnes", List.class);
        Assert.assertEquals(0, personnes.size());
    }

    @Test
    void postPersonne() {
    }

    @Test
    void getOne() {
    }
}