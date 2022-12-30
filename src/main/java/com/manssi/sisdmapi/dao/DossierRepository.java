package com.manssi.sisdmapi.dao;

import com.manssi.sisdmapi.models.DME;
import com.manssi.sisdmapi.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DossierRepository extends JpaRepository<DME, Long> {

}
