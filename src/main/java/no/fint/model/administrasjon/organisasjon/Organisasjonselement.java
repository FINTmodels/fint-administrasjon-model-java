package no.fint.model.administrasjon.organisasjon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.administrasjon.kodeverk.Ansvar;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Periode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Organisasjonselement {
    private String navn;
    private String kortnavn;
    private Personalressurs leder;
    private boolean erAktiv;
    private Organisasjonselement overordnet;
    private Ansvar foreslaattAnsvar;
    private Identifikator orgId;
    private Identifikator orgKode;
    private Periode gyldighetsperiode;
}
