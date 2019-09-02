package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    Role role = RoleFactory.buildRole("Manager");

    @Test
    public void buildRole() {

        assertEquals(role,role);
        assertNotNull(role);

        System.out.println(role);

        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the RoleFactory class
         * 4. Assert that the id is generated.
         */
    }
}