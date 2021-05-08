package Enums;
/* internamente enum Enums.DiaSemana se convierte en
class Enums.DiaSemana
{
     public static final Enums.DiaSemana LUNES = new Enums.DiaSemana();
     public static final Enums.DiaSemana MARTES = new Enums.DiaSemana();
     public static final Enums.DiaSemana MIERCOLES = new Enums.DiaSemana();
     etc...
}*/

public enum DiaSemana {
    LUNES(1),
    MARTES(2),
    MIERCOLES(3),
    JUEVES(4),
    VIERNES(5),
    SABADO(6),
    DOMINGO(7);

    private int numDia;

    public String toCapitalize(){
        return this.toString().substring(0, 1).toUpperCase() + this.toString().substring(1).toLowerCase();
    }

    DiaSemana(int numDia) {
        this.numDia = numDia;
    }

    public int getNumDia() {
        return numDia;
    }
}