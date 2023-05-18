import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class CollectionPractice {
    public static void main(String[] args){
        try {
            List<Integer> intList = new ArrayList<>();
            intList.add(1);
            intList.add(2);
            intList.add(3);
            intList.add(4);
            intList.add(5);
            intList.add(4);
            Set<Integer> intSet = new HashSet<>();
            intSet.addAll(intList);
            int sum =0;
            for(int num: intSet){
                sum += num;
            }
            double ave = sum / intSet.size();
            System.out.println(sum);
            System.out.println(ave);
            System.out.println(intSet);

        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
