public class DarkTheme implements Extension{

    @Override
    public void visit(Chrome chrome) {
        System.out.print("Chrome color has updated " + chrome.getColor());
        chrome.setColor("dark");
        System.out.println(" to " + chrome.getColor());
    }

    @Override
    public void visit(Firefox firefox) {
        System.out.println("Firefox " + firefox.getSearchAlgorithm() + " doesn't support changing color");
    }

    @Override
    public void visit(Explorer explorer) {
        System.out.print("Explorer color has updated " + explorer.getColor());
        explorer.setColor("dark");
        System.out.println(" to " + explorer.getColor());

    }
}
