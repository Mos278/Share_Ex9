public class Sprinkler implements Colleague{
   

    @Override
    public void execute(IMediator alarm) {
        System.out.println("I am sprinkler,... doing my task");
        alarm.endAlarm("Sprinkler");
    }
    
}
