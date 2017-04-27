package no.fint.model.administrasjon.personal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;
import no.fint.model.relation.Identifiable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Arbeidsforhold implements Identifiable {
    public enum Relasjonsnavn {
        ANSVAR,
        ARBEIDSFORHOLDSTYPE,
        FUNKSJON,
        STILLINGSKODE,
        TIMEPERUKE,
        ARBEIDSSTED,
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

    public Arbeidsforhold(Identifikator systemId, String stillingsnummer, double arslonn, String stillingstittel, double ansettelsesprosent, double lonnsprosent, boolean hovedstilling, Periode gyldighetsperiode) {
        this.systemId = systemId;
        this.stillingsnummer = stillingsnummer;
        this.arslonn = arslonn;
        this.stillingstittel = stillingstittel;
        this.ansettelsesprosent = ansettelsesprosent;
        this.lonnsprosent = lonnsprosent;
        this.hovedstilling = hovedstilling;
        this.gyldighetsperiode = gyldighetsperiode;
    }

    @JsonIgnore
    @Override
    public String getId() {
        return this.getSystemId().getIdentifikatorverdi();
    }
}
