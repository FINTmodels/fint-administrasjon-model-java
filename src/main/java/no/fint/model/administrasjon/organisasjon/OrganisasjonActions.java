package no.fint.model.administrasjon.organisasjon;

import java.util.Arrays;
import java.util.List;

public enum OrganisasjonActions {
    GET_ALL_ORGANISASJONSELEMENT,
    GET_ORGANISASJONSELEMENT;

    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(OrganisasjonActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }
}
