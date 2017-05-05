package example.hello;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;
import com.example.LambdaFunctionHandler;
import com.example.MainHandler;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class LambdaFunctionHandlerTest {

    private static Map<String,String> input;

    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
         input = new HashMap<String,String>();
         input.put("name", "Renuka");
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("Your Function Name");

        return ctx;
    }

    @Test
    public void testLambdaFunctionHandler() {
       // LambdaFunctionHandler handler = new LambdaFunctionHandler();
    	final MainHandler handler = new MainHandler();
        Context ctx = createContext();

        String output = handler.handleRequest("input", ctx);

        // TODO: validate output here if needed.
        if (output != null) {
            System.out.println(output.toString());
        }
    }
}
