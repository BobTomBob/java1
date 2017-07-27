/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chooseyourownadventure;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Hello user,\n\nYou can win $1,000,000,000 if you go in an abandoned underground bunker riddled with zombies and creatures from hell and come out alive.");
            Thread.sleep(1500);
            System.out.println("If you wish to continue type OK. If you do not wish to continue type cancel");

            String OKaccepted = keyboard.nextLine();
            if ((OKaccepted.equals("OK")) || (OKaccepted.equals("ok")) || (OKaccepted.equals("Ok"))) {
                System.out.println("You are walking down a cold, grim, stuffy hallway filled with a faint scent of death.");
                Thread.sleep(2000);
                System.out.println("You must choose the correct path to the escape room. Or else...");
                Thread.sleep(2500);
                System.out.println("...you shall perish in the most awful way possible.\n\n\n\n");
                Thread.sleep(500);
                System.out.println("You have 10 minutes to complete the mission.\n");
                Thread.sleep(500);
                System.out.println("You must pick the right doors to enter the correct hallway\n");
                Thread.sleep(500);
                System.out.println("You have now gone into the first room\n");
                Thread.sleep(500);
                System.out.println("You must choose to pass through either door 84b or door 98n by pressing either 1 or 2 respectively.\n");
                String door1 = keyboard.nextLine();

                if ((door1.equals("1"))) {
                    System.out.println("You have made it into room 84b");
                    System.out.println("Now that you're in room two you must continue to either of the two doors. Press 1 or 2 to go into the corresponding hallway.");
                    String door2 = keyboard.nextLine();
                    if ((door2.equals("1"))) {
                        System.out.println("You have traveled into hall 2145g");
                        System.out.println("You must continue to either of the two doors. Press 1 or 2 to go into the corresponding hallway.");
                        String door4 = keyboard.nextLine();

                        if ((door4.equals("1"))) {
                            System.out.println("You are in hall 15f. Zombies are approaching and you must get out of here!\nPress 1 or 2 to go into the HVAC tubing");
                            String door5 = keyboard.nextLine();
                            if ((door5.equals("1"))) {
                                System.out.println("You're making to much noise scampering and crinkling the HVAC tubes. Slow down beause you're about to fall into storage closet 21t.\n");
                            } else {
                                System.out.println("You were to slow. A zombie ripped your neck of and devoured your brain.");
                            }

                        } else {
                            System.out.println("Well my friend, it seems that you aren't dead yet. \nYou are in hall 22f and must continue on carefully to avoid poisonus fungi which grow on the floor and on the dimly lit walls.\n");
                            System.out.println("You must continue into either of the two enclosed, tight, 1/4 mile long tunnels to continue with your quest");
                            String door3 = keyboard.nextLine();
                            if ((door3.equals("1"))) {
                                System.out.println("You are now emerging from the tunnel you squeezed through for 15 minutes.");
                                System.out.println("Oh dear. Your soul was taken by a demon and you sat at the end of the tunnel, brain-dead.\n Four hours later, an evil wizard, Orfeo Vandran, used the rest of your body to use as fertilizer for his poisonus fungus.");

                            } else {
                                System.out.println("You just haven't kicked the bucket yet. Be careful because you could die right after you exit this room. \nYou are in room 98n and must continue on quietly to avoid being heard by the creatures which lurk around you.\nPress 1 or 2 to select which elevator you'd like to go into.");
                                String door6 = keyboard.nextLine();
                                if ((door6.equals("1"))) {
                                    System.out.println("As you stepped into the elevator in the dark, you realized that it was just an empty elevator shaft. \nIn doing so, you lost your balance and fell 12 stories and...SPLAT. 40 minutes later a giant mutant bat came and ate you whole. That's right, he even ate your bones and your clothes.");
                                } else {
                                    System.out.println("You safely boarded the elevator. It is dark and there is a horendous smell in the air. You go down to floor -6.\nThe elevator door fails to open. There are two auxillary hatches. Press 1 or 2");
                                    String door7 = keyboard.nextLine();
                                    if ((door6.equals("1"))) {
                                        System.out.println("Good choice.");
                                    }
                                }

                            }

                        }
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
