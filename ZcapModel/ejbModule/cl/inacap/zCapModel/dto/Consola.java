package cl.inacap.zCapModel.dto;

import java.util.List;

public class Consola {
	private String nombre;
	private String marca;
	private int añoLanzamiento;
	private List<Juego> juegos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAñoLanzamiento() {
		return añoLanzamiento;
	}

	public void setAñoLanzamiento(int añoLanzamiento) {
		this.añoLanzamiento = añoLanzamiento;
	}

	public List<Juego> getJuegos() {
		return juegos;
	}

	public void setJuegos(List<Juego> juegos) {
		this.juegos = juegos;
	}
}
