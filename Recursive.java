public class Recursive{



    public static void sort(int []array,int lo,int n)
    {
    if(n==0)
    {
        return;
    }
    
    else if(lo==n)
    {
        return;
    } 

    else 
    {
        if(array[lo]%2==0)
        {
            
         sort(array,lo+1,n);
  
        }            
    else 
    {
        
        for(int i=lo;i<n;i++)
        {
            if(array[i]%2==0)
            {
                int temp = array[lo];
                array[lo]=array[i];
                array[i]=temp;
              break;
            }
            
            
        }
       
        sort(array,lo+1,n);
    
    }
        
    }
    
    }
    
    
    public static void main(String[] args) 
    {
    
        int array[]={1,2,3,4,5,6,7,8,9};
        int low =0;
        int size=array.length;
       
        
      sort(array,low,size);
      System.out.println("Result: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+ " ");
        }
       
      
    }
    
    
    
    
    
    }