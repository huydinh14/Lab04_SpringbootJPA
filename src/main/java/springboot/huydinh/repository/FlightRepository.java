package springboot.huydinh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import springboot.huydinh.entity.flight;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<flight, String>{
	// Cho biết các chuyến bay đi Đà Lạt (DAD).
		@Query(value = "select f from flight f where f.GaDen='DAD'")
		public List<flight> lstSearchFlight();
		@Query(value = "select f from flight  f where f.DoDai > 8000 and f.DoDai < 10000")
		public List<flight> lstFlightCau4();
		@Query(value = "select f from flight  f where f.GaDi='SGN' and f.GaDen='BMV'")
		public List<flight> lstFlightCau5();
}
