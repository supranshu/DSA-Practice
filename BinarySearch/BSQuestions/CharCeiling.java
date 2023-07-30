package BinarySearch.BSQuestions;

public class CharCeiling {
    public static void main(String[] args){
        char[] letters={'a','d','g','h','j','k','r','t','y'};
        char ans=ceilingChar(letters, 'g');
        System.out.println("Greates letter is "+ans);
        
    }
    
    
    public static char ceilingChar(char[] letters,char target){
        int start=0,end=letters.length-1,i=0;
       
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid])
            {   
                
                end=mid-1;
            }
            else{
                
                start=mid+1;

            }
            
            
            
        } 
           
        return letters[start%(letters.length)];

    }
}
