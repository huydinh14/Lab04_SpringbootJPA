package springboot.huydinh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.huydinh.entity.employee;
import springboot.huydinh.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String home()
    {
        return "home";
    }

    @GetMapping("/cau3")
    public List<employee> getCau3()
    {
       return employeeService.finAllCau3();
    }

//    @GetMapping("/cau2")
//    public List<employee> getEmp()
//    {
//        return employeeService.finAllCau1();
//    }
}
