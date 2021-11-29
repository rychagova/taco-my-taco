package com.taco.tacomytaco.controllers;
import com.taco.tacomytaco.models.Ingredient;
import com.taco.tacomytaco.models.Taco;
import com.taco.tacomytaco.models.Design;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.taco.tacomytaco.models.Ingredient.Type;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {
    @GetMapping
    public String showDesignForm(Model model) {
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
                new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
                new Ingredient("CARN", "Carnitas", Type.PROTEIN),
                new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
                new Ingredient("LETC", "Lettuce", Type.VEGGIES),
                new Ingredient("CHED", "Cheddar", Type.CHEESE),
                new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
                new Ingredient("SLSA", "Salsa", Type.SAUCE),
                new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
        );
        Type[] types = Ingredient.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    ingredients.stream().filter(i -> i.getType().equals(type)).collect(Collectors.toList()));
        }
        model.addAttribute("design", new Taco());
        return "design";
    }

    @PostMapping
    public String processDesign(@Valid Taco design, Errors errors) {
        if (errors.hasErrors()) {
            return "redirect:/design";
        }
        // Save the taco design...
        // We'll do this in chapter 3
        log.info("Processing design: " + design);
        return "redirect:/orders/current";
    }
}
//    Logger logger = LoggerFactory.getLogger(DesignTacoController.class);
//
//
//    @Autowired
//    TacoRepository repository;
//
//    @RequestMapping("/")
//    public String index() {
//        String toReturn = "Howdy! Check out the Logs to see the output...";
//        logger.info("/log/");
//        logger.info("method GET");
//        logger.info(toReturn);
//        logger.trace("A TRACE Message from Controller");
//        logger.debug("A DEBUG Message from Controller");
//        logger.info("An INFO Message from Controller");
//        logger.warn("A WARN Message from Controller");
//        logger.error("An ERROR Message from Controller");
//
//        return toReturn;
//    }
//    @GetMapping("/tacos")
//    public List<Taco> adminPage() {
//        return (List<Taco>) repository.findAll();
//    }
//
//
//    @PostMapping("/add")
//    public void addUser(@RequestBody Taco taco) {
//        repository.save(taco);
//    }
//}
