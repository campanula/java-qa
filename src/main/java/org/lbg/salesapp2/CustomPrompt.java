package org.lbg.salesapp2;

public class CustomPrompt implements ICustomPrompt{

    @Override
    public void prompt(String message) {
        System.out.println(message);
    }
}
