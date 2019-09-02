package ac.za.cput.adp3.xyzcongolmerate.service.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationUserFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.impl.OrganisationUserRepositoryImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrganisationUserServiceImplTest {

    private OrganisationUserRepositoryImpl repository;
    private OrganisationUser org;

    @Before
    public void setUp() throws Exception
    {
        this.repository = (OrganisationUserRepositoryImpl) OrganisationUserRepositoryImpl.getOrganisationUserRepository();
        org = OrganisationUserFactory.buildOrganisationUser("111","tyrr");
    }


    @Test
    public void a_create() {
        OrganisationUser created = this.repository.create(org);
        System.out.println(org);
    }

    @Test
    public void b_read() {
        this.repository.read(org.getOrgCode(),org.getUserEmail());
    }

    @Test
    public void c_update() {
        this.repository.update(org);
    }

    @Test
    public void e_delete() {
        this.repository.delete("111","trry");
    }

    @Test
    public void d_getAll() {
        Set<OrganisationUser> org = this.repository.getAll();
    }
    @Test
    public void e_getUserFullNamesInOrganisation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Test
    public void f_getUserOrganisations() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}