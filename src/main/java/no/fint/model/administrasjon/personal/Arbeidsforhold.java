package no.fint.model.administrasjon.personal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Kontaktinformasjon;
import no.fint.model.felles.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Arbeidsforhold {
    public static String RELASJON_ARBEIDSFORHOLD_PERSONALRESSURS = "urn:fint.no:arbeidsforhold:personalressurs:arbeidsforhold.systemid:personalressurs.ansattnummer";
    public static String RELASJON_ARBEIDSFORHOLD_ORGANISASJON = "urn:fint.no:arbeidsforhold:organisasjon:arbeidsforhold.systemid:organisasjosnelement.orgid";
    public static String RELASJON_ARBEIDSFORHOLD_ARBEIDSFORHOLDSTYPE = "urn:fint.no:arbeidsforhold:arbeidsforholdstype:arbeidsforhold.systemid:arbeidsforholdstype.systemid";
    public static String RELASJON_ARBEIDSFORHOLD_STILLINGSKODE = "urn:fint.no:arbeidsforhold:stillingskode:arbeidsforhold.systemid:stillingskode.systemid";
    public static String RELASJON_ARBEIDSFORHOLD_ANSVAR = "urn:fint.no:arbeidsforhold:ansvar:arbeidsforhold.systemid:ansvar.systemid";
    public static String RELASJON_ARBEIDSFORHOLD_FUNKSJON = "urn:fint.no:arbeidsforhold:funksjon:arbeidsforhold.systemid:funksjon.systemid";
    public static String RELASJON_ARBEIDSFORHOLD_TIMEPRUKE = "urn:fint.no:arbeidsforhold:timerpruke:arbeidsforhold.systemid:timerpruke.systemid";

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
