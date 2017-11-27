// Built from tag v2.2.10

package no.fint.model.administrasjon.personal;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Personalressurs implements FintMainObject {
    public enum Relasjonsnavn {
            PERSONALRESSURSKATEGORI,
            ARBEIDSFORHOLD,
            PERSON
    }

    @NonNull
    private Identifikator ansattnummer;
    @NonNull
    private Periode ansettelsesperiode;
    @NonNull
    private Identifikator brukernavn;
    private Kontaktinformasjon kontaktinformasjon;
    private Identifikator systemId;
}
