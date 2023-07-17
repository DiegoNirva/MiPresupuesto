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

    public Sueldo traerSueldos(int registro) {
       return controlPersis.traerSueldos(registro);
    }

    public GastoFijo traerGastFijos(int registro) {
        return controlPersis.traerGastosFijos(registro);
    }

    public GastoAdicional traerGastAdi(int registro) {
        return controlPersis.traerGastAdi(registro);
    }

    public void editarRegistro(GastoFijo fijo, GastoAdicional gastAdi, String valor, String gasatoConcepto, String gasatoMes, double gasatoImporte) {
         switch (valor) {
            case "Gastos Fijos":
                fijo.setConcepto(gasatoConcepto);
                fijo.setMes(gasatoMes);
                fijo.setImporte(gasatoImporte);
                controlPersis.editarGasFijo(fijo);
                break;
            case "Gastos Adicionales":
                gastAdi.setConcepto(gasatoConcepto);
                gastAdi.setMes(gasatoMes);
                gastAdi.setImporte(gasatoImporte);
                controlPersis.editarGasAdi(gastAdi);
                break;
            default:
                break;
        }
    }

}
