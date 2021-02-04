package be.hvwebsites.landen.repositories;

import be.hvwebsites.landen.domain.Land;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LandRepository extends JpaRepository<Land, String> {
}
