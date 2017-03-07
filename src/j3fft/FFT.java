package j3fft;

public class FFT {
    public static void fft(double pr[], double pi[], double fr[], double fi[]) {
        int N = pr.length;
        for (int i = 0; i < N; i++) {
            fr[i] = 0;
            fi[i] = 0;
            for (int j = 0; j < N; j++) {
                fr[i] += pr[j] * Math.cos(2 * Math.PI * i * j / N) + pi[j]
                        * Math.sin(2 * Math.PI * i * j / N);
                fi[i] += (-pr[j] * Math.sin(2 * Math.PI * i * j / N)) + pi[j]
                        * Math.cos(2 * Math.PI * i * j / N);
            }
        }
        
        
    }

    public static void ifft(double fr[], double fi[], double pr[], double pi[]) {
        int N = pr.length;
        for (int i = 0; i < N; i++) {
            pr[i] = 0;
            pi[i] = 0;
            for (int j = 0; j < N; j++) {
                pr[i] += fr[j] * Math.cos(2 * Math.PI * i * j / N) / N - fi[j]
                        * Math.sin(2 * Math.PI * i * j / N) / N;
                pi[i] += fr[j] * Math.sin(2 * Math.PI * i * j / N) / N + fi[j]
                        * Math.cos(2 * Math.PI * i * j / N) / N;
            }
        }
    }
    
    public static int greater2p2(int n) {
        for (int i = 1;; i++) {
            if (n < Math.pow(2, i)) {
                return (int) Math.pow(2, i);
            }
        }
    }

    public static void main(String[] args) {
//    	double fft[] = {0,1, 2, 3, 4, 5,6,7 };
    	
//    	fft(fft,null,null,null);
    	
    	
    	
    	
        double pr[] = { 1, 2, 3, 4, 5 };
        double pi[] = { 0, 0, 0, 0, 0 };
        /*double fr[] = new double[5];
        double fi[] = new double[5];
        double pr1[] = new double[5];
        double pi1[] = new double[5];
        fft(pr, pi, fr, fi);
        for (int i = 0; i < pr.length; i++) {
            System.out.printf("%3.3f   %3.3f", fr[i], fi[i]);
            System.out.println();
        }

        System.out.println();

        ifft(fr, fi, pr1, pi1);
        for (int i = 0; i < fr.length; i++) {
            System.out.printf("%3.3f    %3.3f", pr1[i], pi1[i]);
            System.out.println();
        }*/

        int KK = greater2p2(pr.length);
        System.out.println(KK);
        double pr2[] = new double[KK];
        double pi2[] = new double[KK];
        double fr2[] = new double[KK];
        double fi2[] = new double[KK];
        for (int i = 0; i < KK; i++) {
            pr2[i] = 0;
            pi2[i] = 0;
            if (i < pr.length) {
                pr2[i] = pr[i];
                pi2[i] = pi[i];
            }

        }

        fft(pr2, pi2, fr2, fi2);
        for (int i = 0; i < KK; i++) {
            System.out.printf("%3.3f   %3.3f", fr2[i], fi2[i]);
            System.out.println();
        }
    }

}
