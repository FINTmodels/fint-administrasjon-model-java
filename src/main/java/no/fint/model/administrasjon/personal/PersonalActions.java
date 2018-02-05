// Built from tag v2.4.0-rc-4

package no.fint.model.administrasjon.personal;

import java.util.Arrays;
import java.util.List;

public enum PersonalActions {
	
	GET_FASTLONN,
	GET_ALL_FASTLONN,
	UPDATE_FASTLONN,
	GET_VARIABELLONN,
	GET_ALL_VARIABELLONN,
	UPDATE_VARIABELLONN,
	GET_PERSONALRESSURS,
	GET_ALL_PERSONALRESSURS,
	UPDATE_PERSONALRESSURS,
	GET_ARBEIDSFORHOLD,
	GET_ALL_ARBEIDSFORHOLD,
	UPDATE_ARBEIDSFORHOLD
	;


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

