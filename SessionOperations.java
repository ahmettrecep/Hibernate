package DAO;

import Util.HibernateUtil;
import org.hibernate.Session;

public class SessionOperations {
    public Session create(){
        Session session;
        session = HibernateUtil.getInstance().getSession();
        return session;
    }

}
