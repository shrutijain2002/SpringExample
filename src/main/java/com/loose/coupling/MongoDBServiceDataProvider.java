package com.loose.coupling;

public class MongoDBServiceDataProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {

        return "Fetching Data From MongoDBService";
    }
}
