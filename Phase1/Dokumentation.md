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

**b)**

Das zu XML aquivalente JSON-Dokument:

```
{
"personen":
	[{
		"vorname": "Lutz",
		"nachname": "Schönfelder",
		"email": "lutz.schoenfelder@googlemail.com",
		"geburtsdatum": "27.05.1991",
		"erfahrung": "Amateur",
		"schlagzeug": "nicht vorhanden",
		"anmerkung": ""
	},
	{
		"vorname": "Max",
		"nachname": "Mustermann",
		"email": "max.mustermann@googlemail.com",
		"geburtsdatum": "01.01.1991",
		"erfahrung": "Amateur",
		"schlagzeug": "nicht vorhanden",
		"anmerkung": ""
	}]
}
```

###Aufgabe 3
**a)**

```
<rezept>
	<name> Lenchen's Schokoladenkuchen </name>
	
	<fotos>
		<foto src="img/foto1"> mrasterix </foto>
		<foto src="img/foto2"> Lari </foto>
		<foto src="img/foto60"> Leokardia </foto>
	</fotos>
	
	<zutaten> 
      		<zutat menge="200" einheit="g"> butter </zutat>
      		<zutat menge="200" einheit="g"> zucker </zutat>
      		<zutat menge="200" einheit="g"> schokolade, blockschokolade </zutat>
      		<zutat menge="120" einheit="g"> mehl </zutat>
      		<zutat menge="1/2" einheit="tl"> backpulver </zutat>
      		<zutat menge="1" einheit="Pkt."> Vanillezucker </zutat>
      		<zutat menge="4" einheit=""> Ei(er) </zutat>
    	</zutaten>

    	<arbeitszeit> ca 1 Std. </arbeitszeit>
    	<schwierigkeitsgrad> normal </schwierigkeitsgrad>
    	<brennwert> 295 kcal </brennwert>

    	<zubereitung>
      		Butter und Schokolade im Wasserbad schmelzen. 
      		Eier trennen. Eiweiß steif schlagen.
      		Eigelbe, Zucker und Vanillezucker verrühren. 
      		Geschmolzene Butter-Schokomasse hinzufügen und mischen. 
      		Mehl mit dem Backpulver in die Masse sieben
      		und zum Schluss die steifen Eiweiße vorsichtig unterheben. 
      		In eine gut gefettete Form geben. 
      		Bei 180°Grad 40 – 50 Minuten backen.
    	</zubereitung>
    	
    	<kommentare>
    		<kommentar>
    			<user> swieselchen </user>
    			<zeit> 07.02.2002 18:49 </zeit>
    			<text> Meinem Hund hat es geschmeckt.. </text>
    		</kommentar>
    		
    		<kommentar>
    			<user> Mane </user>
    			<zeit> 07.01.2003 15:06 </zeit>
    			<text> Total wiederlich! BAH! </text>
    		</kommentar>
    		
    		<kommentar>
    			<user> Bossie </user>
    			<zeit> 17.02.2003 09:38 </zeit>
    			<text> Jo Leute checkt mal meine Rezepte aus </text>
    		</kommentar>
    	</kommentare>
</rezept>
```

Hierzu zu sagen ist, dass ich mit bei ``<foto src=""> </foto>`` an dem HTML-Tag ``<img>`` orientiert habe.

**b)**
