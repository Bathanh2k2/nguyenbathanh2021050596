l?p  c�ng khai Ch�nh {
 
    public  static  void  main ( String [] args ) {
      Tour  a = new  Tour ();
      a . SetTour ();
      a . getTour ();
      H? th?ng . ra ngo�i . print ( "daylathue: day la bathanh" +    a . getTax ());
      NoTaxTour  b = new  NoTaxTour ();
      b . SetTour ();
      b . getTour ();
     H? th?ng . ra ngo�i . print ( "bathanhthue: day la bathanh" +    b . getTax ());
    }
 
}