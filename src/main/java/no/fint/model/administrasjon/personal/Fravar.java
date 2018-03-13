// Built from tag v2.6.0-rc-1

package no.fint.model.administrasjon.personal;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Fravar implements FintMainObject {
    public enum Relasjonsnavn {
            FRAVARSGRUNN,
            FRAVARSTYPE,
            ARBEIDSFORHOLD,
            FORTSETTELSE,
            FORTSETTER
    }

    @NonNull
    private Periode periode;
    @NonNull
    private Long prosent;
    @NonNull
    private Identifikator systemId;
}