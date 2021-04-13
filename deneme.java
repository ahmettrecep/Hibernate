package DAO;

import Bean.KapiKontrol;
import Bean.Sicaklik;

public class deneme {
    public static void main(String[] args) {
        Sicaklik s1 = new Sicaklik();
        s1.setKabin_no(1);
        s1.setDeger(18);
        s1.setIpAddress("192.168.2.15");
        s1.setTarih("2010-10-11");

        KapiKontrol kk = new KapiKontrol();
        kk.setKabin_no(1);
        kk.setDurum("Acik");
        kk.setTarih("2010-10-10");
        kk.setIpAddress("192.168.2.15");

        AddOperations addOperations = new AddOperations();
        addOperations.addSicaklik(s1);
        addOperations.addKapiKontrol(kk);
        addOperations.commitle();
        addOperations.oturumKapat();
    }
}