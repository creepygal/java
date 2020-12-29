public class Lab8HW1 {
    public static void main(String[] args){
        int[] responces= {1,6,3,5,3,2,3,4,3,4,7,9,2,1,5,7,5,3,5,7,5,8,6,3,8,3,6,7,5,4,3,5,10,5,7,8,8,6,4,5,};
        int[] freq= new int[11];
        String output ="";
        for(int i=0;i<responces.length;i++){
            ++freq[responces[i]];
        }
        output+="Ratings\t Frequency\n";
        for(int ratings=1;ratings<freq.length;ratings++){
                output+=ratings+"\t"+freq[ratings]+"\n";
            }
        System.out.println(output);
            
        }
        
    }
