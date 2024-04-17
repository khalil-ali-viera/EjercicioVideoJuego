package ejercicioVideoJuego;

import java.util.List;
import java.util.ArrayList;
import ejercicioVideoJuego.logica.VideoJuego;

public class Main {

	public static void main(String[] args) {
		/*
		 * 2- Crear una ArrayList de tipo VideoJuego. Crear 5 videojuegos y guardarlos
		 * en la collection.
		 */

		List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();

		VideoJuego videoJuego_1 = new VideoJuego();
		videoJuego_1.setCodigo(1);
		videoJuego_1.setTitulo("League of Legends");
		videoJuego_1.setConsola("PC");
		videoJuego_1.setCantidadJugadores(5);
		videoJuego_1.setCategoria("Estrategia");

		VideoJuego videoJuego_2 = new VideoJuego();
		videoJuego_2.setCodigo(2);
		videoJuego_2.setTitulo("Planta Vs Zombie");
		videoJuego_2.setConsola("Nintendo 64");
		videoJuego_2.setCantidadJugadores(1);
		videoJuego_2.setCategoria("Estrategia");

		VideoJuego videoJuego_3 = new VideoJuego();
		videoJuego_3.setCodigo(3);
		videoJuego_3.setTitulo("Word of Tanks");
		videoJuego_3.setConsola("Multiplataforma");
		videoJuego_3.setCantidadJugadores(5);
		videoJuego_3.setCategoria("Estrategia");

		VideoJuego videoJuego_4 = new VideoJuego();
		videoJuego_4.setCodigo(4);
		videoJuego_4.setTitulo("Mario Bross");
		videoJuego_4.setConsola("Nintendo 64");
		videoJuego_4.setCantidadJugadores(2);
		videoJuego_4.setCategoria("Aventura");

		VideoJuego videoJuego_5 = new VideoJuego();
		videoJuego_5.setCodigo(5);
		videoJuego_5.setTitulo("Pac Man");
		videoJuego_5.setConsola("Multiplataforma");
		videoJuego_5.setCantidadJugadores(1);
		videoJuego_5.setCategoria("Estrategia");

		listaVideoJuegos.add(videoJuego_1);
		listaVideoJuegos.add(videoJuego_2);
		listaVideoJuegos.add(videoJuego_3);
		listaVideoJuegos.add(videoJuego_4);
		listaVideoJuegos.add(videoJuego_5);

		System.out.println("--------------------------------------------------------");

		/*
		 * 3- Recorrer la ArrayList creada y mostrar por pantalla el titulo, consola y
		 * cantidad de jugadores de los video juegos almacenados.
		 */
		for (VideoJuego videoJuego : listaVideoJuegos) {
			System.out.println("Titulo = " + videoJuego.getTitulo());
			System.out.println("Consola = " + videoJuego.getConsola());
			System.out.println("Cantidad de Jugadores = " + videoJuego.getCantidadJugadores());
			System.out.println();
		}

		System.out.println("--------------------------------------------------------");

		/*
		 * 4- Cambiar el nombre y la cantidad de jugadores de dos videojuegos. Mostrar
		 * por pantalla los datos de todos los videojuegos luego del cambio.
		 */
		videoJuego_2.setTitulo("Counter Strike");
		videoJuego_2.setCantidadJugadores(2);

		videoJuego_5.setTitulo("Tortugas Ninja");
		videoJuego_5.setCantidadJugadores(2);

		for (VideoJuego videoJuego : listaVideoJuegos) {
			System.out.println(videoJuego.toString());
			System.out.println();
		}

		System.out.println("--------------------------------------------------------");

		/*
		 * 5- Recorrer la ArrayList y mostrar por pantalla únicamente a los videojuegos
		 * que sean de la consola "Nintendo 64"
		 */
		for (VideoJuego videoJuego : listaVideoJuegos) {

			if (videoJuego.getConsola().equals("Nintendo 64")) {
				System.out.println(videoJuego.toString());
			}

		}

		System.out.println("--------------------------------------------------------");
	}

}
