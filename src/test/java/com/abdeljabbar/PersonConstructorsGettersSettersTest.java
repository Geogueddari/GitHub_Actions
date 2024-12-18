package com.abdeljabbar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;




//import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;

import org.junit.Test;

public class PersonConstructorsGettersSettersTest {

    @Test
    public void testPersonClass() {

        Person abdeljabbar = new Person();
        abdeljabbar.setFirstName("abdeljabbar");
        abdeljabbar.setLastName("elgaddari");
        abdeljabbar.setBirthDate(LocalDate.of(2004, 4, 5));
        //test with standard junit assert 
        assertNotNull(abdeljabbar);
        assertEquals("abdeljabbar", abdeljabbar.getFirstName());
        assertEquals("elgaddari", abdeljabbar.getLastName());
        assertEquals(LocalDate.of(2004, 4, 5), abdeljabbar.getBirthDate());
        assertEquals(LocalDate.now().getYear() - abdeljabbar.getBirthDate().getYear(), abdeljabbar.calculateAge());
        //test with assertJ
        assertThat(abdeljabbar.getFirstName()).isEqualTo("abdeljabbar");
        assertThat(abdeljabbar.getFirstName()).isEqualTo("abdeljabba");
    }
}
