// Built from tag feature-betaling

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
public class Kontostreng implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            ANSVAR,
            ART,
            FUNKSJON,
            PROSJEKT
    }

    private String dim5;
    private String dim6;
    private String dim7;
    private String dim8;
    private String dim9;
}
