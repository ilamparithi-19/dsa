class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = new int{1,2,3,4};
        productExceptSelf(arr);
    }
    private productExceptSelf(int[] arr) {
        int[] output = new int[arr.length];
        int L = arr.length;
        output[0] = 1;
        for(int i = 1; i < L; i++) {
            output[i] = output[i-1] * arr[i-1];
        }
        int R = 1;
        for(int j = L - 1; j >= 0; j--) {
            output[j] *= R; 
            R *= arr[j+1];
        }
        return output;
    }
}
