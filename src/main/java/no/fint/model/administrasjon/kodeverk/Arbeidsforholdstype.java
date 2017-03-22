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
    private Arbeidsforholdstype forelder;

    public Arbeidsforholdstype(Identifikator systemId, String kode, String navn, Periode gyldighetsperiode, Arbeidsforholdstype forelder) {
        super(systemId, kode, navn, gyldighetsperiode);
        this.forelder = forelder;
    }
}
