// Built from tag v2.0.10

package no.fint.model.administrasjon.personal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Personalressurs {
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

