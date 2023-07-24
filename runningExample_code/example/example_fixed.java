package example;

public class example_fixed {

    public static String process(String s){
        if(s.contains("*1*") || s.contains("*2*")){
        	return "";}
        int sign = 0;
        int sum_1 = 0;
        sum_1 = s.contains("wordNone") ? 1 : 0;
        sign += sum_1;
        s = s.replaceAll("wordNone", "*1*");
        int sum_2 = 0;
        sum_2 = s.contains("wordNtwo") ? 2 : 0;
        sign += sum_2;
        s = s.replaceAll("wordNtwo", "*2*");
        if(sign == 3){
            return "both pattern recognized";}
        String msg = sign == 1 ? "wordNone recognized" : "pass";
        msg = sign == 2 ? "wordNtwo recognized" : msg;
        return s + "//" + msg;}

}