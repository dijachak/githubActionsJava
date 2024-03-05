package com.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeTest {

    @Test
    public void testEquals() {
        Employe employe1 = new Employe();
        employe1.setIdEmploye(1);
        employe1.setNomEmploye("John Doe");
        employe1.setTelEmploye("123456789");
        employe1.setSalaireEmploye(50000.0);

        Employe employe2 = new Employe();
        employe2.setIdEmploye(1);
        employe2.setNomEmploye("John Doe");
        employe2.setTelEmploye("123456789");
        employe2.setSalaireEmploye(50000.0);

        assertEquals(employe1, employe2);
    }

    @Test
    public void testHashCode() {
        Employe employe = new Employe();
        employe.setIdEmploye(1);
        employe.setNomEmploye("Jane Smith");
        employe.setTelEmploye("987654321");
        employe.setSalaireEmploye(60000.0);

        int expectedHashCode = employe.hashCode();
        int actualHashCode = Objects.hash(1, "Jane Smith", "987654321", 60000.0);

        assertEquals(expectedHashCode, actualHashCode);
    }
}
