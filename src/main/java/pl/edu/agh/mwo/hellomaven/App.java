package pl.edu.agh.mwo.hellomaven;

import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;
/**
 * Simple main application
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

        IRender render = new Render();
        IContextBuilder builder = render.newBuilder();
            builder.width(120).

        height(20);
            builder.element(new

        PseudoText("PseudoText"));
        ICanvas canvas = render.render(builder.build());
        String s = canvas.getText();
            System.out.println(s);
}

    public int getRandomNumber() {
        // chosen by fair dice roll.
        // guaranteed to be random
        return 4;
    }
}
