package dbController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * La clase `CtrlConsulta` proporciona métodos para insertar datos relacionados
 * con consultas en la base de datos desde diferentes ventanas en momentos
 * específicos del programa.
 */
public class CtrlConsulta {

    /**
     * Realiza la primera carga de información de una consulta en la base de
     * datos.
     *
     * @param apellidoPaciente El apellido del paciente.
     * @param dniPaciente El DNI del paciente.
     * @param fecha La fecha de la consulta.
     * @param hora La hora de la consulta.
     * @param motivo El motivo de la consulta.
     */
    public void primeraCarga(String apellidoPaciente, String dniPaciente, String fecha, String hora, String motivo) {
        Connection conex = null;
        try {
            conex = Conexion.conectar();

            String insert = "INSERT INTO Consulta(ApellidoPaciente, DNIPaciente, Fecha, Hora, Motivo) VALUES (?,?,?,?,?)";

            PreparedStatement psi = conex.prepareStatement(insert);

            psi.setString(1, apellidoPaciente);
            psi.setString(2, dniPaciente);
            psi.setString(3, fecha);
            psi.setString(4, hora);
            psi.setString(5, motivo);

            psi.executeUpdate();

        } catch (SQLException e) {
            System.out.println("EXCEP SQL" + e);
            JOptionPane.showMessageDialog(null, "¡Error! Contacte al administrador");
        } finally {
            try {
                if (conex != null) {
                    conex.close();
                }
            } catch (SQLException excSql) {
                System.err.println("ERROR SQL" + excSql);
            }
        }

    }

    /**
     * Realiza la segunda carga de información de una consulta en la base de
     * datos.
     *
     * @param resultadoParcial El resultado parcial de la consulta.
     * @param resultadoDefinitivo El resultado definitivo de la consulta.
     * @param dni El DNI del paciente relacionado con la consulta.
     */
    public void segundaCarga(String resultadoParcial, String resultadoDefinitivo, String dni) {
        Connection conex = null;
        try {
            conex = Conexion.conectar();
            conex.setAutoCommit(false);
            String query = "UPDATE Consulta SET ResultadoParcial = ?, ResultadoDefinitivo = ? WHERE DNIPaciente = ? AND ResultadoParcial IS NULL AND ResultadoDefinitivo IS NULL";

            PreparedStatement pst = conex.prepareStatement(query);
            pst.setString(1, resultadoParcial);
            pst.setString(2, resultadoDefinitivo);
            pst.setString(3, dni);
            pst.executeUpdate();
            conex.commit();
        } catch (SQLException e) {
            //conex.rollback();
            System.out.println("EXCEP SQL" + e);
            JOptionPane.showMessageDialog(null, "¡Error! Contacte al administrador");
        } finally {
            try {
                if (conex != null) {
                    conex.close();
                }
            } catch (SQLException excSql) {
                System.err.println("ERROR SQL" + excSql);
            }
        }

    }

    /**
     * Realiza la tercera carga de información de una consulta en la base de
     * datos.
     *
     * @param apellidoMedico El apellido del médico asociado a la consulta.
     * @param matricula La matrícula del médico.
     * @param dni El DNI del paciente relacionado con la consulta.
     */
    public void terceraCarga(String apellidoMedico, int matricula, String dni) {
        Connection conex = null;
        try {
            conex = Conexion.conectar();

            String query = "UPDATE Consulta SET ApellidoMedico = ?, Matricula = ? WHERE DNIPaciente = ? AND ApellidoMedico IS NULL AND Matricula IS NULL";

            PreparedStatement pst = conex.prepareStatement(query);
            pst.setString(1, apellidoMedico);
            pst.setInt(2, matricula);
            pst.setString(3, dni);
            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("EXCEP SQLCuatro" + e);
            JOptionPane.showMessageDialog(null, "¡Error! Contacte al administrador");
        } finally {
            try {
                if (conex != null) {
                    conex.close();
                }
            } catch (SQLException excSql) {
                System.err.println("ERROR SQL" + excSql);
            }
        }

    }

}
