package practice.inheritance;

class SmartLight implements SmartDevice,VoiceControl{

    String a;

    @Override
    public void response(String command) {
        System.out.println("The "+command+" command got");
    }

    @Override
    public void turnOn() {
        System.out.println("The light turned on");
        a  = "Light is on";
    }

    @Override
    public void turnOff() {
        System.out.println("The light turned off");
        a  = "Light is off";
    }

    @Override
    public String getStringStatus() {
        return a;
    }
}
