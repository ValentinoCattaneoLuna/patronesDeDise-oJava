abstract class RemoteControl {
    protected Device device;  // El puente a la implementación

    public RemoteControl(Device device) {
        this.device = device; // aca se establece el puente con la implementación
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setVolume(int volume);
}
