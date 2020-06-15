import java.util.ArrayList;
import java.util.List;

public class CleanHistory implements Extension {

    ArrayList<String> cleanHistory ;

    CleanHistory(){
        cleanHistory = new ArrayList<>();
        cleanHistory.clear();
    }

    @Override
    public void visit(Chrome chrome) {
        chrome.setHistory(cleanHistory);
        System.out.println("Chrome's history cleaned succesfully");
    }

    @Override
    public void visit(Firefox firefox) {
        firefox.setHistory(cleanHistory);
        System.out.println("Firefox's history cleaned succesfully");
    }

    @Override
    public void visit(Explorer explorer) {
        System.out.println("Explorer " + explorer.getSearchAlgorithm() + " doesn't support clean your history");
    }
}
