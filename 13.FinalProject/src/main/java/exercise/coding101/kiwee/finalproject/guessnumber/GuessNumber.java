package exercise.coding101.kiwee.finalproject.guessnumber;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import org.apache.commons.lang3.StringUtils;

import exercise.coding101.kiwee.finalproject.Game;
import exercise.coding101.kiwee.finalproject.Player;

public class GuessNumber extends Game {

    private static final int SECRET_LENGTH = 3;
    private static final String SECRET = "SECRET";
    private static final String MESG = "Please set answer key: ";

    public GuessNumber(Scanner scan) {
        super("Guess Number", scan);

        setNumber(players[0]);
        setNumber(players[1]);
    }

    @Override
    protected boolean term(Player player) {
        return false;
    }

    /**
     * This is for user to set the number without revealing on screen; you don't
     * need to touch the following code.
     * 
     * @param player
     */
    private void setNumber(Player player) {
        String passwd = null;

        while (!StringUtils.isNumeric(passwd) || StringUtils.length(passwd) != SECRET_LENGTH) {
            // check if this is in IDE
            if (System.console() == null) {

                final JPasswordField pf = new JPasswordField();
                passwd = JOptionPane.showConfirmDialog(null, pf, player.getName() + ", " + MESG, JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION ? new String(pf.getPassword()) : "";

            } else {
                // this is in console
                System.out.println(player.getName() + ", " + MESG);
                var password = System.console().readPassword();

                passwd = new String(password);
            }
        }

        // now each user has this property called "SECRET" with password
        player.SetProperty(SECRET, passwd);

        System.out.println(player.getName() + " has setup the answer key.");
    }

}
