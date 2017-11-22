/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain.poc;

/**
 *
 * @author YongZe
 */
public class Message {
    private int PREVIOUSHASH;
    private int CURRENTHASH;
    private String MESSAGE;

    public Message(int prevHash, String msg, int currentHash) {
        PREVIOUSHASH = prevHash;
        CURRENTHASH = currentHash;
        MESSAGE = msg;
    }

    
    public int getPrevHash() {
        return PREVIOUSHASH;
    }

    public int getCurrentHash() {
        return CURRENTHASH;
    }

    public String getMessage() {
        return MESSAGE;
    }
    
    public void setMessage(String msg) {
        MESSAGE = msg;
    }
    
}
