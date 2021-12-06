package br.com.doefacil.doefacil.controllers;

import br.com.doefacil.doefacil.models.Ong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.doefacil.doefacil.services.OngService;

import java.text.ParseException;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/ong")
public class OngController {

    @Autowired
    OngService ongService;

    @GetMapping("/details/{id}")
    public Ong searchOng (@PathVariable("id") String id){
        return ongService.search(id).get();
    }

    @GetMapping("/list")
    public List<Ong> searchAll(){
        return ongService.searchAll();
    }

    @PostMapping("/register")
    public Ong registerOng(@RequestBody Ong ong) throws ParseException{
        return ongService.save(ong);
    }

    @GetMapping("/{email}")
    public Ong searchAll(@PathVariable("email") String email){
        return ongService.findByEmail(email);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOngById (@PathVariable("id") String id){
        ongService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public Ong updateOng (@PathVariable ("id") String id, @RequestBody Ong updatedOng){
        Ong ong = ongService.findById(id);

        return ongService.updateOng(id, updatedOng);
    }
}
