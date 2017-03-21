package no.fint.model.administrasjon.kodeverk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Ansvar extends Begrep {
    private Ansvar forelder;

    public Ansvar(Identifikator systemId, String kode, String navn, Periode gyldighetsperiode, Ansvar forelder) {
        super(systemId, kode, navn, gyldighetsperiode);
        this.forelder = forelder;
    }
}
