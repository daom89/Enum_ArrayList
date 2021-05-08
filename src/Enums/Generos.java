package Enums;

public enum Generos {
    MASCULINO("Masculino"), FEMENINO("Femenino"), OTRO ("Otro");
    private String Capitalizado;

    Generos(String capitalizado) {
        Capitalizado = capitalizado;
    }

    public String getCapitalizado() {
        return Capitalizado;
    }
}
