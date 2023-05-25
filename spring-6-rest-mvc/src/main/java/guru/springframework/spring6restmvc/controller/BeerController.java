package guru.springframework.spring6restmvc.controller;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.services.BeerService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/beer")
public class BeerController {
    private final BeerService beerService;

    @PostMapping
    public ResponseEntity handlePost(@RequestBody  Beer beer){
        Beer savedBeer = beerService.saveNewBeer(beer);


        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer" + savedBeer.getId().toString());

        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

//    @RequestMapping(value = "{beerId}", method = RequestMethod.GET)
    @GetMapping(value = "{beerId}")
    public Beer getBeerById(@PathVariable("beerId") UUID beerId) {

        log.debug("We are in the controller class edit helloas");

        return beerService.getBeerById(beerId);
    }

    @GetMapping
    public List<Beer> listBeer(){
        return beerService.listBeers();
    }

}
