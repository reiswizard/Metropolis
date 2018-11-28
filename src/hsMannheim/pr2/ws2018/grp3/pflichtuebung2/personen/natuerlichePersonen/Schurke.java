package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import java.util.Arrays;
import java.util.List;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Steuerzahler;

public class Schurke extends Mutant implements Steuerzahler, Kaempfer {
    private boolean eingesperrt;
    private boolean schuldig;

    public Schurke(String name, int einkommen, String mutation, String superkraft) throws NegativeIncomeException {
        super(name, einkommen, mutation, superkraft);
        // this.setSuperkraft(superkraft);
        meldeAnFinanzamt();

    }

    @Override
    public void setSuperkraft(String... superkraft) {

        this.superkraefte = superkraft;
    }

    // @SuppressWarnings("unlikely-arg-type")
    // public void kaempfe(Superheld superheld) {
    // List<String> superkraefteliste = Arrays.asList(superheld.getSuperkraefte().);
    // // verloren
    // if (superkraefteliste.contains(this.getSuperkraefte())) {
    // this.setEingesperrt(true);
    // } else {
    // // gewonnen
    // System.out.println("Schurke hat den Kampf gewonnen und macht sich triumphal
    // davon");
    // }
    // }

    public boolean isSchuldig() {
        return schuldig;
    }

    public boolean isEingesperrt() {
        return eingesperrt;
    }

    public void setSchuldig(boolean schuldig) {
        this.schuldig = schuldig;
    }

    public void setEingesperrt(boolean eingesperrt) {
        this.eingesperrt = eingesperrt;
    }

    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);

    }

    @SuppressWarnings("unlikely-arg-type")
    @Override
    public void kaempfe(Mutant gladiator) {
        if (gladiator instanceof Superheld) {
            List<String> superkraefteliste = Arrays.asList(gladiator.getSuperkraefte());
            // verloren
            if (superkraefteliste.contains(this.getSuperkraefte())) {
                this.setEingesperrt(true);
            } else {
                // gewonnen
                System.out.println("Schurke hat den Kampf gewonnen und macht sich triumphal davon");
            }
        }
    }
}
