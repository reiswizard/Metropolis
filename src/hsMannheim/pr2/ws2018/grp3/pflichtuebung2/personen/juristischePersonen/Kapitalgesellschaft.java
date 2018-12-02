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
public class Kapitalgesellschaft extends Unternehmen {
	//private Buerger[] gesellschafter;
    private ArrayList<Buerger> gesellschafter = new ArrayList<Buerger>();
    /**
     * 
     * @param name Name
     * @param gewinn Gewinn
     * @param neuergesellschafter neuer Gesellschafter
     * @throws NegativeIncomeException kein negatives Einkommen
     */
    public Kapitalgesellschaft(String name, long gewinn, Buerger... neuergesellschafter) throws NegativeIncomeException {
        super(name, gewinn);
        for(int i = 0; i<neuergesellschafter.length;i++) {
        	this.gesellschafter.add(neuergesellschafter[i]);
        }
        //this.gesellschafter = gesellschafter;
        meldeAnFinanzamt();

    }

    /**
     *
     * @return Buerger[] mit allen Gesellschaftern
     */
    public Buerger[] getGesellschafter() {
    	Buerger[] aktuellerGesellschafter = new Buerger[gesellschafter.size()];
    	aktuellerGesellschafter = gesellschafter.toArray(aktuellerGesellschafter);
        return aktuellerGesellschafter;
    }

    /**
     * FÜgt neue Gesellschafter zum Unternehmen hinzu, falls diese noch keine Gesellschafter des Unternehmen sind
     * @param neuergesellschafter neu eingestellte Gesellschafter
     */
    public void setGesellschafter(Buerger... neuergesellschafter) {
    	for(int i = 0; i<neuergesellschafter.length;i++) {
    		if (!gesellschafter.contains(neuergesellschafter[i])) {
				this.gesellschafter.add(neuergesellschafter[i]);
			}
        }
        //this.gesellschafter = gesellschafter;
    }

    /**
     * Entferne Gesellschafter aus dem Unternehmen, falls diese Gesellschafter des Unternehmen ist
     * @param austretendegesellschafter auszutretende Gesellschafter
     * @throws NegativeIncomeException kein negatives Einkommen
     */
    public void setInhaberausgetreten(Buerger...austretendegesellschafter) throws NegativeIncomeException {
    	for(int i = 0; i<austretendegesellschafter.length;i++) {
    		if (gesellschafter.contains(austretendegesellschafter[i])) {
				this.gesellschafter.remove(austretendegesellschafter[i]);
			}
        }
    	if (gesellschafter.size()<1) {
					this.setEinkommen(0);


    }
    }

    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);

    }

}
