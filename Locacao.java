import java.util.Date;

public class Locacao extends Produto {
    Date dataSaida;
    Date dataEntregaPrevista;
    Date dataDevolucao;

    public Locacao(String c, String t, String g, boolean l,Date ds, Date ep, Date dd){
        super(c, t, g, l);
        this.dataSaida = ds;
        this.dataEntregaPrevista = ep;
        this.dataDevolucao = dd;
    }
    
    
    public void  fazerLocacao(int m,String c,boolean l, Date ds, Date ep, Date dd){

    Cliente cli = new Cliente(m);
    
        cli.matricula = m;
        super.codigo = c;

        this.dataSaida = ds;
        this.dataEntregaPrevista = ep;
        this.dataDevolucao =dd;


    
    }

    @Override
    public double calcularDiaria() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    
}
