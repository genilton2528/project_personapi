package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.model.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final long PERSON_ID = 1L;
    private static final String FIRST_NAME = "Genilton";
    private static final String LAST_NAME = "Barbosa";
    private static final String CPF_NUMBER = "130.303.936-23";
    private static final LocalDate BIRTH_DATE = LocalDate.of(1998, 02, 28);

    public static PersonDTO createFakeDTO(){
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(getFormattedDate())
                .build();
    }

    public static Person createFakeEntity(){
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }

    private static String getFormattedDate() {
        return String.format("%02d-%02d-%d",
                BIRTH_DATE.getDayOfMonth(),
                BIRTH_DATE.getMonthValue(),
                BIRTH_DATE.getYear());
    }
}
