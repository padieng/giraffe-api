package edu.uncg.giraffegallery.giraffe_api;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GiraffeRepository extends JpaRepository<Giraffe, Long> {
    List<Giraffe> findBySpeciesIgnoreCase(String species);
    List<Giraffe> findByNameContainingIgnoreCase(String name);
}
