public class taksi {
    private String musteri;
    private int baslangic_ucreti;

    public taksi() {
        this.baslangic_ucreti = 30;
    }

    public void sec(String ilce){
        ilce=ilce.toLowerCase();
        switch (ilce){
            case "bagcilar":
                hesapla(30,"bagcilar");
                break;
            case "esenler":
                hesapla(70,"esenler");
                break;
            case "fatih":
                hesapla(26,"fatih");
                break;
            case "aksaray":
                hesapla(40,"aksaray");
                break;
            case "eminonu":
                hesapla(34,"eminonu");
                break;
            default:
                System.out.println("Değişim saati abi");
                break;
        }
    }
    public void hesapla(int q,String w){
        System.out.println(w+(((float)q*2.2)+baslangic_ucreti)+" TL");
    }


    public String getMusteri() {
        return musteri;
    }

    public void setMusteri(String musteri) {
        this.musteri = musteri;
    }
}
