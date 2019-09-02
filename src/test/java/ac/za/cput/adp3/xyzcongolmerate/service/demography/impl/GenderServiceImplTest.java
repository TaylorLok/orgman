package ac.za.cput.adp3.xyzcongolmerate.service.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl.GenderRepositoryImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderServiceImplTest {

    private GenderRepositoryImpl repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception
    {
        this.repository = (GenderRepositoryImpl) GenderRepositoryImpl.genderRepository();
        gender = GenderFactory.buildGender("Male");
    }

    @Test
    public void a_create() {
        Gender created = this.repository.create(gender);
        System.out.println(gender);
    }

    @Test
    public void b_read() {
        this.repository.read(gender.getGenderId());
    }

    @Test
    public void c_update() {
        this.repository.update(gender);
    }

    @Test
    public void e_delete() {
        this.repository.delete("2221");
    }

    @Test
    public void d_getAll() {
        Set<Gender> genders = this.repository.getAll();
    }
}