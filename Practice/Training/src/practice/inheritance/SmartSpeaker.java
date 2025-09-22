package practice.inheritance;

class SmartSpeaker implements SmartDevice,VoiceControl{

    String a;
    @Override
    public void response(String command) {
        System.out.println("The "+command+" command got");
    }

    @Override
    public void turnOn() {
        System.out.println("The Speaker Playing music");
        a  = "Speaker is on";
    }

    @Override
    public void turnOff() {
        System.out.println("The Speaker is not played");
        a  = "Speaker is off";
    }

    @Override
    public String getStringStatus() {
        return a;
    }
}
