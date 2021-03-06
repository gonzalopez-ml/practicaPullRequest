package com.metrosCuadrados;

public class HabitacionDTO {
    String nombre;
    double ancho;
    double alto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getCalculoMetrosCuadrados(){
        return ancho * alto;
    }
}
