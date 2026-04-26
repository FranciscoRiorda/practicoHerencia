package practicoHerencia;

import java.time.LocalDate;

public class PersonaJuridica extends Cliente {
    
    private String rubro;
    private String representanteLegal;

    public PersonaJuridica(Integer id, String razonSocial, String documento,
            String direccion, String telefono, String email, LocalDate fechaAlta, String rubro,
            String representanteLegal) {
        super(id, null, null, razonSocial, documento, direccion, telefono, email, fechaAlta);
        this.rubro = rubro;
        this.representanteLegal = representanteLegal;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    @Override
    public String toString() {
        return super.toString() + " | PersonaJuridica [rubro=" + rubro + ", representanteLegal=" + representanteLegal + "]";
    }

}
