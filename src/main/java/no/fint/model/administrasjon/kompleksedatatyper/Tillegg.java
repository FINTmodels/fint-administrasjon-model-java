// Built from tag v2.4.0-rc-2

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
public class Tillegg implements FintComplexDatatypeObject {
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
    private Long grunnlag;
}
