import java.util.Comparator;

public class CriterioDeBuscaPorDescricao implements Comparator<ItemDePedido> {

    @Override
    public int compare(ItemDePedido item1, ItemDePedido item2) {
        if (item1 == item2) {
            return 0;
        }
        if (item1 == null) {
            return -1;
        }
        if (item2 == null) {
            return 1;
        }
        return item1.getProduto().descricao.compareToIgnoreCase(item2.getProduto().descricao);
    }
}
