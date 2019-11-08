package inPut;

public class outPut extends inPut {

    public void println(String name,String pag) throws InterruptedException {
        System.out.print(name + pag);
        Thread.sleep(1000);
    }
}
