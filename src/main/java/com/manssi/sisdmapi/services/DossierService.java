package com.manssi.sisdmapi.services;
import com.manssi.sisdmapi.dao.DossierRepository;
import com.manssi.sisdmapi.models.DME;
import com.manssi.sisdmapi.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
@RestController
public class DossierService {
    @Autowired
    public DossierRepository dossierRepository;

    @GetMapping(value = "/dossiers")
    public List<DME> getAllPatients() {
        return dossierRepository.findAll();
    }

    @GetMapping(value = "/dossiers/{id}")
    public Optional<DME> getPatientsById(@PathVariable Long id) {
        return dossierRepository.findById(id);
    }

    @PostMapping(value = "/dossiers/add")
    public DME saveDossier(@RequestBody DME dossier) {
        return dossierRepository.save(dossier);
    }

    @PutMapping(value = "/dossiers/update/{id}")
    public DME updatePatient(@PathVariable(name = "id") Long id, @RequestBody DME dossier) {
        dossier.setNumDossier(id);
        return dossierRepository.save(dossier);
    }

    @DeleteMapping(value = "/dossiers/{id}")
    public void deletePage(@PathVariable(name = "id") Long id){
        dossierRepository.deleteById(id);
    }

}
