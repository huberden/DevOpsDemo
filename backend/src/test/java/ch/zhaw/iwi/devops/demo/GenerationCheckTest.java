package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GenerationCheckTest {

    @Test

    public void GenerationCheckAlpha(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation Alpha", ac.CHECK_ING(2011));

    }

    @Test

    public void GenerationCheckZ(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation Z", ac.CHECK_ING(2000));
    }
    
    @Test

    public void GenerationCheckY(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation Y", ac.CHECK_ING(1992));
    }

    @Test

    public void GenerationCheckX(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation X", ac.CHECK_ING(1968));
    }

    @Test

    public void GenerationCheckBoomer(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation Boomer", ac.CHECK_ING(1960));
    }

    @Test

    public void GenerationCheckSilent(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation Silent", ac.CHECK_ING(1945));
    }

    @Test

    public void GenerationCheckBeta(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("unbestimmt", ac.CHECK_ING(2043));
    }

    @Test

    public void GenerationCheckBeta2(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("Generation Beta", ac.CHECK_ING(2040));
    }

    @Test

    public void GenerationCheckNodate(){
        GenerationCheck ac = new GenerationCheck();
        assertEquals("unbestimmt", ac.CHECK_ING(30000));
    }
}
