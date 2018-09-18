class Dog extends Animal implements Comparable<Dog>
{
	public Dog(String name, int legs)
	{
        this.setName(name);
        this.setLegs(legs);
	}

	public int compareTo(Dog other)
	{
		return this.getLegs() - other.getLegs();
	}

	public String toString()
	{
		return super.toString();
	}
}
