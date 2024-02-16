import java.util.ArrayList;

public class AgendaContactosDaoImpl implements AgendaContactosDao {
    private void cargardatos() {
        contactos.add(new Contactos("julia", "Padureanu","juliap@gmail.com","123456789","AD"));
        contactos.add(new Contactos("valeria", "clemente","valeriaC@gmail.com","123456788","AD"));
        contactos.add(new Contactos("Tomasi", "Tomasin","TomasT@gmail.com","123456787","AD"));
        contactos.add(new Contactos("gerar", "Lerones","Leronesp@gmail.com","123456786","AD"));

    }
}
    @Override
    public boolean AltaContacto(Contactos contacto) {

        if (!contactos.contains(contacto)) {
            contactos.add(contacto);
            return true;
        }else {
            return false;}

    @Override
    public boolean EliminarContacto(Contactos contacto) {
            contactos.remove(contacto);
            return true;
}
    @Override
    public Contactos buscarUno(String nombre) {
            Contactos[] listaContactos = null;
            for (Contactos contacto : listaContactos) {
                if (contacto.getNombre().equals(nombre)) {
                    return contacto;
                }
            }


    @Override
    public Contactos buscarTelefono(String nombre) {
                int posEncontrada = -1;

                for (int i = 0; i < contactos.size(); i++) {
                    if (sonTelefonosIguales(nombre, contactos.get(i).getTelefono())) {
                        posEncontrada = i;
                        break;
                    }
                }

                if (posEncontrada == -1) {
                    return null;
                } else {
                    return contactos.get(posEncontrada);
                }
            }

            private boolean sonTelefonosIguales(String nombre, String telefono) {
                // TODO Auto-generated method stub
                return false;
            }    }

    @Override
    public Contactos buscarEmail(String email) {
            int posEncontrada=-1;
            for (int i=0; i < contactos.size();i++) {
                if (contactos.get(i).getEmail()==email) {
                    posEncontrada=i;
                    break;
                }
                if (posEncontrada == -1 )
                    return null;

                else
                    return contactos.get(posEncontrada);
            }
            }


    @Override
    public ArrayList<Contactos> buscarContactosPorTresPrimeros(String nombre) {
            ArrayList<Contactos> aux = new ArrayList<>();
            for (Contactos ele : contactos) {
                if(nombre.substring(0,3).equalsIgnoreCase(ele.getNombre().substring(0,3))){
                    aux.add(ele);
                }
            }
            return aux;
        }
    }

    @Override
    public Boolean cambiarDatos(Contactos contacto) {
        int posicion = contactos.indexOf(contacto);

        if (posicion == -1) {
            return false;
        }else {
            contactos.set(posicion, contacto);
        }
        return true;
    }


    @Override
    public ArrayList<Contactos> CompactosPorEmpresa(String empresa) {
        ArrayList<Contactos> aux = new ArrayList <>();

        for (Contactos ele : contactos) {
            if(ele.getEmpresa() == empresa) {
                aux.add(ele);
            }
        }
        return aux;

    }
}
