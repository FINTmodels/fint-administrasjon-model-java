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
}
