// Built from tag feature-betaling

package no.fint.model.administrasjon.betaling;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.basisklasser.Aktor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Kunde extends Aktor implements FintMainObject {
    @NonNull
    private Identifikator kundenummer;
}
