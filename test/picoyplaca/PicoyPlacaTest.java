/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoyplaca;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carol
 */
public class PicoyPlacaTest {

    public PicoyPlacaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of circulacion  method, of class PicoyPlaca.
     */
    @Test
    public void testCirculacion() throws Exception {
        PicoyPlaca placa= new PicoyPlaca(); 

        System.out.println("* ProyectoHotel: testProcessInputFile()");
        assertEquals("success", placa.circulacion("PPI0214", "16 May 2016", "9:30"));
        assertEquals("success", placa.circulacion("PBX2901", "25 May 2015", "16:30"));
        assertEquals("success", placa.circulacion("PCN2056", "30 May 2016", "12:00"));
        assertEquals("success", placa.circulacion("PBA2900", "14 Jun 2016", "18:15"));
        assertEquals("success", placa.circulacion("GHZ0466", "30 Jun 2016", "20:10"));
        assertEquals("success", placa.circulacion("POF0250", "16 Jul 2016", "14:20"));
        assertEquals("success", placa.circulacion("IBB0517", "16 Aug 2016", "7:22"));
        
       

    }

    /**
     * Test of main method, of class PicoyPlaca.
     */
    @Test
    public void testMain() throws Exception {

    }

}
