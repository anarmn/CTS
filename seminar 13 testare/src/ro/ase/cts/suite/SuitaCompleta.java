package ro.ase.cts.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.test.GrupaTest;
import ro.ase.cts.test.GrupaTestMock;
import ro.ase.cts.test.GrupaTestStudentFake;


@RunWith(Suite.class)
    @Suite.SuiteClasses({GrupaTest.class, GrupaTestMock.class, GrupaTestStudentFake.class})
    public class SuitaCompleta{

    }

