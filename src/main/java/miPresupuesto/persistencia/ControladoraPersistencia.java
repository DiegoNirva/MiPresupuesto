
package miPresupuesto.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import miPresupuesto.logica.GastoFijo;
import miPresupuesto.logica.Sueldo;
import miPresupuesto.logica.GastoAdicional;
import miPresupuesto.persistencia.exceptions.NonexistentEntityException;

   

public class ControladoraPersistencia {

    SueldoJpaController sueldoJpa = new SueldoJpaController();
    GastoFijoJpaController fijoJpa = new GastoFijoJpaController();
    GastoAdicionalJpaController gastAdi = new GastoAdicionalJpaController();
    
    public void guardarSueldo(Sueldo sueldo) {
        sueldoJpa.create(sueldo);
    }

    public void guardarGastAdi(GastoAdicional adicional) {
        gastAdi.create(adicional);
    }

    public void guardarGastFijo(GastoFijo fijo) {
        fijoJpa.create(fijo);
        
    }

    public List<Sueldo> traerSueldos() {
        return sueldoJpa.findSueldoEntities();
    }

    public List<GastoFijo> traerGastosFijos() {
        return fijoJpa.findGastoFijoEntities();
    }

    public List<GastoAdicional> trearGastosAdi() {
        return gastAdi.findGastosAdicionalesEntities();
    }

    public void borrarSueldo(int registro) {
        try {
            sueldoJpa.destroy(registro);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarGastFijos(int registro) {
        try {
            fijoJpa.destroy(registro);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarGastAdi(int registro) {
        try {
            gastAdi.destroy(registro);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Sueldo traerSueldos(int registro) {
        return sueldoJpa.findSueldo(registro);
    }

    public GastoFijo traerGastosFijos(int registro) {
        return fijoJpa.findGastoFijo(registro);
    }

    public GastoAdicional traerGastAdi(int registro) {
        return gastAdi.findGastosAdicionales(registro);
    }

    public void editarGasFijo(GastoFijo fijo) {
        try {
            fijoJpa.edit(fijo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarGasAdi(GastoAdicional gastAdi) {
        try {
            this.gastAdi.edit(gastAdi);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarSueldo(Sueldo sueldo) {
        try {
            sueldoJpa.edit(sueldo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
