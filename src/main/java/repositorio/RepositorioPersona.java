package repositorio;
import modelo.Persona;
import java.util.Map;
import java.util.HashMap;
public class RepositorioPersona {
    private Map<String,String> objDataBase = new HashMap<>();
    public String crearPersona(Persona persona){
        objDataBase.put(persona.getRut(),persona.getNombre());
        return "Persona creada";
    }
    public String actualizarPersona(Persona persona){
        objDataBase.put(persona.getRut(),persona.getNombre());
        return "Persona actualizada";
    }
    public Map<String,String> listarPersonas(){
        return objDataBase;
    }
    public String eliminarPersona(Persona persona){
        objDataBase.remove(persona.getRut());
        return "Persona eliminada" + persona.getNombre();
    }
}
