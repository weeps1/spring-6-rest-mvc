package guru.springframework.spring6restmvc.controller;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
@RestController
public class BeerController {
    private final BeerService beerService;


    public Beer getBeerById(UUID id) {

        log.debug("We are in the controller class");

        return beerService.getBeerById(id);
    }

    @RequestMapping("/api/v1/beer")
    public List<Beer> listBeer(){
        return beerService.listBeers();
    }

}
