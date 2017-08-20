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
    public enum Relasjonsnavn {
        ANSVAR,
        ARBEIDSFORHOLDSTYPE,
        FUNKSJON,
        STILLINGSKODE,
        TIMERPERUKE,
        ARBEIDSSTED,
        UNDERVISNINGSFORHOLD,
        PERSONALRESSURS
    }

    private Identifikator systemId;
    private String stillingsnummer;
    private Periode gyldighetsperiode;
    private double arslonn;
    private String stillingstittel;
    private double ansettelsesprosent;
    private double lonnsprosent;
    private boolean hovedstilling;
}

