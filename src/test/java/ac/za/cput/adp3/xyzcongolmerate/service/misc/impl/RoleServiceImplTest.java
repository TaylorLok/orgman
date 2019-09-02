package ac.za.cput.adp3.xyzcongolmerate.service.misc.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.misc.impl.RoleRepositoryImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoleServiceImplTest {

    private RoleRepositoryImpl repository;
    private Role role;

    @Before
    public void setUp() throws Exception
    {
        this.repository = (RoleRepositoryImpl) RoleRepositoryImpl.getRoleRepository();
        role = RoleFactory.buildRole("Barista");
    }

    @Test
    public void a_create() {
        Role created = this.repository.create(role);
        System.out.println(role);
    }

    @Test
    public void b_read() {
        this.repository.read(role.getRoleId());
    }

    @Test
    public void c_update() {
        this.repository.update(role);
    }

    @Test
    public void e_delete() {
        this.repository.delete("2221");
    }

    @Test
    public void d_getAll() {
        Set<Role> roles = this.repository.getAll();
    }
}