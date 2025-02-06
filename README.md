#ReadMe 

Java

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
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4,$
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5,$
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findDuplicatesNestedLoops(sample1));
        System.out.println("Sample 2: " + findDuplicatesNestedLoops(sample2));
        System.out.println("Sample 3: " + findDuplicatesNestedLoops(sample3));
        System.out.println("Sample 4: " + findDuplicatesNestedLoops(sample4));
    }
}


Python

def find_duplicates_nested_loop(check: list) -> list:
    dupes=[]
    for x in range(len(check)):
        for y in range(len(check)):
            if not x==y and check[x] not in dupes and check[x]==check[y]:
                    dupes.append(check[x])
                    break
    # Replace "return None" with your code
    return dupes
if __name__ == "__main__":
    sample1 = [3, 7, 5, 6, 7, 4, 8, 5, 7, 66]
    sample2 = [3, 5, 6, 4, 4, 5, 66, 6, 7, 6]
    sample3 = [3, 0, 5, 1, 0]
    sample4 = [3]
    print("Sample 1:", find_duplicates_nested_loop(sample1))
    print("Sample 2:", find_duplicates_nested_loop(sample2))
    print("Sample 3:", find_duplicates_nested_loop(sample3))
    print("Sample 4:", find_duplicates_nested_loop(sample4))

Describe Different Approaches to Solving This Problem
I would think the issue with the nested loop is that it would have to go through each list for every integer so the time complexity would be o(n^2) while 
for the map it would store each int seen in the list in a hash table and check if it had already appeared
which would be an o(n) time complexity as it wont have to go through the list again







