package JavaStart.day05;

public class PhoneDemo01 {
	public static void main(String[] args) {
		Phone HUAWEI = new Phone();
		System.out.println(HUAWEI.price);
		System.out.println(HUAWEI.brand);
		HUAWEI.price = 4599;
		HUAWEI.brand = "华为";
		System.out.println(HUAWEI.price);
		System.out.println(HUAWEI.brand);

		HUAWEI.call();
		HUAWEI.message();
	}
}
