package pl.edu.pb.sm_zadanie_6_android3;

import java.util.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task() {
        id = UUID.randomUUID();
        date = new Date();
    }
    public Task(String name, boolean done) { //do wyrzucenia
        id = UUID.randomUUID();
        date = new Date();
        this.name = name;
        this.done = done;
    }
}
