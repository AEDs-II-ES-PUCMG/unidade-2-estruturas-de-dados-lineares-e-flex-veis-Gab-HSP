import java.util.function.Predicate;

public class CondicaoFiltrarPedido implements Predicate<Pedido> {

    private final Produto produto;

    public CondicaoFiltrarPedido(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean test(Pedido pedido) {
        if (pedido == null || produto == null) {
            return false;
        }
        return pedido.existeNoPedido(produto) != null;
    }
}
