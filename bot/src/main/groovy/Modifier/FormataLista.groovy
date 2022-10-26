package Modifier

import Classes.Item

class FormataLista {
    static def formatar(List<Item> listaCrua){
        Double media = calculaMedia(listaCrua)
        println('Media: R$' + media.round(2))

        List<Item> listaFormatada = new ArrayList<>()
        for(Item item : listaCrua)
        {
            if(item.valor<=media)
            {
                listaFormatada.add(item)
            }
        }


        Item itemDeMenorValor = encontraMenorItem(listaFormatada)
        Item itemMaiorValor = encontraMaiorItem(listaFormatada)

        println('===ITEM DE MENOR VALOR===')
        println('TITULO: ' +itemDeMenorValor.titulo)
        println('VALOR: ' +itemDeMenorValor.valor)
        println('ENDEREÇO: ' +itemDeMenorValor.endereco)
        println('URL: ' +itemDeMenorValor.URL_anuncio)

        println('===ITEM DE MAIOR VALOR===')
        println('TITULO: ' +itemMaiorValor.titulo)
        println('VALOR: ' +itemMaiorValor.valor)
        println('ENDEREÇO: ' +itemMaiorValor.endereco)
        println('URL: ' +itemMaiorValor.URL_anuncio)

        return listaFormatada
    }

    static def calculaMedia (List<Item> listaCrua)
    {
        Double media = 0
        int i = 0
        for(Item item : listaCrua)
        {
            media = media + item.valor
            i++
        }
        media = media /i

        return media
    }

    static def encontraMenorItem(List<Item> listaFormatada)
    {
        Item itemDeMenorValor = new Item()
        itemDeMenorValor.valor = 5000

        for(Item item : listaFormatada)
        {
            if(item.valor<itemDeMenorValor.valor && item.valor!=0)
            {
                itemDeMenorValor = item
            }
        }
        return itemDeMenorValor
    }


    static def encontraMaiorItem(List<Item> listaFormatada)
    {
        Item itemMaiorValor = new Item()
        itemMaiorValor.valor = 0

        for(Item item : listaFormatada)
        {
            if(item.valor>itemMaiorValor.valor && item.valor!=0)
            {
                itemMaiorValor = item
            }
        }
        return itemMaiorValor
    }
}
