package itacademy.finalproject.repository;

import itacademy.finalproject.entity.Window;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WindowRepository extends JpaRepository<Window,Long> {
}
