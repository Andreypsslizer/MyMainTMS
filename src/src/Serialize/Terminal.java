package Serialize;

import java.io.Serializable;

public class Terminal implements Serializable {
    String[] params;

    public Terminal(String[] params) {
        this.params = params;
    }
}
