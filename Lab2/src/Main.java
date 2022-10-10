public class Main {
    public static void main(String[] args) {
        final char[][] array1={
                {'a','6','-'},
                {',','7','f','A','g'},
                {'T','=','d','H','4','C','m'},
                {'E','b','Q','p'},
                {'T','d',')'},
                {'%','$','#','@'}
        };
        final char [][] array2={
                {'A','B','C','D'},
                {},
                {'1','2','3','4','5',},
                {'.'}
        };
        final int CountRows1= array1.length;
        final int CountRows2= array2.length;
        final int CountRowsResult=Math.max(CountRows1, CountRows2);
        int MaxCountColumns1;
        if(CountRows1==0){
            MaxCountColumns1=0;
        }
        else {
            MaxCountColumns1 = array1[0].length;
        }
        for(int i=1;i<CountRows1;i++){
            MaxCountColumns1=Math.max(MaxCountColumns1, array1[i].length);
        }
        int MaxCountColumns2;
        if(CountRows2==0){
            MaxCountColumns2=0;
        }
        else{
            MaxCountColumns2=array2[0].length;
        }

        for(int i=1;i<CountRows2;i++){
            MaxCountColumns2=Math.max(MaxCountColumns2, array2[i].length);
        }
        final int CountColumnsResult=Math.max(MaxCountColumns1, MaxCountColumns2);

        char[][] result=new char[CountRowsResult][CountColumnsResult];
        char currentResult1;
        char currentResult2;
        for(int i=0; i<CountRowsResult;i++){
            for(int j=0;j<result[i].length;j++){
                currentResult1=(array1.length<=i||array1[i].length<=j)?
                        0:array1[i][j];
                currentResult2=(array2.length<=i||array2[i].length<=j)?
                        0:array2[i][j];

                result[i][j]=(char)(currentResult1+currentResult2);
            }
        }

        for(int i=0; i<CountRowsResult;i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        char sumRow;
        for(int i=0; i<CountRowsResult;i++) {
            sumRow=0;
            for (int j = 0; j < result[i].length; j++) {
                sumRow+=result[i][j];
            }
            System.out.printf("The average of the %d row: '%c'\n",i+1,(char)(sumRow/CountColumnsResult));
        }
    }
}