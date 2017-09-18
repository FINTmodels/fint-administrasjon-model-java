// Built from tag master

package no.fint.model.administrasjon.kodeverk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.basisklasser.Begrep;

@Data
@EqualsAndHashCode(callSuper = false)
public class Ansvar extends Begrep {
    public enum Relasjonsnavn {
        FORELDER
    }
}

