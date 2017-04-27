package no.fint.model.administrasjon.organisasjon;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.*;
import no.fint.model.relation.Identifiable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Organisasjonselement extends Enhet implements Identifiable {
    public enum Relasjonsnavn {
        OVERORDNET,
        UNDERORDNET,
        LEDER
    }

    private String navn;
    private String kortnavn;
    private Identifikator organisasjonsId;
    private Identifikator organisasjonsKode;
    private Periode gyldighetsperiode;

    public Organisasjonselement(Kontaktinformasjon kontaktinformasjon, Adresse postadresse, Identifikator organisasjonsnummer, String organisasjonsnavn, Adresse forretningsadresse, String navn, String kortnavn, Identifikator organisasjonsId, Identifikator organisasjonsKode, Periode gyldighetsperiode) {
        super(kontaktinformasjon, postadresse, organisasjonsnummer, organisasjonsnavn, forretningsadresse);
        this.navn = navn;
        this.kortnavn = kortnavn;
        this.organisasjonsId = organisasjonsId;
        this.organisasjonsKode = organisasjonsKode;
        this.gyldighetsperiode = gyldighetsperiode;
    }

    @JsonIgnore
    @Override
    public String getId() {
        return this.getOrganisasjonsId().getIdentifikatorverdi();
    }
}
