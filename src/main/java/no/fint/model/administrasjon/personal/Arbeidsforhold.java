package no.fint.model.administrasjon.personal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Kontaktinformasjon;
import no.fint.model.felles.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Arbeidsforhold {
    private Identifikator brukernavn;
    private Identifikator systemId;
    private Identifikator ansattnummer;
    private Periode ansettelsesperiode;
    private Kontaktinformasjon kontaktinformasjon;
}
