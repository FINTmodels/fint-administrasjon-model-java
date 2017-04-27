package no.fint.model.administrasjon.personal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Kontaktinformasjon;
import no.fint.model.felles.Periode;
import no.fint.model.relation.Identifiable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Personalressurs implements Identifiable {
    public enum Relasjonsnavn {
        PERSON,
        PERSONALRESSURSKATEGORI,
        ARBEIDSFORHOLD
    }

    private Identifikator brukernavn;
    private Identifikator systemId;
    private Identifikator ansattnummer;
    private Periode ansettelsesperiode;
    private Kontaktinformasjon kontaktinformasjon;

    public Personalressurs(Identifikator brukernavn, Identifikator systemId, Identifikator ansattnummer, Periode ansettelsesperiode, Kontaktinformasjon kontaktinformasjon) {
        this.brukernavn = brukernavn;
        this.systemId = systemId;
        this.ansattnummer = ansattnummer;
        this.ansettelsesperiode = ansettelsesperiode;
        this.kontaktinformasjon = kontaktinformasjon;
    }

    @JsonIgnore
    @Override
    public String getId() {
        return this.getAnsattnummer().getIdentifikatorverdi();
    }
}