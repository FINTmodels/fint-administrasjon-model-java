// Built from tag v2.2.20

package no.fint.model.administrasjon.kodeverk;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.administrasjon.kodeverk.Kodeverk;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Funksjon extends Kodeverk implements FintMainObject {
    public enum Relasjonsnavn {
            FORELDER
    }

}
