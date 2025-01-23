# exercice11_SpringWebFlux

**Contexte** :
Un service de gestion de projets permet aux utilisateurs de s’authentifier avec un **token JWT** et d’accéder à leurs projets personnels.

#### **Instructions** :
1. Implémentez un endpoint `POST /api/auth/login` qui :
    - Accepte un JSON avec `username` et `password`.
    - Valide les identifiants avec une liste codée en dur.
    - Retourne un token JWT si l’authentification réussit.

2. Implémentez un endpoint protégé `GET /api/projects` qui :
   - Retourne une liste de projets pour l’utilisateur authentifié (ex. : `{ "projects": ["Projet A", "Projet B"] }`).
   - Retourne une erreur HTTP 401 si le JWT est absent ou invalide.
