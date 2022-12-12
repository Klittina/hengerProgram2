package model;

import java.util.ArrayList;
import java.util.List;
//ez az ujjabb, mindig ezt importáljuk, a swing az az előd volt

public class Hengerporgram1212 {
    
    private List<Henger> hengerek;

    public static void main(String[] args) {
        new Hengerporgram1212().run();
    }

    public Hengerporgram1212(List<Henger> hengerek) {
        this.hengerek = hengerek;
    }
    public Hengerporgram1212(){
        hengerek = new ArrayList<>();
        /*  tesztesetek */
        hengerek.add(new Henger(0,0));
        //Kristóf egy furry UwU
    }
    public void run(){
        int db = Henger.getHengerDb();
        System.out.printf("Hengerek (%d db):\n",db);
        for (Henger henger : lista()){
            System.out.println(henger);
        }
        
        System.out.println("átlag térfogat: " + atlagTerfogat());
        System.out.println("csövek súlya: " + csovekSulya());
        
        System.out.println("Összesen (%d db) henger:\n");
    }
    
    private List<Henger> lista (){
        return hengerek;
    }
    
    public double atlagTerfogat(){
        double ossz = 0;
        for (Henger henger : lista()) {
            ossz += henger.terfogat();
        }
        return ossz;
    }
    
    public double csovekSulya(){
        double ossz = 0;
        for (Henger henger : lista()) {
//            if (henger instanceof LyukasHenger){
//                ossz += ((LyukasHenger)henger).suly();
//            }

            if (henger instanceof LyukasHenger cso){
                ossz += cso.suly();
            }
        }
        return ossz;
    }
}
