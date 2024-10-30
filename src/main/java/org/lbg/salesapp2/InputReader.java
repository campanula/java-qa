package org.lbg.salesapp2;

public abstract class InputReader {

    protected ICustomPrompt iCustomPrompt;
    public InputReader(ICustomPrompt icp) {
        // initialise println prompt here
        iCustomPrompt = icp;
    }

    public void setPrompt (ICustomPrompt icp){
        iCustomPrompt = icp;
    }
}