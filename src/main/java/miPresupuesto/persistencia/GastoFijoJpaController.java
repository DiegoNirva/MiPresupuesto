
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
import miPresupuesto.logica.GastoFijo;
import miPresupuesto.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Usuario
 */
public class GastoFijoJpaController implements Serializable {

    public GastoFijoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
         public GastoFijoJpaController(){
        emf = Persistence.createEntityManagerFactory("miPresupuesto");
    }
    
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(GastoFijo gastoFijo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(gastoFijo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(GastoFijo gastoFijo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            gastoFijo = em.merge(gastoFijo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = gastoFijo.getRegistroGasEsc();
                if (findGastoFijo(id) == null) {
                    throw new NonexistentEntityException("The gastoFijo with id " + id + " no longer exists.");
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
            GastoFijo gastoFijo;
            try {
                gastoFijo = em.getReference(GastoFijo.class, id);
                gastoFijo.getRegistroGasEsc();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The gastoFijo with id " + id + " no longer exists.", enfe);
            }
            em.remove(gastoFijo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<GastoFijo> findGastoFijoEntities() {
        return findGastoFijoEntities(true, -1, -1);
    }

    public List<GastoFijo> findGastoFijoEntities(int maxResults, int firstResult) {
        return findGastoFijoEntities(false, maxResults, firstResult);
    }

    private List<GastoFijo> findGastoFijoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(GastoFijo.class));
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

    public GastoFijo findGastoFijo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(GastoFijo.class, id);
        } finally {
            em.close();
        }
    }

    public int getGastoFijoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<GastoFijo> rt = cq.from(GastoFijo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
