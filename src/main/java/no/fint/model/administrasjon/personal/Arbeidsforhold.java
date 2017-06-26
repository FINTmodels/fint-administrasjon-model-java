package no.fint.model.administrasjon.personal;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.relation.Identifiable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Arbeidsforhold implements Identifiable {
    private Identifikator systemId;
    private String stillingsnummer;
    private Periode gyldighetsperiode;
    private double arslonn;
    private String stillingstittel;
    private double ansettelsesprosent;
    private double lonnsprosent;
    private boolean hovedstilling;

    @JsonIgnore
    @Override
    public String getId() {
        return this.getSystemId().getIdentifikatorverdi();
    }

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
}

