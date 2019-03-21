package Consumer_Lambda.Consumer;

	public class Student {
		private String name;
		private int id;
		private String dept;
		public String getName() {
			return name;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", id=" + id + ", dept=" + dept + "]";
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public Student(String name, int id, String dept) {
			super();
			this.name = name;
			this.id = id;
			this.dept = dept;
		}

		
		
	}

