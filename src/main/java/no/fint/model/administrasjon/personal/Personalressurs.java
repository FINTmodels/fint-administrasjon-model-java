// Built from tag v2.2.0

package no.fint.model.administrasjon.personal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;

@Data
@EqualsAndHashCode
@ToString
public class Personalressurs implements FintMainObject {
	public enum Relasjonsnavn {
			PERSONALRESSURSKATEGORI,
			ARBEIDSFORHOLD,
			PERSON
	}

	private Identifikator ansattnummer;
	private Periode ansettelsesperiode;
	private Identifikator brukernavn;
	private Kontaktinformasjon kontaktinformasjon;
	private Identifikator systemId;
	}
