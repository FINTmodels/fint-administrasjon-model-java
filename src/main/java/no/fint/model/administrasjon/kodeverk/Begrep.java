package no.fint.model.administrasjon.kodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Begrep {
    private Identifikator systemId;
    private String kode;
    private String navn;
    private Periode gyldighetsperiode;
}
