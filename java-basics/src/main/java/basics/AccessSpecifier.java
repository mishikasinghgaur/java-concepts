package basics;

public class AccessSpecifier implements AccessSpecifiersInterface{
    @Override
    public void setSum(int s) {

    }

    public static void main(String[] args){
        AccessSpecifier as = new AccessSpecifier();

        as.setSum(123);
    }
}
