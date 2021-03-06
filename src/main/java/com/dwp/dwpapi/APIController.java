package com.dwp.dwpapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class APIController
{
    @Autowired
    private RestTemplate restTemplate;

    private static String url = "https://bpdts-test-app.herokuapp.com/city/London/users";

    @GetMapping("/city/London/users")
    public List<Object> getUsersLondon()
    {
        Object[] usersLondon = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(usersLondon);
    }

}
