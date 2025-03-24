# Exercicis de Programació en Java

## 📌 Nivell 1
### Exercici 1
- Crear una classe `Month` amb un atribut `name` que emmagatzema el nom del mes.
- Afegir 11 objectes `Month` en un `ArrayList` (tots menys "Agost").
- Inserir "Agost" en la posició correcta per mantenir l'ordre.
- Convertir l'`ArrayList` a un `HashSet` i assegurar-se que no hi ha duplicats.
- Recórrer la llista amb un **for** i amb un **iterador**.

### Exercici 2
- Crear i emplenar un `List<Integer>`.
- Crear un segon `List<Integer>` i inserir els elements de la primera en ordre invers.
- Utilitzar **ListIterator** per fer la inserció en ordre invers.

### Exercici 3
- Llegir el fitxer `countries.txt` (conté països i capitals).
- Emmagatzemar les dades en un `HashMap<String, String>`.
- Demanar el nom de l'usuari i mostrar països aleatoris.
- L'usuari ha d'escriure la capital correcta.
- Si encerta, suma un punt. El joc es repeteix 10 vegades.
- Després de 10 intents, guardar el nom i la puntuació en `classificacio.txt`.

---

## 📌 Nivell 2
### Exercici 1
- Crear una classe `Restaurant` amb **nom** (`String`) i **puntuació** (`int`).
- Implementar la lògica per evitar restaurants duplicats en un `HashSet`.
- Pot haver-hi restaurants amb el mateix nom però puntuació diferent.

### Exercici 2
- Ordenar els objectes `Restaurant` per **nom** i per **puntuació** en ordre descendent.

**Exemple:**
```
Nom: restaurant1, Puntuació: 8
Nom: restaurant1, Puntuació: 7
```

---

## 📌 Nivell 3
### Exercici 1
- Llegir un fitxer **CSV** amb **nom, cognom i DNI**.
- Ordenar les persones per **nom, cognom o DNI**.
- Implementar un **menú interactiu**:

```
1.- Introduir persona.
2.- Mostrar les persones ordenades per nom (A-Z).
3.- Mostrar les persones ordenades per nom (Z-A).
4.- Mostrar les persones ordenades per cognoms (A-Z).
5.- Mostrar les persones ordenades per cognoms (Z-A).
6.- Mostrar les persones ordenades per DNI (1-9).
7.- Mostrar les persones ordenades per DNI (9-1).
0.- Sortir.
```

- Format de sortida:
```
___Nom___ ____Cognoms___ __NIF__
Andreu     Ballestero Llenas   34835767J
Miquel     Bayona Font         48743957B
Guillem    Capdevila Riu      33957834J
Albert     Carbonell Ferrer    77364986R
Ferran     Casas Coderch      23047848P
Maria      Casellas Fuste      47102244S
Genis      Ciutat Vendrell     39718459N
```

---

## 🚀 Instal·lació i Execució

1. **Clona el repositori:**
  
  https://github.com/Unrotopo/Sprint1_Tasca3.git

   ```

3. **Obre el projecte en el teu IDE (Eclipse, IntelliJ).**

4. **Compila i executa els programes.**

5. **Si el projecte és Maven o Gradle, usa:**
   ```sh
   mvn clean install
   # o
   gradle build
   ```

---

## 📜 Llicència
Aquest projecte es distribueix sota la llicència MIT. Consulta el fitxer `LICENSE` per més detalls.

---

## 📝 Autor
Aquest repositori ha estat creat per Luis Portas Montero.

---

## 🌟 Contribució
Si vols contribuir, fes un **fork** del repositori i envia un **pull request** amb les teves millores. Gràcies! 😃

