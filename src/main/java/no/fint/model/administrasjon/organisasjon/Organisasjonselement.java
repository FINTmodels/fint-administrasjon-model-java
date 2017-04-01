package no.fint.model.administrasjon.organisasjon;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.*;
import no.fint.model.relation.FintModel;
import no.fint.model.relation.Relation;

import java.util.ArrayList;
import java.util.List;

@Data
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

    public Organisasjonselement() {
        this.relasjoner = new ArrayList<>();
    }

    public Organisasjonselement(Kontaktinformasjon kontaktinformasjon, Adresse postadresse, Identifikator organisasjonsnummer, String organisasjonsnavn, Adresse forretningsadresse, String navn, String kortnavn, boolean aktiv, Identifikator organisasjonsId, Identifikator organisasjonsKode, Periode gyldighetsperiode) {
        super(kontaktinformasjon, postadresse, organisasjonsnummer, organisasjonsnavn, forretningsadresse);
        this.navn = navn;
        this.kortnavn = kortnavn;
        this.aktiv = aktiv;
        this.organisasjonsId = organisasjonsId;
        this.organisasjonsKode = organisasjonsKode;
        this.gyldighetsperiode = gyldighetsperiode;
        this.relasjoner = new ArrayList<>();
    }

    @Override
    public void addRelasjon(Relation relation) {
        this.relasjoner.add(relation);
    }

    @JsonIgnore
    @Override
    public String getId() {
        return this.getOrganisasjonsId().getIdentifikatorverdi();
    }
}
