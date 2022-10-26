package Writer

import Classes.Item
import com.opencsv.CSVWriter

class Writer {

    static def write(List<Item> anunciosSalvos){
        File file = new File('/home/rezendecas/Documents/crawler-olx/bot/src/files/out.csv')
        try{
            FileWriter outputFile = new FileWriter(file)

            CSVWriter writer = new CSVWriter(outputFile)

            String[] header = ['Titulo', 'Valor', 'Endereço', 'URL']
            writer.writeNext(header)
            for(Item item : anunciosSalvos)
            {
                writer.writeNext(item.titulo,item.valor.toString(),item.endereco,item.URL_anuncio)
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
