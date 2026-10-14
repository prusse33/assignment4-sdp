public class Main {

    public static void main(String[] args) {

        SmartHomeFacade smartHome = new SmartHomeFacade();

        smartHome.leaveHome();

        System.out.println();

        smartHome.arriveHome();

        System.out.println();

        smartHome.prepareComfortMode(22);
    }
}