public class Client {
    public static void main(String[] args) {
        RequestCreator lowRequestCreator = new LowPriorityConcreteCreator();
        lowRequestCreator.createRequest();
        lowRequestCreator.processRequest();

        RequestCreator mediumRequestCreator = new MediumPriorityConcreteCreator();
        mediumRequestCreator.createRequest();
        mediumRequestCreator.processRequest();

        RequestCreator highRequestCreator = new HighPriorityConcreteCreator();
        highRequestCreator.createRequest();
        highRequestCreator.processRequest();
    }
}
