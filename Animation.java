import mayflower.*;

public class Animation
{
    private MayflowerImage[] frames;
    private int framerate;
    private int currentFrame;
    public Animation(int secF, String[] images)
    {
        framerate = secF;
        frames = new MayflowerImage[images.length];
        for(int i =0; i < images.length;i++){
             frames[i] = new MayflowerImage(images[i]);   
        }
        
    }

    public int getFramerate()
    {
        return framerate;
    }
    public void scale(int w, int h){
        for(int i =0; i<frames.length; i++){
            frames[i].scale(w,h);
        }
    }
    public void mirrorHorizontally(){
        for(int i =0; i<frames.length; i++){
            frames[i].mirrorHorizontally();
        }
    }
    public void setBounds(int x, int y, int w, int h){
        for(int i =0; i<frames.length; i++){
            frames[i].crop(x,y,w,h);
        }        
    }
    public MayflowerImage getNextFrame()
    {


        currentFrame++;
        if(currentFrame % frames.length == 0){
            currentFrame=0;
            }
        MayflowerImage currentImage = frames[currentFrame];

      
      
      return currentImage;
    }
}
