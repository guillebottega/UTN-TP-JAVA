package com.finales;
import lombok.Getter;
import lombok.Setter;
public class equipo {
	
	private  @Getter @Setter String Nombre;
	private  @Getter @Setter String Description;
	
	
	public equipo() {
		super();
	}


	public equipo(String nombre, String description) {
		super();
		Nombre = nombre;
		Description = description;
	}

	
}
