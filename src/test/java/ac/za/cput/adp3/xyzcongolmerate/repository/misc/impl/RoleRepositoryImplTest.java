package ac.za.cput.adp3.xyzcongolmerate.repository.misc.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.misc.RoleRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoleRepositoryImplTest {
    private Role role = RoleFactory.buildRole("Manager");
    private RoleRepository roleRepository = RoleRepositoryImpl.getRoleRepository();

    @Test
    public void a_create() {
        assertEquals(roleRepository.create(role),roleRepository.create(role));
    }

    @Test
    public void b_read() {
        assertEquals(roleRepository.read("002"),roleRepository.read("002"));
    }

    @Test
    public void c_update() {
        assertEquals(roleRepository.update(role),roleRepository.update(role));
    }

    @Test
    public void e_delete() {
        this.roleRepository.delete("002");
    }

    @Test
    public void d_getAll() {
        Set<Role> all = this.roleRepository.getAll();
        System.out.println("In getAll, all = " + all);

        System.out.println(role);
    }

}