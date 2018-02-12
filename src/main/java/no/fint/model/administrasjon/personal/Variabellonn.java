// Built from tag v2.6.0-beta-1

package no.fint.model.administrasjon.personal;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.administrasjon.kompleksedatatyper.Variabelttillegg;
import no.fint.model.administrasjon.personal.Lonn;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Variabellonn extends Lonn implements FintMainObject {
    public enum Relasjonsnavn {
            ANVISER,
            KONTERER,
            ATTESTANT,
            ARBEIDSFORHOLD
    }

    @NonNull
    private List<Variabelttillegg> variabelttillegg;
}
