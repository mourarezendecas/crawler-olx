package Classes

class Item {
    String titulo
    Double valor
    String endereco
    String URL_anuncio


    @Override
    public String toString() {
        return "Item{" +
                "Título ='" + titulo + '\'' +
                "Valor ='" + valor + '\'' +
                "Endereço ='" + endereco + '\'' +
                "URL='" + URL_anuncio + '\'' +
                '}';
    }
}
