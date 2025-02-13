
public class Main {
    public static void main(String[] args) {
         Logger logger = Logger.getInstance();
         logger.log("Hello World!");
         Logger logger2 = Logger.getInstance();
         logger2.log("Hello World!");

         LoggerClass loggerr = LoggerClass.getInstance();
            loggerr.log("Hello World!");
    }
}