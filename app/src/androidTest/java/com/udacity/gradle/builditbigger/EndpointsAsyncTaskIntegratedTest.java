package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskIntegratedTest {

    @Test
    public void testJokeIsNotEmpty() throws Exception{
        EndpointsAsyncTaskTester endpointsAsyncTask= new EndpointsAsyncTaskTester();
        endpointsAsyncTask.execute(InstrumentationRegistry.getContext());
        String joke = endpointsAsyncTask.get(5, TimeUnit.SECONDS);
        assertFalse(joke.isEmpty());
    }

}