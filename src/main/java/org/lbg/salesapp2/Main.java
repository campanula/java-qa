package org.lbg.salesapp2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ICustomPrompt iCustomPrompt = new CustomPrompt();
        VatInputReader vatInputReader = new VatInputReader(iCustomPrompt);
        ItemCostReader itemCostReader = new ItemCostReader(iCustomPrompt);

        ArrayList<IReader> readers = new ArrayList<>();

        readers.add(vatInputReader);
        readers.add(itemCostReader);

        Runner runner = new Runner(readers);
        ArrayList<LineEntry> lines = runner.run();

        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }

    }
}
