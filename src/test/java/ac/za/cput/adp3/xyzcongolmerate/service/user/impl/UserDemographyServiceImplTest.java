package ac.za.cput.adp3.xyzcongolmerate.service.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserDemographyFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.impl.UserDemographyRepositoryImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Date;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDemographyServiceImplTest {

    private UserDemographyRepositoryImpl repository;
    private UserDemography userDemography;

    @Before
    public void setUp() throws Exception
    {
        this.repository = (UserDemographyRepositoryImpl) UserDemographyRepositoryImpl.getUserDemographyRepository();
        userDemography = UserDemographyFactory.buildUserDemography("tayl.com","Mr","22","78",new Date());
    }

    @Test
    public void a_create() {
        UserDemography created = this.repository.create(userDemography);
        System.out.println(userDemography);
    }

    @Test
    public void b_read() {
        this.repository.read(userDemography.getRaceId());
    }

    @Test
    public void c_update() {
        this.repository.update(userDemography);
    }

    @Test
    public void e_delete() {
        this.repository.delete("2221");
    }

    @Test
    public void d_getAll() {
        Set<UserDemography> userdemos = this.repository.getAll();
    }
}