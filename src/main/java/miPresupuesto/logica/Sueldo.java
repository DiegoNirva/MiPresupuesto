
package miPresupuesto.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sueldo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int registroSuel;
    
    @Basic
    private String anio;
    private String mes;
    private double importeNeto;

    public Sueldo() {
    }

    public Sueldo(int registroSuel, String anio, String mes, double importeNeto) {
        this.registroSuel = registroSuel;
        this.anio = anio;
        this.mes = mes;
        this.importeNeto = importeNeto;
    }

    public int getRegistroSuel() {
        return registroSuel;
    }

    public void setRegistroSuel(int registroSuel) {
        this.registroSuel = registroSuel;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getImporteNeto() {
        return importeNeto;
    }

    public void setImporteNeto(double importeNeto) {
        this.importeNeto = importeNeto;
    }
    
    
}
