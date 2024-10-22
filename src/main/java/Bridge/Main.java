//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Control básico para una Radio

        Device radio = new Radio();
        RemoteControl remoteForRadio = new BasicRemoteControl(radio);
        remoteForRadio.turnOn();
        remoteForRadio.setVolume(10);
        remoteForRadio.turnOff();

        System.out.println();

        // Control básico para una TV

        Device tv = new TV();
        RemoteControl remoteForTV = new BasicRemoteControl(tv);
        remoteForTV.turnOn();
        remoteForTV.setVolume(20);
        remoteForTV.turnOff();
    }
}