public class CybertekApp {

    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        Mentor mentor = new Mentor(fullTime,partTime);
        mentor.manageAccount();
        /* what is Coupling?
        Usage of an object by another object.
        it is simple mmeans that one object requires another object to complete its assigned task.
        There are two ypes of coupling :
            1. Tight coupling
                A group of classes are highly dependent on one another
                A class has a direct reference to a concrete class.
            2Loose Cpupling
                An object getes the object to be used from external sources
                Reduces the dependencies of a class that uses the diffenet classes directly


            */


    }
}
