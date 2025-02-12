package Day_9;

public class SoftwareEngineer extends Parent1 implements TrafficRules, EmployeeRules{
    public static void main(String[] args) {
        SoftwareEngineer se = new SoftwareEngineer();
        TrafficRules s = new SoftwareEngineer();
        EmployeeRules e = new SoftwareEngineer();
        e.wear_formals();
        s.wearHelmet();
        se.cooking();
        se.goSlow();
        se.fine();
    }

    @Override
    public void wear_formals() {
       System.out.println("I am in formals");
    }

    @Override
    public void work_12_hrs() {
        System.out.println("I will work 12 hrs..");
    }

    @Override
    public void wear_Id() {
        System.out.println("I am wearing ID.");
    }

    @Override
    public void goSlow() {
        System.out.println("I am going slow");
    }

    @Override
    public void wearHelmet() {
        System.out.println("i am wearing wearing Helmet");
    }

    @Override
    public void fine() {
        System.out.println("I know the fine amount");   
    }
}