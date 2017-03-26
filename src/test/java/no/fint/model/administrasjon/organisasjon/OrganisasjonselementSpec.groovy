package no.fint.model.administrasjon.organisasjon

import no.fint.model.relation.RelationType
import no.fint.model.relation.RelationUtil
import spock.lang.Specification

class OrganisasjonselementSpec extends Specification {

    def "Get relation types"() {
        when:
        def relations = RelationUtil.getRelationTypes(Organisasjonselement)

        then:
        relations.size() == 3
    }

    def "Verify relation type"() {
        when:
        def relationType = new RelationType(rel)

        then:
        relationType.isValid()
        relationType.containsClass(Organisasjonselement)

        where:
        rel                                        | _
        Organisasjonselement.REL_ID_ORGANISASJON   | _
        Organisasjonselement.REL_ID_ARBEIDSFORHOLD | _
        Organisasjonselement.REL_ID_LEDER          | _
    }
}
