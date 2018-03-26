// Built from tag feature-betaling

package no.fint.model.administrasjon.betaling;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import java.util.Date;
import no.fint.model.administrasjon.kompleksedatatyper.Kontostreng;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Betalingsinformasjon implements FintComplexDatatypeObject {
    @NonNull
    private Long belop;
    @NonNull
    private String betalingsmiddel;
    @NonNull
    private String betalingsstatus;
    @NonNull
    private String betalingstype;
    @NonNull
    private Date forfallsdato;
    @NonNull
    private Kontostreng kontering;
    @NonNull
    private Date transaksjonsdato;
}
