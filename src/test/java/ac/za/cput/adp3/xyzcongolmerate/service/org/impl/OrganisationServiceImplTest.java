package ac.za.cput.adp3.xyzcongolmerate.service.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.impl.OrganisationRepositoryImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrganisationServiceImplTest {

    private OrganisationRepositoryImpl repository;
    private Organisation org;

    @Before
    public void setUp() throws Exception
    {
        this.repository = (OrganisationRepositoryImpl) OrganisationRepositoryImpl.getOrganisationRepository();
        org = OrganisationFactory.buildOrganisation("Nextdev");
    }

    @Test
    public void a_create() {
        Organisation created = this.repository.create(org);
        System.out.println(org);
    }

    @Test
    public void b_read() {
        this.repository.read(org.getOrgName());
    }

    @Test
    public void c_update() {
        this.repository.update(org);
    }

    @Test
    public void e_delete() {
        this.repository.delete("2221");
    }

    @Test
    public void d_getAll() {
        Set<Organisation> roles = this.repository.getAll();
    }
}