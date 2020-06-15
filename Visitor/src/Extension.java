public interface Extension {
    void visit(Chrome chrome);
    void visit(Firefox firefox);
    void visit(Explorer explorer);
}
