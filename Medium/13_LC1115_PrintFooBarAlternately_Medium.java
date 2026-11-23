import java.util.concurrent.Semaphore;

class FooBar {
    private int n;
    Semaphore a=new Semaphore(1);
    Semaphore b=new Semaphore(0);

    public FooBar(int n) {
        this.n=n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for(int i=0;i<n;i++){
            a.acquire();
            printFoo.run();
            b.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for(int i=0;i<n;i++){
            b.acquire();
            printBar.run();
            a.release();
        }
    }
}
