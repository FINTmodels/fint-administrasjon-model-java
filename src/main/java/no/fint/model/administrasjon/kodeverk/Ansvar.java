package no.fint.model.administrasjon.kodeverk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.Begrep;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;
import no.fint.model.relation.FintModel;
import no.fint.model.relation.Relation;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class Ansvar extends Begrep implements FintModel {

    public enum Relasjonsnavn {
        FORELDER
    }

    private List<Relation> relasjoner;

    public Ansvar(Identifikator systemId, String kode, String navn, Periode gyldighetsperiode) {
        super(systemId, kode, navn, gyldighetsperiode);
        this.relasjoner = new ArrayList<>();
    }

    public Ansvar() {
        this.relasjoner = new ArrayList<>();
    }

    public void addRelasjon(Relation relation) {
        this.relasjoner.add(relation);
    }

}
