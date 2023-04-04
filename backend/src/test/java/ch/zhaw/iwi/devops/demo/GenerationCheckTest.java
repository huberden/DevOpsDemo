package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GenerationCheckTest {

    @Test

    public void GenerationCheckAlpha(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation Alpha", ac.Checking(2011));

    }

    @Test

    public void GenerationCheckZ(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation Z", ac.Checking(2000));
    }
    
    @Test

    public void GenerationCheckY(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation Y", ac.Checking(1992));
    }

    @Test

    public void GenerationCheckX(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation X", ac.Checking(1968));
    }

    @Test

    public void GenerationCheckBoomer(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation Boomer", ac.Checking(1960));
    }

    @Test

    public void GenerationCheckSilent(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation Silent", ac.Checking(1945));
    }

    @Test

    public void GenerationCheckBeta(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("unbestimmt", ac.Checking(2043));
    }

    @Test

    public void GenerationCheckBeta2(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation Beta", ac.Checking(2040));
    }

    @Test

    public void GenerationCheckNodate(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("unbestimmt", ac.Checking(30000));
    }

    @Test

    public void GenerationCheckNodate2(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("bevor Christus", ac.Checking(-2000));
    }
}
