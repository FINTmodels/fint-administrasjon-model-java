package no.fint.model.administrasjon.kodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Begrep;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Stillingskode extends Begrep {
    private Stillingskode forelder;
    private String ksKode;

    public Stillingskode(Identifikator systemId, String kode, String navn, Periode gyldighetsperiode, Stillingskode forelder, String ksKode) {
        super(systemId, kode, navn, gyldighetsperiode);
        this.forelder = forelder;
        this.ksKode = ksKode;
    }
}
