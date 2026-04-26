package practicoHerencia;

import java.time.LocalDate;

public class Cliente {
private Integer id;
private String nombre;
private String apellido;
private String razonSocial;
private String documento;
private String direccion;
private String telefono;
private String email;
private LocalDate fechaAlta;

public Cliente() {
}

public Cliente(Integer id, String nombre, String apellido, String razonSocial, String documento, String direccion,
        String telefono, String email, LocalDate fechaAlta) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.razonSocial = razonSocial;
    this.documento = documento;
    this.direccion = direccion;
    this.telefono = telefono;
    this.email = email;
    this.fechaAlta = fechaAlta;
}

@Override
public String toString() {
    return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", razonSocial=" + razonSocial
            + ", documento=" + documento + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email
            + ", fechaAlta=" + fechaAlta + "]";
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public String getRazonSocial() {
    return razonSocial;
}

public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
}

public String getDocumento() {
    return documento;
}

public void setDocumento(String documento) {
    this.documento = documento;
}

public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public LocalDate getFechaAlta() {
    return fechaAlta;
}

public void setFechaAlta(LocalDate fechaAlta) {
    this.fechaAlta = fechaAlta;
}
    
}