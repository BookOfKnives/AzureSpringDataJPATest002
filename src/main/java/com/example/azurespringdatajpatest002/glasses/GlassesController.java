package com.example.azurespringdatajpatest002.glasses;


import org.springframework.web.bind.annotation.*;


@RestController
        @RequestMapping(path="/glasses")
public class GlassesController {

    private final GlassesRepository glassesRepository;

    public GlassesController(GlassesRepository repository) {this.glassesRepository = repository;}

    @PostMapping(path="/add")
    public @ResponseBody String addNewGlasses (@RequestBody GlassesModel glasses) {
        GlassesModel newGlasses = new GlassesModel();
        newGlasses.setName(glasses.getName());
        glassesRepository.save(newGlasses);
        System.out.println("its a successs!! inside postmapping of glasescontrol");
        return "its a cuess, boss, you added a glass!";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<GlassesModel> showAllGlasses () {

        return glassesRepository.findAll();
    }
}
