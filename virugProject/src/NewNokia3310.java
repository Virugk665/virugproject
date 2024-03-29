import java.util.Scanner;
public class NewNokia3310 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("""
                List of menu functions:
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                """);
        System.out.println("enter a number from the list:  ");
        int numberSelected = keyboard.nextInt();
        switch (numberSelected) {
            case 1 -> {
                System.out.println("""
                        1. Search
                        2. Service Nos.
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. options
                        9. Speed dials
                        10. Voice tags
                        """);
                System.out.println("Enter a number");
                numberSelected = keyboard.nextInt();
                switch (numberSelected) {
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service Nos");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("Send b'card");
                    case 8 -> {
                        System.out.println("""
                                1. Type of view
                                2. Memory status
                                """);
                        System.out.println("Enter a sub number");
                        numberSelected = keyboard.nextInt();
                        switch (numberSelected) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");
                        }
                    }
                    case 9 -> System.out.println("9. Speed dials");
                    case 10 -> System.out.println("10. Voice tags");
                }
            }
            case 2 -> {
                System.out.println("""
                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info services
                        9. Voice mailbox number
                        10. Service command editor
                        """);
                System.out.println("Enter a number");
                numberSelected = keyboard.nextInt();
                switch (numberSelected) {
                    case 1:
                        System.out.println("Write message");
                    case 2:
                        System.out.println("Inbox");
                    case 3:
                        System.out.println("Outbox");
                    case 4:
                        System.out.println("Picture messages");
                    case 5:
                        System.out.println("Templates");
                    case 6:
                        System.out.println("Smileys");
                    case 7:
                        System.out.println("""
                                1. Set 1
                                2. Common
                                """);
                        System.out.println("Enter a sub number");
                        numberSelected = keyboard.nextInt();
                        switch (numberSelected) {
                            case 1 -> {
                                System.out.println("""
                                        1. Message centre number
                                        2. Message sent as
                                        3. Message validity
                                        """);
                                System.out.println("Enter a sub number");
                                numberSelected = keyboard.nextInt();
                                switch (numberSelected) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Message sent as");
                                    case 3 -> System.out.println("Message validity");
                                }
                            }
                            case 2 -> {
                                System.out.println("""
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                        """);
                                System.out.println("Enter a sub number");
                                numberSelected = keyboard.nextInt();
                                switch (numberSelected) {
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via same centre ");
                                    case 3 -> System.out.println(" Character support");
                                }
                            }
                        }
                    case 8:
                        System.out.println("Info services");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                }
            }
            case 3 -> System.out.println("3. Chat");
            case 4 -> {
                System.out.println("""
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid credit
                        """);
                System.out.println("Enter a number");
                numberSelected = keyboard.nextInt();
                switch (numberSelected) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialled numbers");
                    case 4 -> System.out.println("Erase recent call lists");
                    case 5 -> {
                        System.out.println("""
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialled calls' duration
                                5. Clear timers
                                """);
                        System.out.println("Enter a sub number");
                        numberSelected = keyboard.nextInt();
                        switch (numberSelected) {
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("All calls' duration");
                            case 3 -> System.out.println("Received calls' duration");
                            case 4 -> System.out.println("Dialled calls' duration");
                            case 5 -> System.out.println("Clear timers");
                        }
                    }
                    case 6 -> {
                        System.out.println("""
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters
                                """);
                        System.out.println("Enter a sub number");
                        numberSelected = keyboard.nextInt();
                        switch (numberSelected) {
                            case 1 -> System.out.println("Last call cost");
                            case 2 -> System.out.println("All calls cost");
                            case 3 -> System.out.println("Clear counters");
                        }
                    }
                    case 7 -> {
                        System.out.println("""
                                1. Call cost settings
                                2. Show costs in
                                """);
                        System.out.println("Enter a sub number");
                        numberSelected = keyboard.nextInt();
                        switch (numberSelected) {
                            case 1 -> System.out.println("Call cost settings");
                            case 2 -> System.out.println("Show costs in");
                        }
                    }
                    case 8 -> System.out.println("Prepaid credit");
                }
            }
            case 5 -> {
                System.out.println("""
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and gaming tones
                        8. Vibrating alert
                        9. Screen saver
                        """);
                System.out.println("Enter a sub number");
                numberSelected = keyboard.nextInt();
                switch (numberSelected) {

                    case 1 -> System.out.println("Ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert");
                    case 4 -> System.out.println("Composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println(" Keypad tones");
                    case 7 -> System.out.println("Warning and game tones");
                    case 8 -> System.out.println("Vibrating alert");
                    case 9 -> System.out.println("Screen saver");
                }
            }
            case 6 -> {
                System.out.println("""
                        1. Call settings
                        2. Phone settings
                        3.Security settings
                        4. Restore factory settings
                        """);
                System.out.println("Enter a number");
                numberSelected = keyboard.nextInt();
                switch (numberSelected) {
                    case 1 -> {
                        System.out.println("""
                                1. Automatic redial
                                2. Speed dialing
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                """);
                        System.out.println("Enter a sub number");
                        numberSelected = keyboard.nextInt();
                        switch (numberSelected) {
                            case 1 -> System.out.println("Automatic redial");
                            case 2 -> System.out.println("Speed dialing");
                            case 3 -> System.out.println("Call waiting options");
                            case 4 -> System.out.println("Own number sending");
                            case 5 -> System.out.println("Phone line in use");
                            case 6 -> System.out.println("Automatic answer");

                        }
                    }
                    case 2 -> {
                        System.out.println("""
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM service actions
                                """);
                        System.out.println("Enter a sub number");
                        numberSelected = keyboard.nextInt();
                        switch ((numberSelected)) {
                            case 1 -> System.out.println("Language");
                            case 2 -> System.out.println("Cell info display");
                            case 3 -> System.out.println("Welcome note");
                            case 4 -> System.out.println("Network selection");
                            case 5 -> System.out.println("Lights");
                            case 6 -> System.out.println("Confirm SIM service actions");
                        }

                    }
                    case 3 -> {
                        System.out.println("""
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialing
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                """);
                        System.out.println("Enter a sub number");
                        numberSelected = keyboard.nextInt();
                        switch ((numberSelected)) {
                            case 1 -> System.out.println("PIN code request");
                            case 2 -> System.out.println("Call barring service");
                            case 3 -> System.out.println("Fixed dialing");
                            case 4 -> System.out.println("Closed user group");
                            case 5 -> System.out.println("Phone security");
                            case 6 -> System.out.println("Change access codes");
                        }
                    }
                }
            }
                    case 7 -> System.out.println("7. Call divert");
                    case 8 -> System.out.println("8. Games");
                    case 9 -> System.out.println("9. Calculator");
                    case 10 -> System.out.println("10. Reminders");
                    case 11 -> {
                        System.out.println("""
                                1. Alarm clock
                                2. Clock settings
                                3. Date setting
                                4. Stopwatch
                                5. Countdown timer
                                6. Auto update of date and time
                                """);
                        System.out.println("Enter a sub number");
                        numberSelected = keyboard.nextInt();
                        switch (numberSelected) {
                            case 1:
                                System.out.println("Alarm clock");
                            case 2:
                                System.out.println("Clock setting");
                            case 3:
                                System.out.println("Date setting");
                            case 4:
                                System.out.println("Stopwatch");
                            case 5:
                                System.out.println("Countdown timer");
                            case 6:
                                System.out.println("Auto update of time and date");
                        }
                    }
                    case 12 -> System.out.println("12. Profiles");
                    case 13 -> System.out.println("13. SIm services");

        }
    }
}


