// Built from tag master

package no.fint.model.administrasjon.organisasjon;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.basisklasser.Enhet;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Organisasjonselement extends Enhet {
    public enum Relasjonsnavn {
        LEDER,
        OVERORDNET,
        UNDERORDNET,
        SKOLE
    }

    private Periode gyldighetsperiode;
    private String kortnavn;
    private String navn;
    private Identifikator organisasjonsId;
    private Identifikator organisasjonsKode;
}

