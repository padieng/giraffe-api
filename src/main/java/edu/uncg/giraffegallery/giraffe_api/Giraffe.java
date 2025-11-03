package edu.uncg.giraffegallery.giraffe_api;

import jakarta.persistence.*;

@Entity
@Table(name = "giraffes")
public class Giraffe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String species;
    private String imageUrl;

    public Giraffe() {}

    public Giraffe(String name, int age, String species, String imageUrl) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.imageUrl = imageUrl;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
