package dbController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import clases.AdminSistemas;
//import clases.Administrativo;
//import clases.Medico;
import clases.Funcionario;


public class CtrlRegistroFuncionarios {
    
    public static void registrarFuncionario(
            String nombre,
            String apellido,
            String fechaFormateada,
            String domicilio,
            String dni,
            String telFijo,
            String telCelular,
            String estadoCivil,
            String correoElectronico
    ) {
        Funcionario func = new Funcionario();
        func.setNombre(nombre);
        func.setApellido(apellido);
        func.setFecNacimiento(fechaFormateada);
        func.setDomicilio(domicilio);
        func.setDni(dni);
        func.setTelFijo(telFijo);
        func.setTelCelular(telCelular);
        func.setEstadoCivil(estadoCivil);
        func.setCorreoElectronico(correoElectronico);
        
        Connection conex = null;
        try {
            conex = Conexion.conectar();

            String query = "SELECT * FROM Funcionarios WHERE DNI = ?";

            PreparedStatement psq = conex.prepareStatement(query);
            psq.setString(1, dni);

            ResultSet rs = psq.executeQuery();

            if (!rs.next()) {

                String insert = "INSERT INTO Funcionarios(Nombre, Apellido, FechaNacimiento, Domicilio, DNI, TelFijo, telCel, EstadoCivil, Mail) VALUES(?,?,?,?,?,?,?,?,?);";
                PreparedStatement psi = conex.prepareStatement(insert);

                psi.setString(1, nombre);
                psi.setString(2, apellido);
                psi.setString(3, fechaFormateada);
                psi.setString(4, domicilio);
                psi.setString(5, dni);
                psi.setString(6, telFijo);
                psi.setString(7, telCelular);
                psi.setString(8, correoElectronico);
                psi.setString(9, estadoCivil);

                psi.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario registrado con éxito - Recuerde que un informático deberá validar el usuario para su posterior ingreso al sistema.");

            } else {
                JOptionPane.showMessageDialog(null, "DNI ya registrado");
            }

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

}
