package ir.afaghsoft.crud.services.impl;

import ir.afaghsoft.crud.base.service.impl.BaseServiceImpl;
import ir.afaghsoft.crud.exception.AccessDeniedRunTimeException;
import ir.afaghsoft.crud.models.Person;
import ir.afaghsoft.crud.repositories.PersonRepository;
import ir.afaghsoft.crud.services.PersonService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl extends BaseServiceImpl<Person, Long, PersonRepository> implements PersonService {

    public PersonServiceImpl(PersonRepository repository) {
        super(repository);
    }

    @Override
    public Person saveNotSecure(Person person) {
        return super.saveNotSecure(person);
    }

    @Override
    public List<Person> saveAllNotSecure(Collection<Person> collection) {
        return super.saveAllNotSecure(collection);
    }

    @Override
    public Optional<Person> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public List<Person> findAllNotSecure() {
        return super.findAllNotSecure();
    }

    @Override
    public void deleteById(Long id) {
        try {
            super.deleteById(id);
        } catch (Exception e) {
            throw new AccessDeniedRunTimeException("can't delete entity with id " + id);
        }
    }

}
