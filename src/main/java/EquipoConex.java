
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Baeza
 */
public class EquipoConex {
    private final String URL = "jdbc:mysql://localhost:3306/nombre_de_la_base_de_datos";
    private final String USUARIO = "usuario_de_la_base_de_datos";
    private final String CLAVE = "clave_de_la_base_de_datos";

    private Connection conexion;

    public EquipoConex() throws SQLException {
        conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
    }

    public void cerrarConexion() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }

    public Equipo buscarPorId(int id) throws SQLException {
        PreparedStatement ps = conexion.prepareStatement("SELECT * FROM equipo WHERE id = ?");
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return new Equipo(rs.getInt("id"), rs.getString("nombre"), rs.getInt("titulares"),
                    rs.getInt("suplentes"), rs.getString("director_tecnico"), rs.getInt("puntos"),
                    rs.getInt("partidos_jugados"));
        }

        return null;
    }

    public List<Equipo> buscarTodos() throws SQLException {
        List<Equipo> equipos = new ArrayList<>();

        PreparedStatement ps = conexion.prepareStatement("SELECT * FROM equipo");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            equipos.add(new Equipo(rs.getInt("id"), rs.getString("nombre"), rs.getInt("titulares"),
                    rs.getInt("suplentes"), rs.getString("director_tecnico"), rs.getInt("puntos"),
                    rs.getInt("partidos_jugados")));
        }

        return equipos;
    }
}