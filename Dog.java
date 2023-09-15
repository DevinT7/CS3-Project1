import mayflower.*;

public class Dog extends AnimatedActor
{
    private Animation walk;
    public Dog() 
    {
        String[] animationL = new String[10];
        for(int i =0; i<animationL.length;i++){
            animationL[i] = "img/dog/Walk ("+(i+1)+").png";
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
