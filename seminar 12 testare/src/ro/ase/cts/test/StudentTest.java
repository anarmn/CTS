package ro.ase.cts.test;

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



}