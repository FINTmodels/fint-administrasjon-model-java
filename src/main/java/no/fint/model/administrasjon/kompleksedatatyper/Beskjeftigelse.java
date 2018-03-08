// Built from tag v0.99.9

package no.fint.model.administrasjon.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Beskjeftigelse implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            LONNSART,
            KONTOSTRENG
    }

    @NonNull
    private String beskrivelse;
    @NonNull
    private Long prosent;
}
