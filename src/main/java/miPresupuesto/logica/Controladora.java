package miPresupuesto.logica;

import java.util.List;
import miPresupuesto.igu.GastosFijos;
import miPresupuesto.persistencia.ControladoraPersistencia;


public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardarSueldo(String anioSueldo, String mesSueldo, double importeSueldo) {

        Sueldo sueldo = new Sueldo();
        sueldo.setAnio(anioSueldo);
        sueldo.setMes(mesSueldo);
        sueldo.setImporteNeto(importeSueldo);

        controlPersis.guardarSueldo(sueldo);

    }

    public void guardarGastAdi(String gasAdiConcepto, String gastAdiMes, double importeGasAdi) {
        GastoAdicional adicional = new GastoAdicional();
        adicional.setConcepto(gasAdiConcepto);
        adicional.setMes(gastAdiMes);
        adicional.setImporte(importeGasAdi);

        controlPersis.guardarGastAdi(adicional);
    }

    public void guardarGastFijo(String gasfijoConcepto, String gasfijoMes, double gasfijoImporte) {
        
        GastoFijo fijo = new GastoFijo();
        fijo.setConcepto(gasfijoConcepto);
        fijo.setMes(gasfijoMes);
        fijo.setImporte(gasfijoImporte);
        
        //guardamos en BD tabla Gastos fijos
        controlPersis.guardarGastFijo(fijo);
        
    }

    public List<Sueldo> traerSueldos() {
        return controlPersis.traerSueldos();
    }

    public List<GastoFijo> traerGastosFijos() {
        return controlPersis.traerGastosFijos();
    }

    public List<GastoAdicional> traerGastosAdi() {
        return controlPersis.trearGastosAdi();
    }

    public void borrarSueldo(int registro) {
        controlPersis.borrarSueldo(registro);
    }

    public void borrarGastFijos(int registro) {
                controlPersis.borrarGastFijos(registro);

    }

    public void borrarGastAdi(int registro) {
                controlPersis.borrarGastAdi(registro);

    }

}
