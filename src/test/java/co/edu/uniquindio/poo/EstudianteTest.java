/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2024-02
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void DatosCompletos() {

        LOG.info("Iniciado test de Datos Completos");

        Estudiante estudiante = new Estudiante("109453264", "Camila", "Alzate", "camila@uniquindio.edu.co", "315635674",
                18);

        assertEquals("109453264", estudiante.getNumId());
        assertEquals("Camila", estudiante.getNombre());
        assertEquals("Alzate", estudiante.getApellido());
        assertEquals("camila@uniquindio.edu.co", estudiante.getCorreo());
        assertEquals("315635674", estudiante.getTelefono());
        assertEquals(18, estudiante.getEdad());

        LOG.info("inicio de test Datos completos");

        LOG.info("Finalizando test Datos completos");
    }

    @Test
    public void DatosNull() {
        LOG.info("Iniciado test de Datos Null");

        assertThrows(Throwable.class, () -> new Estudiante(null, null, null, null, null, 0));
        LOG.info("Finalizando test datos null");
    }

    @Test
    public void DatosVacios() {
        LOG.info("Iniciado test de Datos vacios ");

        assertThrows(Throwable.class, () -> new Estudiante("", "", "", "", "", 0));

        LOG.info("Finalizando test datos vacios");
    }

    @Test
    public void EdadNegativa() {
        assertThrows(Throwable.class, () -> new Estudiante("109453264", "Camila", "Alzate", "camila@uniquindio.edu.co", "315635674",-18));
    }

    @Test
    public void CorreoInvalido() {
        LOG.info("Iniciado test de Correo invalido");

        assertThrows(Throwable.class, ()-> new Estudiante("109453264", "Camila", "Alzate", "camlica.co", "315635674",
        18));


    }
}
