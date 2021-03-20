Problem => https://www.hackerrank.com/challenges/sock-merchant?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

static int sockMerchant(int n, int[] ar) {
        int cift_corap_sayisi = 0;
        int i = 0;
        for(i=0;i<n;i++){
            int aranan_sayi = ar[i];
            for(int j=i+1;j<n;j++){
                if(aranan_sayi == ar[j] && ar[j] != -1){
                    cift_corap_sayisi +=1;
                    ar[i] = -1; //Bulunan coraplar -1 olarak değiştiriliyor bize verilen dizide -1 olacak şekilde bir renk kodu olmadığı için bulunanlar bu şekilde ayırt ediliyor.
                    ar[j] = -1;
                    break;
                }
            }
        }
        return cift_corap_sayisi;


    }
