# Exemple 2 - Abstract Factory : vehicules

Cet exercice est isole dans le package exemple2 et la branche exemple-2.
Cette branche contient uniquement le code de l'exemple 2. Le premier exercice est conserve dans les branches main et exemple-1-mod.

## Correspondance avec le diagramme

- Automobile et Scooter sont des classes abstraites.
- AutomobileEssence et AutomobileElectrique heritent de Automobile.
- ScooterEssence et ScooterElectrique heritent de Scooter.
- AbstractFactory est une classe abstraite, comme sur ce diagramme.
- FactoryEssence cree AutomobileEssence et ScooterEssence.
- FactoryElectrique cree AutomobileElectrique et ScooterElectrique.
- Client utilise les types abstraits pour manipuler les deux familles.

Les noms ConstruireAutomobile et ConstruireScooter conservent la majuscule du diagramme.
Le comportement des methodes n'etant pas precise, elles affichent le type du vehicule.

## Compiler et lancer depuis devoir

```powershell
javac -encoding UTF-8 -d out src/exemple2/*.java
java -cp out exemple2.Client
```

## Resultat attendu

```text
Famille essence :
AutomobileEssence : methodeAutomobile
ScooterEssence : methodeScooter
Famille electrique :
AutomobileElectrique : methodeAutomobile
ScooterElectrique : methodeScooter
```