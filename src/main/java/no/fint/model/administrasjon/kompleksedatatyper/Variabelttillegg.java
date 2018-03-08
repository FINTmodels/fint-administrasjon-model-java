// Built from tag v0.99.9

package no.fint.model.administrasjon.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Variabelttillegg implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            LONNSART,
            KONTOSTRENG
    }

    @NonNull
    private Long antall;
    private Long belop;
    @NonNull
    private String beskrivelse;
    @NonNull
    private Periode periode;
}
