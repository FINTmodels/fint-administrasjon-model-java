// Built from tag v2.0.0

package no.fint.model.administrasjon.kodeverk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import no.fint.model.felles.basisklasser.Begrep;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Ansvar extends Begrep {
    public enum Relasjonsnavn {
        FORELDER
    }
}

