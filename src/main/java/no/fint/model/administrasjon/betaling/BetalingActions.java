// Built from tag feature-betaling

package no.fint.model.administrasjon.betaling;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum BetalingActions {

    GET_BETALING,
    GET_ALL_BETALING,
    UPDATE_BETALING,
    GET_ORDRE,
    GET_ALL_ORDRE,
    UPDATE_ORDRE;

    public static List<String> getActions() {
        return Arrays.stream(BetalingActions.class.getEnumConstants()).map(Enum::name).collect(Collectors.toList());
    }

}

