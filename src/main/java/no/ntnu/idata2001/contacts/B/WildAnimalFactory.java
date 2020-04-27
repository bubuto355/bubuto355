package no.ntnu.idata2001.contacts.B;

import java.time.LocalDate;

public class WildAnimalFactory {
    private static WildAnimalFactory single_instance = null;

    public static WildAnimalFactory getInstance(){
        if(single_instance == null){
           single_instance = new WildAnimalFactory();
        }
        return single_instance;
    }

    public ScandinavianWildAnimal newMaleBear(LocalDate arrivalDate,
                                              String name,
                                              LocalDate dateOfBirth,
                                              String address){

        return new MaleIndividual("Bjørn", "Ursus arctos", "Ursidae", arrivalDate, name, dateOfBirth, true, address);

    }
    public ScandinavianWildAnimal newFemaleWolf(LocalDate arrivalDate,
                                                String name,
                                                LocalDate dateOfBirth,
                                                String address,
                                                int noLitters){
        return new FemaleIndividual("Ulv", "Canis Lupus", "Canidae", arrivalDate, name, dateOfBirth, true, address, noLitters);
    }
    public ScandinavianWildAnimal newMaleWolf(LocalDate arrivalDate,
                                              String name,
                                              LocalDate dateOfBirth,
                                              String address){


        return new MaleIndividual("Ulv", "Canis Lupus", "Canidae", arrivalDate, name, dateOfBirth, true, address);
    }
}
