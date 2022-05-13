package ir.afaghsoft.crud.services.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import ir.afaghsoft.crud.base.BaseDTO;
import ir.afaghsoft.crud.models.enumeration.Gender;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Getter
@Setter
public class PersonDTO extends BaseDTO<Long> {

    private String firstName;

    private String lastName;

    private String nationalCode;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private String address;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
