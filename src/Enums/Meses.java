package Enums;/*
    Las enumeracion no pueden tener clases hijas.
    Los enums pueden tener contructores, main, variables de instancia, metodos
*/

public enum Meses {
    ENERO(1), FEBRERO(2), MARZO(3), //llamamdo al constructor
    ABRIL(4), MAYO(5), JUNIO(6),
    JULIO(7), AGOSTO(8), SEPTIEMBRE(9),
    OCTUBRE(10), NOVIEMBRE(11), DICIEMBRE(12);

    private int numMes;

    Meses(int num){
        this.numMes = num;
    }

    public int getNumMes() {
        return numMes;
    }

    public String toCapitalize(){
        return this.toString().substring(0, 1).toUpperCase() + this.toString().substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Meses lista[] = Meses.values();
        for (Meses ms :
                lista) {
            System.out.println("El mes: "+ms.toCapitalize()+" esta en el indice "+ms.ordinal());
            System.out.println(ms.numMes);
        }
    }

}