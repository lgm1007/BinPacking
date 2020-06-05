import java.util.ArrayList;

public class WorstFit implements Fit {
	@Override
	 public void fit(ArrayList<Bin> arr, Item item) {
		
		 Sort(arr);
		 for (int i=0; i<arr.size(); i++) {
			 Bin bin = arr.get(i);
			 if(bin.check(item)) {
				 bin.update(item);
				 return;
			 } else {
				 continue;
			 }
		 }
		 
		 Bin b = new Bin();
		 b.update(item);
		 arr.add(b);
	 }
	 
	 //남은 용량에 대해 많은 순서(내림차순)로 배열
	 public void Sort(ArrayList<Bin> arr) {
		 for(int i = 0; i < arr.size() - 1; i++) {
			 int max = i;
			 
			 for(int j = i + 1; j < arr.size(); j++) {
				 if(arr.get(j).remainCapacity > arr.get(max).remainCapacity) {
					 max = j;
				 }
			 }
			 Bin tmp = new Bin();
			 tmp = arr.get(i);
			 arr.set(i, arr.get(max));
			 arr.set(max, tmp);
		 }
	 }
}
