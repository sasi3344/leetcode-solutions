class Solution {
    public int removeDuplicates(int[] n) {
        int a=1;
        for (int i=1;i <n.length;i++){
            if(n[i]!=n[i-1]){
                n[a]=n[i];
                a++;
            }
        }
        return a;
    }
}