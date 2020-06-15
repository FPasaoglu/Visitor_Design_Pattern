import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Firefox implements Browser{

    private String color;
    private String firefoxServer;
    private String searchAlgorithm;
    private List<String> history;
    private Map<String,String> passwords;

    Firefox(){
        color = "orange";
        firefoxServer = "128.162.15.999";
        searchAlgorithm = "Frecency";
        history = new ArrayList<>();
        passwords = new HashMap<>();
    }

    @Override
    public void loadExtension(Extension ext) {
        ext.visit(this);
    }


    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getServerAdress() {
        return firefoxServer;
    }

    private void setFirefoxServer(String firefoxServer) {
        this.firefoxServer = firefoxServer;
    }

    public String getSearchAlgorithm() {
        return searchAlgorithm;
    }

    private void setSearchAlgorithm(String searchAlgorithm) {
        this.searchAlgorithm = searchAlgorithm;
    }

    @Override
    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    public String getPassword(String adress) {
        return passwords.get(adress);
    }

    public void setPasswords(Map<String, String> passwords) {
        this.passwords = passwords;
    }



}
