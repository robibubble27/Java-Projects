import java.awt.*;
import java.util.List;

public interface Strategy {
    public int addTask(List<Server> servers, Task t, int maxClientsPerServer);
}

