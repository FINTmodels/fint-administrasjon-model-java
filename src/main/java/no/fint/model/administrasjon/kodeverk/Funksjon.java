// Built from tag v0.99.9

package no.fint.model.administrasjon.kodeverk;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.administrasjon.kodeverk.Kontodimensjon;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Funksjon extends Kontodimensjon implements FintMainObject {
    public enum Relasjonsnavn {
            OVERORDNET,
            UNDERORDNET,
            FULLMAKT
    }

}
