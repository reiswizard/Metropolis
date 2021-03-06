package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import java.util.ArrayList;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Steuerzahler;

/**
 *
 * @author Herbrandt.Poerling,Phan
 *
 */
public class Schurke extends Mutant implements Steuerzahler, Kaempfer {
    private boolean eingesperrt = false;
    private boolean schuldig = false;
    /**
     * 
     * @param name Name
     * @param einkommen Einkommen
     * @param mutation Mutation
     * @param superkraft Superkraft
     * @throws NegativeIncomeException kein negatives Einkommen
     */
    public Schurke(String name, long einkommen, String mutation, String superkraft) throws NegativeIncomeException {
        super(name, einkommen, mutation, superkraft);
        // this.setSuperkraft(superkraft);
        meldeAnFinanzamt();

    }

    @Override
    public void setSuperkraft(String... superkraft) {

        this.superkraefte = superkraft;
    }

    /**
     *
     * @return schuldig boolean
     */
    public boolean isSchuldig() {
        return schuldig;
    }

    /**
     *
     * @return eingesperrt boolean
     */
    public boolean isEingesperrt() {
        return eingesperrt;
    }

    /**
     *
     * @param schuldig boolean
     */
    public void setSchuldig(boolean schuldig) {
        this.schuldig = schuldig;
    }

    /**
     *
     * @param eingesperrt boolean
     */
    public void setEingesperrt(boolean eingesperrt) {
        this.eingesperrt = eingesperrt;
    }

    /**
     * f�gt Steuerpflichtige hinzu
     */
    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);

    }

    /**
     * kampf zwischen Schukre und Superheld
     */
    @SuppressWarnings("unlikely-arg-type")
    @Override
    public void kaempfe(Mutant gladiator) {
        boolean besiegt = false;
        if (gladiator instanceof Superheld) {
            ArrayList<String> superkraefteliste = new ArrayList<>(gladiator.getSuperkraefte().length);
            for (int i = 0; i < gladiator.getSuperkraefte().length; i++) {
                superkraefteliste.add((gladiator.getSuperkraefte()[i]));
            }

            for (int j = 0; j < this.getSuperkraefte().length; j++) {
                if (superkraefteliste.contains(this.getSuperkraefte()[j])) {
                    this.eingesperrt = true;
                    besiegt = true;
                    System.out.println(gladiator.getName() + " hat den Kampf gewonnen! " + this.getName() + " wurde eingesperrt!");
                }

            }
            if (besiegt == false) {
                System.out.println(this.getName() + " hat den Kampf gewonnen und macht sich davon!");
            }
        }


    }
    //old solution
    // public void kaempfe(Mutant gladiator) {
    //
    // for (int j = 0; j < gladiator.getSuperkraefte().length; j++) {
    //
    // for (int i = 0; i < this.getSuperkraefte().length; i++) {
    // if (gladiator.superkraefte[j].equals(this.getSuperkraefte()[i])) {
    // // System.out.println("selbe Kraft");
    // this.setEingesperrt(true);
    // }
    //
    // }
    //
    // }
    //
    // if (this.isEingesperrt() == true)
    // // verloren
    // System.out.println("Der Held gewinnt den Kampf und der Schurke wurde
    // eingesperrt");
    // else {
    //
    // System.out.println("Held wurde besiegt, Schurke ist entkommen");
    // }
    // }
}
