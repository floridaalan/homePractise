class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal=new ArrayList();

        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList(); // store row
            for(int j=0;j<=i;j++){ 
                if(j==i||j==0){
                    row.add(1);
                }else{
                    List<Integer> previousRow=pascal.get(i-1); // get previous row
                    row.add(previousRow.get(j)+previousRow.get(j-1));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}
