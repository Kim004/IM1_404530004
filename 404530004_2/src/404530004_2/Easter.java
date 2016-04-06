package 404530004_2;

public class Easter {

	public String calculateEaster(int aYear) {
		int a = aYear % 19;
		int b = aYear % 4;
		int c = aYear % 7;
		int k = (aYear / 100);//Math.floor(), -2
		int p = ((13 + 8 * k) / 25);
		int q = (k / 4);
		int M = (15 - p + k - q) % 30;
		int N = (4 + k - q) % 7;
		int d = (19 * a + M) % 30;
		int e = (2 * b + 4 * c + 6 * d + N) % 7;
		if (d + e <= 9) {
			int d1 = d + e + 22;
			return "In" + aYear + ", Easter Sunday is: month = 3 and day= " + d1;
		} else {
			int d2 = d + e - 9;
			// �ʤ֨�ӧP�_��, ��@��������! -5
						// if d = 29 and e = 6, replace 26 April with 19 April
						// if d = 28, e = 6, and (11M + 11) mod 30 < 19, replace 25 April
						// with 18 April

			return "In" + aYear + ", Easter Sunday is: month = 4 and day= " + d2;
		}

	}

}
