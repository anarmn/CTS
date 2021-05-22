package ro.ase.cts.test;

import org.junit.Test;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class StudentTest {

    @org.junit.Test
    public void getNume() {
        String nume = "Gigel";
        Student student = new Student(nume);
//        if (nume.equals(student.getNume())){
//            System.out.println("e ok");
//        }else{
//            System.out.println("constructorul nu initializeaza numele corect");
//        }
        assertEquals(nume, student.getNume());
    }

    @org.junit.Test
    public void setNume() {
        String nume = "Popescu";
        Student student = new Student();
        student.setNume(nume);
        assertEquals(nume, student.getNume());
    }

    @org.junit.Test
    public void testConstructorDefault() {
        Student student = new Student();
        //assertNotEquals(null, student.getNote());
        assertNotNull("Lista de note nu a fost initializata", student.getNote());
        assertNotNull("Numele nu a fost initializata", student.getNume());
    }

    @org.junit.Test
    public void testAdaugaNota() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));
    }

    @Test
    public void testGetNote(){
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(1);
        student.adaugaNota(0);
        student.adaugaNota(9);
        assertEquals(9, student.getNota(3));
    }

    @Test
    public void testAdaugaNotaUnica(){
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(1, student.getNote().size());
    }

    @Test
    public void testAdaugaNotaIncorecta(){
        Student student = new Student();

        try{
            student.adaugaNota(-1);
            // 3 - nu se ajunge aici
            fail("nu trebuia sa ajung aici. Metoda nu arunca exceptie");
        }catch(IllegalArgumentException e){
            //4 se executa
        }catch (Exception e){
            // 5 nu ajunge aici
            fail("Nu arunca exceptia corecta");
        }
        // ajunge aici
    }

    @Test(expected = IllegalArgumentException.class)
    public void adaugaNotaIncorecta(){
        Student student = new Student();
        student.adaugaNota(-1);
    }

    @org.junit.Test
    public void studentulAreRestante(){
        Student student =  new Student();
        student.adaugaNota(4);
        boolean rezultat = student.areRestante();

//        assertEquals(true,rezultat);
        assertTrue(rezultat);
    }

    @org.junit.Test
    public void studentulNuAreRestante(){
        Student student =  new Student();
        student.adaugaNota(6);
        boolean rezultat = student.areRestante();

        assertFalse(rezultat);
    }

    @Test
    public void testCalculeazaMedieCorecta(){
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        assertEquals(9.5, student.calculeazaMedie(), 0.001);
    }



}