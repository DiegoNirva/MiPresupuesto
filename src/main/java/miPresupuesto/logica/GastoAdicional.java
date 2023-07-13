package miPresupuesto.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GastoAdicional implements Serializable {

     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int registroGasAdic;
    
    @Basic
    private String Concepto;
    private String mes;
    private double importe;

    public GastoAdicional() {
    }

    public GastoAdicional(int registroGasAdic, String Concepto, String mes, double importe) {
        this.registroGasAdic = registroGasAdic;
        this.Concepto = Concepto;
        this.mes = mes;
        this.importe = importe;
    }

    public int getRegistroGasAdic() {
        return registroGasAdic;
    }

    public void setRegistroGasAdic(int registroGasAdic) {
        this.registroGasAdic = registroGasAdic;
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
