package labs_examples.multi_threading.labs;

public class ManipulatedObject {
    private String lastThreadsFirstInput = "Not yet manipulated";
    private String lastThreadsSecondInput = "Not yet manipulated";

    public void setLastThreadsFirstInput(String lastThreadsFirstInput) {
        this.lastThreadsFirstInput = lastThreadsFirstInput;
    }

    public void setLastThreadsSecondInput(String lastThreadsSecondInput) {
        this.lastThreadsSecondInput = lastThreadsSecondInput;
    }

    public String getLastThreadsFirstInput() {
        return lastThreadsFirstInput;
    }

    public String getLastThreadsSecondInput() {
        return lastThreadsSecondInput;
    }
}
