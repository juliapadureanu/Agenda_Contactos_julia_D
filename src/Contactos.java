import java.util.Objects;

public class Contactos {

    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String empresa;

    public String getNombre() {
        return nombre;
    }
    public Contactos(String nombre, String apellidos, String email, String telefono, String empresa) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.empresa = empresa;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contactos contactos = (Contactos) o;
        return Objects.equals(nombre, contactos.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}