package Prototype;

public class Cliente {

    public static void main(String[] args) {


        Soldado soldado1 = new Soldado();
        Soldado soldado2 = soldado1.clonar();

        soldado2.mejorarArma(10);


        System.out.println("Soldado1" + "\n" +soldado1);

        System.out.println("Soldado2 "+ "\n" + soldado2);


        Mago mago1 = new Mago();
        mago1.MejorarMagia(50);

        Mago mago2 = mago1.clonar();

        mago1.evolucionDeMagia();

        System.out.println("Mago1"+ "\n" + mago1);

        System.out.println("Mago2" + "\n" +mago2);
    }
}
