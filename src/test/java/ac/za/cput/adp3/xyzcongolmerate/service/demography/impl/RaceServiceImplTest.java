package ac.za.cput.adp3.xyzcongolmerate.service.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl.RaceRepositoryImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaceServiceImplTest {

    private RaceRepositoryImpl repository;
    private Race race;

    @Before
    public void setUp() throws Exception
    {
        this.repository = (RaceRepositoryImpl) RaceRepositoryImpl.getRaceRepository();
        race = RaceFactory.buildRace("Black");
    }

    @Test
    public void a_create() {
        Race created = this.repository.create(race);
        System.out.println(race);
    }

    @Test
    public void b_read() {
        this.repository.read(race.getRaceId());
    }

    @Test
    public void c_update() {
        this.repository.update(race);
    }

    @Test
    public void e_delete() {
        this.repository.delete("2221");
    }

    @Test
    public void d_getAll() {
        Set<Race> races = this.repository.getAll();
    }
}