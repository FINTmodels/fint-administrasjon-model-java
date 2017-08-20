package no.fint.model.administrasjon.organisasjon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.basisklasser.Enhet;

@Data
@EqualsAndHashCode(callSuper=false)
public class Organisasjonselement extends Enhet {
	public enum Relasjonsnavn {
			LEDER,
			OVERORDNET,
			SKOLE,
			UNDERORDNET
	}

	private String navn;
	private String kortnavn;
	private Identifikator organisasjonsId;
	private Identifikator organisasjonsKode;
	private Periode gyldighetsperiode;
	}

