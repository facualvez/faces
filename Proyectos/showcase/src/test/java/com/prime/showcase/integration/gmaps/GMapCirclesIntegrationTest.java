package com.prime.showcase.integration.gmaps;

import com.prime.showcase.integration.AbstractIntegrationTest;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.openqa.selenium.NoSuchElementException;

public class GMapCirclesIntegrationTest extends AbstractIntegrationTest {
    
    protected static final String TEST_URL = PRIME_SHOWCASE_UI + "gmapCircle.jsf";
    
    @BeforeClass
    public static void init(){
        driver.get(TEST_URL);
    }
    
    @Test
    public void shouldVerifyDOM(){
        
        try{
            
           assertTrue("Should map displayed.", findElementBySelector("div#gmap").isDisplayed());
           
        }
        catch(NoSuchElementException e){
            assertTrue("GMap Circles showcase DOM not verified.", false);
        }
    }
}
