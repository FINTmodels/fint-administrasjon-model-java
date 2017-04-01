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
public class Funksjon extends Begrep implements Identifiable {
    public enum Relasjonsnavn {
        FORELDER
    }

    public Funksjon(Identifikator systemId, String kode, String navn, Periode gyldighetsperiode) {
        super(systemId, kode, navn, gyldighetsperiode);
    }

    @JsonIgnore
    @Override
    public String getId() {
        return this.getSystemId().getIdentifikatorverdi();
    }
}
