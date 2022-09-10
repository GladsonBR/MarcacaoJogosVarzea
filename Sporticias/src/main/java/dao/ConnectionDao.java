package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionDao {
    private EntityManager em;
    private EntityManagerFactory entityManager;
    
    public ConnectionDao(){
        entityManager = Persistence
                .createEntityManagerFactory("myPU");        
    }    

    public EntityManager getEm() {
        em=entityManager.createEntityManager();        
        return em;
    }  

    public void close(){
        entityManager.close();
        em.close();
    }
}
