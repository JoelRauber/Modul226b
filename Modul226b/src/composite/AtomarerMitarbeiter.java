/**
 * AtomarerMitarbeiter.java
 * @author Joel & Michael
 * @version 31.01.2019
*/

package composite;

public class AtomarerMitarbeiter extends Mitarbeiter {

    public void print(String abstand) {
        System.out.println(abstand + getName() + ". Tel: " + getTelefonNr());
    }
    
    public AtomarerMitarbeiter(String name, int telefonNr) {
        super(name, telefonNr);
    }
    
    public int getMitarbeiterAnzahl() {
        return 1;
    }
}
