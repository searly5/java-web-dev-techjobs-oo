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
        test_job = new Job(
                "Betty",
                new Employer("Mastercard"),
                new Location("Saint Louis"),
                new PositionType("Technical"),
                new CoreCompetency("Java"));
        test_id = new Job();
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
        job_3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals("Product tester", job_3.getName());
        assertEquals("ACME", job_3.getEmployer().getValue());
        assertEquals("Desert", job_3.getLocation().getValue());
        assertEquals("Quality control", job_3.getPositionType().getValue());
        assertEquals("Persistence", job_3.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
        job_4 = new Job("Window washer",
                new Employer("Windows Plus"),
                new Location("France"),
                new PositionType("Clean manager"),
                new CoreCompetency("reliable"));
        job_5 = new Job("Window washer",
                new Employer("Windows Plus"),
                new Location("France"),
                new PositionType("Clean manager"),
                new CoreCompetency("reliable"));
        assertFalse(job_4.equals(job_5));
    }



    @Test
    public void toString_returnsBlankLine() {
        job_4 = new Job("Window washer",
                new Employer("Windows Plus"),
                new Location("France"),
                new PositionType("Clean manager"),
                new CoreCompetency("reliable"));

        String output =  String.format
                ("\nID: %d\n" +
                "Name: %s\n" +
                "Employer: %s\n" +
                "Location: %s\n" +
                "Position Type: %s\n" +
                "Core Competency: %s\n", job_4.getId(), job_4.getName(), job_4.getEmployer(), job_4.getLocation(), job_4.getPositionType(), job_4.getCoreCompetency());
         assertEquals(output, job_4.toString());


    }




}




