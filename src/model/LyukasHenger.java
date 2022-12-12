package model;

public class LyukasHenger extends TomorHenger {
    private double falvastagsag;

    public LyukasHenger( double sugar, double magassag,double falvastagsag) {
        //super(sugar, magassag);
        //this.falvastagsag = falvastagsag;
        this(sugar,magassag,1,falvastagsag);
    }

    public LyukasHenger(double sugar, double magassag,double falvastagsag, double fajsuly) {
        super(fajsuly, sugar, magassag);
        //this.falvastagsag = falvastagsag;
        setFalvastagsag(falvastagsag);
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    public void setFalvastagsag(double falvastagsag) {
        if (falvastagsag <=0) {
            falvastagsag=0.5;
        }
        this.falvastagsag = falvastagsag;
    }

    @Override
    public String toString() {
        String os = super.toString()+"\n\t";
        return os+ "LyukasHenger{" + "falvastagsag=" + falvastagsag + '}';
    }

    @Override
    public double terfogat() {
        Henger belso = new Henger(getSugar()-falvastagsag,getMagassag());
        Henger.setHengerDb(Henger.getHengerDb()-1);
        return super.terfogat()-belso.terfogat(); 
    }

    
}
