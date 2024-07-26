
package Modelo;


public class Cita {
    
    
    private int id_cita,id_paciente;
    private String fecha,hora,motivo,estado,nota,monto;
    

    public Cita() {
    }

    public Cita(int id_cita, int id_paciente, String fecha, String hora, String motivo, String estado, String nota, String monto) {
        this.id_cita = id_cita;
        this.id_paciente = id_paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = estado;
        this.nota = nota;
        this.monto = monto;
    }

    
    
    public int getId_cita() {
        return id_cita;
    }
    
    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getId_pacientes() {
        return id_paciente;
    }

    public void setPacientes(int id_pacientes) {
        this.id_paciente = id_pacientes;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    

    @Override
    public String toString() {
        return id_cita + ";" + id_paciente + ";" + fecha + ";" + hora + ";" + motivo + ";" + estado + ";" + nota + ";" + monto;
    }

    
}
