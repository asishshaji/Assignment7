package Q6;

public class Voter {
    int voterId;
    String name;
    int age;

    public Voter(int voterId, String name, int age) throws Exception {
        this.voterId = voterId;
        this.name = name;
        if (age < 18) {
            throw new Exception("Invalid age for voter");
        } else
            this.age = age;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "voterId=" + voterId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
