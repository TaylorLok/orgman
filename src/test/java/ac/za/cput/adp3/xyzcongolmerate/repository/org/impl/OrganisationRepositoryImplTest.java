package ac.za.cput.adp3.xyzcongolmerate.repository.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrganisationRepositoryImplTest {

    private Organisation organisation = OrganisationFactory.buildOrganisation("Nextdsolution");
    private OrganisationRepository repository = OrganisationRepositoryImpl.getOrganisationRepository();

    @Test
    public void a_create() {
        assertEquals(repository.create(organisation),repository.create(organisation));
    }

    @Test
    public void b_read() {
        assertEquals(repository.read("88"),repository.read("88"));
    }

    @Test
    public void c_update() {
       assertEquals(repository.update(organisation),repository.update(organisation));
    }

    @Test
    public void e_delete() {
        this.repository.delete(organisation.getOrgCode());
        System.out.println(organisation);
    }

    @Test
    public void d_getAll() {
        Set<Organisation> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);

        System.out.println(organisation);
    }
}