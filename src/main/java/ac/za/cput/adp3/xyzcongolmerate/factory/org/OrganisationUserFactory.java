package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;

public class OrganisationUserFactory {


    public static OrganisationUser buildOrganisationUser(String orgCode, String userEmail) {
        OrganisationUser org = new OrganisationUser(orgCode,userEmail);
        return org;
        /**
         * Your implementation goes here
         * INSTRUCTIONS
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not supported yet.");]
         * 3. Create and return an object of OrganisationUser
         */
    }
}
