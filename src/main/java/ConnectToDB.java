import com.mongodb.DB;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

public class ConnectToDB {

        public static void main( String args[] ) throws UnknownHostException {
            MongoClient mongo = new MongoClient("localhost", 27017);
            //We can get all the collections names using below code.
            //DB db = mongo.getDB("knolx");
            //Set<String> collections = db.getCollectionNames();
            //System.out.println(collections);
            //We can get all the databases names using below code.
            List<String> dbs = mongo.getDatabaseNames();
            System.out.println(dbs);
        }
    }
