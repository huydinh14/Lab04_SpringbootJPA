package springboot.huydinh;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.huydinh.entity.flight;
import springboot.huydinh.service.EmployeeService;
import springboot.huydinh.service.FlightService;
import springboot.huydinh.service.PlaneService;


@SpringBootTest
class ApplicationTests {
    @Autowired
    FlightService flightService;
    @Autowired
    PlaneService planeService;
    @Autowired
    EmployeeService employeeService;

    @Test
    void cau1() {
        System.out.println("1.\tCho biết các chuyến bay đi Đà Lạt (DAD).");
        List<flight> lstFl = flightService.getAllFlight();
        lstFl.forEach(System.out::println);
    }

    @Test
    void cau2(){
        System.out.println("2.\tCho biết các loại máy bay có tầm bay lớn hơn 10,000km");
        planeService.getPlane();
    }

    @Test
    void cau3(){
        System.out.println("3.\t Tìm các nhân viên có lương nhỏ hơn 10,000.");
        employeeService.finAllCau3().forEach(System.out::println);
    }

    @Test
    void cau4(){
        System.out.println("4.\t Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.");
        flightService.getFlightCau4();
    }


    @Test
    void cau5(){
        System.out.println("5.\t Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).");
        flightService.getFlightCau5();
    }
}
