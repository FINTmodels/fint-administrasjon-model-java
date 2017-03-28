package no.fint.model.administrasjon.personal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.administrasjon.kodeverk.Personalressurskategori;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Kontaktinformasjon;
import no.fint.model.felles.Periode;
import no.fint.model.felles.Person;
import no.fint.model.relation.Identifiable;
import no.fint.model.relation.RelationType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Personalressurs implements Identifiable {
    public static final String REL_ID_PERSON = new RelationType.Builder()
            .namespace("fint.no").relationName("person").main(Personalressurs.class, "ansattnummer").related(Person.class, "fodselsnummer").buildTypeString();

    public static final String REL_ID_ARBEIDSFORHOLD = new RelationType.Builder()
            .namespace("fint.no").relationName("personalressurs").main(Personalressurs.class, "ansattnummer").related(Arbeidsforhold.class, "systemid").buildTypeString();

    public static final String REL_ID_PERSONALRESSURSKATEGORI = new RelationType.Builder()
            .namespace("fint.no").relationName("personalressurskategori").main(Personalressurs.class, "ansattnummer").related(Personalressurskategori.class, "systemid").buildTypeString();

    private Identifikator brukernavn;
    private Identifikator systemId;
    private Identifikator ansattnummer;
    private Periode ansettelsesperiode;
    private Kontaktinformasjon kontaktinformasjon;

    @JsonIgnore
    @Override
    public String getId() {
        return this.getAnsattnummer().getIdentifikatorverdi();
    }
}
