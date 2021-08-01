package com.dwp.dwpapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DwpApiApplicationTests {

    @Test
    void apicontrollertest()
    {
        APIController apiController = new APIController();
        Object[]  userArray = apiController.getUsersLondon().toArray();
        Arrays.asList(userArray);
        // Assert
        assertEquals(Arrays.asList(794,"Katee","Gopsall",
                "kgopsallm1@cam.ac.uk","203.138.133.164",
                5.7204203,10.901604), Arrays.stream(userArray).toList());
    }

}
