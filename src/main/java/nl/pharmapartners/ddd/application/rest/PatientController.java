package nl.pharmapartners.ddd.application.rest;

import lombok.RequiredArgsConstructor;
import nl.pharmapartners.ddd.application.rest.mapper.InschrijvenPatientMapper;
import nl.pharmapartners.ddd.application.rest.request.InschrijvenPatientRequest;
import nl.pharmapartners.ddd.domain.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/patient")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;
    private final InschrijvenPatientMapper inschrijvenPatientMapper;

    @PostMapping(value = "/inschrijven")
    public ResponseEntity<Void> inschrijvenPatient(@RequestBody InschrijvenPatientRequest inschrijvenPatientRequest) {
        patientService.aRandomName(inschrijvenPatientMapper.InschrijvenPatientCommand(inschrijvenPatientRequest));
        return ResponseEntity.ok().build();
    }
}
