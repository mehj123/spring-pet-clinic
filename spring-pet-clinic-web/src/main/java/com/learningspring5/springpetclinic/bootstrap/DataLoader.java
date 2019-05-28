package com.learningspring5.springpetclinic.bootstrap;

import com.learningspring5.springpetclinic.model.Owner;
import com.learningspring5.springpetclinic.model.Vet;
import com.learningspring5.springpetclinic.services.OwnerService;
import com.learningspring5.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Anas");
        owner1.setLastName("PM");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Mehjabeen");
        owner2.setLastName("Begum");

        ownerService.save(owner2);

        System.out.println("Loaded owners data...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Fathima");
        vet1.setLastName("PA");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Noora");
        vet2.setLastName("PA");

        vetService.save(vet2);

        System.out.println("Loaded vet data...");

    }
}
