package no.fint.model.administrasjon.kodeverk;

import java.util.Arrays;
import java.util.List;

public enum KodeverkActions {
    GET_ALL_ANSVAR,
    GET_ALL_ARBEIDSFORHOLDSTYPE,
    GET_ALL_ART,
    GET_ALL_FUNKSJON,
    GET_ALL_PERSONALRESSURSKATEGORI,
    GET_ALL_PROSJEKT,
    GET_ALL_STILLINGSKODE,
    GET_ALL_TIMERPRUKEKODE,
    GET_ANSVAR,
    GET_ARBEIDSFORHOLDSTYPE,
    GET_ART,
    GET_FUNKSJON,
    GET_PERSONALRESSURSKATEGORI,
    GET_PROSJEKT,
    GET_STILLINGSKODE,
    GET_TIMERPRUKEKODE;

    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(KodeverkActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }
}