package no.fint.model.administrasjon.personal;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.relation.Identifiable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Personalressurs implements Identifiable {
    private Identifikator brukernavn;
    private Identifikator systemId;
    private Identifikator ansattnummer;
    private Periode ansettelsesperiode;
    private Kontaktinformasjon kontaktinformasjon;

    @JsonIgnore
    @Override
    public String getId() {
        return this.getAnsattnummer().getIdentifikatorverdi();
    }

    public enum Relasjonsnavn {
        PARORENDE,
        PERSONALRESSURSKATEGORI,
        ARBEIDSFORHOLD,
        PERSON
    }
}

