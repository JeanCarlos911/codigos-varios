/**
 *
 * @author Jean K
 */
class Runner {
    private Programa programa;
    private Componentes comp;
    
    public Runner(){
        comp = new Componentes();
        programa = new Programa(comp);
    }
}
