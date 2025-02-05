/**
 * Represents a Bee
 * @author brynja
 */
public class Bee extends Insect
{
	private static final int DAMAGE = 1;
	
	/**
	 * Creates a new bee with the given armor
	 * @param armor The bee's armor
	 */
	public Bee(int armor)
	{
		super(armor);
	}
	
	/**
	 * Deals damage to the given ant
	 * @param ant The ant to sting
	 */
	public void sting(Ant ant)
	{
		ant.reduceArmor(DAMAGE);
	}
	
	/**
	 * Moves to the given place
	 * @param place The place to move to
	 */
	public void moveTo(Place place)
	{
		this.getPlace().removeInsect(this);
		place.addInsect(this);
	}

	public void leavePlace()
	{
		this.getPlace().removeInsect(this);
	}
	
	/**
	 * Returns true if the bee cannot advance (because an ant is in the way)
	 * @return if the bee can advance
	 */
	public boolean isBlocked()
	{
      if(this.getPlace().getAnt()==null){
         return false;
      }
		else{
         return this.getPlace().getAnt().getBlock();
      }
	}

	/**
	 * A bee's action is to sting the Ant that blocks its exit if it is blocked,
	 * otherwise it moves to the exit of its current place.
	 */
	public void action(AntColony colony)
	{
		if(this.isBlocked())
			sting(this.getPlace().getAnt());
		else if(this.getArmor() > 0)
			this.moveTo(this.getPlace().getExit());
	}
}
