// Built from tag feature-betaling

package no.fint.model.administrasjon.betaling;

import java.util.Arrays;
import java.util.List;

public enum BetalingActions {
	
	GET_BETALING,
	GET_ALL_BETALING,
	UPDATE_BETALING,
	GET_ORDRE,
	GET_ALL_ORDRE,
	UPDATE_ORDRE
	;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(BetalingActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

