import mayflower.*;

public class Ninja extends AnimatedActor
{
    private Animation walk;
    public Ninja() 
    {
        String[] animationL = new String[9];
        for(int i =0; i<animationL.length;i++){
            animationL[i] = "img/ninjagirl/Run__00"+(i+1)+".png";
        }
        
        walk= new Animation(50,animationL);
        walk.scale(100,80);

        setAnimation(walk);
    }
    public void act()
    {

        super.act();
    }
}
