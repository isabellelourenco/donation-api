package br.com.doefacil.doefacil.services;

import br.com.doefacil.doefacil.models.Donor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.doefacil.doefacil.repositories.DonorRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/donor")
public class DonorService {
    @Autowired
    DonorRepository donorRepository;

    public Donor save(Donor donor){
        return donorRepository.save(donor);
    }

    public void delete(Donor donor){
        donorRepository.delete(donor);
    }

    public Optional<Donor> search (String id){
        return donorRepository.findById(id);
    }

    public List<Donor> searchAll (){
        return donorRepository.findAll();
    }

    public void deleteById (String id) {
        Donor donor = donorRepository.findById(id).get();
        donorRepository.deleteById(id);
    }

    public Donor findById(String id){
        return donorRepository.findById(id).get();
    }

    public Donor updateDonor (String id, Donor updatedDonor){

        if (donorRepository.existsById(id)) {
            updatedDonor.set_id(id);
            donorRepository.save(updatedDonor);
        }

        return updatedDonor;

    }

}
