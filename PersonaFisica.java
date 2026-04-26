package practicoHerencia;

import java.time.LocalDate;

public class PersonaFisica extends Cliente implements Calificable {

    private LocalDate fechaNacimiento;
    private String profesion;
    private Double ingresosDeclarados;
    
    public PersonaFisica(Integer id, String nombre, String apellido, String documento,
            String direccion, String telefono, String email, LocalDate fechaAlta, LocalDate fechaNacimiento,
            String profesion, Double ingresosDeclarados) {
        super(id, nombre, apellido, null, documento, direccion, telefono, email, fechaAlta);
        this.fechaNacimiento = fechaNacimiento;
        this.profesion = profesion;
        this.ingresosDeclarados = ingresosDeclarados;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Double getIngresosDeclarados() {
        return ingresosDeclarados;
    }

    public void setIngresosDeclarados(Double ingresosDeclarados) {
        this.ingresosDeclarados = ingresosDeclarados;
    }

    @Override
    public String toString() {
        return super.toString() + " | PersonaFisica [fechaNacimiento=" + fechaNacimiento + ", profesion=" + profesion
                + ", ingresosDeclarados=" + ingresosDeclarados + "]";
    }

    @Override
    public CalificacionCliente getCalificacionCliente() {

        if(this.ingresosDeclarados < 30000) {
            return CalificacionCliente.BAJA;
        } else if (this.ingresosDeclarados >= 30000 && this.ingresosDeclarados < 70000) {
            return CalificacionCliente.MEDIA;
        } else if (this.ingresosDeclarados >= 70000 && this.ingresosDeclarados < 150000) {
            return CalificacionCliente.ALTA;
        } else if (this.ingresosDeclarados >= 150000) {
            return CalificacionCliente.PREMIUM;
        }
        return null;
    }

    


    
} 
