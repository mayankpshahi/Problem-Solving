

//1861. Rotating the Box

class Solution {
   
    public char[][] rotateTheBox(char[][] box) {
       for(int i=0;i<box.length;i++) {
		Integer lastEmpty = null;
		for(int j=box[0].length-1;j>=0;j--) 
			if(lastEmpty==null && box[i][j] == '.')
				lastEmpty = j;
			else if(box[i][j] == '#' && lastEmpty!=null) { // Move the stone
				box[i][j]='.';
				box[i][lastEmpty--]='#'; 
			} else if(box[i][j] == '*')
				lastEmpty = null;
	}    
	char[][] result = new char[box[0].length][box.length];
	for(int i=0;i<box.length;i++)
		for(int j=box[0].length-1;j>=0;j--) 
			result[j][box.length - i -1] = box[i][j]; // rotate
	return result;
        
        
    }
}