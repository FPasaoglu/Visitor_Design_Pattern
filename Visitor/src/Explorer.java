import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Explorer implements Browser{


    private String color;
    private String explorerServer;
    private String searchAlgorithm;
    private List<String> history;
    private Map<String,String> passwords;

    Explorer(){
        color = "blue";
        explorerServer = "6.1.7601";
        searchAlgorithm = "Bing";
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
        return explorerServer;
    }

    private void setExplorerServer(String explorerServer) {
        this.explorerServer = explorerServer;
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

    private void setHistory(List<String> history) {
        this.history = history;
    }

    public String getPassword(String adress) {
        return passwords.get(adress);
    }

    public void setPasswords(Map<String, String> passwords) {
        this.passwords = passwords;

    }


}
