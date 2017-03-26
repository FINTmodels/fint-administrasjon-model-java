package no.fint.model.administrasjon.kodeverk

import no.fint.model.relation.RelationType
import no.fint.model.relation.RelationUtil
import spock.lang.Specification

class ArbeidsforholdstypeSpec extends Specification {

    def "Get relation types"() {
        when:
        def relations = RelationUtil.getRelationTypes(Arbeidsforholdstype)

        then:
        relations.size() == 1
    }

    def "Verify relation type"() {
        when:
        def relationType = new RelationType(Arbeidsforholdstype.REL_ID_FORELDER)

        then:
        relationType.isValid()
        relationType.containsClass(Arbeidsforholdstype)

    }
}
