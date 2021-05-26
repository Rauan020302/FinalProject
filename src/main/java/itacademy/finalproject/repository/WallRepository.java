package itacademy.finalproject.repository;

import itacademy.finalproject.entity.Wall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WallRepository extends JpaRepository<Wall,Long> {
}
