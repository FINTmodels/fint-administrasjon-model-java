package no.fint.model.administrasjon.personal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Kontaktinformasjon;
import no.fint.model.felles.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Personalressurs {
    public static final String RELASJON_PERSONLRESSURS_PERSON = "urn:fint.no:personalressurs:person:personalressurs.ansattnummer:person.fodselsnummer";
    public static final String RELASJON_PERSONALRESSURS_ARBEIDSFORHOLD = "urn:fint.no:personalressurs:arbeidsforhold:personlressur.ansattnummer:arbeidsforhold.systemid";
    public static final String RELASJON_PERSONALRESSURS_PERSONALRESSURSKATEGORI = "urn:fint.no:personalressurs:personaressurskategori:personlressur.ansattnummer:personalressurs.systemid";

    private Identifikator brukernavn;
    private Identifikator systemId;
    private Identifikator ansattnummer;
    private Periode ansettelsesperiode;
    private Kontaktinformasjon kontaktinformasjon;
}
