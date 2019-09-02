package ac.za.cput.adp3.xyzcongolmerate.service.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserRoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.impl.UserRoleRepositoryImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRoleServiceImplTest {

    private UserRoleRepositoryImpl repository;
    private UserRole userRole;

    @Before
    public void setUp() throws Exception
    {
        this.repository = (UserRoleRepositoryImpl) UserRoleRepositoryImpl.getUserRoleRepository();
        userRole = UserRoleFactory.buildUserRole("541","tay@com","29");
    }

    @Test
    public void a_create() {
        UserRole created = this.repository.create(userRole);
        System.out.println(userRole);
    }

    @Test
    public void b_read() {
        this.repository.read(userRole);
    }

    @Test
    public void c_update() {
        this.repository.update(userRole);
    }

    @Test
    public void e_delete() {
        this.repository.delete(userRole);
    }

    @Test
    public void d_getAll() {
        Set<UserRole> userdemos = this.repository.getAll();
    }
}