package ro.ase.cts.test;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import ro.ase.cts.categories.TesteRight;
import ro.ase.cts.categories.TesteUrgente;
import ro.ase.cts.clase.Grupa;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    @Category(TesteRight.class)
    public void testConstructorRight(){
        Grupa grupa = new Grupa(1086);
        assertEquals(1086, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaInferioara(){
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    @Category(TesteUrgente.class)
    public void testConstructorLimitaSuperioara(){
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorException(){
        Grupa grupa = new Grupa(900);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorExceptionSup(){
        Grupa grupa = new Grupa(1200);
    }

    @Test(timeout = 500)
    public void testConstructorPerformance(){
        Grupa grupa = new Grupa(1086);
    }

    @Test
    public void testConstructorRange(){
        Grupa grupa =new Grupa(1001) ;
        assertEquals(1001,grupa.getNrGrupa());
        Grupa grupa2 =new Grupa(1099) ;
        assertEquals(1099,grupa2.getNrGrupa());
    }

    @Test
    public void testConstructorExistance(){
        Grupa grupa=new Grupa(1034);
        assertNotNull(grupa.getStudenti());
    }







}