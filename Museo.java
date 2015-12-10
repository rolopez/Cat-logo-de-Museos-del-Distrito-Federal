package museos;

import java.io.Serializable;
import java.util.Set;

/*La clase Museo, tiene los atributos del museo*/
public class Museo {

    public String nombre;
    public String delegacion;
    public String colonia;
    public String calle;
    public String numero;
    public String horario;
    public String costo;
    public String descripcion;
    public double altitud;
    public double longitud;

    /*Método constructor, que debe tener el mismo nombre que la clase.
    Es para poder crear objetos desde un inicio, con todos sus atributos*/
    public Museo(String nombre, String delegacion, String colonia, String calle, String numero, String horario, String costo, String descripcion, double altitud, double longitud) {
        this.nombre = nombre;
        this.delegacion = delegacion;
        this.colonia = colonia;
        this.calle = calle;
        this.numero = numero;
        this.horario = horario;
        this.costo = costo;
        this.descripcion = descripcion;
        this.altitud = altitud;
        this.longitud = longitud;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(float altitud) {
        this.altitud = altitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
