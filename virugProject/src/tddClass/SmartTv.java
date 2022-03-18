package tddClass;

public class SmartTv {

    private boolean powerOn;
    private boolean powerOff;
    private boolean mute;

    public void powerOn(boolean status) {
        powerOn = status;
    }

    public boolean getPowerOn(){
        return powerOn;
    }

    public boolean getpowerOn() {
        return powerOn;
    }

    public void powerOff(boolean status) {
        powerOff =  status;
    }
}
