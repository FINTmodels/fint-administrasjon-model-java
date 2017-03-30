package no.fint.model.administrasjon.kodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Begrep;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;
import no.fint.model.relation.FintModel;
import no.fint.model.relation.Relation;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Stillingskode extends Begrep implements FintModel {

    public enum Relasjonsnavn {
        FORELDER
    }

    private List<Relation> relasjoner;
    private String ksKode;

    public Stillingskode(Identifikator systemId, String kode, String navn, Periode gyldighetsperiode, Stillingskode forelder, String ksKode) {
        super(systemId, kode, navn, gyldighetsperiode);
        this.ksKode = ksKode;
    }
}
