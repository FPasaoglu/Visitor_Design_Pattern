public class Ubuntu {

    public static void main(String args[]){

        Browser chrome = new Chrome();
        Browser firefox = new Firefox();
        Browser explorer = new Explorer();

        Extension darkTheme = new DarkTheme();
        Extension savePassword = new SavePassword("e-destek.kocaeli.edu.tr" , "Abc123");
        Extension cleanHistory = new CleanHistory();


        chrome.loadExtension(darkTheme);
        firefox.loadExtension(darkTheme);
        explorer.loadExtension(darkTheme);


        System.out.println("----------------------------------");
        chrome.loadExtension(savePassword);
        System.out.println("Password : " + chrome.getPassword("e-destek.kocaeli.edu.tr"));
        System.out.println("----------------------------------");

        firefox.loadExtension(cleanHistory);
        explorer.loadExtension(cleanHistory);

    }

}
