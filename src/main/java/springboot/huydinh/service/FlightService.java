package springboot.huydinh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.huydinh.entity.flight;
import springboot.huydinh.repository.FlightRepository;

import java.util.List;

@Service
@Transactional
public class FlightService {
	@Autowired 
	private FlightRepository flightRepository;
	
	public FlightRepository getFlightRepo() {

		return flightRepository;
	}
	
	public List<flight> getAllFlight() {

		return flightRepository.lstSearchFlight();
	}

	public List<flight> getFlightCau4() {
		return flightRepository.lstFlightCau4();
	}

	public List<flight> getFlightCau5() {
		return flightRepository.lstFlightCau5(); }
}
