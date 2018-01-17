// Built from tag v2.4.0-rc-2

package no.fint.model.administrasjon.personal;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.administrasjon.personal.Lonn;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Variabellonn extends Lonn implements FintMainObject {
    public enum Relasjonsnavn {
            TILLEGG,
            ANVISER,
            KONTERER,
            ATTESTANT,
            ARBEIDSFORHOLD
    }

}
