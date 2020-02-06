package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    private static Job jobOne;
    private static Job jobTwo;
    private static Job testJob;
    private static Job testJobCopy;

    @Before
    public static void jobObjects() {
        jobOne = new Job();
        jobTwo = new Job();
        testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJobCopy = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }


    @Test
    public void testSettingJobId() {
        assertEquals(1, (jobTwo.getId() - jobOne.getId()), 0.001);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob.getName() instanceof String);
        assertEquals("Product Tester", testJob.getName());
        assertTrue(testJob.getName() instanceof Employer);
        assertEquals("ACME", testJob.getName());
        assertTrue(testJob.getName() instanceof Location);
        assertEquals("Desert", testJob.getName());
        assertTrue(testJob.getName() instanceof PositionType);
        assertEquals("Quality control", testJob.getName());
        assertTrue(testJob.getName() instanceof CoreCompetency);
        assertEquals("Persistence",  testJob.getName());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob.equals(testJobCopy));
    }
}
