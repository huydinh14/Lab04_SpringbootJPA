package springboot.huydinh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.huydinh.entity.employee;
import springboot.huydinh.repository.EmployeeRepository;

import java.util.List;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public void getEmployee() {
        employeeRepository.listEmp().forEach(System.out::println);
    }
    
    public List<employee> finAll() {
        return employeeRepository.findAll();
    }
    
    public List<employee> finAllCau3() {
        return employeeRepository.listEmp();
    }
}
