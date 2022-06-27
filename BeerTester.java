class BeerTester {

public static void main(String a[]) {

KingFisher kf = new KingFisher ();

kf.country = "India";
kf.alcoholVolume = "4.8%";
kf.type = "Lager";
kf.introduced = 1857;
kf.manufacturer = "United Breweries Group";

System.out.println(kf.country+"  "+kf.alcoholVolume+"  "+kf.type+"  "+kf.introduced+"  "+kf.manufacturer);

}
}