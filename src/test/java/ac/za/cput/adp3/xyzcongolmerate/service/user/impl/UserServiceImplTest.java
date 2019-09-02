package ac.za.cput.adp3.xyzcongolmerate.service.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.impl.UserRepositoryImpl;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.impl.UserRoleRepositoryImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserServiceImplTest {

    private UserRepositoryImpl repository;
    private User user;

    @Before
    public void setUp() throws Exception
    {
        this.repository = (UserRepositoryImpl) UserRepositoryImpl.getUserRepository();
        user = UserFactory.buildUser("tay@com","Taylor","Lokamba");
    }

    @Test
    public void a_create() {
        User created = this.repository.create(user);
        System.out.println(user);
    }

    @Test
    public void b_read() {
        this.repository.read(user.getUserEmail());
    }

    @Test
    public void c_update() {
        this.repository.update(user);
    }

    @Test
    public void e_delete() {
        this.repository.delete(user.getUserEmail());
    }

    @Test
    public void d_getAll() {
        Set<User> users = this.repository.getAll();
    }
}