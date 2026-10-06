public class Student {
    static int ExamYear;
    String RegFees;
    String Grading;
    static String RegStatus;
    static String ExamCentre;

    {
        ExamYear = 2026;
        RegFees = "UGX 50000";
        System.out.println("=== Instance Initialization Block ===");
        System.out.println("ExamYear: "+ExamYear);
        System.out.println("RegFees: "+RegFees);
    }

    static {
        RegStatus = "Registered";
        ExamCentre = "UG08IUEA";
        System.out.println("=== Static Block ===");
        System.out.println("RegStatus: "+RegStatus);
        System.out.println("ExamCentre: "+ExamCentre);
    }

    public Student (String g) {

    }
}