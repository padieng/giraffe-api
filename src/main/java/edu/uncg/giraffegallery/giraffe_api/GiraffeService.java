package edu.uncg.giraffegallery.giraffe_api;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GiraffeService {
    private final GiraffeRepository giraffeRepository;

    public GiraffeService(GiraffeRepository giraffeRepository) {
        this.giraffeRepository = giraffeRepository;
    }

    public List<Giraffe> getAllGiraffes() {
        return giraffeRepository.findAll();
    }

    public Giraffe getGiraffeById(Long id) {
        return giraffeRepository.findById(id).orElse(null);
    }

    public Giraffe addGiraffe(Giraffe giraffe) {
        return giraffeRepository.save(giraffe);
    }

    public Giraffe updateGiraffe(Long id, Giraffe giraffeDetails) {
        return giraffeRepository.findById(id).map(giraffe -> {
            giraffe.setName(giraffeDetails.getName());
            giraffe.setAge(giraffeDetails.getAge());
            giraffe.setSpecies(giraffeDetails.getSpecies());
            giraffe.setImageUrl(giraffeDetails.getImageUrl());
            return giraffeRepository.save(giraffe);
        }).orElse(null);
    }

    public void deleteGiraffe(Long id) {
        giraffeRepository.deleteById(id);
    }

    public List<Giraffe> getBySpecies(String species) {
        return giraffeRepository.findBySpeciesIgnoreCase(species);
    }

    public List<Giraffe> searchByName(String substring) {
        return giraffeRepository.findByNameContainingIgnoreCase(substring);
    }
}
