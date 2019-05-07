package sdw.ignite;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;


public class IgniteApplication {
    public static void main(String... args) throws Exception {
        final Ignite ignite = Ignition.start("ignite-cassandra.xml");

        ignite.cache("CatalogCategory").loadCache(null);
        //ignite.cache("CatalogGood").loadCache(null);
    }
}