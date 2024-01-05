package Kata2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileSalesLoader implements SalesLoader{

    private final File file;

    public CsvFileSalesLoader(File file) {
        this.file = file;
    }
    @Override
    public List<Sales> load(){
        try {
            return load(new FileReader(file));
        } catch (IOException E) {
            throw new RuntimeException(E);
        }
    }

    private List<Sales> load(FileReader fileR) throws IOException {
        BufferedReader reader = new BufferedReader(fileR);
        reader.skip(1);
        List<Sales> sales = new ArrayList<>();
        String linea;
        while ((linea = reader.readLine()) != null) {
            sales.add(toSales(linea));
        }
        return sales;
    }

    private Sales toSales(String linea) {
        String[] nl = linea.split(";");
        return new Sales(
                nl[0],
                nl[1],
                nl[2],
                nl[2],
                nl[4],
                nl[5],
                nl[6],
                nl[7],
                nl[8],
                nl[9],
                nl[10],
                nl[11],
                nl[12],
                nl[13]
        );
    }
}
