//problem -> https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays

  static int[] rotLeft(int[] a, int d) {
        int uzunluk = a.length;
        int count = 0;
        while(count < d){
            int dizi_koru = a[0];
            int count2 = 0;
            while(count2 < uzunluk-1){
                a[count2] = a[count2+1];
                count2++;
            }
            a[count2] = dizi_koru;
            count+=1;
        }
        return a;

    }
