// Built from tag v2.6.0-beta-3

package no.fint.model.administrasjon.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.administrasjon.kompleksedatatyper.Kontostreng;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Beskjeftigelse implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            LONNSART
    }

    @NonNull
    private String beskrivelse;
    @NonNull
    private Kontostreng kontostreng;
    @NonNull
    private Long prosent;
}
