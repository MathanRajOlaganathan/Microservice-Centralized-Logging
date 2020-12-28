package com.logging.elk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 28/12/2020
 */
@RestController
public class GamingController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GamingController.class.getName());

    @GetMapping("/games")
    public List<String> getGames(){
        LOGGER.info("Inside getGames method:GamingController");
        return Stream.of("CS GO","God of War","WWE 2K20","FIFA 20","PUBG").collect(Collectors.toList());
    }
}
