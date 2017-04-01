package no.fint.model.administrasjon.personal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Kontaktinformasjon;
import no.fint.model.felles.Periode;
import no.fint.model.relation.FintModel;
import no.fint.model.relation.Relation;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class Personalressurs implements FintModel {
    public enum Relasjonsnavn {
        PERSON,
        ARBEIDSFORHOLD,
        PERSONALRESSURSKATEGORI
    }

    private Identifikator brukernavn;
    private Identifikator systemId;
    private Identifikator ansattnummer;
    private Periode ansettelsesperiode;
    private Kontaktinformasjon kontaktinformasjon;
    private List<Relation> relasjoner;

    public Personalressurs() {
        this.relasjoner = new ArrayList<>();
    }

    public Personalressurs(Identifikator brukernavn, Identifikator systemId, Identifikator ansattnummer, Periode ansettelsesperiode, Kontaktinformasjon kontaktinformasjon) {
        this.brukernavn = brukernavn;
        this.systemId = systemId;
        this.ansattnummer = ansattnummer;
        this.ansettelsesperiode = ansettelsesperiode;
        this.kontaktinformasjon = kontaktinformasjon;
        this.relasjoner = new ArrayList<>();
    }

    @Override
    public void addRelasjon(Relation relation) {
        this.relasjoner.add(relation);
    }
}
