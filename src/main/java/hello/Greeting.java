package hello;

public class Greeting {
    private final long id;
    private final String msg;
/*
    public Greeting(long id, String msg) {
        this.id = id;
        this.msg = msg;
    }
*/
    public long getId() {
        return id;
    }

    public String getContent() {
        return msg;
    }
}
