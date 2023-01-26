package utils;

import java.util.Objects;

public class Author {
	private String name;
	private String surname;
	
	
		public Author() {
	}
	public Author(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name, surname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}
	@Override
	public String toString() {
		return "Authors [name=" + name + ", surname=" + surname + "]";
	}
}
