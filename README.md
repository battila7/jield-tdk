# Generátorok előállítása CPS-transzformációval Java nyelven

## Debreceni Egyetem, Informatikai Kar, Számítógéptudományi Tanszék

Szerző: Bagossy Attila

Témavezetők: Dr. Battyányi Gyula Péter, Balla Tibor

----

## Absztrakt

A dolgozatban egy olyan transzformációs eljárás kerül ismertetésre, mely lehetővé teszi generátorok használatát Java nyelvben. Az eljárás a nyelv és a fordító módosítása nélkül, a Java által biztosított annotációk és a Pluggable Annotation Processing API segítségével valósítja meg a generátorok támogatását. Ennek köszönhetően használata nem igényel speciális futtatókörnyezetet. Az implementáció részletei mellett a dolgozat egy áttekintő képet ad az úgynevezett Continuation Passing Style használatáról és a generátorral rokon szerkezetek családjáról.

Az eljárás kifejtését követően gyakorlati példák szemléltetik a generátorok felhasználásának lehetőségeit. Ezzel együtt a transzformáció segítségével, és a Java jelenlegi szerkezeteit használva nyert generátorok összehasonlítására is sor kerül, teljesítményt és más szempontokat figyelembe véve. 

Zárásként az eljárás továbbfejlesztésének lehetséges irányai szerepelnek, mint a haladottabb vezérlési szerkezetek modellezése, vagy a nyelvi szintű támogatás bevezetése.

## Build

A dolgozat PDF-be való buildeléséhez Windowson felhasználható a `make.bat` állomány. A buildhez a `latexmk` és a `pdflatex` programok szükségesek.