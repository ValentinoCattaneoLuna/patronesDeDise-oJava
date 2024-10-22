package Prototype;

import java.sql.Clob;

public class Mago extends Personaje {
    private int nivelMagia;
    private TipoDeMagia tipoDeMagia;
    public Mago(){
        this.nivelMagia = 10;
        this.tipoDeMagia = TipoDeMagia.BLANCA;
    }

    private int getNivelMagia() {
        return nivelMagia;
    }

    private TipoDeMagia getTipoDeMagia() {
        return tipoDeMagia;
    }

    @Override
    public Mago clonar() {
        Mago magoCopia = new Mago();
        magoCopia.nivelHabilidades = this.getNivelHabilidades();
        magoCopia.cantFuerza = this.getCantFuerza();
        magoCopia.puntosVida = this.getPuntosVida();
        magoCopia.tipoDeMagia = this.getTipoDeMagia();
        magoCopia.nivelMagia = this.getNivelMagia();
        return magoCopia;
    }

    public String toString() {
        String habilidades = "Estadisticas Mago" + "\n"
                + "Nivel de Magia: "+ this.getNivelMagia() +"\n"
                + "Tipo de Magia: "+ this.getTipoDeMagia() +"\n"
                + "=========================="+"\n";

        return super.toString() + habilidades;
    }

    public void MejorarMagia(int fragmentosDeMejora){
        this.nivelMagia += fragmentosDeMejora;
    }

    public void evolucionDeMagia(){
        if (this.nivelMagia >= 50){
            this.tipoDeMagia = TipoDeMagia.OSCURA;
        }
        else{
            if (this.nivelMagia >= 100){
                this.tipoDeMagia = TipoDeMagia.MIXTA;
            }
        }
    }
}
