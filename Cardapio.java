import java.util.ArrayList;
import java.util.List;

public class Cardapio{
    private String prato1 = "Arroz, feijão, macarrão ou pure";
    private  double price;

    List<Cardapio> list =  new ArrayList();

    public Cardapio(String prato1, double price) {
        this.prato1 = prato1;
        this.price = price;

        list.add(prato1,price);
    }
}