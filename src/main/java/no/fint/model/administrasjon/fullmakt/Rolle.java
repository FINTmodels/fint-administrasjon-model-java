// Built from tag v2.4.0-rc-2

package no.fint.model.administrasjon.fullmakt;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Rolle implements FintMainObject {
    public enum Relasjonsnavn {
            FULLMAKT
    }

    @NonNull
    private String beskrivelse;
    @NonNull
    private Identifikator navn;
}