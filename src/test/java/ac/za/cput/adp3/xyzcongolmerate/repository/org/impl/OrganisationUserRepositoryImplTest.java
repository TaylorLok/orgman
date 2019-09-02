package ac.za.cput.adp3.xyzcongolmerate.repository.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationUserFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationUserRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrganisationUserRepositoryImplTest {

    private OrganisationUser orgUser = OrganisationUserFactory.buildOrganisationUser("88","emile@yahoo.com");
    private OrganisationUserRepository repository = OrganisationUserRepositoryImpl.getOrganisationUserRepository();

    @Test
    public void a_create() {
        assertEquals(repository.create(orgUser),repository.create(orgUser));
    }

    @Test
    public void b_read() {
        assertEquals(repository.read("88","emile@yahoo.com"),orgUser);
    }

    @Test
    public void c_update() {
        assertEquals(repository.update(orgUser),repository.update(orgUser));
    }

    @Test
    public void e_delete() {
        this.repository.delete("88","emile@yahoo.com");
    }

    @Test
    public void d_getAll() {
        Set<OrganisationUser> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);

    }
}