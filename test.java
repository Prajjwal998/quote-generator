class test
{
  public static void main(String args[]) {
    int[] ar={1350,2342,6754,1200,1363};

    int c=0;
    for(int i: ar){
      switch(i%2)
      {
        default: ar[c]=i+1;
        case 0:  ar[c]=i+1;
        c++;
        case 1:  ar[c]=i+1;
        break;
        
      }
    }

for(int i=0;i<ar.length;i++)
System.out.println(ar[i]+" ");


  }
}
