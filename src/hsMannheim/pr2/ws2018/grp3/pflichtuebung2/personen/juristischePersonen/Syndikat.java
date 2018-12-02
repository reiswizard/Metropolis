package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import java.util.ArrayList;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Steuerzahler;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Schurke;

/**
 *
 * @author P�rling, Herbrandt, Phan
 *
 */
public class Syndikat extends Organisation implements Steuerzahler {
    //private Schurke[] mitglieder;
    private ArrayList<Schurke> mitglieder = new ArrayList<Schurke>();
    /**
     * 
     * @param name Name
     * @param neuemitglieder neue Mitglieder
     * @throws NegativeIncomeException kein negatives Einkommen
     */
    public Syndikat(String name, Schurke... neuemitglieder) throws NegativeIncomeException {
        super(name);
        for(int i = 0; i<neuemitglieder.length;i++) {
        	this.mitglieder.add(neuemitglieder[i]);
        }
        //this.mitglieder = mitglieder;

        //Einkommenberechnung f�r die Mitglieder
        Schurke[] aktuellerMitglieger = new Schurke[mitglieder.size()];
        aktuellerMitglieger = mitglieder.toArray(aktuellerMitglieger);
        for (int i = 0; i < aktuellerMitglieger.length; i++) {
            // this.einkommen+=mitglieder[i].getEinkommen();
            this.setEinkommen(getEinkommen() + aktuellerMitglieger[i].getEinkommen());
        }

        meldeAnFinanzamt();

    }

    /**
     *
     * @return Schurke[] mit allen Mitgliedern 
     */
    public Schurke[] getMitglieder() {
    	Schurke[] aktuellerMitglieger = new Schurke[mitglieder.size()];
        aktuellerMitglieger = mitglieder.toArray(aktuellerMitglieger);
        return aktuellerMitglieger;
    }

    /**
     * F�gt neue Mitglieder zum Syndikat hinzu, falls diese noch nicht Mitglieds ist
     * Das Einkommen der neuen Mitglieger wird zum Einkommen des Syndikates hinzugef�gt
     * @param neuemitglieder neue Mitglieder
     * @throws NegativeIncomeException kein negatives Einkommen
     */
    public void setMitglieder(Schurke... neuemitglieder) throws NegativeIncomeException {
        //this.mitglieder = mitglieder;
        for(int i = 0; i<neuemitglieder.length;i++) {
        	if (!mitglieder.contains(neuemitglieder[i])){
        		this.mitglieder.add(neuemitglieder[i]);
        		this.setEinkommen(getEinkommen() + neuemitglieder[i].getEinkommen());
        	}
        }
    }

    /**
     * Entferne die �bergebende Mitglieder aus dem Syndikat, falls diese Mitglieds sind,
     * das Einkommen des entfernte Mitglied wird vom einkommen des Syndikates subtrahiert
     * @param austretendeMitglieger Mitglieder die ausgetreten sind
     * @throws NegativeIncomeException kein negatives Einkommen
     */
    public void setMitgliederausgetreten(Schurke...austretendeMitglieger) throws NegativeIncomeException {
    	for(int i = 0; i<austretendeMitglieger.length;i++) {
    		if (mitglieder.contains(austretendeMitglieger[i])){
    			this.mitglieder.remove(austretendeMitglieger[i]);
        		this.setEinkommen(getEinkommen() - austretendeMitglieger[i].getEinkommen());
        	}
        }
    }

    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);

    }

}
