package Enums;

public enum Color {
    NEGRO("Negro"), //0
    AZUL("Azul"),   //1
    AMARILLO("Amarillo"), //2
    VERDE("Verde"); //3

    //Propiedad
    private String Capitalizar;

    //Contructor
    Color(String capitalizar) {
        Capitalizar = capitalizar;
    }

    //Metodos
    public String getCapitalizar() {
        return Capitalizar;
    }
}