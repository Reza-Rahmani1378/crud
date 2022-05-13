package ir.afaghsoft.crud.resource;

import ir.afaghsoft.crud.models.Person;
import ir.afaghsoft.crud.services.dto.PersonDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-12T03:41:11+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person convertEntityToDTO(PersonDTO d) {
        if ( d == null ) {
            return null;
        }

        Person person = new Person();

        person.setId( d.getId() );
        person.setFirstName( d.getFirstName() );
        person.setLastName( d.getLastName() );
        person.setNationalCode( d.getNationalCode() );
        person.setBirthday( d.getBirthday() );
        person.setAddress( d.getAddress() );
        person.setGender( d.getGender() );

        return person;
    }

    @Override
    public PersonDTO convertDTOToEntity(Person e) {
        if ( e == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setId( e.getId() );
        personDTO.setFirstName( e.getFirstName() );
        personDTO.setLastName( e.getLastName() );
        personDTO.setNationalCode( e.getNationalCode() );
        personDTO.setBirthday( e.getBirthday() );
        personDTO.setAddress( e.getAddress() );
        personDTO.setGender( e.getGender() );

        return personDTO;
    }

    @Override
    public List<PersonDTO> convertListEntityToListDTO(List<Person> eList) {
        if ( eList == null ) {
            return null;
        }

        List<PersonDTO> list = new ArrayList<PersonDTO>( eList.size() );
        for ( Person person : eList ) {
            list.add( convertDTOToEntity( person ) );
        }

        return list;
    }

    @Override
    public List<Person> convertListDTOToListEntity(List<PersonDTO> dList) {
        if ( dList == null ) {
            return null;
        }

        List<Person> list = new ArrayList<Person>( dList.size() );
        for ( PersonDTO personDTO : dList ) {
            list.add( convertEntityToDTO( personDTO ) );
        }

        return list;
    }
}
