# Projet Rap-jeu
Ce repo présente le code produit pour répondre à l'énoncé du cours de java/angular.

## Requirements

- Java 17
- Node 16
- Docker

## Run
Le Docker de l'application ne contient que la bdd et vous devrez lancer le back et le front manuellement.

## Disclaimer
Nous avons fait le choix de commencer par développer le Back-End de l'application avant d'avoir développé le front.

Dans cette optique, nous avons mis en place les notions de back nous étant familières. Ainsi, nous avons mis en 
place l'utilisation de la session pour stocker les questions de notre quizz ainsi que le score de les infos
sur la partie en cours.

Pour initialiser la session, nous avons créé un contrôleur /game/init qui intéragie avec le back-end exclusivement. 
Nous n'avons pas réussi à connecter le front à cette requête, car elle n'a aucune intéraction directe avec celui-ci,
rendant la base de notre logique métier backend inutilisable.

Plutôt que de chercher une alternative à la structure de notre back, nous avons décidé de nous entêter à le faire 
fonctionner de cette manière sans succès...

Ce retard a ainsi eu un impact fort sur le développement du front qui n'a pas pu aboutir.

Angular étant nouveau pour nous et étant deux développeurs plus habitués au back qu'au front, nous avons sous-éstimé 
la complexité de sa réalisation et avons fait preuve d'un manque d'organisation.

Le contrôle de session n'a pas pu être mis en place non plus.

Nous vous invitons à tester les fonctionnalités du backend via Postman pour valider leurs fonctionnements.

## Endpoints

### AnswerController
Le contrôleur Spring fourni dans la classe `AnswerController` propose les points d'accès REST suivants :

1. **GET** `""` - Récupère la liste de toutes les réponses.

2. **GET** `"/{id}"` - Récupère une réponse spécifique par ID.

3. **POST** `"/{idAnswer}/{idQuestion}"` - Vérifie une réponse donnée à une question. Augmente le score en session si la réponse est correcte.

4. **POST** `"/rapper/{idRapper}"` - Vérifie une réponse pour un rappeur donné en utilisant la distance de Levenshtein. Augmente le score en session si la réponse est similaire au nom du rappeur.

5. **DELETE** `"/{id}"` - Supprime une réponse par ID.

6. **POST** `"/add"` - Ajoute une nouvelle réponse à partir d'un objet `AnswerDto`.

### GameController
Le contrôleur Spring fourni dans la classe `GameController` propose les points d'accès REST suivants :

1. **GET** `""` - Récupère la liste de tous les jeux.

2. **GET** `"/highScores"` - Récupère la liste des meilleurs scores.

3. **GET** `"/{id}"` - Récupère un jeu spécifique par ID.

4. **GET** `"/init"` - Initialise une nouvelle partie en générant des questions et en initialisant le score. Redirige vers "/game/sendQuestion" après l'initialisation.

5. **GET** `"/sendQuestion"` - Redirige vers la page de la question suivante. Si le nombre de questions atteint un multiple de 5, redirige vers la page de devinette du rappeur.

### QuestionController
Le contrôleur Spring fourni dans la classe `QuestionController` propose les points d'accès REST suivants :

1. **GET** `""` - Récupère la liste de toutes les questions.

2. **GET** `"/{id}"` - Récupère une question spécifique par ID.

3. **GET** `"/guessRapper/{id}"` - Récupère un rappeur spécifique par ID, utilisé pour la fonctionnalité de devinette du rappeur.

4. **DELETE** `"/{id}"` - Supprime une question par ID.

5. **POST** `"/add"` - Ajoute une nouvelle question à partir d'un objet `QuestionDto`.

### RapperController
Le contrôleur Spring fourni dans la classe `RapperController` propose les points d'accès REST suivants :

1. **GET** `""` - Récupère la liste de tous les rappeurs.

2. **GET** `"/{id}"` - Récupère un rappeur spécifique par ID.

3. **DELETE** `"/{id}"` - Supprime un rappeur par ID.