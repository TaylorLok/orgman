package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserDemographyFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserDemographyRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Date;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDemographyRepositoryImplTest {

    private UserDemography userDemography = UserDemographyFactory.buildUserDemography
            ("junior@yahoo.com","Mr", "222","211",new Date());
    private UserDemographyRepository repository = UserDemographyRepositoryImpl.getUserDemographyRepository();

    @Test
    public void a_create() {
        assertEquals(repository.create(userDemography),repository.create(userDemography));
    }

    @Test
    public void b_read() {
        assertEquals(repository.read("222"),repository.read("211"));
    }

    @Test
    public void c_update() {
        assertEquals(repository.update(userDemography),repository.update(userDemography));
    }

    @Test
    public void e_delete() {
        this.repository.delete(userDemography.getRaceId());
    }

    @Test
    public void d_getAll() {
        Set<UserDemography> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}