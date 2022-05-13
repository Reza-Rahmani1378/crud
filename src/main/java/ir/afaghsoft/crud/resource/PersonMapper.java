package ir.afaghsoft.crud.resource;

import ir.afaghsoft.crud.base.mapper.BaseMapper;
import ir.afaghsoft.crud.models.Person;
import ir.afaghsoft.crud.services.dto.PersonDTO;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper extends BaseMapper<Person, PersonDTO> {

}
