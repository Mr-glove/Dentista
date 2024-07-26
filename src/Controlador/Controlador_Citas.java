package Controlador;
import Modelo.Cita;
import Modelo.Pacientes;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Vista.Pendientes;
import Vista.Vista_Citas;
import java.io.File;

public class Controlador_Citas {
    private static final String FILE_NAME = "citas.txt";
    
    // Crear un nuevo historial
    public void CrearCitas(Cita citas) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
        writer.write(citas.toString());
        writer.newLine();
        writer.close();
    }
    
    // Leer todas las citas
    public List<Cita> leerCitas() throws IOException {
        List<Cita> citas = new ArrayList<>();
        
        if(ExisteArchivo(FILE_NAME) == true){
            System.out.println("existe");
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null){
                String[] partes = line.split(";");
                Cita cita = new Cita(Integer.parseInt(partes[0]), Integer.parseInt(partes[1]), partes[2], partes[3], partes[4], partes[5], partes[6], partes[7]);
                citas.add(cita);
            }
            reader.close();
            return citas;
        }
        else{
            System.out.println("no existe");
            CrearCitas(new Cita(1,1,"01-01-2024","12:00","Prueba","Pendiente","prueba","prueba"));
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null){
                String[] partes = line.split(";");
                Cita cita = new Cita(Integer.parseInt(partes[0]), Integer.parseInt(partes[1]), partes[2], partes[3], partes[4], partes[5], partes[6], partes[7]);
                citas.add(cita);
            }
            reader.close();
            return citas;
        }
    }
    
    // Actualizar una cita existente
    public void actualizarCita(Cita citaActualizada) throws IOException {
        List<Cita> citas = leerCitas();
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
        for (Cita cita : citas){
            if (cita.getId_cita() == citaActualizada.getId_cita()) {
                writer.write(citaActualizada.toString());
            } else {
                writer.write(cita.toString());
            }
            
            writer.newLine();
        }
        writer.close();
    }
    
    // Borrar cita por id
    public void BorrarId(int id) throws IOException {
        List<Cita> citas = leerCitas();
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
        for (Cita cita : citas){
            if (cita.getId_cita() != id) {
                writer.write(cita.toString());
                writer.newLine();
            }
        }
        writer.close();
    }
    
    // Buscar paciente por id
    public Cita buscarCita(int id) throws IOException {
        List<Cita> citas = leerCitas();
        for (Cita cita : citas){
            if (cita.getId_cita() == id) {
                return cita;
            }
        }
        return null;
    }
    
    public void LlenarTabla_Pendientes() throws IOException{
        Controlador_Pacientes p = new Controlador_Pacientes();
        List<Cita> citas_totales = leerCitas();
        List<Cita> citas = new ArrayList();
        for(Cita c : citas_totales){
            if(c.getEstado().equals("Pendiente")){
                citas.add(c);
            }
        }
        Pacientes paciente;  
        
        Pendientes.modelo.setNumRows(citas.size());
        for(int i=0;i<citas.size();i++){
            paciente = p.buscarPaciente(citas.get(i).getId_pacientes());
            Pendientes.modelo.setValueAt(citas.get(i).getId_cita(), i, 0);
            Pendientes.modelo.setValueAt(paciente.getNombre()+"", i, 1);
            Pendientes.modelo.setValueAt(paciente.getApellido()+"", i, 2);
            Pendientes.modelo.setValueAt(paciente.getNumero()+"", i, 3);
            Pendientes.modelo.setValueAt(citas.get(i).getFecha(), i, 4);
            Pendientes.modelo.setValueAt(citas.get(i).getHora(), i, 5);
            Pendientes.modelo.setValueAt(citas.get(i).getMotivo(), i,6);
            Pendientes.modelo.setValueAt(citas.get(i).getNota(), i, 7);
            Pendientes.modelo.setValueAt(citas.get(i).getMonto(), i, 8);
            Pendientes.modelo.setValueAt(citas.get(i).getEstado(), i, 9);
            
        }
    }
    
    public void LlenarTabla_Vista_Paciente(int modo,String dato) throws IOException{
        Controlador_Pacientes p = new Controlador_Pacientes();
        List<Cita> citas_totales = leerCitas();
        List<Cita> citas = new ArrayList();
        // [Modo 1: todo] [Modo 2: Dia] [Modo 3: Mes] [Modo 4: Año] [Modo 5: Paciente]
        switch(modo){
            //Todo
            case 1:
                for(Cita c : citas_totales){
                        citas.add(c);
                    }
                break;
            //DIA
            case 2:
                for(Cita c : citas_totales){
                    if (c.getFecha().startsWith(dato))
                        citas.add(c);
                }
                break;
                
            //MES
            case 3:
                for(Cita c: citas_totales){
                    if (c.getFecha().contains(dato)) 
                        citas.add(c);
                    }
                break;
                
            //Año
            case 4:
                for(Cita c: citas_totales){
                    if (c.getFecha().contains(dato))
                        citas.add(c);
                }

        }
        
        Pacientes paciente; 
        Vista_Citas.modelo.setNumRows(citas.size());
        for(int a=0;a<citas.size();a++){

            paciente = p.buscarPaciente(citas.get(a).getId_pacientes());
            Vista_Citas.modelo.setValueAt(citas.get(a).getId_cita(), a, 0);
            Vista_Citas.modelo.setValueAt(paciente.getNombre()+"", a, 1);
            Vista_Citas.modelo.setValueAt(paciente.getApellido()+"", a, 2);
            Vista_Citas.modelo.setValueAt(paciente.getNumero()+"", a, 3);
            Vista_Citas.modelo.setValueAt(citas.get(a).getFecha(), a, 4);
            Vista_Citas.modelo.setValueAt(citas.get(a).getHora(), a, 5);
            Vista_Citas.modelo.setValueAt(citas.get(a).getMotivo(), a,6);
            Vista_Citas.modelo.setValueAt(citas.get(a).getNota(), a, 7);
            Vista_Citas.modelo.setValueAt(citas.get(a).getMonto(), a, 8);
            Vista_Citas.modelo.setValueAt(citas.get(a).getEstado(), a, 9);
        }
        
    }
    
    public boolean ExisteArchivo(String ruta){
        File archivo = new File(ruta);
        
        if (archivo.exists()) 
            return true;
        else 
            return false;
    }


}