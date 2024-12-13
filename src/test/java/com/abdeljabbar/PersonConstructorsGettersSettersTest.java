package com.abdeljabbar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;



public class PersonConstructorsGettersSettersTest {

    @Test
    public void testPersonClass() {

        Person abdeljabbar = new Person();
        abdeljabbar.setFirstName("abdeljabbar");
        abdeljabbar.setLastName("elgaddari");
        abdeljabbar.setBirthDate(LocalDate.of(2004, 4, 5));

        assertNotNull(abdeljabbar);
        assertEquals("abdeljabbar", abdeljabbar.getFirstName());
        assertEquals("elgaddari", abdeljabbar.getLastName());
        assertEquals(LocalDate.of(2004, 4, 5), abdeljabbar.getBirthDate());

    }
}
