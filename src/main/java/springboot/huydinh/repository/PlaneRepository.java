package springboot.huydinh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import springboot.huydinh.entity.plane;

import java.util.List;

@Repository
public interface PlaneRepository extends JpaRepository<plane, Integer>{
    @Query(value = "select p from plane p where p.TamBay > 10000")
    public List<plane> lstPlane();
}
