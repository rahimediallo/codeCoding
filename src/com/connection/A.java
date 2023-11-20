package com.connection;

public class A {

    void a(Service s, Connection c) throws Exception {
        // update this code

            try {
                // Exécution du service
                s.setConnection(c); // Optionnel : injecter la connexion dans le service
                s.execute();
                // Si aucune exception n'est levée, on commit la transaction
                c.commit();
            } catch (Exception e) {
                // En cas d'exception, on effectue un rollback et on propage l'exception
                c.rollback();
                throw e;
            } finally {
                // Quoi qu'il arrive, on ferme la connexion
                c.close();
            }
        }
}
