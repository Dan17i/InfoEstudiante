package co.edu.uniquindio.poo;

/* 
 * ejercicio 
 * Luis es un profesor de la universidad del Quindío que le ha solicitado diseñar un sistema
para la gestión de los estudiantes del curso de programación 1. Para ello, él necesita que la
aplicación que permita:
Almacenar la información de un estudiante, incluyendo su número de identificación,
nombres, apellidos, correo, teléfono y edad.
 *@autor Simon 
 */
public class Estudiante {

    // atributos de la clase:
    private String numId;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private int edad;
                      
    // ------------------------------------------------------------------------------------------------
    // contructor de la clase que contiene todos los atributos de la clase
    public Estudiante(String numId, String nombre, String apellido, String correo, String telefono, int edad) {

        assert numId != null && !numId.isBlank():"el numero de identificación es obligatorio";
        assert nombre != null && !nombre.isBlank():"el nombre es obligatorio";
        assert apellido != null && !apellido.isBlank(): "el apellido es obligatorio";
        assert correo != null && !correo.isBlank() : "el correo es obligatorio";
        assert telefono != null && !telefono.isBlank(): "el telefono es obligatorio";
        assert edad >= 0: "la edad debe ser positiva ";

        assert correoValido(correo) : "el correo debe de estar bien diligenciados";

        // materializar el objeto
        this.numId = numId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;

    }
  // contructor vacio por buenas practicas
    public Estudiante() {

    }

    // -------------------------------------------------------------------------------------------------
    // me todos de acceso
    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private static boolean correoValido(String email) {
        // Expresión regular para validar el formato básico de un correo electrónico
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        return email.matches(emailRegex);
        // -------------------------------------------------------------------------------------------------

    }

    @Override
    public String toString() {
        return "Estudiante [numId=" + numId + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
                + ", telefono=" + telefono + ", edad=" + edad + "]";
    }
}
