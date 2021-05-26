package itacademy.finalproject.repository;

import itacademy.finalproject.entity.Cement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CementRepository extends JpaRepository<Cement,Long> {
}
