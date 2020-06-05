import java.util.ArrayList;

public class NextFit implements Fit{
    @Override
    public void fit(ArrayList<Bin> arr, Item item) {
    	for (int i=0; i<arr.size(); i++) {
    		Bin bin = arr.get(arr.size() - 1);		//가장 최근에 넣은 통
    		if(bin.check(item)) {
                bin.update(item);
                return;
            } 
    		
    	}
    	
    	Bin b = new Bin();
    	b.update(item);
    	arr.add(b);
    	
    }
}
