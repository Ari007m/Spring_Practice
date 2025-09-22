package practice.inheritance;

public class Main {
    public static void main(String[] args) {

        VoiceControl[] elements = new VoiceControl[3];
        elements[0]= new SmartLight();
        elements[1]= new SmartSpeaker();
        elements[2]= new SmartThermostat();

        for( VoiceControl element : elements){
            element.response("Turn on");
        }

        SmartDevice[] devices = new SmartDevice[3];
        devices[0] = new SmartLight();
        devices[1] = new SmartSpeaker();
        devices[2] = new SmartThermostat();

        for( SmartDevice device : devices){
            device.turnOn();
            System.out.println(device.getStringStatus());
            device.turnOff();
            System.out.println(device.getStringStatus());
            System.out.println();

//            device.response("Turn on");
        }


    }
}
