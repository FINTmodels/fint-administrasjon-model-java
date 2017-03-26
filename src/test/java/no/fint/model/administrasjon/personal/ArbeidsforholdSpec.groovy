package no.fint.model.administrasjon.personal

import no.fint.model.administrasjon.kodeverk.*
import no.fint.model.administrasjon.organisasjon.Organisasjonselement
import no.fint.model.relation.RelationType
import no.fint.model.relation.RelationUtil
import spock.lang.Specification

class ArbeidsforholdSpec extends Specification {

    def "Get relation types"() {
        when:
        def relations = RelationUtil.getRelationTypes(Arbeidsforhold)

        then:
        relations.size() == 7
    }

    def "Verify relation type"() {
        when:
        def relationType = new RelationType(rel)

        then:
        relationType.isValid()
        relationType.containsClass(Arbeidsforhold, relatedClass)

        where:
        rel                                       | relatedClass
        Arbeidsforhold.REL_ID_PERSONALRESSURS     | Personalressurs
        Arbeidsforhold.REL_ID_ORGANISASJON        | Organisasjonselement
        Arbeidsforhold.REL_ID_ARBEIDSFORHOLDSTYPE | Arbeidsforholdstype
        Arbeidsforhold.REL_ID_STILLINGSKODE       | Stillingskode
        Arbeidsforhold.REL_ID_ANSVAR              | Ansvar
        Arbeidsforhold.REL_ID_FUNKSJON            | Funksjon
        Arbeidsforhold.REL_ID_TIMEPRUKE           | TimerPerUkeKode
    }
}
