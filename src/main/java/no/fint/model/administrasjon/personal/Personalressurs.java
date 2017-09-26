// Built from tag v2.0.0

package no.fint.model.administrasjon.personal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;
import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Personalressurs {
    private Identifikator ansattnummer;
    private Periode ansettelsesperiode;
    private Identifikator brukernavn;
    private Kontaktinformasjon kontaktinformasjon;
    private Identifikator systemId;
    public enum Relasjonsnavn {
        PERSONALRESSURSKATEGORI,
        ARBEIDSFORHOLD,
        PERSON
    }
}

