// Built from tag v1.1.0-rc3

package no.fint.model.administrasjon.organisasjon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.basisklasser.Enhet;

@Data
@EqualsAndHashCode(callSuper=false)
public class Organisasjonselement extends Enhet {
	public enum Relasjonsnavn {
			LEDER,
			OVERORDNET,
			UNDERORDNET,
			SKOLE
	}

	private Periode gyldighetsperiode;
	private String kortnavn;
	private String navn;
	private Identifikator organisasjonsId;
	private Identifikator organisasjonsKode;
	}

