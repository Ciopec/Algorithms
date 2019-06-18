//There is an infinite number of possible solutions for this ecuation.
//To improve computational speed, we'll limit the solutions: 0<=a,b,c,d<=30

class Backtracking {
    public static int n = 4;
    public static int [] sol = {0,0,0,0};
    public static int sum = 0;
    public static void main(String[] args) {
        bkt(0);
        System.out.println("Done!");
    }

    public static void bkt(int poz) {
        if(poz == n) {
            if (sum == 30) writeSolution(); 
            return;
        }
        for (int i = 0; i <= 30; i++) {
            if(sum > 30 ) {
                return;
            }
            sol[poz] = i;
            sum = sum + (poz+1) * sol[poz];
            bkt(poz + 1);
            sum = sum - (poz+1) * sol[poz];
        }
    }

    public static void writeSolution() {
        for (int i=0; i<n; i++) {
            System.out.printf("+%d*%d",i+1,sol[i]);
        }
        System.out.println();
    }
}
