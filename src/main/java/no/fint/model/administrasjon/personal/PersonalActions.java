package no.fint.model.administrasjon.personal;

import java.util.Arrays;
import java.util.List;

public enum PersonalActions {
    GET_ALL_PERSONALRESSURS,
    GET_PERSONALRESSURS,
    GET_ALL_PERSON,
    GET_PERSON,
    GET_ALL_ARBEIDSFORHOLD,
    GET_ARBEIDSFORHOLD;

    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(PersonalActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }
}
