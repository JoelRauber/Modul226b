/**
 * Abteilungsleiter.java
 * @author Joel & Michael
 * @version 31.01.2019
*/

package composite;

import java.util.ArrayList;
import java.util.List;

public class Abteilungsleiter extends Mitarbeiter {

    public void print(String abstand) {
        System.out.println(abstand + "Abteilungsleiter " + getName() + " (" + getAbteilung() + "). Tel: " + getTelefonNr());
        for (Mitarbeiter ma : mitarbeiter) {
            ma.print(abstand + "      ");
        }
    }
    
    private List<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();

    private String abteilung;
    
    public String getAbteilung() {
        return abteilung;
    }
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }
    
    /**
     * Instantiates a new abteilungsleiter.
     *
     * @param name the name
     * @param abteilung the abteilung
     * @param telefonNr the telefon nr
     */
    
    public Abteilungsleiter(String name, String abteilung, int telefonNr) {
        super(name, telefonNr);
        this.abteilung = abteilung;
    }
    public int getMitarbeiterAnzahl() {
        int summe = 1;
        for (Mitarbeiter ma : mitarbeiter) {
            summe += ma.getMitarbeiterAnzahl();
        }
        return summe;
    }
    
    /**
     * Adds the Mitarbeiter.
     *
     * @param ma the ma
     */
    
    public void add(Mitarbeiter ma) {
        mitarbeiter.add(ma);
    }

    /**
     * Removes the Mitarbeiter.
     *
     * @param ma the ma
     */
    
    public void remove(Mitarbeiter ma) {
        mitarbeiter.remove(ma);
    }

    /**
     * Gets the mitarbeiter.
     *
     * @param index the index
     * @return the mitarbeiter
     */
    
    public Mitarbeiter getMitarbeiter(int index) {
        return mitarbeiter.get(index);
    }
}
