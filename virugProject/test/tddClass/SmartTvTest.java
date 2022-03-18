package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartTvTest {





    @Test
public void TvRemoteOn(){

        SmartTv codeBlock = new SmartTv();
        codeBlock.powerOn(true);
        assertEquals(true,codeBlock.getpowerOn());

    }
@Test
    public void TvRemoteOff(){
        SmartTv codeBlock = new SmartTv();
        codeBlock.powerOff(false);

}

@Test
    public void TvRemoteMute(){
        SmartTv codeBlock = new SmartTv();

}




}
