package Q7;

public class Student implements StudentFee {
    String name;
    double fees;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void getFee(double fees) throws InvalidFeeException {
        if (fees < 0) {
            throw new InvalidFeeException("Invalid fees");
        } else this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fees=" + fees +
                '}';
    }
}
