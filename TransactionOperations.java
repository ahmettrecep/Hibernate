package DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TransactionOperations {
    //Singleton uygula.
    public Transaction create(Session session){
        Transaction transaction;
        transaction = session.beginTransaction();
        return transaction;
    }
}
