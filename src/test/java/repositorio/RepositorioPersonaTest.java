package repositorio;

import modelo.Persona;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class RepositorioPersonaTest {
    private RepositorioPersona objRepositorioPersona = mock(RepositorioPersona.class);
    @Test
    public void testCrearPersona(){
        Persona pepe = new Persona("15943017-9","Loco Pepe");
        when(objRepositorioPersona.crearPersona(pepe)).thenReturn("Persona creada");
        String respuesta = objRepositorioPersona.crearPersona(pepe);
        assertEquals("Persona creada", respuesta);
        verify(objRepositorioPersona).crearPersona(pepe);
    }

    @Test
    public void testCrearPersonaNull(){
        Persona pepe = new Persona("15943017-9","Loco Pepe");
        when(objRepositorioPersona.crearPersona(null)).thenThrow(new NullPointerException());
    }
}
