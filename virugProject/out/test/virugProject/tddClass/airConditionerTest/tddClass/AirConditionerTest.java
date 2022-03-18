package tddClass;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AirConditionerTest {

    @Test
    public void turnOnTest() {
        NewAirCondition media1 = new NewAirCondition();
        media1.turnOn(true);
        assertEquals(true,media1.getPowerStatus());

    }

    @Test
    public void turnOffTest() {
        NewAirCondition media1 = new NewAirCondition();
        media1.turnOff(false);
        assertEquals(false, media1.getPowerStatus());

    }

    @Test
    public void increaseTemperature() {
        NewAirCondition media1 = new NewAirCondition();
        media1.setTemperature(16);
        assertEquals(16,media1.getTemperature());

    }
    @Test
    public void decreaseTemperature() {
        NewAirCondition media1 = new NewAirCondition();
        media1.setTemperature(23);
        assertEquals(20,media1.getPowerStatus());
    }

}

