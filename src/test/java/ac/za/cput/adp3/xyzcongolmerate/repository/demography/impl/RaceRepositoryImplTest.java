package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.RaceRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaceRepositoryImplTest {

    private Race race = RaceFactory.buildRace("BlackPanther");
    private RaceRepository raceRepository = RaceRepositoryImpl.getRaceRepository();

    @Test
    public void a_create() {
        assertEquals(raceRepository.create(race),raceRepository.create(race));
    }

    @Test
    public void b_read() {
        assertEquals(raceRepository.read("001"),raceRepository.read("001"));
    }

    @Test
    public void c_update() {
        assertEquals(raceRepository.update(race),raceRepository.update(race));
    }

    @Test
    public void e_delete() {
        this.raceRepository.delete("001");
    }

    @Test
    public void d_getAll() {
        Set<Race> all = this.raceRepository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}