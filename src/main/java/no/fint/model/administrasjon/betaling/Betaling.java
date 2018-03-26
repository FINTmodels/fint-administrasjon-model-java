// Built from tag feature-betaling

package no.fint.model.administrasjon.betaling;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.administrasjon.betaling.Betalingsinformasjon;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Betaling implements FintMainObject {
    public enum Relasjonsnavn {
            BETALER,
            ORDRE
    }

    @NonNull
    private Identifikator betalingsId;
    @NonNull
    private List<Betalingsinformasjon> betalingsinformasjon;
}
