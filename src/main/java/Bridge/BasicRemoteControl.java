public class BasicRemoteControl extends RemoteControl{

    public BasicRemoteControl(Device device) { // puente bridge
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Control remoto: encendiendo dispositivo");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Control remoto: apagando dispositivo");
        device.turnOff();
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Control remoto: ajustando volumen");
        device.setVolume(volume);
    }
}