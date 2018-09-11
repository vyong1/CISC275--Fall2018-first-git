package src;

class Dog extends Animal implements Comparable<Dog>
{
	public Dog(String name, int legs)
	{
		this.name = name;
		this.legs = legs;
	}

	public int compareTo(Dog other)
	{
		return this.getLegs() - other.getLegs();
	}

	public String toString()
	{
		return this.name;
	}
}
