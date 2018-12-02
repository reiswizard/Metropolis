package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Kapitalgesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Personengesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Syndikat;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Unternehmen;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Schurke;
/**
 *
 * @author Herbrandt, Poerling, Phan
 *
 */
public abstract class Person {
    private boolean einkommensteuerpflichtig;
    private boolean gewerbesteuerpflichtig;
    private boolean koerperschaftssteuerpflichtig;
    private long einkommen;
    private String name;

    /**Konstruktor f�r Person
     *
     * Weist Person jeweils ein dazugeh�riges Atribut zu, wenn es Instanz einer bestimmten Klasse ist
     *
     * @param name der Name der Instanz
     */

    protected Person(String name) {
        this.name = name;
        if ((this instanceof Buerger) || (this instanceof Personengesellschaft) || (this instanceof Schurke)) {
            this.einkommensteuerpflichtig = true;
        }
        if ((this instanceof Kapitalgesellschaft) || (this instanceof Syndikat)) {
            this.koerperschaftssteuerpflichtig = true;
        }
        if ((this instanceof Unternehmen)) {
            this.gewerbesteuerpflichtig = true;
        }

    }

	/**
	 *
	 * @param name der Name der Instanz
	 * @param einkommen das Einkommen
	 * @throws NegativeIncomeException die Exception f�r negatives Einkommen
	 */
    public Person(String name, long einkommen) throws NegativeIncomeException {
        this(name);
        if (einkommen < 0) {
            throw new NegativeIncomeException("Negatives Einkommen existiert nicht ", einkommen);
        }
        this.einkommen = einkommen;
    }

    /**
     *
     * @return einkommen Einkommen
     */
    public long getEinkommen() {
        return einkommen;
    }

    /**
     *
     * @return class Klasse
     */
    public String getKlasse() {
        return this.getClass().getSimpleName();
    }

/**
 * 
 * @param einkommen Einkommen einer Person
 * @throws NegativeIncomeException kein negatives Einkommen
 */
    public void setEinkommen(long einkommen) throws NegativeIncomeException {
        if (einkommen < 0) {
            throw new NegativeIncomeException("Negatives Einkommen existiert nicht ", einkommen);
        } else {
			this.einkommen = einkommen;
		}
    }

    /**
     *
     * @return name Name
     */
    public String getPersonName() {
        return name;
    }

   /**
    * 
    * @param name Name
    */
    public void setPersonName(String name) {
        this.name = name;
    }

    /**
     *
     * @return einkommenssteuerpflichtig ob einkommenssteuerpflichtig oder nicht
     */
    public boolean isEinkommenssteuerpflichtig()  {
        return this.einkommensteuerpflichtig;
    }

    /**
     *
     * @return gewerbesteuerpflichtig ob gewerbesteuerpflichtig oder nicht
     */
    public boolean isGewerbesteuerpflichtig() {
        return this.gewerbesteuerpflichtig;
    }

    /**
     *
     * @return koerperschaftssteuerpflichtig ob koerperschaftssteuerpflichtig oder nicht
     */
    public boolean isKoerperschaftsteuerpflichtig() {
        return this.koerperschaftssteuerpflichtig;
    }

/**
 * 
 * @param einkommensteuerpflichtig ob einkommensteuerpflichtig oder nicht
 */
    public void setEinkommensteuerpflichtig(boolean einkommensteuerpflichtig) {
        this.einkommensteuerpflichtig = einkommensteuerpflichtig;
    }

}
