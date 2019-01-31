package composite;

public abstract class Mitarbeiter {
    public abstract void print(String abstand);
    
    public abstract int getMitarbeiterAnzahl();
    
    private String name;
    private int telefonNr;

    public Mitarbeiter(String name, int telefonNr) {
        this.name = name;
        this.telefonNr = telefonNr;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTelefonNr() {
        return telefonNr;
    }
    public void setTelefonNr(int telefonNr) {
        this.telefonNr = telefonNr;
    }
}		
