package com.finales;

public class Participante {
    private String nombre;
    private int puntosAc = 0;
    private boolean aciertoEnTodaLaRonda = false;

    public Participante(String nombre, String arreglo) {
        this.nombre = nombre;
        //this.puntosAc = puntosAc;
    }

    public Participante(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
	}

	//Este metodo recibe como parametro puntos y los suma a la propiedad puntosAc.
    public void sumarPuntosAc(int puntosAc) {
        this.puntosAc += puntosAc;
    }
    public void acertoTodalaRonda(){
        aciertoEnTodaLaRonda = true;
    }
    public boolean isAciertoEnTodaLaRonda() {
        return aciertoEnTodaLaRonda;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPuntosAc() {
        return puntosAc;
    }
}