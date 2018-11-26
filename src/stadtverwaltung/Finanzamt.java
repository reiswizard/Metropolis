package stadtverwaltung;

import java.util.ArrayList;

/**
 *
 */

/**
 * @author hoang
 *
 */
public class Finanzamt {
//    public static Finanzamt myFinanzamt;
    public static ArrayList<Steuerpflichtig> steuerpflichtige = new ArrayList<Steuerpflichtig>();

    public Finanzamt() {
    }

//    public static Finanzamt getInstanz() {
//        if (Finanzamt.myFinanzamt == null) {
//            Finanzamt.myFinanzamt = new Finanzamt();
//        }
//        return Finanzamt.myFinanzamt;
//    }

    public void addSteuerpflichtige(Steuerpflichtig irgendwer) {
        steuerpflichtige.add(irgendwer);
    }

    public void getSteuerpflichtige() {
        for (int i = 0; i < steuerpflichtige.size(); i++) {
            System.out.println(steuerpflichtige.get(i).toString());
        }

    }
    
    public double berechneEinkommenssteuer() {
        double Einkommenssteuer = 0;
    for(int i=0;i<steuerpflichtige.size();i++) {
        if(steuerpflichtige.get(i) instanceof Einkommenssteuer) {
            Einkommenssteuer=Einkommenssteuer+steuerpflichtige.get(i).getEinkommen();
        }
            
    }
    return Einkommenssteuer;
    }

   
}