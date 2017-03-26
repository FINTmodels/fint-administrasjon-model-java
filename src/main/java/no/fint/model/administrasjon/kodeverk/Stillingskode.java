package no.fint.model.administrasjon.kodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Begrep;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;
import no.fint.model.relation.RelationType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Stillingskode extends Begrep {
    public static final String REL_ID_FORELDER = new RelationType.Builder()
            .namespace("fint.no").relationName("forelder").main(Stillingskode.class, "systemid").related(Stillingskode.class, "systemid").buildTypeString();

    private String ksKode;

    public Stillingskode(Identifikator systemId, String kode, String navn, Periode gyldighetsperiode, Stillingskode forelder, String ksKode) {
        super(systemId, kode, navn, gyldighetsperiode);
        this.ksKode = ksKode;
    }
}
