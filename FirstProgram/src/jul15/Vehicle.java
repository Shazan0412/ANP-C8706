package jul15;

public class Vehicle {
		private String Company ;
		private String ModelName ; 
		private Double Price ;
		public String getCompany() {
			return Company;
		}
		public void setCompany(String company) {
			Company = company;
		}
		public String getModelName() {
			return ModelName;
		}
		public void setModelName(String modelName) {
			ModelName = modelName;
		}
		public Double getPrice() {
			return Price;
		}
		public void setPrice(Double price) {
			Price = price;
		}
		public Vehicle(String company, String modelName, Double price) {
			super();
			Company = company;
			ModelName = modelName;
			Price = price;
		}
		public Vehicle() {
			super();
		}
		@Override
		public String toString() {
			return "Vehicle [Company=" + Company + ", ModelName=" + ModelName + ", Price=" + Price + "]";
		}
		
}
