package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import java.util.Arrays;
import java.util.List;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;

public class Superheld extends Mutant implements Kaempfer {

    public Superheld(String name, int einkommen, String mutation, String... superkraft) throws NegativeIncomeException {
        super(name, einkommen, mutation, superkraft);

    }

    @Override
    public void setSuperkraft(String... superkraft) {

        this.superkraefte = superkraft;
    }

    /*
     * @SuppressWarnings("unlikely-arg-type") public void kaempfe(Schurke schurke) {
     * 
     * List<String> superkraefteliste = Arrays.asList(superkraefte); // gewonnen
     * if(superkraefteliste.contains(schurke.getSuperkraefte())) {
     * schurke.setEingesperrt(true); } else { // verloren
     * System.out.println("Held wurde besiegt, Schurke ist entkommen."); } }
     */

    @Override
    @SuppressWarnings("unlikely-arg-type")
    public void kaempfe(Mutant gladiator) {
        if (gladiator instanceof Schurke) {
            List<String> superkraefteliste = Arrays.asList(superkraefte);
            // gewonnen
            if (superkraefteliste.contains(((Mutant) gladiator).getSuperkraefte())) {
                ((Schurke) gladiator).setEingesperrt(true);
            } else {
                // verloren
                System.out.println("Held wurde besiegt, Schurke ist entkommen.");
            }

        }

    }

}
