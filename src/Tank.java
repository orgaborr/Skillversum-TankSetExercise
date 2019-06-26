
public class Tank {
	private Long id;
	private String name;
	private Integer canonNumber;
	
	public Tank() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCanonNumber() {
		return canonNumber;
	}

	public void setCanonNumber(int canonNumber) {
		this.canonNumber = canonNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(obj instanceof Tank) {
			if(((Tank) obj).getId() == null || this.id == null) {
				return false;
			}
			
			return this.id.equals(((Tank) obj).getId());
 		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = 13;
		hash = 19 * hash + (id != null ? id.intValue() : 0);
		hash  = 19 * hash + (name != null ? name.hashCode() : 0);
		hash = 19 * hash + (canonNumber != null ? canonNumber : 0);
		return hash;
	}
}
