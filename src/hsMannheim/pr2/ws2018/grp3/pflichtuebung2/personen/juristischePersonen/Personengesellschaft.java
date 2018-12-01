package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import java.util.ArrayList;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;
/**
 *
 * @author Pörling, Herbrandt, Phan
 *
 */
public class Personengesellschaft extends Unternehmen {
    //private Buerger[] inhaber;
    private ArrayList<Buerger> inhaber = new ArrayList<Buerger>();

    public Personengesellschaft(String name, int gewinn, Buerger... neuerinhaber) throws NegativeIncomeException {
        super(name, gewinn);
        for(int i = 0; i<neuerinhaber.length;i++) {
        	this.inhaber.add(neuerinhaber[i]);
        }
        //this.inhaber = inhaber;
        meldeAnFinanzamt();

    }

    /**
     *
     * @return Array mit allen aktuellen Inhaber der Personengesellschaft
     */
    public Buerger[] getInhaber() {
    	Buerger[] aktuellerInhaber = new Buerger[inhaber.size()];
    	aktuellerInhaber = inhaber.toArray(aktuellerInhaber);
        return aktuellerInhaber;
    }

    /**
     * fügt Inhaber neue Mitglieder hinzu, falls diese keine Inhaber des Unternehmen sind
     * @param neuerinhaber
     */
    public void setInhaber(Buerger...neuerinhaber) {
    	//inhaber.add(neuerinhaber);
    	for(int i = 0; i<neuerinhaber.length;i++) {
    		if (!inhaber.contains(neuerinhaber[i])) {
				this.inhaber.add(neuerinhaber[i]);
			}
        }
        //this.inhaber = inhaber;
    }

    /**
     * Entferne Inhaber aus Inhaberliste, wenn diese ein Inhaber des Unternehmens ist
     * @param austretendeinhaber
     * @throws NegativeIncomeException
     */
    public void setInhaberausgetreten(Buerger...austretendeinhaber) throws NegativeIncomeException {
    	for(int i = 0; i<austretendeinhaber.length;i++) {
    		if (inhaber.contains(austretendeinhaber[i])) {
				this.inhaber.remove(austretendeinhaber[i]);
			}
        }
    	if (inhaber.size()<1) {
			this.setEinkommen(0);
    	}
    }

    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);

    }

}
