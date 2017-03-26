package no.fint.model.administrasjon.kodeverk

import no.fint.model.relation.RelationType
import no.fint.model.relation.RelationUtil
import spock.lang.Specification

class AnsvarSpec extends Specification {

    def "Get relation types"() {
        when:
        def relations = RelationUtil.getRelationTypes(Ansvar)

        then:
        relations.size() == 1
    }

    def "Verify relation type"() {
        when:
        def relationType = new RelationType(Ansvar.REL_ID_FORELDER)

        then:
        relationType.isValid()
        relationType.containsClass(Ansvar)
    }
}
