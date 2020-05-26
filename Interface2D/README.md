# Exercice 8.6.3 Interface 2D

## Compilation 
```
javac *.java
```

## Exécution
```
java Main
```

# Utilisation
Le programme permet :
- De créer une forme : Dessin
- De déplacer une forme : Deplacer
- De voir la liste des formes crées : Afficher
- De pouvoir arrêter le programme : Quiter

## Dessin
La fonctionnalité Dessin permet de créer les formes suivantes :
- cercle
- rectangle
- triangle
    
Une fois la forme choisie il faut définir un nom à la forme.   

Pour le cercle il faut définir les coordonées du centre et la taille du rayon.   
Pour le rectangle il faut définir les coordonnées du point supérieur gauche et inférieur bas.    
Pour le triangle il faut définr les coordonnées de chaque sommet.

## Déplacer
La fonctionnalité Deplacer permet de déplacer une ou plusieur forme. Pour cela il faut indiquer le nom de la ou les formes.   
Exemple : 
```
> cercle1
```
Permet de selectionner la forme nommé cercle1 il est maintenant possible de modifié ses coordonnées

```
> c1 c2 r1
```
Permet de déplacer le groupe de forme constitué des formes nommés : c1, c2 et r1   
   
Si une des formes choisies n'existe pas un message d'erreur apparait pour la forme en question.

## Afficher
Cette fonctionnalité permet d'afficher la liste des formes crées par l'utilisateur, s'il n'y a aucune forme un message apparait pour indiquer qu'aucune forme n'existe.

## Auteur 
Théophile Molinatti 21707388 TD4