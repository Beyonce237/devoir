# devoir - Abstract Factory

Implementation Java du diagramme de classes fourni.

## Structure

- AbstractFactory : interface de creation des produits A et B.
- ProduitA et ProduitB : classes abstraites des deux types de produits.
- ProduitA1, ProduitB1 : produits de la famille 1, crees par Factory1.
- ProduitA2, ProduitB2 : produits de la famille 2, crees par Factory2.
- ProduitA3, ProduitB3 : produits de la famille 3, crees par Factory3.
- Client : montre l'utilisation des trois fabriques via les types abstraits.
- Main : point d'entree supplementaire qui lance Client.

Le diagramme ne precise pas le corps des methodes ni leur type de retour pour les operations des produits. Ces operations retournent donc void et affichent le nom du produit pour illustrer le fonctionnement. Les produits generiques sont modelises par des classes abstraites ; AbstractFactory est une interface, comme indique sur le diagramme.

## Compiler et executer

Avec un JDK installe, depuis le dossier devoir :

```powershell
javac -encoding UTF-8 -d out src/*.java
java -cp out Client
```

On peut aussi lancer `java -cp out Main`.

## Resultat attendu

```text
Famille 1 :
ProduitA1 : methodeproduitA
ProduitB1 : methodeproduitB
Famille 2 :
ProduitA2 : methodeproduitA
ProduitB2 : methodeproduitB
Famille 3 :
ProduitA3 : methodeproduitA
ProduitB3 : methodeproduitB
```