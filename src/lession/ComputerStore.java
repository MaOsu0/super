package lession;

public class ComputerStore {
    public static void main(String[] args) {
        Computer computer = new Computer(45,16384);

        Notebook notebook = new Notebook(40,8192,10000);
        notebook.coolDown();
        System.out.println(notebook.getCpuTemperature());
    }
}
