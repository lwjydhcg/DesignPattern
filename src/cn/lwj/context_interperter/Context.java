package cn.lwj.context_interperter;

import java.util.StringTokenizer;

/**
 * Created by Administrator
 * 2018-02-05.
 */
public class Context {
    private StringTokenizer tokenizer;
    private String currentToken;

    public Context(String context) {
        this.tokenizer = new StringTokenizer(context);
    }

    String newToken() {
        currentToken = tokenizer.nextToken();
        return currentToken;
    }

    String currentToken() {
        return currentToken;
    }

    boolean hasNextToken() {
        return tokenizer.hasMoreTokens();
    }
}
