package be.hvwebsites.landen.services;

import be.hvwebsites.landen.repositories.LandRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class DefaultLandService implements LandService{
    private final LandRepository repository;

    public DefaultLandService(LandRepository repository) {
        this.repository = repository;
    }

    @Override
    public long findAantal() {
        return repository.count();
    }
}
