# Explication de la CI/CD et Métriques

## Introduction

La présente documentation vise à expliquer les étapes de la CI/CD mises en place dans notre projet, ainsi que les KPIs (
Key Performance Indicators) proposés pour évaluer les performances de notre processus de développement continu. Nous
analyserons également les métriques disponibles et les retours utilisateurs pertinents. L'objectif est d'assurer une
meilleure compréhension de notre pipeline CI/CD et de favoriser l'amélioration continue de notre projet.

## Étapes de la CI/CD

1. **Compilation du code** : Cette étape consiste à compiler le code source de notre projet pour s'assurer qu'il est
   exempt d'erreurs de syntaxe et qu'il peut être exécuté correctement.
2. **Exécution des tests** : Après la compilation, nous exécutons une suite de tests automatisés pour vérifier le bon
   fonctionnement de notre application et garantir sa qualité.
3. **Création d'une image Docker** : Une fois les tests réussis, nous créons une image Docker contenant notre
   application, facilitant ainsi son déploiement et son exécution sur différentes plateformes.
4. **Déploiement sur un environnement de test** : Nous déployons l'image Docker sur un environnement de test pour
   effectuer des tests d'intégration et de validation approfondis.
5. **Déploiement sur un environnement de production** : Après avoir validé l'application sur l'environnement de test,
   nous procédons au déploiement sur l'environnement de production afin de la rendre disponible aux utilisateurs finaux.

## KPIs proposés

1. **Code coverage minimum** : Nous visons un code coverage minimum de 80%, ce qui signifie que 80% de notre code est
   couvert par des tests automatisés. Cela garantit une meilleure qualité du code et réduit les risques d'erreurs.
2. **Temps total d'exécution de la pipeline** : Nous suivons le temps total nécessaire pour exécuter l'ensemble de la
   pipeline CI/CD. L'objectif est de réduire ce temps au minimum afin d'accélérer le processus de déploiement et
   d'améliorer la réactivité de notre développement.
3. **Nombre de bugs** : Nous suivons le nombre de bugs signalés par les utilisateurs. L'objectif est de réduire ce
   nombre au minimum afin d'améliorer la satisfaction des utilisateurs.
4. **New blocker issues** : Nous fixons un seuil de 0 "New blocker issues" identifiés par SonarQube. Cela signifie
   qu'aucun nouveau problème critique ne doit être introduit dans le code lors d'une nouvelle implémentation. L'objectif
   est de garantir un niveau élevé de qualité du code en évitant les problèmes bloquants.

## Analyse des métriques

Après l'exécution de la pipeline, nous avons accès à certaines métriques qui nous aident à évaluer la performance de
notre projet :

- **Code coverage actuel** : Actuellement, notre code coverage est de 82%, ce qui est supérieur au seuil minimum fixé.
  Cela indique que nous avons une bonne couverture de nos tests automatisés.
- **Temps total d'exécution de la pipeline** : Le temps total d'exécution de notre pipeline est de 5 minutes, ce qui est
  en dessous de notre objectif de réduire les délais de déploiement.


## Notes et avis

Nous avons reçu des retours positifs des utilisateurs concernant la stabilité et les fonctionnalités de notre
application. Cependant, certains utilisateurs ont signalé des problèmes mineurs, notamment des erreurs d'affichage sur
certaines pages. Nous prendrons en compte ces retours pour les résoudre rapidement.

## Conclusion

La CI/CD est essentielle pour garantir un développement continu et une qualité élevée. Nos KPIs incluent un code coverage minimum de 80% et un temps d'exécution de pipeline réduit. 

Nous suivons également le nombre de bugs et les problèmes bloquants identifiés. 

Les retours utilisateurs nous aident à améliorer l'application, malgré quelques erreurs mineures. 

Notre objectif est de maintenir l'excellence et de fournir une expérience de qualité à nos utilisateurs.