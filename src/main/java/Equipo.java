import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Equipo {
    private int id;
    private String nombre;
    private int titulares;
    private int suplentes;
    private String directorTecnico;
    private int puntos;
    private int partidosJugados;

    public Equipo(int id, String nombre, int titulares, int suplentes, String directorTecnico, int puntos, int partidosJugados) {
        this.id = id;
        this.nombre = nombre;
        this.titulares = titulares;
        this.suplentes = suplentes;
        this.directorTecnico = directorTecnico;
        this.puntos = puntos;
        this.partidosJugados = partidosJugados;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTitulares() {
        return titulares;
    }

    public int getSuplentes() {
        return suplentes;
    }

    public String getDirectorTecnico() {
        return directorTecnico;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }
}

