package domin;

public class domino {
         private int A,B ;

		public domino(int a, int b) {
			super();
			A = a;
			B = b;
		}

		public int getA() {
			return A;
		}

		public void setA(int a) {
			A = a;
		}

		public int getB() {
			return B;
		}

		public void setB(int b) {
			B = b;
		}

		@Override
		public String toString() {
			return "domino [A=" + A + ", B=" + B +" total = "+ this.total()+"]";
		}
        public int total() {
        	return this.A+this.B ;
        }
}
