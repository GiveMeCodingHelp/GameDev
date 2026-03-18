import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class Player extends GameObject{
    int speed = 200;
    public Player(double x, double y) {
        super(x,y,50,50,"assets/ship.png");
    }

    @Override
    public void move(double deltaTime) {
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            setX(deltaTime * speed + getX());
        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            setX(getX() - deltaTime * speed);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            setY(deltaTime * speed + getY());
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            setY(getY() - deltaTime * speed);
        }
    }
}
