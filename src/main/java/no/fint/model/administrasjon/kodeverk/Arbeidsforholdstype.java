package no.fint.model.administrasjon.kodeverk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Begrep;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Arbeidsforholdstype extends Begrep {
    public static final String RELASJON_ARBEIDSFORHOLDSTYPE_FORELDER = "urn:fint.no:arbeidsforholdstype:forelder:arbeidsforholdstype.systemid:arbeidsforholdstype.systemid";

    public Arbeidsforholdstype(Identifikator systemId, String kode, String navn, Periode gyldighetsperiode) {
        super(systemId, kode, navn, gyldighetsperiode);
    }
}
