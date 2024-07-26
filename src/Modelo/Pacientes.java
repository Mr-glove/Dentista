package Modelo;

public class Pacientes {
    
    private String Nombre;
    private String Apellido;
    private String Numero;
    private int id;

    public Pacientes() {
    }

    public Pacientes(String Nombre, String Apellido, String Numero, int id) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Numero = Numero;
        this.id = id;
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
   @Override
    public String toString() {
        return id + ";" + Nombre + ";" + Apellido + ";" + Numero;
    }
}
