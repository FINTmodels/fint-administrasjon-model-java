// Built from tag feature-betaling

package no.fint.model.administrasjon.betaling;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.administrasjon.kompleksedatatyper.Kontostreng;
import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Ordrelinje implements FintComplexDatatypeObject {
    @NonNull
    private Long avgift;
    @NonNull
    private List<String> beskrivelse;
    @NonNull
    private Long enhetspris;
    @NonNull
    private Kontostreng kontering;
    @NonNull
    private Date leveringsdato;
    @NonNull
    private Long mengde;
}
