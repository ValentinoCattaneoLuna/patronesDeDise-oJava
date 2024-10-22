public class TV implements Device{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV encendida");
    }

    @Override
    public void turnOff() {
        System.out.println("TV apagada");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volumen de la TV ajustado a: " + volume);
    }
}
