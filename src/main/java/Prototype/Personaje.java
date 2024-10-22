package Prototype;

abstract class Personaje implements Clonable {

    protected int puntosVida = 100;
    protected int cantFuerza = 25;
    protected int nivelHabilidades = 0;

    protected int getPuntosVida() {
        return puntosVida;
    }

    protected int getCantFuerza() {
        return cantFuerza;
    }

    protected int getNivelHabilidades() {
        return nivelHabilidades;
    }

    @Override
    public String toString() {
        String general ="=========================="+ "\n"+
                "Estadisticas Generales" + "\n"
                + "Vida: "+ this.getPuntosVida() + "\n"
                + "Fuerza: "+ this.getCantFuerza() + "\n"
                + "Nivel de Habilidades: "+ this.getNivelHabilidades() + "\n";
        return general;
    }
}
