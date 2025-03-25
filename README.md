# README

## Descripció
Aquest repositori conté una sèrie d'exercicis de programació en Java. 

---

## Exercicis

### Nivell 1

#### Exercici 1
- Crea una classe anomenada `Month` amb un atribut `name` (nom del mes de l'any).
- Afegeix 11 objectes `Month` en un `ArrayList`, excepte el mes d'Agost.
- Insereix el mes d'Agost en la posició correcta i assegura't que la llista manté l'ordre.
- Converteix la `ArrayList` en un `HashSet` i comprova que no permet duplicats.
- Recorre la llista amb un bucle `for` i amb un `Iterator`.

#### Exercici 2
- Crea i emplena un `List<Integer>`.
- Crea un segon `List<Integer>` i insereix-hi els elements de la primera llista en ordre invers.
- Utilitza `ListIterator` per llegir els elements de la primera llista i inserir-los a la segona.

#### Exercici 3
- Llegeix el fitxer `countries.txt`, que conté països i capitals, i desa les dades en un `HashMap<String, String>`.
- El programa ha de demanar el nom de l'usuari i mostrar un país de manera aleatòria.
- L'usuari ha d'introduir la capital corresponent. Si l'encerta, suma un punt.
- Repeteix aquest procés 10 vegades.
- Desa la classificació en un fitxer anomenat `classificacio.txt` amb el nom de l'usuari i la seva puntuació.

---

### Nivell 2

#### Exercici 1
- Crea una classe `Restaurant` amb els atributs `name` (String) i `rating` (int).
- Implementa els mètodes necessaris perquè no es puguin introduir objectes `Restaurant` amb el mateix nom i puntuació en un `HashSet`.
- És possible tenir restaurants amb el mateix nom però amb diferents puntuacions.

#### Exercici 2
- Modifica la classe `Restaurant` perquè els objectes es puguin ordenar per nom i per puntuació en ordre descendent.

> **Exemple de sortida:**
>
> nom: restaurant1, puntuació: 8
>
> nom: restaurant1, puntuació: 7

---

### Nivell 3

#### Exercici 1
- Desenvolupa una aplicació per llegir un fitxer CSV que conté tres camps: `name`, `surname` i `DNI`.
- Ordena les persones llegides per nom, cognom o DNI utilitzant la col·lecció més adient.

##### Classe `Persona`
- `name` (String)
- `surname` (String)
- `DNI` (String)

##### Menú de l'aplicació
1. Introduir persona.
2. Mostrar les persones ordenades per nom (A-Z).
3. Mostrar les persones ordenades per nom (Z-A).
4. Mostrar les persones ordenades per cognoms (A-Z).
5. Mostrar les persones ordenades per cognoms (Z-A).
6. Mostrar les persones ordenades per DNI (1-9).
7. Mostrar les persones ordenades per DNI (9-1).
0. Sortir.

##### Exemple de sortida
```
___Nom___ ____Cognoms___ __NIF__
Andreu          Ballestero Llenas  34835767J
Miquel          Bayona Font        48743957B
Guillem         Capdevila Riu      33957834J
Albert          Carbonell Ferrer   77364986R
Ferran          Casas Coderch      23047848P
Maria           Casellas Fuste     47102244S
Genis           Ciutat Vendrell    39718459N
```

