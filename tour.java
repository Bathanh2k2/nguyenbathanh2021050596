nh?p  java . s? d?ng . Máy quét ;
   

 Tham quan l?p  công c?ng {
     tiêu ?? chu?i  t? nhân ;
    giá g?p ?ôi  t? nhân ;
    tên chu?i  riêng ;
    Máy quét  sc = Máy quét m?i  ( H? th?ng . In );
    public  double  getTax () {
       tr? l?i  0,5 / 100 * giá ;
    }
    // day la bai cua bathanh
    public  void  SetTour () {
        H? th?ng . ra ngoài . print ( "daylacuathanhnhap name tour du lich:" );
        title = sc . nextLine ();
     H? th?ng . ra ngoài . print ( "nhap gia:" );
     giá c? = sc . nextDouble ();
    }
   public  void  getTour () {
    H? th?ng . ra ngoài . println ( "ten goi du lich:" + title );
    H? th?ng . ra ngoài . println ( "ten gia:" + price );
    cái này . name = "nguyen ba" ;
   }
    public  static  void  main ( String [] args ) ném  Exception {
        Tour  a = new  Tour ();
        a . SetTour ();
        a . getTour ();
        H? th?ng . ra ngoài . print ( "thue: day la bai cua day la ba thanh" +    a . getTax ());
     }
}