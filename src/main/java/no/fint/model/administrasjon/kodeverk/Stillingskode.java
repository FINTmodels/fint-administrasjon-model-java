package no.fint.model.administrasjon.kodeverk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Begrep;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;
import no.fint.model.relation.Identifiable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Stillingskode extends Begrep implements Identifiable {
    public enum Relasjonsnavn {
        FORELDER
    }

    private String ksKode;

    public Stillingskode(Identifikator systemId, String kode, String navn, Periode gyldighetsperiode, Stillingskode forelder, String ksKode) {
        super(systemId, kode, navn, gyldighetsperiode);
        this.ksKode = ksKode;
    }

    @JsonIgnore
    @Override
    public String getId() {
        return this.getSystemId().getIdentifikatorverdi();
    }
}

