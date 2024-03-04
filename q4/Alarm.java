public class Alarm implements IMediator{
    private Colleague C1;
    private Colleague C2;

    public Alarm(Colleague C1, Colleague C2) {
        this.C1 = C1;
        this.C2 = C2;
    }

    @Override
    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        C1.execute(this);
        C2.execute(this);
    }

    @Override
    public void endAlarm(String from) {
        System.out.println("Alarm event ended from " + from);
    }

}