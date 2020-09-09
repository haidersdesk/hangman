package hangman;

public class look {
	
	
	/*
	  -Looks of the Hangman
	  -7 stages using 7 switch statements
	 */
	
	
	
	public static void drawMan(int tries) {
        switch (tries) {
        case 0:
            System.out.println(

                            " - - - - -\n" +
                            "|        |\n" +
                            "|        O\n" +
                            "|      / | \\ \n" +
                            "|        |\n" +
                            "|       / \\ \n" +
                            "|\n" +
                            "|\n"+ ":::::::THE END:::::::::"


            );
            break;
        
        
            case 1:
                System.out.println(

                                " - - - - -\n" +
                                "|        |\n" +
                                "|        O\n" +
                                "|      / | \\ \n" +
                                "|        |\n" +
                                "|       / \\ \n" +
                                "|\n" +
                                "|\n"


                );
                break;
            case 2:
                System.out.println(

                                " - - - - -\n" +
                                "|        |\n" +
                                "|        O\n" +
                                "|      / | \\ \n" +
                                "|        |\n" +
                                "|\n" +
                                "|\n" +
                                "|\n"


                );
                break;
            case 3:
                System.out.println(

                                " - - - - -\n" +
                                "|        |\n" +
                                "|        O\n" +
                                "|      /   \\ \n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n"


                );
                break;
            case 4:
                System.out.println(

                                " - - - - -\n" +
                                "|        |\n" +
                                "|        O\n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n"


                );
                break;
            case 5:
                System.out.println(

                                " - - - - -\n" +
                                "|        |\n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n"


                );
                break;
            case 6:
                System.out.println(

                                " - - - - -\n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n"


                );
                break;
            case 7:
                System.out.println(

                                "- - \n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n" +
                                "|\n"


                );
                break;
        }

}
}
