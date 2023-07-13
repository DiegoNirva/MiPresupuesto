
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
import miPresupuesto.logica.GastoAdicional;
import miPresupuesto.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Usuario
 */
public class GastoAdicionalJpaController implements Serializable {

    public GastoAdicionalJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
         public GastoAdicionalJpaController(){
        emf = Persistence.createEntityManagerFactory("miPresupuesto");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(GastoAdicional gastosAdicionales) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(gastosAdicionales);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(GastoAdicional gastosAdicionales) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            gastosAdicionales = em.merge(gastosAdicionales);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = gastosAdicionales.getRegistroGasAdic();
                if (findGastosAdicionales(id) == null) {
                    throw new NonexistentEntityException("The gastosAdicionales with id " + id + " no longer exists.");
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
            GastoAdicional gastosAdicionales;
            try {
                gastosAdicionales = em.getReference(GastoAdicional.class, id);
                gastosAdicionales.getRegistroGasAdic();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The gastosAdicionales with id " + id + " no longer exists.", enfe);
            }
            em.remove(gastosAdicionales);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<GastoAdicional> findGastosAdicionalesEntities() {
        return findGastosAdicionalesEntities(true, -1, -1);
    }

    public List<GastoAdicional> findGastosAdicionalesEntities(int maxResults, int firstResult) {
        return findGastosAdicionalesEntities(false, maxResults, firstResult);
    }

    private List<GastoAdicional> findGastosAdicionalesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(GastoAdicional.class));
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

    public GastoAdicional findGastosAdicionales(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(GastoAdicional.class, id);
        } finally {
            em.close();
        }
    }

    public int getGastosAdicionalesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<GastoAdicional> rt = cq.from(GastoAdicional.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
