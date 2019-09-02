package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.GenderRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderRepositoryImplTest {

    private Gender gender = GenderFactory.buildGender("Male");
    private GenderRepository genderRepository = GenderRepositoryImpl.genderRepository();

    @Test
    public void a_create() {

        assertEquals(genderRepository.create(gender),genderRepository.create(gender));
    }

    @Test
    public void b_read() {
        assertEquals(genderRepository.read("22"),genderRepository.read("22"));
    }

    @Test
    public void c_update() {
        assertEquals(genderRepository.update(gender),genderRepository.update(gender));
    }

    @Test
    public void e_delete() {
        this.genderRepository.delete("22");
    }

    @Test
    public void d_getAll() {
        Set<Gender> all = this.genderRepository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}