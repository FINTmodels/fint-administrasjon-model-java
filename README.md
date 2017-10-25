# FINT informasjonsmodeller for Java

[ ![Download](https://api.bintray.com/packages/fint/maven/fint-administrasjon-model-java/images/download.svg) ](https://bintray.com/fint/maven/fint-administrasjon-model-java/_latestVersion)

Inneholder modeller for administrasjon (tjenesteområdet)

Se informasjonsmodell dokumentasjonen for mer informasjon: [https://informasjonsmodell.felleskomponent.no](https://informasjonsmodell.felleskomponent.no)


## Snapshot tester

Testene er tilgjengelig i `ModelSpec`. De genererte json-filene vil lagres i `src/test/resources/snapshots`, disse skal sjekkes inn i repository.

1. Kjør testen `Matches snapshots` for å verifisere at modellene fungerer med snapshot filene.
2. Kjør `Create FINT model snapshots` for å regenerere snapshot json-filene.