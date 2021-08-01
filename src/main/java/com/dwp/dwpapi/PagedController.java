package com.dwp.dwpapi;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.Arrays;

@RestController
public class PagedController
{
    @GetMapping(path = "/city/London/users")

            @PageableDefault(page = 0, size = 20)
            @SortDefault.SortDefaults({
                    @SortDefault(sort = "id", direction = SpringDataWebProperties.Sort.Direction.DESC),
                    @SortDefault(sort = "first_name", direction = SpringDataWebProperties.Sort.Direction.ASC),
                    @SortDefault(sort = "last_name", direction = SpringDataWebProperties.Sort.Direction.ASC),
                    @SortDefault(sort = "email", direction = SpringDataWebProperties.Sort.Direction.ASC),
                    @SortDefault(sort = "ip_address", direction = SpringDataWebProperties.Sort.Direction.ASC),
                    @SortDefault(sort = "latitude", direction = SpringDataWebProperties.Sort.Direction.ASC),
                    @SortDefault(sort = "longitude", direction = SpringDataWebProperties.Sort.Direction.ASC)
            })
                    Pageable pageable) {
        return Arrays.asList(usersLondon).findAllPage(pageable);

    }
}
