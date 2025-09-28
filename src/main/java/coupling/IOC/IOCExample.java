package coupling.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import setter.injection.Car;

public class IOCExample {
    public static void main(String[] args) {


        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationIOCExample.xml");

        UserManager userManagerWithMongoDB = (UserManager) context.getBean("userManagerWithMongoDBDataProvider");
        System.out.println(userManagerWithMongoDB.getUserInfo());


        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        UserManager userManagerWithNewDB = (UserManager) context.getBean("userManagerWithNewDataProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());

        UserManager userManagerWithWS = (UserManager) context.getBean("userManagerWithWebServiceDataPerovider");
        System.out.println(userManagerWithWS.getUserInfo());


        //MongoDB Service
//        UserDataProvider mongoDBDatabaseProvider = new MongoDBServiceDataProvider();
//        UserManager userManagerWithMongoDB = new UserManager(mongoDBDatabaseProvider);
//        System.out.println(userManagerWithMongoDB.getUserInfo());
    }
}
