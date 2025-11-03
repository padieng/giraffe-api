package edu.uncg.giraffegallery.giraffe_api;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/giraffes")
public class GiraffeController {
    private final GiraffeService giraffeService;

    public GiraffeController(GiraffeService giraffeService) {
        this.giraffeService = giraffeService;
    }

    // GET all giraffes
    @GetMapping
    public List<Giraffe> getAllGiraffes() {
        return giraffeService.getAllGiraffes();
    }

    // GET giraffe by ID
    @GetMapping("/{id}")
    public Giraffe getGiraffeById(@PathVariable Long id) {
        return giraffeService.getGiraffeById(id);
    }

    // POST (add giraffe)
    @PostMapping
    public Giraffe addGiraffe(@RequestBody Giraffe giraffe) {
        return giraffeService.addGiraffe(giraffe);
    }

    // PUT (update giraffe)
    @PutMapping("/{id}")
    public Giraffe updateGiraffe(@PathVariable Long id, @RequestBody Giraffe giraffeDetails) {
        return giraffeService.updateGiraffe(id, giraffeDetails);
    }

    // DELETE giraffe
    @DeleteMapping("/{id}")
    public void deleteGiraffe(@PathVariable Long id) {
        giraffeService.deleteGiraffe(id);
    }

    // GET giraffes by species
    @GetMapping("/category/{species}")
    public List<Giraffe> getBySpecies(@PathVariable String species) {
        return giraffeService.getBySpecies(species);
    }

    // SEARCH giraffes by name substring
    @GetMapping("/search")
    public List<Giraffe> searchByName(@RequestParam String name) {
        return giraffeService.searchByName(name);
    }
}
