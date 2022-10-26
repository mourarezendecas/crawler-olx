package Scraper

import Classes.Item
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

class MainScrapper {
    static List<Item> anunciosSalvos = new ArrayList<>()

    static def mainScraper()
    {
        coletar('https://go.olx.com.br/grande-goiania-e-anapolis?q=iphone%2011%20')
        coletar('https://go.olx.com.br/grande-goiania-e-anapolis?o=2&q=iphone%2011%20')
        coletar('https://go.olx.com.br/grande-goiania-e-anapolis?o=3&q=iphone%2011%20')

        return anunciosSalvos
    }

   static def coletar(String url){
        Document doc = Jsoup.connect(url).get()

        List<Element> anuncios = doc.getElementsByClass('sc-12rk7z2-0 bjnzhV')

        for (Element anuncio : anuncios)
        {
            Item anuncioSalvo = new Item()
            anuncioSalvo.titulo = anuncio.getElementsByTag('h2').first().text()
            if(anuncio.getElementsByClass('sc-1kn4z61-1 dGMPPn').first().text() == '')
            {
                anuncioSalvo.valor = 0
            }
            else
            {
                anuncioSalvo.valor = converterString(anuncio.getElementsByClass('sc-1kn4z61-1 dGMPPn').first().text())
            }
            anuncioSalvo.endereco = anuncio.getElementsByClass('sc-1c3ysll-0 lfQETj').first().text()
            anuncioSalvo.URL_anuncio = anuncio.getElementsByTag('a').attr('href')

            anunciosSalvos.add(anuncioSalvo)
        }
   }

    static Double converterString(String valor)
    {
        Double valorreal = valor.replaceAll(/\D+/,"").toDouble()
        return valorreal
    }


}


