package model;

public class Henger {
    private static int hengerDb = 0;
    private double sugar,magassag;
    
    static{
        hengerDb = 0;
    }
    


    public Henger(double sugar, double magassag) {
        //this.sugar = sugar;
        //this.magassag = magassag;
        
        setSugar(sugar);
        setMagassag(magassag);
    }

    public static int getHengerDb() {
        return hengerDb;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public static void setHengerDb(int hengerDb) {
        Henger.hengerDb = hengerDb;
    }

    public void setSugar(double sugar) {
        if (sugar <= 0) {
            sugar = 1;
        }
        this.sugar = sugar;
    }

    public void setMagassag(double magassag) {
        if (magassag <= 0) {
            magassag=1;
        }
        this.magassag = magassag;
    }

    @Override
    public String toString() {
        return "Henger{" + "sugar=" + sugar + ", magassag=" + magassag + '}';
    }
    
    public double terfogat(){
        return Math.pow(sugar, 2)* Math.PI*magassag;
    }
}
