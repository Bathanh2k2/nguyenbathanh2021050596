nh?p  java . s? d?ng . M�y qu�t ;
   

 Tham quan l?p  c�ng c?ng {
     ti�u ?? chu?i  t? nh�n ;
    gi� g?p ?�i  t? nh�n ;
    t�n chu?i  ri�ng ;
    M�y qu�t  sc = M�y qu�t m?i  ( H? th?ng . In );
    public  double  getTax () {
       tr? l?i  0,5 / 100 * gi� ;
    }
    // day la bai cua bathanh
    public  void  SetTour () {
        H? th?ng . ra ngo�i . print ( "daylacuathanhnhap name tour du lich:" );
        title = sc . nextLine ();
     H? th?ng . ra ngo�i . print ( "nhap gia:" );
     gi� c? = sc . nextDouble ();
    }
   public  void  getTour () {
    H? th?ng . ra ngo�i . println ( "ten goi du lich:" + title );
    H? th?ng . ra ngo�i . println ( "ten gia:" + price );
    c�i n�y . name = "nguyen ba" ;
   }
    public  static  void  main ( String [] args ) n�m  Exception {
        Tour  a = new  Tour ();
        a . SetTour ();
        a . getTour ();
        H? th?ng . ra ngo�i . print ( "thue: day la bai cua day la ba thanh" +    a . getTax ());
     }
}