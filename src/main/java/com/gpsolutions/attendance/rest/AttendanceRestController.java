package com.gpsolutions.attendance.rest;


import com.gpsolutions.attendance.dto.UserDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendanceRestController {

    @GetMapping(value = "/list")
    public List<UserDto> getUsersList(@RequestParam(value = "namePart", defaultValue = "") String namePart) {

        return new ArrayList<>();
    }

    @RequestMapping(path = "/status", method = RequestMethod.GET)
    public Boolean getUserPresenceOnFloor(@RequestParam(value = "user") String ldapId, @RequestParam(value = "floor") Integer floor) {
        return false;
    }


}
