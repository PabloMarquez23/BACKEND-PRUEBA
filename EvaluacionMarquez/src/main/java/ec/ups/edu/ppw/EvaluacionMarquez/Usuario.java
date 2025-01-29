package ec.ups.edu.ppw.EvaluacionMarquez;

import java.io.Serializable;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    private String cedula;
    private String nombre;
    private double consumo;
    private double deudaPendiente;

    // ✅ Constructor vacío (requerido para serialización)
    public Usuario() {}

    // ✅ Constructor con parámetros
    public Usuario(String cedula, String nombre, double consumo, double deudaPendiente) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.consumo = consumo;
        this.deudaPendiente = deudaPendiente;
    }

    // ✅ Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getDeudaPendiente() {
        return deudaPendiente;
    }

    public void setDeudaPendiente(double deudaPendiente) {
        this.deudaPendiente = deudaPendiente;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", consumo=" + consumo +
                ", deudaPendiente=" + deudaPendiente +
                '}';
    }
}
