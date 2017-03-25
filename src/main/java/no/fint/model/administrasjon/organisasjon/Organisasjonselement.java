package no.fint.model.administrasjon.organisasjon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Organisasjonselement {
    public static final String RELASJON_ORGANISASJON_ORGANISASJON = "urn:fint.no:organisasjonselement:overordnet:organisasjonselement.orgid:organisasjonselement.orgid";
    public static final String RELASJON_ORGANISASJON_ARBEIDSFORHOLD = "urn:fint.no:organisasjonselement:arbeidsforhold:organisasjonselement.orgid:arbeidsforhold:systemid";
    public static final String RELASJON_ORGANISASJON_LEDER = "urn:fint.no:organisasjonselement:leder:organisasjonselement.orgid:personalressurs.ansattnummer";

    private String navn;
    private String kortnavn;
    private boolean aktiv;
    private Identifikator organisasjonsId;
    private Identifikator organisasjonsKode;
    private Periode gyldighetsperiode;
}
