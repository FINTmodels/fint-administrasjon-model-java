package no.fint.model.administrasjon.organisasjon;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.*;
import no.fint.model.relation.FintModel;
import no.fint.model.relation.Relation;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Organisasjonselement extends Enhet implements FintModel {
    public enum Relasjonsnavn {
        ORGANISASJON,
        ARBEIDSFORHOLD,
        LEDER
    }

    private String navn;
    private String kortnavn;
    private boolean aktiv;
    private Identifikator organisasjonsId;
    private Identifikator organisasjonsKode;
    private Periode gyldighetsperiode;
    private List<Relation> relasjoner;

    public Organisasjonselement(Kontaktinformasjon kontaktinformasjon, Adresse postadresse, Identifikator organisasjonsnummer, String organisasjonsnavn, Adresse forretningsadresse, String navn, String kortnavn, boolean aktiv, Identifikator organisasjonsId, Identifikator organisasjonsKode, Periode gyldighetsperiode) {
        super(kontaktinformasjon, postadresse, organisasjonsnummer, organisasjonsnavn, forretningsadresse);
        this.navn = navn;
        this.kortnavn = kortnavn;
        this.aktiv = aktiv;
        this.organisasjonsId = organisasjonsId;
        this.organisasjonsKode = organisasjonsKode;
        this.gyldighetsperiode = gyldighetsperiode;
    }
}
