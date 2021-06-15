package com.taco.tacomytaco;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//@Slf4j
@RestController
@RequestMapping("log/")
public class DesignTacoController {
    Logger logger = LoggerFactory.getLogger(DesignTacoController.class);

//test
    @Autowired
    TacoRepository repository;

    @RequestMapping("/")
    public String index() {
        String toReturn = "Howdy! Check out the Logs to see the output...";
        logger.info("/log/");
        logger.info("method GET");
        logger.info(toReturn);
        logger.trace("A TRACE Message from Controller");
        logger.debug("A DEBUG Message from Controller");
        logger.info("An INFO Message from Controller");
        logger.warn("A WARN Message from Controller");
        logger.error("An ERROR Message from Controller");

        return toReturn;
    }
    @GetMapping("/tacos")
    public List<Taco> adminPage() {
        return (List<Taco>) repository.findAll();
    }


    @PostMapping("/add")
    public void addUser(@RequestBody Taco taco) {
        repository.save(taco);
    }






}
