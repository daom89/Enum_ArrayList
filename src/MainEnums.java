import Enums.DiaSemana;
import Enums.Meses;

import java.util.Scanner;

public class MainEnums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fecha f1 = new Fecha(13, Meses.ENERO, 2021, DiaSemana.MIERCOLES);

        System.out.println("Ingrese el dia de la semana");
        String DiaTexto = sc.next();

        try {
            DiaSemana diaSemana = DiaSemana.valueOf(DiaTexto.toUpperCase().trim());
            f1.setDia_Semana(diaSemana);
        }catch (IllegalArgumentException IAE){
            System.out.println("El texto ingresado no corresponde a un dia de la semana valido");
        }
        System.out.println(f1);

        System.out.println("El dia: "+f1.getDia_Semana().toCapitalize()+" es el "+f1.getDia_Semana().getNumDia()+" dia de la semana");
    }
}
