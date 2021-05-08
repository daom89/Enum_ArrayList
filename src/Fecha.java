import Enums.DiaSemana;
import Enums.Meses;

public class Fecha {

    private int dia;
    private Meses mes;
    private int anno;
    private DiaSemana Dia_Semana;

    public Fecha() {

    }

    public Fecha(int dia, Meses mes, int anno, DiaSemana dia_Semana) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
        Dia_Semana = dia_Semana;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Meses getMes() {
        return mes;
    }

    public void setMes(Meses mes) {
        this.mes = mes;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public DiaSemana getDia_Semana() {
        return Dia_Semana;
    }

    public void setDia_Semana(DiaSemana dia_Semana) {
        Dia_Semana = dia_Semana;
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes.toCapitalize() +
                ", anno=" + anno +
                ", Dia_Semana=" + Dia_Semana.toCapitalize() +
                '}';
    }
}
