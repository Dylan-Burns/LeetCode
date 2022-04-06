

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        StringBuffer sb = new StringBuffer(s.length());
        for(int i = 0; i < indices.length; i++) {
            sb.append(s.charAt(indices[i]));
        }

        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        ShuffleString shuffleString = new ShuffleString();
        int[] indices = {4,5,6,7,0,1,2,3};
        System.out.println(shuffleString.restoreString("codeleet", indices));
    }
}
