import Classes.Item
import Modifier.FormataLista
import Scraper.MainScrapper
import Writer.Writer

static void main(String[] args) {
  List<Item> anunciosSalvos = MainScrapper.mainScraper()

  Writer csvWriter = new Writer()

  FormataLista formataLista = new FormataLista()
  csvWriter.write(formataLista.formatar(anunciosSalvos))

}


