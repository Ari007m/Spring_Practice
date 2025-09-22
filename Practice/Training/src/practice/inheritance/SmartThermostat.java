package practice.inheritance;

class SmartThermostat implements SmartDevice,VoiceControl{

    String a;
    @Override
    public void response(String command) {
        System.out.println("The "+command+" command got");
    }

    @Override
    public void turnOn() {
        System.out.println("The Thermostat heating up");
        a  = "Thermostat is on";
    }

    @Override
    public void turnOff() {
        System.out.println("The Thermostat is off");
        a  = "Thermostat is off";
    }

    @Override
    public String getStringStatus() {
        return a;
    }
}