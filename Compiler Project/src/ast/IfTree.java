package ast;

import lexer.Symbol;
import lexer.Token;
import visitor.*;

public class IfTree extends AST {
    private Symbol symbol;
    
    public IfTree() {
    }

    public IfTree(Token tok) {
        this.symbol = tok.getSymbol();
    }
    
    public Object accept(ASTVisitor v) {
        return v.visitIfTree(this);
    }

    public Symbol getSymbol() {
        return symbol;
    }
    
    public String getType() {
    	return "if";
    }
}

