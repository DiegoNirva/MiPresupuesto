package miPresupuesto.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GastoFijo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int registroGasEsc;
    
    @Basic
    private String Concepto;
    private String mes;
    private double importe;

    public GastoFijo() {
    }

    public GastoFijo(int registroGasEsc,  String Concepto, String mes, double importe) {
        this.registroGasEsc = registroGasEsc;
        this.Concepto = Concepto;
        this.mes = mes;
        this.importe = importe;
    }

    public int getRegistroGasEsc() {
        return registroGasEsc;
    }

    public void setRegistroGasEsc(int registroGasEsc) {
        this.registroGasEsc = registroGasEsc;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

}
