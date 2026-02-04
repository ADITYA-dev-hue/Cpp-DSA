class BenchMark {
    public static void main(String[] args) {
        int n = 10000;
        StringBuilder sb = new StringBuilder();
        

        long currentTime = System.nanoTime();

        for(int i=0 ; i<n ;i++){
            sb.append(i);
        }
        long stringTime = System.nanoTime() - currentTime;
        System.out.println(stringTime);

        System.out.println("String operation time: "+stringTime/10000+" ms");
        StringBuffer sbBuffer = new StringBuffer();
        currentTime = System.nanoTime();

        for(int i=0;i<n;i++){
            sbBuffer.append(i);
        }
        long subbBuffer=System.nanoTime()-currentTime;

        System.out.print("String operation time: "+subbBuffer/10000+" ms");

    }    
}
