// Generated from Data.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DataListener extends ParseTreeListener {
	void enterSequence(DataParser.SequenceContext ctx);
	void exitSequence(DataParser.SequenceContext ctx);

	void enterFile(DataParser.FileContext ctx);
	void exitFile(DataParser.FileContext ctx);

	void enterGroup(DataParser.GroupContext ctx);
	void exitGroup(DataParser.GroupContext ctx);
}