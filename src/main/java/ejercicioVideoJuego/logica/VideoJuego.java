package ejercicioVideoJuego.logica;

public class VideoJuego {

	// ESTADO: ATRIBUTOS;
	private int codigo;
	private String titulo;
	private String consola;
	private int cantidadJugadores;
	private String categoria;

	// COMPORTAMIENTO: FUNCIONES, PROCEDIMIENTOS Y MÉTODOS;
	// MÉTODO CONSTRUCTOR POR DEFECTO(VACIO);
	public VideoJuego() {
	}

	// MÉTODO CONSTRUCTOR CON PARÁMETROS;
	public VideoJuego(int codigoP, String tituloP, String consolaP, int cantidadJugadoresP, String categoriaP) {
		this.codigo = codigoP;
		this.titulo = tituloP;
		this.consola = consolaP;
		this.cantidadJugadores = cantidadJugadoresP;
		this.categoria = categoriaP;
	}

	// MÉTODOS GETTERS Y SETTERS;
	public int getCodigo() { // getter
		return codigo;
	}

	public void setCodigo(int codigoP) { // setter
		this.codigo = codigoP;
	}

	public String getTitulo() { // getter
		return titulo;
	}

	public void setTitulo(String tituloP) { // setter
		this.titulo = tituloP;
	}

	public String getConsola() { // getter
		return consola;
	}

	public void setConsola(String consolaP) { // setter
		this.consola = consolaP;
	}

	public int getCantidadJugadores() { // setter
		return cantidadJugadores;
	}

	public void setCantidadJugadores(int cantidadJugadoresP) { // setter
		this.cantidadJugadores = cantidadJugadoresP;
	}

	public String getCategoria() { // getter
		return categoria;
	}

	public void setCategoria(String categoriaP) {
		this.categoria = categoriaP;
	}

	// MÉTODOS PROPIOS DE LA CLASE VideoJuego;
	@Override
	public String toString() {
		return "VideoJuego [codigo=" + codigo + ", titulo=" + titulo + ", consola=" + consola + ", cantidadJugadores="
				+ cantidadJugadores + ", categoria=" + categoria + "]";
	}

}

/*
 * 1- Crear una clase llamada VideoJuego, que tenga los siguientes atributos:
 * codigo, titulo, consola, cantidadJugadores, categoria(tener en cuenta todos
 * sus atributos, constructores, métodos getters y setters).
 */
