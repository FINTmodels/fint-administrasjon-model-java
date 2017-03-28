package no.fint.model.administrasjon.organisasjon;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.*;
import no.fint.model.relation.Identifiable;
import no.fint.model.relation.RelationType;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Organisasjonselement extends Enhet implements Identifiable {
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

    public Organisasjonselement(Kontaktinformasjon kontaktinformasjon, Adresse postadresse, Identifikator organisasjonsnummer, String organisasjonsnavn, Adresse forretningsadresse, String navn, String kortnavn, boolean aktiv, Identifikator organisasjonsId, Identifikator organisasjonsKode, Periode gyldighetsperiode) {
        super(kontaktinformasjon, postadresse, organisasjonsnummer, organisasjonsnavn, forretningsadresse);
        this.navn = navn;
        this.kortnavn = kortnavn;
        this.aktiv = aktiv;
        this.organisasjonsId = organisasjonsId;
        this.organisasjonsKode = organisasjonsKode;
        this.gyldighetsperiode = gyldighetsperiode;
    }

    @JsonIgnore
    @Override
    public String getId() {
        return this.getOrganisasjonsId().getIdentifikatorverdi();
    }
}
