import mayflower.*;


public class MyWorld extends World {

    private Cat cat;
    private Dog dog;
    private Jack jack;
    private Ninja ninja;
    private Block block;
    private String tiles[][]; 
    public MyWorld() 
    {
        setBackground("img/BG/BG.png");
        Mayflower.showBounds(true);
        cat = new Cat();
        addObject(cat, 400, 0);
        tiles = new String[6][8];
        //dog = new Dog();
        //addObject(dog, 200, 100);
        //jack = new Jack();
        //addObject(jack, 300, 100);
        //ninja = new Ninja();
        //addObject(ninja, 100, 400);
        
        //block = new Block();
        //addObject(block, 400,100);
        //Block block1 = new Block();
        //addObject(block1, 528, 372);
        buildWorld(); 
        
        
    }
    
    public void buildWorld(){
        for (int i = 0; i < tiles.length; i++){
            tiles[i] = new String[tiles[0].length]; 
            for (int x = 0; x < tiles[0].length; x++){
                tiles[i][x] = "";
            }
        }
        
        
        for (int x = 0; x < tiles[0].length; x++){
                tiles[5][x] = "ground"; 
            }
            
        
        for (int r = 0; r < tiles.length; r++){
            for (int c = 0; c < tiles[r].length; c++){
                if (tiles[r][c].equals("ground")){
                    addObject(new Block(), c * 128, r + 600 - 120);
                }
            }
        }
    }
    
    public void addRandomObjects(){
        for (int r = 0; r < tiles.length; r++){
            for (int c = 0; c < tiles[r].length; c++){
                int rand = (int)(Math.random() * tiles.length);
                
                if ((rand < 3) && !(tiles[r][c].equals("ground"))){
                   addObject(new Yarn(), (c*100), (r*100)); 
                   tiles[r][c] = "yarn"; 
                }
            }
        }
    }
    
    public void act()
    {
    }
    
}
