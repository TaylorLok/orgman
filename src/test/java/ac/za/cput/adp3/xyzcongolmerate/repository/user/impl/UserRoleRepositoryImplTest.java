package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserRoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserRoleRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRoleRepositoryImplTest {

    private UserRole userRole = UserRoleFactory.buildUserRole("222","jerome@yahoo.com","45");
    private UserRoleRepository repository = UserRoleRepositoryImpl.getUserRoleRepository();

    @Test
    public void a_create() {
        assertEquals(repository.create(userRole),repository.create(userRole));
        System.out.println(userRole);
    }

    @Test
    public void b_read() {
        assertEquals(repository.read(userRole),repository.read(userRole));
    }

    @Test
    public void c_update() {
        assertEquals(repository.update(userRole),repository.update(userRole));
        System.out.println(userRole.getOrgCode() +1 );
    }

    @Test
    public void e_delete() {
        this.repository.delete(userRole);
        System.out.println(userRole.getUserEmail() );
    }

    @Test
    public void d_getAll() {
        Set<UserRole> all = this.repository.getAll();
    }


}