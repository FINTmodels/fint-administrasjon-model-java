// Built from tag v2.7.0

package no.fint.model.administrasjon.personal;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.administrasjon.kompleksedatatyper.Beskjeftigelse;
import no.fint.model.administrasjon.kompleksedatatyper.Fasttillegg;
import no.fint.model.administrasjon.personal.Lonn;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Fastlonn extends Lonn implements FintMainObject {
    public enum Relasjonsnavn {
            ANVISER,
            KONTERER,
            ATTESTANT,
            ARBEIDSFORHOLD
    }

    @NonNull
    private List<Beskjeftigelse> beskjeftigelse;
    @NonNull
    private List<Fasttillegg> fasttillegg;
}
