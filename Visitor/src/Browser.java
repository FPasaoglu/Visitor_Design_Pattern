import java.util.List;
import java.util.Map;

public interface Browser {
    void loadExtension(Extension ext);
    String getServerAdress();
    List<String> getHistory();
    String getPassword(String adress);

}
