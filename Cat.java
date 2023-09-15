import mayflower.*;

public class Cat extends MoveableAnimatedActor
{
    private Animation walkRight;
    private Animation walkLeft;
    private Animation idle;
    private Animation idleLeft;
    private Animation fallR;
    private Animation fallL;
 
    public Cat() 
    {
        String[] animationW = new String[10];
        for(int i =0; i<animationW.length;i++){
            animationW[i] = "img/cat/Walk ("+(i+1)+").png";
        }
        String[] animationI = new String[10];
        for(int i =0; i<animationI.length;i++){
            animationI[i] = "img/cat/Idle ("+(i+1)+").png";
        }
        String[] animationF = new String[8];
        for(int i =0; i<animationF.length;i++){
            animationF[i] = "img/cat/Fall ("+(i+1)+").png";
        }
        
        walkRight= new Animation(50,animationW);
        walkLeft = new Animation(50,animationW);
        idleLeft=new Animation(50,animationI);
        idle = new Animation(50,animationI);
        fallR=new Animation(50,animationF);
        fallL = new Animation(50, animationF);
        
        walkLeft.mirrorHorizontally();
        idleLeft.mirrorHorizontally();
        fallL.mirrorHorizontally();
        
        walkLeft.scale(100,80);
        idleLeft.scale(100,80);
        fallR.scale(100,80);        
        walkRight.scale(100,80);
        idle.scale(100,80);
        fallL.scale(100,80);
        
        walkLeft.setBounds(28,0,54,80);
        walkRight.setBounds(18,0,54,80);
        idle.setBounds(18,0,54,80);
        idleLeft.setBounds(28,0,54,80);
        fallL.setBounds(28,0,54,80);
        fallR.setBounds(18,0,54,80);
        
        setWalkRightAnimation(walkRight);
        setIdleAnimation(idle);
        setWalkLeftAnimation(walkLeft);
        setIdleLeftAnimation(idleLeft);
        setFallingRAnimation(fallR);
        setFallingLAnimation(fallL);
       
    }
    public void act()
    {

        super.act();
    }
}
