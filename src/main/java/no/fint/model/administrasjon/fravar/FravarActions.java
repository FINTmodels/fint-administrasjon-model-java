// Built from tag v2.6.0-beta-2

package no.fint.model.administrasjon.fravar;

import java.util.Arrays;
import java.util.List;

public enum FravarActions {
	
	GET_FRAVAR,
	GET_ALL_FRAVAR,
	UPDATE_FRAVAR,
	GET_FRAVARSGRUNN,
	GET_ALL_FRAVARSGRUNN,
	UPDATE_FRAVARSGRUNN,
	GET_FRAVARSTYPE,
	GET_ALL_FRAVARSTYPE,
	UPDATE_FRAVARSTYPE
	;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(FravarActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

