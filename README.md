# Projet 4A - Application mobile : Slime App
## Étudiante : _MOORGHEN Shéréna_
Ce projet permet de mettre en pratique toutes les notions basiques en Kotlin du développement mobile vues en cours.

À travers l'univers de [Dragon Quest](https://dragonquest.square-enix-games.com/), cette application, nommée **Slime App**, propose une description détaillée de chaque slime du monde _Dragon Quest IX : Les sentinelles du Firmament_.
<p align="center">
 <img src = "https://user-images.githubusercontent.com/63917571/103371082-dc9e1c80-4ace-11eb-93ff-25d99c6bcbd8.png" width="400" height="200">
 </p>

## Table des matières
* Logiciels utilisés
* Critères de notation
* Fonctionnalités
* Art Design
* Références

## Logiciels utilisés
### <img src = "https://user-images.githubusercontent.com/63917571/81484222-27b7a680-9244-11ea-926d-98b4cbf25aaa.png" width="75" height="75"> Android Studio
Environnement de développement choisi pour développer des applications mobiles Android.

### <img src = "https://user-images.githubusercontent.com/63917571/81484226-2a1a0080-9244-11ea-91f1-4eb25c4ad807.png"> Paint Tool SAI
Éditeur graphique raster léger et un logiciel de peinture pour Microsoft Windows.

## Critères de notation
### Fonctionnalités
* Écran avec une liste d’éléments
* Écran avec le détail d’un élément
* Appel WebService à une API Rest
* Mise en place d'une base de données avec Room
* Création et Login de l'utilisateur

### Architecture
* MVVM
* Clean Architecure

### Design
* Material Design (Android Studio)
* Paint Tool SAI
* Dragon Quest Wiki

## Fonctionnalités
### Écran de login
`API Rest`: [Ghibli_API](https://github.com/Luzarios/Ghibli_Repertory/blob/master/Api.json), entièrement créée sur [GitHub](https://github.com/).

<p align="center">
<img src="https://user-images.githubusercontent.com/63917571/81483724-93981000-9240-11ea-8079-2fd6139da022.png" width="270" height="480">
<img src="https://user-images.githubusercontent.com/63917571/81483501-0607f080-923f-11ea-9502-e5736b4ec5ee.png" width="270" height="480">
</p>
 
* _SIGN IN_ : bouton qui permet de se connecter et d'accéder à la liste.
* _CREATE AN ACCOUNT_ : bouton qui redirige l'utilisateur vers la page de création de compte.

### Écran de création de compte

<p align="center">
<img src="https://user-images.githubusercontent.com/63917571/81483724-93981000-9240-11ea-8079-2fd6139da022.png" width="270" height="480">
<img src="https://user-images.githubusercontent.com/63917571/81483501-0607f080-923f-11ea-9502-e5736b4ec5ee.png" width="270" height="480">
<img src="https://user-images.githubusercontent.com/63917571/81483501-0607f080-923f-11ea-9502-e5736b4ec5ee.png" width="270" height="480">
</p>

* _CREATE AN ACCOUNT_ : bouton qui crée un compte et redirige l'utilisateur vers la page d'accueil.

### Création du compte !

<p align="center">
<img src="https://user-images.githubusercontent.com/63917571/81483501-0607f080-923f-11ea-9502-e5736b4ec5ee.png" width="270" height="480">
</p>

### Écran affichage de la liste
Affiche la famille des slimes.

<img src="https://user-images.githubusercontent.com/63917571/81483501-0607f080-923f-11ea-9502-e5736b4ec5ee.png" width="270" height="480"> 

* `RecyclerView` : affiche une liste déroulante d'éléments basée sur un/des ensemble(s) de données.

### Écran détails des slimes
Offre une description complète du slime sélectionné.

<img src="https://user-images.githubusercontent.com/63917571/81483501-0607f080-923f-11ea-9502-e5736b4ec5ee.png" width="270" height="480"> 

## Art Design
Concerne toute la partie graphique utilisée avec [Paint Tool SAI](https://www.systemax.jp/en/sai/) pour l'application **Slime App**.

### Logo
Logo représentant le monstre emblématique de [Dragon Quest](https://dragonquest.square-enix-games.com/).

<p align="center">
 <img src = "https://user-images.githubusercontent.com/63917571/103372136-81b9f480-4ad1-11eb-9acf-9619b7585707.png" width="200" height="200">
 </p>
 
## Références
### <img src = "https://user-images.githubusercontent.com/63917571/103372282-dfe6d780-4ad1-11eb-9078-8046f4dc34da.png" width="75" height="75"> Dragon Quest Wiki
Toutes les images utilisées sont issues du site [Dragon Quest Wiki](https://dragon-quest.org/wiki/Slime_family).
