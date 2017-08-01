package no.fint.model.administrasjon.kodeverk;

import java.util.Arrays;
import java.util.List;

public enum KodeverkActions {

    GET_ANSVAR,
    GET_ALL_ANSVAR,
    UPDATE_ANSVAR,
    GET_ARBEIDFORHOLDSTYPE,
    GET_ALL_ARBEIDFORHOLDSTYPE,
    UPDATE_ARBEIDFORHOLDSTYPE,
    GET_ART,
    GET_ALL_ART,
    UPDATE_ART,
    GET_FUNKSJON,
    GET_ALL_FUNKSJON,
    UPDATE_FUNKSJON,
    GET_PERSONALRESSURSKATEGORI,
    GET_ALL_PERSONALRESSURSKATEGORI,
    UPDATE_PERSONALRESSURSKATEGORI,
    GET_PROSJEKT,
    GET_ALL_PROSJEKT,
    UPDATE_PROSJEKT,
    GET_STILLINGSKODE,
    GET_ALL_STILLINGSKODE,
    UPDATE_STILLINGSKODE,
    GET_TIMERPERUKEKODE,
    GET_ALL_TIMERPERUKEKODE,
    UPDATE_TIMERPERUKEKODE;

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

