package DAO;

import Bean.KapiKontrol;
import Bean.Sicaklik;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddOperations {
    Session session;
    SessionOperations sessionOperations;
    Transaction transaction;
    TransactionOperations transactionOperations;
    public AddOperations(){
        session = sessionOperations.create();
        transaction = transactionOperations.create(session);
    }
    public void addSicaklik(Sicaklik sicaklik){
        session.save(sicaklik);
    }
    public void addKapiKontrol(KapiKontrol kapiKontrol){ session.save(kapiKontrol); }
    public void oturumKapat(){ session.close(); }
    public void commitle(){
        transaction.commit();
    }
}