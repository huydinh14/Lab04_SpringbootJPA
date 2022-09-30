package springboot.huydinh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.huydinh.entity.plane;
import springboot.huydinh.service.PlaneService;

import java.util.List;

@RestController
@RequestMapping("api")
public class PlaneController {
    @Autowired
    PlaneService planeService;

    @GetMapping("/cau2")
    public List<plane> getCau2()
    {
        return planeService.getPlane();
    }
}
