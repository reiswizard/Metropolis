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
    private int einkommen;
    private String name;

    /*Konstruktor für Person
     *
     * Weist Person jeweils ein dazugehöriges Atribut zu, wenn es Instanz einer bestimmten Klasse ist
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
	 * @throws NegativeIncomeException die Exception für negatives Einkommen
	 */
    public Person(String name, int einkommen) throws NegativeIncomeException {
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
    public int getEinkommen() {
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
     * Setze Einkommen einer Person
     *
     * @author Pörling, Herbrandt, Phan
     * @param int einkommen Einkommen
     */
    public void setEinkommen(int einkommen) throws NegativeIncomeException {
        if (einkommen < 0) {
            throw new NegativeIncomeException("Negatives Einkommen existiert nicht ", einkommen);
        }
        else
        this.einkommen = einkommen;
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
     * @return boolean einkommenssteuerpflichtig
     */
    public boolean isEinkommenssteuerpflichtig()  {
        return this.einkommensteuerpflichtig;
    }
    /**
     * 
     * @return boolean gewerbesteuerpflichtig
     */
    public boolean isGewerbesteuerpflichtig() {
        return this.gewerbesteuerpflichtig;
    }
    /**
     * 
     * @return boolean koerperschaftssteuerpflichtig
     */
    public boolean isKoerperschaftsteuerpflichtig() {
        return this.koerperschaftssteuerpflichtig;
    }
    /**
     * 
     * @param einkommensteuerpflichtig
     */
    public void setEinkommensteuerpflichtig(boolean einkommensteuerpflichtig) {
        this.einkommensteuerpflichtig = einkommensteuerpflichtig;
    }

}
