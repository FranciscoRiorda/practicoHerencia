package practicoHerencia;

import java.time.LocalDate;

public class ClientePreferencial extends Cliente {
    
    private Double limiteCreditoEspecial;
    private String ejecutivoAsignado;
    private String beneficiosAdicionales;

    public ClientePreferencial(Integer id, String nombre, String apellido, String razonSocial, String documento,
            String direccion, String telefono, String email, LocalDate fechaAlta, Double limiteCreditoEspecial,
            String ejecutivoAsignado, String beneficiosAdicionales) {
        super(id, nombre, apellido, razonSocial, documento, direccion, telefono, email, fechaAlta);
        this.limiteCreditoEspecial = limiteCreditoEspecial;
        this.ejecutivoAsignado = ejecutivoAsignado;
        this.beneficiosAdicionales = beneficiosAdicionales;
    }

    public Double getLimiteCreditoEspecial() {
        return limiteCreditoEspecial;
    }

    public void setLimiteCreditoEspecial(Double limiteCreditoEspecial) {
        this.limiteCreditoEspecial = limiteCreditoEspecial;
    }

    public String getEjecutivoAsignado() {
        return ejecutivoAsignado;
    }

    public void setEjecutivoAsignado(String ejecutivoAsignado) {
        this.ejecutivoAsignado = ejecutivoAsignado;
    }

    public String getBeneficiosAdicionales() {
        return beneficiosAdicionales;
    }

    public void setBeneficiosAdicionales(String beneficiosAdicionales) {
        this.beneficiosAdicionales = beneficiosAdicionales;
    }

    @Override
    public String toString() {
        return super.toString() + " | ClientePreferencial [limiteCreditoEspecial=" + limiteCreditoEspecial + ", ejecutivoAsignado="
                + ejecutivoAsignado + ", beneficiosAdicionales=" + beneficiosAdicionales + "]";
    }

}
