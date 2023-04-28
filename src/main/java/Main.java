
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CarlosBaeza
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EquipoConex equipoConex = null;

        try {
            
            int opcion;

            do {
                System.out.println("----- Menú -----");
                System.out.println("1. Buscar equipo por ID");
                System.out.println("2. Mostrar todos los equipos");
                System.out.println("3. Salir");
                System.out.print("Ingrese una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el ID del equipo: ");
                        int idEquipo = scanner.nextInt();
                        Equipo equipo = equipoConex.buscarPorId(idEquipo);
                        if (equipo != null) {
                            System.out.println("Equipo encontrado:");
                            System.out.println("ID: " + equipo.getId());
                            System.out.println("Nombre: " + equipo.getNombre());
                            System.out.println("Titulares: " + equipo.getTitulares());
                            System.out.println("Suplentes: " + equipo.getSuplentes());
                            System.out.println("Director Técnico: " + equipo.getDirectorTecnico());
                            System.out.println("Puntos: " + equipo.getPuntos());
                            System.out.println("Partidos Jugados: " + equipo.getPartidosJugados());
                        } else {
                            System.out.println("Equipo no encontrado.");
                        }
                        break;

                    case 2:
                        List<Equipo> equipos = equipoConex.buscarTodos();
                        System.out.println("Lista de equipos:");
                        for (Equipo e : equipos) {
                            System.out.println("ID: " + e.getId());
                            System.out.println("Nombre: " + e.getNombre());
                            System.out.println("Titulares: " + e.getTitulares());
                            System.out.println("Suplentes: " + e.getSuplentes());
                            System.out.println("Director Técnico: " + e.getDirectorTecnico());
                            System.out.println("Puntos: " + e.getPuntos());
                            System.out.println("Partidos Jugados: " + e.getPartidosJugados());
                            System.out.println("--------------------------");
                        }
                        break;

                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción inválida. Por favor, ingrese nuevamente.");
                        break;
                }

                System.out.println();
            } while (opcion != 3);
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        } finally {
            if (equipoConex != null) {
                try {
                    equipoConex.cerrarConexion();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
}