public class Test {
    private Test() {

    }
    static Test test = new Test();

    public static Test getTest() {
        return test;
    }
}
