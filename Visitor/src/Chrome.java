import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chrome implements Browser{

    private String color;
    private String googleServer;
    private String searchAlgorithm;
    private List<String> history;
    private Map<String,String> passwords;

    Chrome(){
        color = "white";
        googleServer = "8.8.8.8";
        searchAlgorithm = "PageRank";
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

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getServerAdress() {
        return googleServer;
    }

    public void setGoogleServer(String googleServer) {
        this.googleServer = googleServer;
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
