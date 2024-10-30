package org.lbg.salesapp2;

import java.util.ArrayList;

public class Runner {
    private final ArrayList<IReader> itsReaders;

    public  Runner( ArrayList<IReader> readers )
    {
        itsReaders = readers;
    }

    public  ArrayList<LineEntry>    run()
    {
        String lineRead = "";
        boolean exitApp = false;
        ArrayList lines = new ArrayList(10);


        while( !exitApp && lineRead != null )
        {
            for(var reader : itsReaders) {
                lineRead = reader.getInput(System.in);
                if (lineRead.equalsIgnoreCase("QUIT"))
                {
                    exitApp = true;
                    break;
                }
                LineEntry le = new LineEntry(lineRead);
                lines.add(le);

                //StoreController storeController = new StoreController();
                //vatInputReader.getValidatedVatRate()
                //storeController.calculateVAT()
            }
        }

        return lines;
    }
}
