package enthuware.loops;

public class For {

    static String[] days = {"monday", "tuesday", "wednesday", "thursday",
            "friday", "saturday", "sunday"};

    public static void main(String[] args) {

        var index = 0;
        for (var day : days) {

            if (index == 3) {
                break;
            } else {
                continue;
            }
            /* TODO: As linhas abaixo comentadas não compilarão, pois NUNCA vai chegar nessa parte.
                Pois BREAK sai do loop, e CONTINUE pula para a próxima iteração
            index++;
            if (days[index].length() > 3) {
                days[index] = day.substring(0, 3);
            } **/
        }
        System.out.println(days[index]);
    }

}
