import mayflower.*;

public class Jack extends AnimatedActor
{
    private Animation walk;
    public Jack() 
    {
        String[] animationL = new String[7];
        for(int i =0; i<animationL.length;i++){
            animationL[i] = "img/jack/Walk ("+(i+1)+").png";
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
