// Built from tag v2.4.0

package no.fint.model.administrasjon.personal;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class Lonn implements FintAbstractObject {
    private Date anvist;
    private Date attestert;
    private Date kontert;
    @NonNull
    private Periode periode;
    @NonNull
    private Identifikator systemId;
}
