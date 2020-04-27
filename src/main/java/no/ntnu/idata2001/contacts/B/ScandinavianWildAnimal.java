package no.ntnu.idata2001.contacts.B;

import java.time.LocalDate;
public interface ScandinavianWildAnimal {

        String getName();
        LocalDate getDateOfBirth();
        int getAge();
        String getAddress();
        void move(String newAddress);
        String printInfo();
        int getNoOfLitters();
        void addLitter(int antall);
        void addNewLitter();
}

