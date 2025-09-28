package coupling.IOC;

public class MongoDBServiceDataProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {

        return "Fetching Data From MongoDBService";
    }
}
