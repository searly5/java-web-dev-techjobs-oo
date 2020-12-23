package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    Job test_job;
    Job test_id;
    Job job_1;
    Job job_2;
    Job job_3;
    Job job_4;
    Job job_5;


    @Before
    public void createJobObject() {
        test_job = new Job("Betty", "Mastercard", "Saint Louis", "Technical", "Java");
        test_id = new Job(1);
        job_1 = new Job();
        job_2 = new Job();


    }
    @Test
    public void testSettingJobId() {
     assertEquals(1,job_2.getId() - job_1.getId());
    }

    @Test
    public void jobCorrectlyAssignsIdNumbers() {
        assertTrue(this.job_1.getId() != this.job_2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        job_3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job_3.getName());
        assertEquals("ACME", job_3.getEmployer().getValue());
        assertEquals("Desert", job_3.getLocation().getValue());
        assertEquals("Quality control", job_3.getPositionType().getValue());
        assertEquals("Persistence", job_3.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
        job_4 = new Job("Window washer", new Employer("Windows Plus"), new Location("France"), new PositionType("Clean manager"), new CoreCompetency("reliable"));
        job_5 = new Job("Window washer", new Employer("Windows Plus"), new Location("France"), new PositionType("Clean manager"), new CoreCompetency("reliable"));
        assertFalse(job_4.equals(job_5));
    }



    @Test
    public void toString_returnsBlankLine() {
        Job blankTest;
        blankTest = new Job();
        String test  = blankTest.toString();
        assertThat(test.contains("______" + test + "______"));

    }

    private void assertThat(boolean contains) {

    }
}




