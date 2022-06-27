class ElectronicDeviceTester{
public static void main(String a[]) {
Light light = new Light();
light.price = 249.00;
light.lightColor = "White";
light.wattage = "80 Watts";
light.voltage = "220-240V";

System.out.println(light.price+"  "+light.lightColor+"  "+light.wattage+"  "+light.voltage);
}
}