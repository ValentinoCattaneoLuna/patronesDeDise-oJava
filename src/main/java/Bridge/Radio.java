public class Radio  implements Device{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Radio encendida");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio apagada");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volumen de la radio ajustado a: " + volume);
    }
}
