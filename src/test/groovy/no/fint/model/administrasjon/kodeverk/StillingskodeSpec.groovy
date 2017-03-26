package no.fint.model.administrasjon.kodeverk

import no.fint.model.relation.RelationType
import no.fint.model.relation.RelationUtil
import spock.lang.Specification

class StillingskodeSpec extends Specification {

    def "Get relation types"() {
        when:
        def relations = RelationUtil.getRelationTypes(Stillingskode)

        then:
        relations.size() == 1
    }

    def "Verify relation type"() {
        when:
        def relationType = new RelationType(Stillingskode.REL_ID_FORELDER)

        then:
        relationType.isValid()
        relationType.containsClass(Stillingskode)
    }
}
