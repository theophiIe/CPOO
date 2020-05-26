# Exercice 8.6.1 DNS

## Information
Si on écrit un nom machine le programme affiche l'ip qui correspond.  
Si on écrit une ip le programme affiche le nom machine correspondant.  
Si on écit ls avec un nom domaine le programme nous donne tous les noms machines avec le même nom de domaine.  
Si on écrit ls -a avec un nom de domaine le programme affiche le nom machine comme dans ls et ajoute l'ip correspondant au nom machine en plus.   
En cas d'erreur de syntaxe le programme affiche "Erreur de syntaxe".   
Si la commande est correcte mais n'est pas contenue dans le fichier un message inconnue apparait.   
Pour quitter le programme ecire : ```exit```  

## Prérequis
Avec un fichier de configuration étant composé d'une ipV4 d'un espace et d'un nom machine   
```
Exemple : 10.19.6.1 https.uvsq.fr
```

## Compilation du programme
```
javac *.java
```

## Exécution du programme
```
java DnsApp
```

## Auteur 
Théophile Molinatti TD4 21707388