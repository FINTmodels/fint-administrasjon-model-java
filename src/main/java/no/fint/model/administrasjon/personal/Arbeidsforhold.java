// Built from tag v2.0.10

package no.fint.model.administrasjon.personal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Arbeidsforhold {
	public enum Relasjonsnavn {
			ANSVAR,
			ARBEIDSFORHOLDSTYPE,
			FUNKSJON,
			STILLINGSKODE,
			TIMERPERUKE,
			ARBEIDSSTED,
			PERSONALRESSURS,
			UNDERVISNINGSFORHOLD
	}

	private long ansettelsesprosent;
	private Periode gyldighetsperiode;
	private boolean hovedstilling;
	private long lonnsprosent;
	private String stillingsnummer;
	private String stillingstittel;
	private Identifikator systemId;
	private long tilstedeprosent;
	private long arslonn;
	}

