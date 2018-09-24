// Built from tag v3.1.0

package no.fint.model.administrasjon.personal;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import no.fint.model.administrasjon.personal.Lonn;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Fasttillegg extends Lonn implements FintMainObject {
    public enum Relasjonsnavn {
            LONNSART,
            ANVISER,
            KONTERER,
            ATTESTANT,
            ARBEIDSFORHOLD
    }

    @NonNull
    private Long belop;
}
