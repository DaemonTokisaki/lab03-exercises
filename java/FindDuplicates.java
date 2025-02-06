import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

    public static List<Integer> findDuplicatesNestedLoops(List<Integer> list) {
    List<Integer> dupes= new ArrayList<>();   
     
        for(int i=0;i<list.size();i++){
     
for(int j=0;j<list.size();j++){
if(i!=j){
        if(list.get(i)==list.get(j)){
            
            if(!dupes.contains(list.get(i))){
                dupes.add(list.get(i));
                
            }

}    
     
}    
     
}    
     
     
}    
return dupes;
     
    }

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findDuplicatesNestedLoops(sample1));
        System.out.println("Sample 2: " + findDuplicatesNestedLoops(sample2));
        System.out.println("Sample 3: " + findDuplicatesNestedLoops(sample3));
        System.out.println("Sample 4: " + findDuplicatesNestedLoops(sample4));
    }

}
