// Built from tag v2.8.0

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
public class Arbeidsforhold implements FintMainObject {
    public enum Relasjonsnavn {
            ANSVAR,
            ARBEIDSFORHOLDSTYPE,
            FUNKSJON,
            STILLINGSKODE,
            TIMERPERUKE,
            ARBEIDSSTED,
            PERSONALLEDER,
            FRAVAR,
            LONN,
            PERSONALRESSURS,
            UNDERVISNINGSFORHOLD
    }

    @NonNull
    private Long ansettelsesprosent;
    @NonNull
    private Periode gyldighetsperiode;
    @NonNull
    private Boolean hovedstilling;
    @NonNull
    private Long lonnsprosent;
    @NonNull
    private String stillingsnummer;
    private String stillingstittel;
    @NonNull
    private Identifikator systemId;
    @NonNull
    private Long tilstedeprosent;
    @NonNull
    private Long arslonn;
}
