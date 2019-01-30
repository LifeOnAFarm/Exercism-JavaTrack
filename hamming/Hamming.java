
class Hamming {

    private char[] leftStrand;
    private char[] rightStrand;
    private int hammingDis;

    Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        } else {
            this.leftStrand = leftStrand.toCharArray();
            this.rightStrand = rightStrand.toCharArray();
        }
    }

    int getHammingDistance() {
        
        for(int x = 0; x < leftStrand.length;x++){
            if( leftStrand[x] !=  rightStrand[x]){
                hammingDis++;
            }
        }

        return hammingDis;

    }

}
