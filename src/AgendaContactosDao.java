import java.util.ArrayList;

public interface AgendaContactosDao {
    boolean AltaContacto(Contactos contacto);
    boolean EliminarContacto(Contactos contacto);
    Contactos buscarUno(String nombre);
    Contactos buscarTelefono(String nombre);
    Contactos buscarEmail(String email);
    ArrayList<Contactos> buscarContactosPorTresPrimeros(String nombre);
    Boolean cambiarDatos(Contactos contacto);
    ArrayList<Contactos> CompactosPorEmpresa(String empresa);
}
}
