package org.lbg.salesapp2;

public class LineEntry {
    private final String textConst;
    //private final int lineNumConst;
    public LineEntry(String text) {
        this.textConst = text;
        //this.lineNumConst = lineNum;
    }

    public String getText(){
        return textConst;
    }

    //public int getLineNumConst(){return lineNumConst; }

    @Override
    public String toString()
    {
        return textConst;
    }
}
