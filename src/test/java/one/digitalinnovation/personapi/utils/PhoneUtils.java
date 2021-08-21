package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.enums.PhoneType;
import one.digitalinnovation.personapi.model.Phone;

public class PhoneUtils {
    public static final String PHONE_NUMBER = "(38)99893-8560";
    public static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    public static final long PHONE_ID = 1L;

    public static PhoneDTO creteFakeDTO(){
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
