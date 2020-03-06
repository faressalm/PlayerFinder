package classes;
import java.awt.Point;

import Interface.IPlayersFinder;
public class PlayerFinder implements IPlayersFinder  {
   private static int  counter ;
   private static String[] photog;
	@Override
	public Point[] findPlayers(String[] photo, int team, int threshold) {
		photog=photo;
		if(photo.length==0) {
			return null;
		}
		
		if(photog==null) {
			return null;}
		
		
		int sizenum=photo[0].length()*photo.length;
		Point game[]=new Point[sizenum/2];
		int point_index=0;
		int arr[][]=new int[2][sizenum];
		int maxrow=0,minrow=0,maxcol=0,mincol=0;
	
		for(int i=0;i<photog.length;i++) {
			
			for(int j=0;j<photog[0].length();j++) {
				if(photog[i].charAt(j)==(char)(team+'0')) {
					// reform the array again
					counter=0;
					
					for(int k=0;k<sizenum;k++) {
						arr[0][k]=-1;
						arr[1][k]=-1;
					}
					
					arr=find_center( i, team, j, arr);
					if((counter)*4>=threshold) {
					maxrow=arr[0][0];
					minrow=arr[0][0];
					maxcol=arr[1][0];
					mincol=arr[1][0];
					for(int k=1;k<sizenum&arr[0][k]!=-1;k++) {
						if(maxrow<arr[0][k]) {
							maxrow=arr[0][k];
						}else if(minrow>arr[0][k]){
							minrow=arr[0][k];
						}
						if(maxcol<arr[1][k]) {
							maxcol=arr[1][k];
						}else if(mincol>arr[1][k]){
							mincol=arr[1][k];
						}
					}
					
					game[point_index]=new Point(maxcol+mincol+1,maxrow+minrow+1);
					point_index++;
					/*game[point_index].x=maxcol+mincol+1;
					
					game[point_index].y=maxrow+minrow+1;*/
				}
				}
			}
			
			
		}
		//sort the array of points
		for(int i=0;i<point_index;i++) {
			for(int j=i+1;j<point_index;j++) {
				if(game[i].x>game[j].x) {
					Point temp;
					temp=game[i];
					game[i]=game[j];
					game[j]=temp;
				}
				if(game[i].x==game[j].x&&game[i].y>=game[j].y) {
					Point temp;
					temp=game[i];
					game[i]=game[j];
					game[j]=temp;
				}
				
			}
		}// copy elements of the array point to a new one
		Point finish[]=new Point[point_index];
		for(int i=0;i<point_index;i++) {
			finish[i]=game[i];
			
			
		}
		/*for(int i=0;i<point_index;i++) {
			System.out.println(finish[i]);
			
		}*/
		
		
		return finish;
	}
    
public static int[][] find_center (int i ,int team,int j,int arr[][]){
	
		
		arr[0][counter]=i;
		arr[1][counter]=j;
		counter++;
		StringBuilder sb=new StringBuilder(photog[i]);
		sb.setCharAt(j, 'A');
		photog[i] = sb.toString();
		
	if(i+1<photog.length) {
		if(photog[i+1].charAt(j)==(char)(team+'0')) {
      
		find_center( i+1, team, j, arr);}}
		 if(j+1<photog[0].length()) {
		if(photog[i].charAt(j+1)==(char)(team+'0')){
     
		find_center( i, team, j+1, arr);}}
		 if(i-1>-1) {
		if(photog[i-1].charAt(j)==(char)(team+'0')){
     
		find_center( i-1, team, j, arr);}}
		if(j-1>-1) {
		if(photog[i].charAt(j-1)==(char)(team+'0')){
	    
		find_center( i, team, j-1, arr);
		}}
	
			
		return arr;
	}
	
}
