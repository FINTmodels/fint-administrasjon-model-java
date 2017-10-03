// Built from tag v2.0.0

package no.fint.model.administrasjon.organisasjon;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.basisklasser.Enhet;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Organisasjonselement extends Enhet {
    private Periode gyldighetsperiode;
    private String kortnavn;
    private String navn;
    private Identifikator organisasjonsId;
    private Identifikator organisasjonsKode;
    public enum Relasjonsnavn {
        LEDER,
        OVERORDNET,
        UNDERORDNET,
        SKOLE
    }
}

