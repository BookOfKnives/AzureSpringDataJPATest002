package com.example.azurespringdatajpatest002.glasses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
        @RequestMapping(path="/glasses")
public class GlassesController {

    private GlassesRepository glassesRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewGlasses (@RequestParam String name) {
        GlassesModel newGlasses = new GlassesModel();
        newGlasses.setName(name);
        glassesRepository.save(newGlasses);
        System.out.println("its a successs!! inside postmapping of glasescontrol");
        return "its a cuess, boss, you added a glass!";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<GlassesModel> showAllGlasses () {
        return glassesRepository.findAll();
    }
}
