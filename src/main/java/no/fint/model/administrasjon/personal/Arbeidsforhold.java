package no.fint.model.administrasjon.personal;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Arbeidsforhold implements FintModel {
    public enum Relasjonsnavn {
        PERSONALRESSURS,
        ORGANISASJON,
        ARBEIDSFORHOLDSTYPE,
        STILLINGSKODE,
        ANSVAR,
        FUNKSJON,
        TIMEPRUKE
    }

    private Identifikator systemId;
    private String stillingsnummer;
    private boolean aktiv;
    private double arslonn;
    private String stillingstittel;
    private double ansettelsesprosent;
    private double lonnsprosent;
    private boolean hovedstilling;
    private Periode gyldighetsperiode;
    private Kontaktinformasjon kontaktinformasjon;
    private List<Relation> relasjoner;

    public Arbeidsforhold(Identifikator systemId, String stillingsnummer, boolean aktiv, double arslonn, String stillingstittel, double ansettelsesprosent, double lonnsprosent, boolean hovedstilling, Periode gyldighetsperiode, Kontaktinformasjon kontaktinformasjon) {
        this.systemId = systemId;
        this.stillingsnummer = stillingsnummer;
        this.aktiv = aktiv;
        this.arslonn = arslonn;
        this.stillingstittel = stillingstittel;
        this.ansettelsesprosent = ansettelsesprosent;
        this.lonnsprosent = lonnsprosent;
        this.hovedstilling = hovedstilling;
        this.gyldighetsperiode = gyldighetsperiode;
        this.kontaktinformasjon = kontaktinformasjon;
        this.relasjoner = new ArrayList<>();
    }

    public Arbeidsforhold() {
        this.relasjoner = new ArrayList<>();
    }

    @Override
    public void addRelasjon(Relation relation) {
        this.relasjoner.add(relation);
    }

    @JsonIgnore
    @Override
    public String getId() {
        return this.getSystemId().getIdentifikatorverdi();
    }
}
