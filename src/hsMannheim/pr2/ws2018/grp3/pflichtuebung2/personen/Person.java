package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Kapitalgesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Personengesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Syndikat;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Unternehmen;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Schurke;

public abstract class Person {
    private boolean einkommensteuerpflichtig;
    private boolean gewerbesteuerpflichtig;
    private boolean koerperschaftssteuerpflichtig;
    private int einkommen;
    private String name;

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

    public Person(String name, int einkommen) throws NegativeIncomeException {
        this(name);
        if (einkommen < 0) {
            throw new NegativeIncomeException("Negatives Einkommen existiert nicht", einkommen);
        }
        this.einkommen = einkommen;
    }

    public int getEinkommen() {
        return einkommen;
    }

    public void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }

    public String getPersonName() {
        return name;
    }

    public void setPersonName(String name) {
        this.name = name;
    }

    public boolean isEinkommenssteuerpflichtig() {
        return this.einkommensteuerpflichtig;
    }

    public boolean isGewerbesteuerpflichtig() {
        return this.gewerbesteuerpflichtig;
    }

    public boolean isKoerperschaftsteuerpflichtig() {
        return this.koerperschaftssteuerpflichtig;
    }

    public void setEinkommensteuerpflichtig(boolean einkommensteuerpflichtig) {
        this.einkommensteuerpflichtig = einkommensteuerpflichtig;
    }

}
