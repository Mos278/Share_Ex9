public class CoffeePot implements Colleague{
   
    @Override
    public void execute(IMediator alarm) {
        System.out.println("I am coffe pot,... doing my task");
        alarm.endAlarm("Coffee Pot");
    }


}
