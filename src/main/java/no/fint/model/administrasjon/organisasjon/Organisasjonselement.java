package no.fint.model.administrasjon.organisasjon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;
import no.fint.model.relation.RelationType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Organisasjonselement {
    public static final String REL_ID_ORGANISASJON = new RelationType.Builder()
            .namespace("fint.no").relationName("overordnet").main(Organisasjonselement.class, "orgid").related(Organisasjonselement.class, "orgid").buildTypeString();

    public static final String REL_ID_ARBEIDSFORHOLD = new RelationType.Builder()
            .namespace("fint.no").relationName("arbeidsforhold").main(Organisasjonselement.class, "orgid").related(Arbeidsforhold.class, "systemid").buildTypeString();

    public static final String REL_ID_LEDER = new RelationType.Builder()
            .namespace("fint.no").relationName("leder").main(Organisasjonselement.class, "orgid").related(Personalressurs.class, "ansattnummer").buildTypeString();

    private String navn;
    private String kortnavn;
    private boolean aktiv;
    private Identifikator organisasjonsId;
    private Identifikator organisasjonsKode;
    private Periode gyldighetsperiode;
}
