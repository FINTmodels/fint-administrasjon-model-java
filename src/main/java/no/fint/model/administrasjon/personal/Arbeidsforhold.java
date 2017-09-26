// Built from tag v2.0.0

package no.fint.model.administrasjon.personal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Arbeidsforhold {
    private long ansettelsesprosent;
    private Periode gyldighetsperiode;
    private boolean hovedstilling;
    private long lonnsprosent;
    private String stillingsnummer;
    private String stillingstittel;
    private Identifikator systemId;
    private long tilstedeprosent;
    private long arslonn;
    public enum Relasjonsnavn {
        ANSVAR,
        ARBEIDSFORHOLDSTYPE,
        FUNKSJON,
        STILLINGSKODE,
        TIMERPERUKE,
        ARBEIDSSTED,
        PERSONALRESSURS,
        UNDERVISNINGSFORHOLD
    }
}

