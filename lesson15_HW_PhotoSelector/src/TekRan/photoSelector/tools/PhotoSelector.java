package TekRan.photoSelector.tools;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhotoSelector {

    public static String[] selectPictures(String[] pictures, String regex) {
        int size = 0;
        for (int i = 0; i < pictures.length; i++) {
            if (pictures[i].matches(regex)) {
                size++;
            }
        }

        String[] res = new String[size];
        for (int i = 0, j = 0; i < pictures.length; i++) {
            if (pictures[i].matches(regex)) {
                res[j++] = pictures[i];
            }
        }

        return res;
    }



    public static String[] selectPicturesSB(String[] pictures, String regex) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < pictures.length; i++) {
            if (pictures[i].matches(regex)) {
                sb.append(pictures[i]).append(";");
            }
        }

        if (sb.length() == 0) {
            return new String[0];
        }

        return sb.toString().split(";");
    }



    public static String [] selectPicturesSbMatcher (String [] pictures,String regex){
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < pictures.length; i++) {
            Matcher matcher = pattern.matcher(pictures[i]);
            if (matcher.find()) {
                sb.append(pictures[i]).append(";");
            }

        }
        if(sb.length()==0){ // if(sb.isEmpty())?
            return new String[0];
        }
        return sb.toString().split(";");

    }

}
