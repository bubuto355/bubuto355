package no.ntnu.idata2001.contacts.B;

import java.time.LocalDate;
import java.util.logging.Logger;

public class main {
    private static final Logger log = Logger.getLogger(main.class.getName());

    public static void main(String[] args) {
        WildAnimalFactory animfaccc = WildAnimalFactory.getInstance();

        ScandinavianWildAnimal ulla = animfaccc.newMaleWolf(LocalDate.now(), "Britta fitta", LocalDate.now(), "Himmelvegen syttitre");
        ScandinavianWildAnimal gulla = animfaccc.newFemaleWolf(LocalDate.now(), "GRUNTHER", LocalDate.now(), "STRAUMGJERDET", 9001);
        ScandinavianWildAnimal tulla = animfaccc.newMaleWolf(LocalDate.now(), "Yoggiz", LocalDate.now(), "Hos sin mor");

        log.info(ulla.toString());
        log.info(gulla.toString());
        log.info(tulla.toString());
    }
}
