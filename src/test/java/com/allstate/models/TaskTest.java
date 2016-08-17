package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by localadmin on 8/17/16.
 */
public class TaskTest {
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateAnInstanceOfTask() throws Exception {
        Task task = new Task();
        assertThat(task, instanceOf(Task.class));
    }

    @Test
    public void shouldGetAndSetAnIdOnTask() throws Exception {
        Task task = new Task();
        task.setId(55);
        assertEquals(55, task.getId());
    }

    @Test
    public void shouldGetAndSetANameOnTask() throws Exception {
        Task task = new Task();
        task.setName("Pizza");
        assertEquals("Pizza", task.getName());
    }

    @Test
    public void shouldGetAndSEtACategoryOnTask() throws Exception {
        Task task = new Task();
        task.setCategory("Pets");
        assertEquals("Pets", task.getCategory());
    }

    @Test
    public void shouldGetAndSetDueOnTask() throws Exception {
        Task task = new Task();
        task.setDue(format.parse("2016-06-06"));
        assertEquals("Mon Jun 06 00:00:00 CDT 2016", task.getDue().toString());
    }

    @Test
    public void shouldGetandSetisComplete() throws Exception {
        Task task = new Task();
        task.setComplete(true);
        assertEquals(true, task.isComplete());

    }
    @Test
    public void shouldGetandSetCreatedAt() throws Exception {
        Task task = new Task();
        task.setCreatedAt(format.parse("2016-06-06"));
        assertEquals("Mon Jun 06 00:00:00 CDT 2016", task.getCreatedAt().toString());

    }

    @Test
    public void shouldGetandSetUpdatedAt() throws Exception {
        Task task = new Task();
        task.setUpdatedAt(format.parse("2016-06-06"));
        assertEquals("Mon Jun 06 00:00:00 CDT 2016", task.getUpdatedAt().toString());
    }
}