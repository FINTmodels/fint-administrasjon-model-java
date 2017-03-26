package no.fint.model.administrasjon.kodeverk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Begrep;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;
import no.fint.model.relation.RelationType;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Ansvar extends Begrep {
    public static final String REL_ID_FORELDER = new RelationType.Builder()
            .namespace("fint.no").relationName("forelder").main(Ansvar.class, "systemid").related(Ansvar.class, "systemid").buildTypeString();

    public Ansvar(Identifikator systemId, String kode, String navn, Periode gyldighetsperiode) {
        super(systemId, kode, navn, gyldighetsperiode);
    }
}
