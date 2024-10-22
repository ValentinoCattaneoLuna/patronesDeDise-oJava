package Prototype;

public class Soldado extends Personaje {

    private int nivelArmadura;

    private int nivelArma;

    public Soldado(){
        this.nivelArmadura = 10;
        this.nivelArma = 10;
    }

    private int getNivelArmadura() {
        return nivelArmadura;
    }

    private int getNivelArma() {
        return nivelArma;
    }

    @Override
    public Soldado clonar() {
       Soldado soldadoCopia = new Soldado();

       soldadoCopia.nivelArma = this.getNivelArma();
       soldadoCopia.nivelArmadura = this.getNivelArmadura();
       soldadoCopia.cantFuerza = this.getCantFuerza();
       soldadoCopia.nivelHabilidades = this.getNivelHabilidades();
       soldadoCopia.puntosVida = this.getPuntosVida();

       return soldadoCopia;
    }

    @Override
    public String toString() {
        String habilidades = "Estadisticas Soldado" + "\n"
                + "Nivel de Arma: "+ this.getNivelArma() +"\n"
                + "Nivel de Armadura: "+ this.getNivelArmadura() +"\n"
                + "=========================="+"\n";

        return super.toString() + habilidades;
    }
    public void mejorarArma(int fragmentosDeMejora){
        this.nivelArma += fragmentosDeMejora;
    }
}
