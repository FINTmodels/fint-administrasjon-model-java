package no.fint.model.administrasjon.personal

import no.fint.model.administrasjon.kodeverk.Personalressurskategori
import no.fint.model.felles.Person
import no.fint.model.relation.RelationType
import no.fint.model.relation.RelationUtil
import spock.lang.Specification

class PersonalressursSpec extends Specification {

    def "Get relation types"() {
        when:
        def relations = RelationUtil.getRelationTypes(Personalressurs)

        then:
        relations.size() == 3
    }

    def "Verify relation type"() {
        when:
        def relationType = new RelationType(rel)

        then:
        relationType.isValid()
        relationType.containsClass(Personalressurs, relatedClass)

        where:
        rel                                            | relatedClass
        Personalressurs.REL_ID_PERSON                  | Person
        Personalressurs.REL_ID_ARBEIDSFORHOLD          | Arbeidsforhold
        Personalressurs.REL_ID_PERSONALRESSURSKATEGORI | Personalressurskategori
    }
}
