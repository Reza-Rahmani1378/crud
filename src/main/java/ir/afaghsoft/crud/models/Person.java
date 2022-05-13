package ir.afaghsoft.crud.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import ir.afaghsoft.crud.base.BaseEntity;
import ir.afaghsoft.crud.models.enumeration.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = Person.TABLE_NAME)
@Getter
@Setter
@NoArgsConstructor
public class Person extends BaseEntity<Long> {
    public static final String TABLE_NAME = "person_table";
    private static final String FIRST_NAME = "first_name";
    private static final String LAST_NAME = "last_name";
    private static final String NATIONAL_CODE = "national_code";

    @Column(name = Person.FIRST_NAME)
    private String firstName;

    @Column(name = Person.LAST_NAME)
    private String lastName;

    @Column(name = Person.NATIONAL_CODE)
    private String nationalCode;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private String address;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
