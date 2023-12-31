package dbController;

import clases.Paciente;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import ventanas.RegistroPaciente;

/**
 * La clase `CtrlRegistroPaciente` se encarga de registrar pacientes en la base de datos,
 * buscar pacientes y gestionar su información.
 */

public class CtrlRegistroPaciente {
    /**
     * Carga en la base de datos a los pacientes y los manda tambien a la lista
     * para realizar el triage.
     *
     * @param pac : Objeto de tipo Paciente.
     */
    public static void registrarPacientes(Paciente pac) {

        Connection conex = null;
        try {
            conex = Conexion.conectar();

            String insertPaciente = "INSERT INTO Paciente(Nombre, Apellido, FechaNacimiento, Domicilio, DNI, TelFijo, telCel, EstadoCivil, Mail, personaContacto) VALUES(?,?,?,?,?,?,?,?,?,?);";
            String insertLista = "INSERT INTO ListaTriage(Nombre, Apellido, DNI) VALUES(?,?,?);";

            PreparedStatement psi = conex.prepareStatement(insertPaciente);
            PreparedStatement psi1 = conex.prepareStatement(insertLista);

            psi.setString(1, pac.getNombre());
            psi.setString(2, pac.getApellido());
            psi.setString(3, pac.getFecNacimiento());
            psi.setString(4, pac.getDomicilio());
            psi.setString(5, pac.getDni());
            psi.setString(6, pac.getTelFijo());
            psi.setString(7, pac.getTelCelular());
            psi.setString(8, pac.getEstadoCivil());
            psi.setString(9, pac.getCorreoElectronico());
            psi.setString(10, pac.getPersonaContacto());

            psi1.setString(1, pac.getNombre());
            psi1.setString(2, pac.getApellido());
            psi1.setString(3, pac.getDni());

            psi.executeUpdate();
            psi1.executeUpdate();

            JOptionPane.showMessageDialog(null, "Paciente registrado con éxito.");
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

    private static final Paciente paciente = new Paciente();
    /**
     * Busca un paciente en la base de datos por su DNI y actualiza los campos de la ventana
     * con la información del paciente si este existe.
     *
     * @param dni             DNI del paciente a buscar.
     * @param botonRegistro   Botón para registro del paciente si no existe.
     * @param botonLista      Botón para mostrar la lista de espera si existe.
     * @param Textnombre      Campo de texto para el nombre del paciente.
     * @param Textapellido     Campo de texto para el apellido del paciente.
     * @param Textdomicilio    Campo de texto para el domicilio del paciente.
     * @param TexttelFijo      Campo de texto para el número de teléfono fijo del paciente.
     * @param TexttelCel       Campo de texto para el número de teléfono celular del paciente.
     * @param TextestadoCivil  Campo de texto para el estado civil del paciente.
     * @param Textmail        Campo de texto para el correo electrónico del paciente.
     * @param TextpersonaContacto Campo de texto para la persona de contacto del paciente.
     * @param TextfecNac      Campo de fecha de nacimiento del paciente.
     */

    public static void buscarPaciente(String dni, JButton botonRegistro, JButton botonLista, JTextField Textnombre, JTextField Textapellido, JTextField Textdomicilio, JTextField TexttelFijo, JTextField TexttelCel, JTextField TextestadoCivil, JTextField Textmail, JTextField TextpersonaContacto, JDateChooser TextfecNac) {

        paciente.setDni(dni);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Connection conex = null;
        try {
            conex = Conexion.conectar();

            String query = "SELECT * FROM Paciente WHERE DNI = ?";

            PreparedStatement psq = conex.prepareStatement(query);
            psq.setString(1, dni);
            ResultSet rs = psq.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString(1);
                String apellido = rs.getString(2);
                paciente.setNombre(nombre);
                paciente.setApellido(apellido);
                String listaEspera = "INSERT INTO ListaTriage(Nombre, Apellido, DNI) VALUES(?,?,?);";
                PreparedStatement psi1 = conex.prepareStatement(listaEspera);

                psi1.setString(1, paciente.getNombre());
                psi1.setString(2, paciente.getApellido());
                psi1.setString(3, paciente.getDni());
                psi1.executeUpdate();

                JOptionPane.showMessageDialog(null, "Paciente registrado");
                botonLista.setVisible(true);
                String fechaFormateada = rs.getString("FechaNacimiento");
                Date fecha = dateFormat.parse(fechaFormateada);
                Textnombre.setText(rs.getString("Nombre"));
                Textapellido.setText(rs.getString("Apellido"));
                TextfecNac.setDate(fecha);
                Textdomicilio.setText(rs.getString("Domicilio"));
                TexttelFijo.setText(rs.getString("TelFijo"));
                TexttelCel.setText(rs.getString("telCel"));
                TextestadoCivil.setText(rs.getString("EstadoCivil"));
                Textmail.setText(rs.getString("Mail"));
                TextpersonaContacto.setText(rs.getString("personaContacto"));

            } else {
                JOptionPane.showMessageDialog(null, "Paciente no registrado, complete sus datos.");
                botonRegistro.setVisible(true);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Paciente ya en espera del Triage");
        } catch (ParseException ex) {
            Logger.getLogger(RegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);
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
