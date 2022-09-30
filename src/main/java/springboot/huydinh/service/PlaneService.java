package springboot.huydinh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.huydinh.entity.plane;
import springboot.huydinh.repository.PlaneRepository;

import java.util.List;

@Service
@Transactional
public class PlaneService {
    @Autowired
    private PlaneRepository planeRepository;

    public List<plane> getPlane() {
         return planeRepository.lstPlane();
    }
}
