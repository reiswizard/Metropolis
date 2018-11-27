/**
 *
 */
package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Kapitalgesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Personengesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Syndikat;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Unternehmen;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Schurke;
/**
 * @author hoang
 *
 */
public abstract class Person {
	protected boolean einkommensteuerpflichtig;
	protected boolean gewerbesteuerpflichtig;
	protected boolean koerperschaftssteuerpflichtig;
	protected int einkommen;

	public Person() { }


	public Person(int einkommen)throws NegativeIncomeException {
		if (einkommen <0)
		{throw new NegativeIncomeException("Negatives Einkommen existiert nicht", einkommen);}
			
		this.einkommen = einkommen;
		
		if((this instanceof Buerger)||(this instanceof Personengesellschaft)||(this instanceof Schurke)) {
		    this.einkommensteuerpflichtig=true;
		}
        if ((this instanceof Kapitalgesellschaft) || (this instanceof Syndikat)) {
            this.koerperschaftssteuerpflichtig = true;
        }
        if ((this instanceof Unternehmen)) {
            this.gewerbesteuerpflichtig = true;
        }
		
	}

	public int getEinkommen() {
		return einkommen;
	}

	//public abstract void steuernzahlen();

	public boolean isEinkommenssteuerpflichtig() {
		return this.einkommensteuerpflichtig;
	}

	public boolean isGewerbesteuerpflichtig() {
	return this.gewerbesteuerpflichtig;
	}

	public boolean isKoerperschaftsteuerpflichtig() {
	return this.koerperschaftssteuerpflichtig;
	}

//	public int getEinkommensteuer(Person...steuerpflichtige) {
//
//		return 0;
//	}
//
//	public int getGewerbesteuer() {
//
//		return 0;
//	}
//
//	public int getKoerperschaftsteuer() {
//
//		return 0;
//	}



}
