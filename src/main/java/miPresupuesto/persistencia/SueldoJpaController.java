
package miPresupuesto.persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import miPresupuesto.logica.Sueldo;
import miPresupuesto.persistencia.exceptions.NonexistentEntityException;


public class SueldoJpaController implements Serializable {

    public SueldoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public SueldoJpaController(){
        emf = Persistence.createEntityManagerFactory("miPresupuesto");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sueldo sueldo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(sueldo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sueldo sueldo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            sueldo = em.merge(sueldo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = sueldo.getRegistroSuel();
                if (findSueldo(id) == null) {
                    throw new NonexistentEntityException("The sueldo with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sueldo sueldo;
            try {
                sueldo = em.getReference(Sueldo.class, id);
                sueldo.getRegistroSuel();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sueldo with id " + id + " no longer exists.", enfe);
            }
            em.remove(sueldo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sueldo> findSueldoEntities() {
        return findSueldoEntities(true, -1, -1);
    }

    public List<Sueldo> findSueldoEntities(int maxResults, int firstResult) {
        return findSueldoEntities(false, maxResults, firstResult);
    }

    private List<Sueldo> findSueldoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sueldo.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Sueldo findSueldo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sueldo.class, id);
        } finally {
            em.close();
        }
    }

    public int getSueldoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sueldo> rt = cq.from(Sueldo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
