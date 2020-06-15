import java.util.HashMap;
import java.util.Map;

public class SavePassword implements Extension{

    Map<String, String> password;

    SavePassword(String site, String password){
        this.password = new HashMap<>();
        this.password.put(site,password);
    }


    @Override
    public void visit(Chrome chrome) {
        chrome.setPasswords(password);
        System.out.println("Password successfully added to Chrome ");
    }

    @Override
    public void visit(Firefox firefox) {
        firefox.setPasswords(password);
        System.out.println("Password successfully added to Firefox");
    }

    @Override
    public void visit(Explorer explorer) {
        explorer.setPasswords(password);
        System.out.println("Password successfully added to Explorer");
    }
}
