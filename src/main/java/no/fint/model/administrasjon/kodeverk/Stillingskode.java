package no.fint.model.administrasjon.kodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stillingskode extends Begrep {
    private Stillingskode forelder;
    private String ksKode;
}
