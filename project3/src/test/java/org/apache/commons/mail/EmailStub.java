
package org.apache.commons.mail;

/**
 * This class is a subclass of the Email class and is used for
 * testing specific methods of the Email class.
 */
public class EmailStub extends Email {

    /**
     * Overrides the setMsg method of the Email class,
     * which is an abstract method.
     * 
     * @param msg The message to be set
     * @return Always returns null in this stub implementation
     * @throws EmailException if there is an issue setting the message
     */
    @Override
    public Email setMsg(String msg) throws EmailException {
        // TODO Auto-generated method stub
        return null;
    }

}

