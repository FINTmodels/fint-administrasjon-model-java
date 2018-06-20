// Built from tag feature-fordring

package no.fint.model.administrasjon.okonomi;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import java.util.Date;
import no.fint.model.administrasjon.okonomi.Fakturalinje;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Fakturagrunnlag implements FintMainObject {
    public enum Relasjonsnavn {
            MOTTAKER,
            OPPDRAGSGIVER
    }

    @NonNull
    private Long avgifter;
    @NonNull
    private Date fakturadato;
    @NonNull
    private List<Fakturalinje> fakturalinjer;
    @NonNull
    private Identifikator fakturanummer;
    @NonNull
    private Date forfallsdato;
    @NonNull
    private Date leveringsdato;
    @NonNull
    private Long netto;
    @NonNull
    private Long total;
}
