public class Exam {
    public static void main(String[] args){
        Exam exam = new Exam();
        long input=11110L;
        exam.maxValue(input);
    }

    public boolean minToMAX(String input){
        int[] num = new int[input.length()];
        for(int i=0 ;i<input.length();i++){
            num[i] = Integer.parseInt(input.substring(i,i+1));
        }
        for(int i=0; i<input.length()-1;i++){
            if(num[i]>num[i+1]) return false;
        }
        return true;
    }

    public void maxValue(long input){
        long max=0;
        for (long i=0 ; i<=input ;i++){
            if(minToMAX(""+i) && i>max) max=i;
        }
        System.out.println("Max : "+ max);
    }
}
