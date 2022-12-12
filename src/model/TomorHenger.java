package model;

public class TomorHenger extends Henger{
    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        //super(sugar, magassag);
        this(sugar,magassag,1);
    }

    public TomorHenger(double fajsuly, double sugar, double magassag) {
        super(sugar, magassag);
        //this.fajsuly = fajsuly;
        setFajsuly(fajsuly);
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public void setFajsuly(double fajsuly) {
        if (fajsuly <=0) {
            fajsuly=1;
        }
        this.fajsuly = fajsuly;
    }

    @Override
    public String toString() {
        String os = super.toString()+"\n\t";
        return os+"TomorHenger{" + "fajsuly=" + fajsuly + '}';
    }
    
    public double suly(){
        //return super.terfogat()*this.fajsuly;
        return this.terfogat()*this.fajsuly;
    }
}
