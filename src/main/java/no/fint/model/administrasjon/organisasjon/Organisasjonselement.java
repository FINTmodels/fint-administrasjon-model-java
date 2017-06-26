package no.fint.model.administrasjon.organisasjon;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import no.fint.model.felles.basisklasser.Enhet;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.relation.Identifiable;

@Data
@EqualsAndHashCode(callSuper = false)
public class Organisasjonselement extends Enhet implements Identifiable {
    private String navn;
    private String kortnavn;
    private Identifikator organisasjonsId;
    private Identifikator organisasjonsKode;
    private Periode gyldighetsperiode;

    @JsonIgnore
    @Override
    public String getId() {
        return this.getOrganisasjonsId().getIdentifikatorverdi();
    }

    public enum Relasjonsnavn {
        LEDER,
        OVERORDNET,
        SKOLE,
        UNDERORDNET
    }
}

