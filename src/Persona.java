import Enums.*;

public class Persona {

    private String Nombre;
    private String Apellidos;
    private TipoDocumento Tipo_Documento;
    private int Numero_Documento;
    private Generos Genero;

    public Persona() {

    }

    public Persona(String nombre, String apellidos, TipoDocumento tipo_Documento, int numero_Documento, Generos genero) {
        Nombre = nombre;
        Apellidos = apellidos;
        Tipo_Documento = tipo_Documento;
        Numero_Documento = numero_Documento;
        Genero = genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public TipoDocumento getTipo_Documento() {
        return Tipo_Documento;
    }

    public void setTipo_Documento(TipoDocumento tipo_Documento) {
        Tipo_Documento = tipo_Documento;
    }

    public int getNumero_Documento() {
        return Numero_Documento;
    }

    public void setNumero_Documento(int numero_Documento) {
        Numero_Documento = numero_Documento;
    }

    public Generos getGenero() {
        return Genero;
    }

    public void setGenero(Generos genero) {
        Genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Tipo_Documento=" + Tipo_Documento.getTextoCompleto() +
                ", Numero_Documento=" + Numero_Documento +
                ", Genero=" + Genero.getCapitalizado() +
                '}';
    }
}
