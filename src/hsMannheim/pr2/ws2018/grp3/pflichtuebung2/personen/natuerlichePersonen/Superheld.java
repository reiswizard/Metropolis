package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import java.util.ArrayList;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;

public class Superheld extends Mutant implements Kaempfer {

    public Superheld(String name, int einkommen, String mutation, String... superkraft) throws NegativeIncomeException {
        super(name, einkommen, mutation, superkraft);
    }

    @Override
    public void setSuperkraft(String... superkraft) {

        this.superkraefte = superkraft;
    }

    @Override
    @SuppressWarnings("unlikely-arg-type")
    public void kaempfe(Mutant gladiator) {
        boolean besiegt = false;
        if (gladiator instanceof Schurke) {
            ArrayList<String> superkraefteliste = new ArrayList<>(gladiator.getSuperkraefte().length);
            for (int i = 0; i < gladiator.getSuperkraefte().length; i++) {
                superkraefteliste.add((gladiator.getSuperkraefte()[i]));
            }

            for (int j = 0; j < this.getSuperkraefte().length; j++) {
                if (superkraefteliste.contains(this.getSuperkraefte()[j])) {
                    ((Schurke) gladiator).setEingesperrt(true);
                    besiegt=true;
                    System.out.println("Schurke wurde besiegt.");
                    
                }

            }
            if(besiegt==false) {
                System.out.println("Superheld wurde besiegt.");
            }

        }
    }
}
    // old solution
    // public void kaempfe(Mutant gladiator) {
    //
    // for (int j = 0; j < this.getSuperkraefte().length; j++) {
    //
    // for (int i = 0; i < gladiator.getSuperkraefte().length; i++) {
    // if (this.superkraefte[j].equals(gladiator.getSuperkraefte()[i])) {
    // // System.out.println("selbe Kraft");
    // ((Schurke) gladiator).setEingesperrt(true);
    // }
    //
    // }
    //
    // }
    //
    // if (((Schurke) gladiator).isEingesperrt() == false)
    // // verloren
    // System.out.println("Held wurde besiegt, Schurke ist entkommen.");
    //
    // else {
    //
    // System.out.println("Der Held gewinnt den Kampf und der Schurke wurde
    // eingesperrt");
    // }
    //
    // }
