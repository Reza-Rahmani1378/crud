package ir.afaghsoft.crud.restcontroller;

import ir.afaghsoft.crud.base.web.BaseRestFull;
import ir.afaghsoft.crud.models.Person;
import ir.afaghsoft.crud.resource.PersonMapper;
import ir.afaghsoft.crud.services.PersonService;
import ir.afaghsoft.crud.services.dto.PersonDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ApiRestController extends BaseRestFull<Person, PersonDTO, Long, PersonService, PersonMapper> {


    public ApiRestController(PersonMapper mapper, PersonService service) {
        super(mapper, service);

    }

    @GetMapping("/persons")
    @Override
    public ResponseEntity<List<PersonDTO>> getAll() {
        return super.getAll();
    }

    @GetMapping("/persons/find/{id}")
    @Override
    public ResponseEntity<PersonDTO> findById(@PathVariable("id") Long id) {
        return super.findById(id);
    }

    @DeleteMapping("/persons/delete/{id}")
    @Override
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
        return super.deleteById(id);
    }

    @PostMapping(value = "/persons/create")
    @Override
    public ResponseEntity<PersonDTO> save(@RequestBody PersonDTO personDTO) {
        return super.save(personDTO);
    }

    @PutMapping("/persons/update")
    @Override
    public ResponseEntity<PersonDTO> update(@RequestBody PersonDTO personDTO) {
        return super.update(personDTO);
    }


}
