package springboot.huydinh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.huydinh.entity.flight;
import springboot.huydinh.service.FlightService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FlightController {
    @Autowired
    FlightService flightService;

    @GetMapping("/cau1")
    @PreAuthorize("hasAnyAuthority('PM')")
    public List<flight> getCau1()
    {
        return flightService.getAllFlight();
    }

    @GetMapping("/cau4")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public List<flight> getCau4()
    {
        return flightService.getFlightCau4();
    }

    @GetMapping("/cau5")
    public List<flight> getCau5()
    {
        return flightService.getFlightCau5();
    }
}
