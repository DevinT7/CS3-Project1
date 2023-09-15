import mayflower.*;

public class MoveableAnimatedActor extends AnimatedActor
{
    private Animation walkRight;
    private Animation idle;
    private String currentAction;
    private Animation walkLeft;
    private Animation fallingR;
    private Animation fallingL;
    private Animation idleLeft;
    private String direction;
    public MoveableAnimatedActor()
    {
     idle= null;
     walkRight = null;
     direction = "right";
    }
    public void act()
    {
        super.act();
        String newAction = "";
        if(currentAction == null){
            newAction="idle";
        }
        if (Mayflower.isKeyDown( Keyboard.KEY_RIGHT )) {
            move(1);
            newAction = "walkRight";
            direction = "right";
            if(isBlocked())
                move(-2);
        }else{ 
            if (Mayflower.isKeyDown( Keyboard.KEY_LEFT )) {
                                move(-1);
                newAction = "walkLeft";
                direction = "left";
               if(isBlocked()){
                move(2);}
            } else{
                    newAction="idle";
                    if(direction!= null && direction.equals("left")){
                        newAction = "idleLeft";}
                    if(isFalling() && (direction.equals("left"))){
                        newAction="fallingLeft";
                    }else{
                        if(isFalling() && (direction.equals("right"))){
                            newAction="fallingRight";
                        }
                    }
            }
            }
                
                
        
    
        if(!(newAction.equals(currentAction))){
            if(newAction.equals("idle")){
                super.setAnimation(idle);
                System.out.print("idle");
                currentAction = "idle";
            }else{ 
                if(newAction.equals("walkRight")){
                System.out.print("walkRight");
                currentAction = "walkRight";
                super.setAnimation(walkRight);
                }else{
                    if(newAction.equals("walkLeft")){
                    System.out.print("walkLeft");
                    currentAction = "walkLeft";
                    super.setAnimation(walkLeft);
                    }else{
                        if(newAction.equals("idleLeft")){
                            System.out.print("idleLeft");
                            currentAction = "idleLeft";
                            super.setAnimation(idleLeft);
                        }else{
                             if(newAction.equals("fallingRight")){
                               currentAction = "fallingRight";
                               System.out.println("It is falling");
                               super.setAnimation(fallingR); 
                            }
                            else{
                                if(newAction.equals("fallingLeft")){
                                   currentAction = "fallingLeft";
                                   System.out.println("It is falling");
                                   super.setAnimation(fallingL);     
                                }
                            }
                        }
                    }
                }
            }   
        }
    }

    public void setWalkRightAnimation(Animation ani){
        walkRight = ani;
    }
    public void setWalkLeftAnimation(Animation ani){
        walkLeft = ani;
    }
    public void setIdleAnimation(Animation ani){
        idle = ani;
    }
    public void setIdleLeftAnimation(Animation ani){
        idleLeft = ani;
    }
    public void setFallingRAnimation(Animation ani){
        fallingR = ani;
    }
    public void setFallingLAnimation(Animation ani){
        fallingL = ani;
    } 
    
}
