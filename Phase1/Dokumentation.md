# Webbasierte Anwendungen 2 - Verteilte Systeme

## Dokumentation 

Lutz Schönfelder

## Aufgaben
### Aufgabe 1

**Wohlgeformtheit**

Unter Wohlgeformtheit eines XML-Dokumentes versteht man, dass eine Struktur erkennbar ist.
Dazu gehört am Beginn die XML Deklalation, die den Bezug zu XML herstellt.
Außerdem muss mindestens ein Datenelement existieren und ein Wurzelelement alle anderen Elemente enthalten.

**Validität**

Ein XML-Dokument ist gültig (valid), wenn es wohlgeformt ist, 
den Verweis auf eine Grammatik enthält und das durch die Grammatik beschriebene Format einhält.

**Namespaces**

XML-Namensräume werden benutzt, um das Vokabular eines XML-Dokumentes eindeutig zu identifizieren und um in einem einzelnen Dokument mehrere XML-Sprachen zu mischen



###Aufgabe 2
**a)**

```
<?xml version="1.0" encoding="UTF-8"?>
<personen>
  <person>
	  <vorname>Lutz</vorname>
	  <nachname>Schönfelder</nachname>
	  <email>lutz.schoenfelder@googlemail.com</email>
	  <geburtsdatum>27.05.1991</geburtsdatum>
	  <erfahrung>Amateur</erfahrung>
	  <schlagzeug>vorhanden</schlagzeug>
	  <anmerkung></anmerkung>
  </person>
	<person>
		<vorname>Max</vorname>
		<nachname>Mustermann</nachname>
		<email>max.mustermann@googlemail.com</email>
		<geburtsdatum>01.01.1991</geburtsdatum>
		<erfahrung>Amateur</erfahrung>
		<schlagzeug>nicht vorhanden</schlagzeug>
		<anmerkung></anmerkung>
	</person>
</personen>
```

Eine Sache die hier vielleicht auffallen könnte, ist, dass der Gruppenleiter auch als Person behandelt wird.
Dazu habe ich mich entschieden, weil ich der Meinung bin, dass die Webseite sich darum kümmert, dass die erste Person
als Gruppenleiter angezeigt wird. Außerdem verzichtet man so auf eine Redundanz, da der Gruppenleiter und die restlichen
Personen genau die selben Elemente haben. Falls es nötig ist, den Gruppenleiter im XML-Dokument besonders dazustellen,
kann man einfach im Element ``person`` ein Attribut erstellen, z.B: ``<person rang="Gruppenleiter">``
