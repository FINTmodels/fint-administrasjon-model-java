package no.fint.model.administrasjon

import no.fint.model.test.utils.JsonSnapshots
import spock.lang.Requires
import spock.lang.Specification

class ModelSpec extends Specification {
    private JsonSnapshots jsonSnapshots

    void setup() {
        jsonSnapshots = new JsonSnapshots('no.fint.model.administrasjon')
    }

    @Requires({ Boolean.valueOf(sys['UPDATE_SNAPSHOT']) })
    def "Create FINT model snapshots"() {
        expect:
        jsonSnapshots.create()
    }

    def "Matches snapshots"() {
        expect:
        jsonSnapshots.matchesSnapshots()
        jsonSnapshots.matchesRelationNames()
    }
}
