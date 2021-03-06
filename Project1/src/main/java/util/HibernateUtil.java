package util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

/**
 * @author imssbora
 */
public class HibernateUtil {
   private static StandardServiceRegistry registry;
   private static SessionFactory sessionFactory;

   public static SessionFactory getSessionFactory() {
      if (sessionFactory == null) {
         try {

            // Create registry builder
            StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();

            // Hibernate settings equivalent to hibernate.cfg.xml's properties
            Map<String, String> settings = new HashMap<>();
            settings.put(Environment.DRIVER, "org.postgresql.Driver");
            settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/");
            settings.put(Environment.USER, "postgres");
            settings.put(Environment.PASS, "pOOkiebear2!");
            settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");

            // Apply settings
            registryBuilder.applySettings(settings);

            // Create registry
            registry = registryBuilder.build();

            // Create MetadataSources
            MetadataSources sources = new MetadataSources(registry);

            // Create Metadata
            Metadata metadata = sources.getMetadataBuilder().build();

            // Create SessionFactory
            sessionFactory = metadata.getSessionFactoryBuilder().build();

         } catch (Exception e) {
            e.printStackTrace();
            if (registry != null) {
               StandardServiceRegistryBuilder.destroy(registry);
            }
         }
      }
      return sessionFactory;
   }

   public static void shutdown() {
      if (registry != null) {
         StandardServiceRegistryBuilder.destroy(registry);
      }
   }
}
