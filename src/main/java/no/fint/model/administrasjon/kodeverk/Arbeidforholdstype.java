package no.fint.model.administrasjon.kodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import no.fint.model.felles.basisklasser.Begrep;

@Data
@EqualsAndHashCode(callSuper=false)
public class Arbeidforholdstype extends Begrep {
	public enum Relasjonsnavn {
			FORELDER
	}
}

