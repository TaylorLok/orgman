package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRepositoryImplTest {
    private User user = UserFactory.buildUser("danny@yahoo.com","Daniel","Endeta");
    private UserRepository repository = UserRepositoryImpl.getUserRepository();

    @Test
    public void a_create() {
        assertEquals(repository.create(user),repository.create(user));
    }

    @Test
    public void b_read() {
        assertEquals(repository.read("003"),repository.read("004"));
    }

    @Test
    public void c_update() {
        assertEquals(repository.update(user),repository.update(user));
    }

    @Test
    public void e_delete() {
        this.repository.delete(user.getUserEmail());
        this.repository.delete(user.getFirstName());
        this.repository.delete(user.getLastName());
    }

    @Test
    public void d_getAll() {
        Set<User> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}