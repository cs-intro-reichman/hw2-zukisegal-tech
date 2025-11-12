public class TimeCalc 
{
    public static void main(String[] args)
     {
        int hours= Integer.parseInt("" + args[0].charAt(0)+ args[0].charAt(1));
		int minutes= Integer.parseInt("" + args[0].charAt(3)+ args[0].charAt(4));
		int minutesToAdd= Integer.parseInt(""+ args[1]);

        int Totalminutes= ((hours*60 )+ minutes + minutesToAdd);
        int Totalhours= (Totalminutes/60);
        int newHour= (Totalhours%24);
        int newMinutes= (Totalminutes - (Totalhours*60));



		System.out.println(newHour + " : " + newMinutes);

    }
}
