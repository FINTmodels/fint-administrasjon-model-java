package no.fint.model.administrasjon.personal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Kontaktinformasjon;
import no.fint.model.felles.Periode;
import no.fint.model.relation.FintModel;
import no.fint.model.relation.Relation;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
}
