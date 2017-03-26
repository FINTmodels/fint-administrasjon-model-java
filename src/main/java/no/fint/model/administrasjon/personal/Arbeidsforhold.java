package no.fint.model.administrasjon.personal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.administrasjon.kodeverk.*;
import no.fint.model.administrasjon.organisasjon.Organisasjonselement;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Kontaktinformasjon;
import no.fint.model.felles.Periode;
import no.fint.model.relation.RelationType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Arbeidsforhold {
    public static String REL_ID_PERSONALRESSURS = new RelationType.Builder()
            .namespace("fint.no").relationName("personalressurs").main(Arbeidsforhold.class, "systemid").related(Personalressurs.class, "ansattnummer").buildTypeString();

    public static String REL_ID_ORGANISASJON = new RelationType.Builder()
            .namespace("fint.no").relationName("organisasjon").main(Arbeidsforhold.class, "systemid").related(Organisasjonselement.class, "orgid").buildTypeString();

    public static String REL_ID_ARBEIDSFORHOLDSTYPE = new RelationType.Builder()
            .namespace("fint.no").relationName("arbeidsforholdstype").main(Arbeidsforhold.class, "systemid").related(Arbeidsforholdstype.class, "systemid").buildTypeString();

    public static String REL_ID_STILLINGSKODE = new RelationType.Builder()
            .namespace("fint.no").relationName("stillingskode").main(Arbeidsforhold.class, "systemid").related(Stillingskode.class, "systemid").buildTypeString();

    public static String REL_ID_ANSVAR = new RelationType.Builder()
            .namespace("fint.no").relationName("ansvar").main(Arbeidsforhold.class, "systemid").related(Ansvar.class, "systemid").buildTypeString();

    public static String REL_ID_FUNKSJON = new RelationType.Builder()
            .namespace("fint.no").relationName("funksjon").main(Arbeidsforhold.class, "systemid").related(Funksjon.class, "systemid").buildTypeString();

    public static String REL_ID_TIMEPRUKE = new RelationType.Builder()
            .namespace("fint.no").relationName("timerperuke").main(Arbeidsforhold.class, "systemid").related(TimerPerUkeKode.class, "systemid").buildTypeString();

    private Identifikator systemId;
    private String stillingsnummer;
    private boolean aktiv;
    private double arslonn;
    private String stillingstittel;
    private double ansettelsesprosent;
    private double lonnsprosent;
    private boolean hovedstilling;
    private Periode gyldighetsperiode;
    private Kontaktinformasjon kontaktinformasjon;

}
