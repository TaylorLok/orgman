package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    OrganisationUser orgUser = OrganisationUserFactory.buildOrganisationUser("001","taylor@nextdevsolution.co.za");

    @Test
    public void buildOrganisationUser() {
        assertEquals(orgUser,orgUser);
        assertNotNull(orgUser);

        System.out.println(orgUser);
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 1. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 2. Test the OrganisationUserFactory class
         * 3. Assert that the an object is created.
         */
    }
}