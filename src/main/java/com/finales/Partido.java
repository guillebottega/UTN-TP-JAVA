package com.finales;
public class Partido {
    private equipo equipo1;
    public equipo getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(equipo equipo1) {
		this.equipo1 = equipo1;
	}
	public equipo getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(equipo equipo2) {
		this.equipo2 = equipo2;
	}
	public int getGolesEquipo1() {
		return golesEquipo1;
	}
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	public int getGolesEquipo2() {
		return golesEquipo2;
	}
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	public int getNroRonda() {
		return nroRonda;
	}
	public void setNroRonda(int nroRonda) {
		this.nroRonda = nroRonda;
	}
	private  equipo equipo2;
    private  int golesEquipo1;
    private  int golesEquipo2;
    private int nroRonda;
    
    public Partido(equipo equipo1, equipo equipo2, int golesEquipo1, int golesEquipo2, int nroRonda) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
        this.nroRonda = nroRonda;
    }
    public Partido(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
}