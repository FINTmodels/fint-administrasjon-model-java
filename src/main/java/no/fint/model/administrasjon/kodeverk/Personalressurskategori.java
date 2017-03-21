package no.fint.model.administrasjon.kodeverk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Personalressurskategori extends Begrep {
    private Personalressurskategori forelder;

    public Personalressurskategori(Identifikator systemId, String kode, String navn, Periode gyldighetsperiode, Personalressurskategori forelder) {
        super(systemId, kode, navn, gyldighetsperiode);
        this.forelder = forelder;
    }
}
