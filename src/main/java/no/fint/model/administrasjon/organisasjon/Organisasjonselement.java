// Built from tag v2.0.10

package no.fint.model.administrasjon.organisasjon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.basisklasser.Enhet;

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Organisasjonselement extends Enhet {
	public enum Relasjonsnavn {
			LEDER,
			OVERORDNET,
			UNDERORDNET,
			SKOLE,
			ARBEIDSFORHOLD
	}

	private Periode gyldighetsperiode;
	private String kortnavn;
	private String navn;
	private Identifikator organisasjonsId;
	private Identifikator organisasjonsKode;
	}

