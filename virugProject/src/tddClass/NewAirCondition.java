package tddClass;

public class NewAirCondition {
    private boolean powerStatus;
    private int temperature;

    public void turnOn(boolean status) {
        powerStatus = status;
    }
    public void turnOff(boolean status) {
        powerStatus = status;
    }

    public boolean getPowerStatus(){
        return powerStatus;
    }


    public void setTemperature(int value1) {
        if (value1 >= 16) if (value1 <= 30)
            temperature = value1;
        else
            temperature = 16;
    }

    public int getTemperature(){
        return temperature;
    }

    public void increaseTemperature(){
        if (temperature >= 16) if (temperature <= 30)
            temperature = temperature + 1;

        if (temperature < 16)
            temperature = 16;

        if (temperature > 30)
            temperature = 30;
    }
    public void decreaseTemperature() {
        if (temperature >= 16) if (temperature <= 30)
            temperature = temperature - 1;

        if (temperature < 16)
            temperature = 16;

        if (temperature > 30)
            temperature = 30;
    }

    public void turnOn() {
    }
}

