
public class Rainfall1 {
	public static void main(String args[]){
		int rainfall[][] = {{2,4,2,1,4,2,4,5},{2,4,2,1,4,2,4,5},{2,4,2,1,4,2,4,5},{2,4,2,1,4,2,4,5}};
		
		for(int i=0; i < rainfall.length;i++){
			for(int j=0; j < rainfall[i].length; j++){
				System.out.print(rainfall[i][j]);
			}
			System.out.println();
		}
	}
}
