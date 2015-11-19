/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andersson.villa
 */
public class ConversorTest {
    Conversor instance;
    
    public ConversorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
        /**
     * Establecemos los parametros iniciales del test
     */
    @Before
    public void setUp() {
            instance = new Conversor();
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Comprobamos que el metodo transforme cualquier numero
     */
    @Test
    public void testRomanoDe() {  
        
        System.out.println("romanoDe Cualquiera");
        String numero = "1";
        String result = instance.romanoDe("999");
        assertEquals("CMXCIX", result);
        
    
    }

        /**
     * Comprobamos que el metodo transforme el numero 1
     */
    @Test
    public void romano_1(){
        System.out.println("romanoDe 1");
        String numero = "1";
        String result = instance.romanoDe("1");
        assertEquals("I", result);
        
    }
    
        /**
     * Comprobamos que el metodo transforme el numero 4
     */
    @Test
    public void romano_4(){
        System.out.println("romanoDe 4");
        String numero = "1";
        String result = instance.romanoDe("4");
        assertEquals("IV", result);
        
    }
    
        /**
     * Comprobamos que el metodo transforme el numero 9
     */
    @Test
    public void romano_9(){
        System.out.println("romanoDe 9");
        String numero = "1";
        String result = instance.romanoDe("9");
        assertEquals("IX", result);
        
    }
    
}
