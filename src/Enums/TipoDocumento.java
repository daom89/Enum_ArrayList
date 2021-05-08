package Enums;

public enum TipoDocumento {

    CC("Cedula de Ciudadania"),
    TI("Tarjeta de Identidad"),
    RC("Registro Civil"),
    PASAPORTE("Pasaporte");

    private String textoCompleto;

    TipoDocumento(String textoCompleto) {
        this.textoCompleto = textoCompleto;
    }

    public String getTextoCompleto() {
        return textoCompleto;
    }
}
