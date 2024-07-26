package Controlador;
import Modelo.Pacientes;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Vista.Vista_Paciente;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador_Pacientes {
    
    private static final String FILE_NAME = "pacientes.txt";

    // Crear un nuevo paciente
    public void crearPaciente(Pacientes paciente) throws IOException {
        if(paciente.getId()<0)
            paciente = new Pacientes("prueba","prueba","prueba",1);
        
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
        writer.write(paciente.toString());
        writer.newLine();
        writer.close();
    }

    // Leer todos los pacientes
    public List<Pacientes> leerPacientes() throws IOException {
        
        List<Pacientes> pacientes = new ArrayList<>();
        if(ExisteArchivo(FILE_NAME)==true){
            try{
                BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] partes = line.split(";");
                    Pacientes paciente = new Pacientes(partes[1], partes[2], partes[3], Integer.parseInt(partes[0]));
                    pacientes.add(paciente);
                }
                reader.close();
                return pacientes;
            } catch (Error ex){
                crearPaciente(new Pacientes("prueba","prueba","prueba",-1));
                BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] partes = line.split(";");
                    Pacientes paciente = new Pacientes(partes[1], partes[2], partes[3], Integer.parseInt(partes[0]));
                    pacientes.add(paciente);
                }
                reader.close();
                return pacientes;
            }
            
        }
        else{
            crearPaciente(new Pacientes("prueba","prueba","prueba",-1));
            pacientes.add(new Pacientes("prueba","prueba","prueba",-1));
            return pacientes;
        }
    }

    // Actualizar un paciente existente
    public void actualizarPaciente(Pacientes pacienteActualizado) throws IOException {
        if(pacienteActualizado == null){
            JOptionPane.showMessageDialog(null,"Cree un paciente primero");
        }
        List<Pacientes> pacientes = leerPacientes();
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
        for (Pacientes paciente : pacientes) {
            if (paciente.getId() == pacienteActualizado.getId()) {
                writer.write(pacienteActualizado.toString());
            } else {
                writer.write(paciente.toString());
            }
            writer.newLine();
        }
        writer.close();
    }

    // Borrar un paciente por id
    public void borrarPaciente(int id) throws IOException {
        List<Pacientes> pacientes = leerPacientes();
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
        for (Pacientes paciente : pacientes) {
            if (paciente.getId() != id) {
                writer.write(paciente.toString());
                writer.newLine();
            }
        }
        writer.close();
    }

    // Buscar un paciente por id
    public Pacientes buscarPaciente(int id) throws IOException {
        List<Pacientes> pacientes = leerPacientes();
        for (Pacientes paciente : pacientes) {
            if (paciente.getId() == id) {
                return paciente;
            }
        }
        return null;
    }
    
    // Llenar la de pacientes para cualquier tabla de cualquier vista
    public DefaultTableModel LlenatTablaLista_Pacientes(String[] titulo) throws IOException{
        List<Pacientes> pacientes = leerPacientes();
        DefaultTableModel modelo= new DefaultTableModel(null,titulo);
        modelo.setNumRows(pacientes.size());
        
        for( int i=0;i<pacientes.size();i++){
            modelo.setValueAt(pacientes.get(i).getId(), i, 0);
            modelo.setValueAt(pacientes.get(i).getNombre(), i, 1);
            modelo.setValueAt(pacientes.get(i).getApellido(), i, 2);
            modelo.setValueAt(pacientes.get(i).getNumero(), i, 3);
        }
        
        return modelo;
    }
    
    public boolean ExisteArchivo(String ruta){
        File archivo = new File(ruta);
        
        if (archivo.exists()) 
            return true;
        else 
            return false;
    }
    
    public static void main(String[] args) throws IOException {
        Controlador_Pacientes controller = new Controlador_Pacientes();
        /*
        try {
            
            // Crear nuevos pacientes
            Pacientes paciente1 = new Pacientes("Juan", "Pérez", "123456789", 101);
            Pacientes paciente2 = new Pacientes("Ana", "Gómez", "987654321", 101);
            Pacientes paciente3 = new Pacientes("Luis", "Martínez", "555444333", 103);

            controller.crearPaciente(paciente1);
            controller.crearPaciente(paciente2);
            controller.crearPaciente(paciente3);

            // Leer todos los pacientes
            List<Pacientes> pacientes = controller.leerPacientes();
            for (Pacientes p : pacientes) {
                System.out.println(p);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }*/
            
        Pacientes paciente1 = new Pacientes("Piero", "Coveñas", "23105", 104);
        controller.actualizarPaciente(paciente1);
        controller.borrarPaciente(104);
    }
    
    
    
}
