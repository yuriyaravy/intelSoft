package by.home.lesson10;

public class Car4 {
		
		private String model;
		
		public Car4(){
			
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((model == null) ? 0 : model.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Car4 other = (Car4) obj;
			if (model == null) {
				if (other.model != null)
					return false;
			} else if (!model.equals(other.model))
				return false;
			return true;
		}

		public Car4(String model){
			this.model = model;
		}

		@Override
		public String toString() {
			return "Моя машина " + model+ " model ";
		}

}
