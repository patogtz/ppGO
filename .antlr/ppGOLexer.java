// Generated from /Users/Pato/Desktop/ppGO/ppGO.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ppGOLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FUNCTION=8, LEFT_PAR=9, 
		RIGHT_PAR=10, LEFT_BRACKET=11, RIGHT_BRACKET=12, LEFT_SBRACKET=13, RIGHT_SBRACKET=14, 
		PLUS=15, MINUS=16, TIMES=17, DIVISION=18, LESS_THAN=19, GREATER_THAN=20, 
		NOT_EQUAL=21, EQUAL_RELOP=22, GREATER_EQUAL=23, LESS_EQUAL=24, EQUAL=25, 
		SEP_COMMA=26, SEP_COLON=27, SEP_SEMICOLON=28, AND=29, OR=30, IF=31, ELSE=32, 
		ELSEIF=33, VAR=34, PROGRAM=35, VAR_INT=36, VAR_FLOAT=37, INPUT=38, LOOP=39, 
		PRINT=40, RETURN=41, LITERAL=42, VAR_STRING=43, WHITESPACE=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "FUNCTION", "LEFT_PAR", 
		"RIGHT_PAR", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", 
		"PLUS", "MINUS", "TIMES", "DIVISION", "LESS_THAN", "GREATER_THAN", "NOT_EQUAL", 
		"EQUAL_RELOP", "GREATER_EQUAL", "LESS_EQUAL", "EQUAL", "SEP_COMMA", "SEP_COLON", 
		"SEP_SEMICOLON", "AND", "OR", "IF", "ELSE", "ELSEIF", "VAR", "PROGRAM", 
		"VAR_INT", "VAR_FLOAT", "INPUT", "LOOP", "PRINT", "RETURN", "LITERAL", 
		"VAR_STRING", "DIGIT", "WHITESPACE", "ESC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'int'", "'float'", "'string'", "'bool'", "'true'", "'false'", 
		"'func'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'+'", "'-'", "'*'", 
		"'/'", "'<'", "'>'", "'<>'", "'=='", "'>='", "'<='", "'='", "','", "':'", 
		"';'", "'AND'", "'OR'", "'if'", "'else'", "'else if'", "'var'", "'program'", 
		null, null, "'usr_input'", "'loop'", "'print'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "FUNCTION", "LEFT_PAR", 
		"RIGHT_PAR", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", 
		"PLUS", "MINUS", "TIMES", "DIVISION", "LESS_THAN", "GREATER_THAN", "NOT_EQUAL", 
		"EQUAL_RELOP", "GREATER_EQUAL", "LESS_EQUAL", "EQUAL", "SEP_COMMA", "SEP_COLON", 
		"SEP_SEMICOLON", "AND", "OR", "IF", "ELSE", "ELSEIF", "VAR", "PROGRAM", 
		"VAR_INT", "VAR_FLOAT", "INPUT", "LOOP", "PRINT", "RETURN", "LITERAL", 
		"VAR_STRING", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ppGOLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ppGO.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0131\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\6%\u00db\n%\r%\16"+
		"%\u00dc\3&\5&\u00e0\n&\3&\7&\u00e3\n&\f&\16&\u00e6\13&\3&\5&\u00e9\n&"+
		"\3&\6&\u00ec\n&\r&\16&\u00ed\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\5+\u010e\n"+
		"+\3+\3+\5+\u0112\n+\7+\u0114\n+\f+\16+\u0117\13+\3,\3,\3,\7,\u011c\n,"+
		"\f,\16,\u011f\13,\3,\3,\3-\3-\3.\6.\u0126\n.\r.\16.\u0127\3.\3.\3/\3/"+
		"\3/\3/\5/\u0130\n/\3\u011d\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[.]\2"+
		"\3\2\7\4\2--//\3\2\62;\3\2\60\60\4\2C\\c|\5\2\13\f\17\17\"\"\2\u013a\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2[\3\2\2\2\3_\3\2\2\2\5d\3\2\2\2\7h\3\2\2\2\tn\3\2"+
		"\2\2\13u\3\2\2\2\rz\3\2\2\2\17\177\3\2\2\2\21\u0085\3\2\2\2\23\u008a\3"+
		"\2\2\2\25\u008c\3\2\2\2\27\u008e\3\2\2\2\31\u0090\3\2\2\2\33\u0092\3\2"+
		"\2\2\35\u0094\3\2\2\2\37\u0096\3\2\2\2!\u0098\3\2\2\2#\u009a\3\2\2\2%"+
		"\u009c\3\2\2\2\'\u009e\3\2\2\2)\u00a0\3\2\2\2+\u00a2\3\2\2\2-\u00a5\3"+
		"\2\2\2/\u00a8\3\2\2\2\61\u00ab\3\2\2\2\63\u00ae\3\2\2\2\65\u00b0\3\2\2"+
		"\2\67\u00b2\3\2\2\29\u00b4\3\2\2\2;\u00b6\3\2\2\2=\u00ba\3\2\2\2?\u00bd"+
		"\3\2\2\2A\u00c0\3\2\2\2C\u00c5\3\2\2\2E\u00cd\3\2\2\2G\u00d1\3\2\2\2I"+
		"\u00da\3\2\2\2K\u00df\3\2\2\2M\u00ef\3\2\2\2O\u00f9\3\2\2\2Q\u00fe\3\2"+
		"\2\2S\u0104\3\2\2\2U\u010b\3\2\2\2W\u0118\3\2\2\2Y\u0122\3\2\2\2[\u0125"+
		"\3\2\2\2]\u012f\3\2\2\2_`\7o\2\2`a\7c\2\2ab\7k\2\2bc\7p\2\2c\4\3\2\2\2"+
		"de\7k\2\2ef\7p\2\2fg\7v\2\2g\6\3\2\2\2hi\7h\2\2ij\7n\2\2jk\7q\2\2kl\7"+
		"c\2\2lm\7v\2\2m\b\3\2\2\2no\7u\2\2op\7v\2\2pq\7t\2\2qr\7k\2\2rs\7p\2\2"+
		"st\7i\2\2t\n\3\2\2\2uv\7d\2\2vw\7q\2\2wx\7q\2\2xy\7n\2\2y\f\3\2\2\2z{"+
		"\7v\2\2{|\7t\2\2|}\7w\2\2}~\7g\2\2~\16\3\2\2\2\177\u0080\7h\2\2\u0080"+
		"\u0081\7c\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2\u0083\u0084\7g\2\2"+
		"\u0084\20\3\2\2\2\u0085\u0086\7h\2\2\u0086\u0087\7w\2\2\u0087\u0088\7"+
		"p\2\2\u0088\u0089\7e\2\2\u0089\22\3\2\2\2\u008a\u008b\7*\2\2\u008b\24"+
		"\3\2\2\2\u008c\u008d\7+\2\2\u008d\26\3\2\2\2\u008e\u008f\7}\2\2\u008f"+
		"\30\3\2\2\2\u0090\u0091\7\177\2\2\u0091\32\3\2\2\2\u0092\u0093\7]\2\2"+
		"\u0093\34\3\2\2\2\u0094\u0095\7_\2\2\u0095\36\3\2\2\2\u0096\u0097\7-\2"+
		"\2\u0097 \3\2\2\2\u0098\u0099\7/\2\2\u0099\"\3\2\2\2\u009a\u009b\7,\2"+
		"\2\u009b$\3\2\2\2\u009c\u009d\7\61\2\2\u009d&\3\2\2\2\u009e\u009f\7>\2"+
		"\2\u009f(\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7>\2\2"+
		"\u00a3\u00a4\7@\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6\u00a7\7?\2"+
		"\2\u00a7.\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9\u00aa\7?\2\2\u00aa\60\3\2\2"+
		"\2\u00ab\u00ac\7>\2\2\u00ac\u00ad\7?\2\2\u00ad\62\3\2\2\2\u00ae\u00af"+
		"\7?\2\2\u00af\64\3\2\2\2\u00b0\u00b1\7.\2\2\u00b1\66\3\2\2\2\u00b2\u00b3"+
		"\7<\2\2\u00b38\3\2\2\2\u00b4\u00b5\7=\2\2\u00b5:\3\2\2\2\u00b6\u00b7\7"+
		"C\2\2\u00b7\u00b8\7P\2\2\u00b8\u00b9\7F\2\2\u00b9<\3\2\2\2\u00ba\u00bb"+
		"\7Q\2\2\u00bb\u00bc\7T\2\2\u00bc>\3\2\2\2\u00bd\u00be\7k\2\2\u00be\u00bf"+
		"\7h\2\2\u00bf@\3\2\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3"+
		"\7u\2\2\u00c3\u00c4\7g\2\2\u00c4B\3\2\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7"+
		"\7n\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7\"\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7h\2\2\u00ccD\3\2\2\2\u00cd\u00ce\7x\2\2\u00ce"+
		"\u00cf\7c\2\2\u00cf\u00d0\7t\2\2\u00d0F\3\2\2\2\u00d1\u00d2\7r\2\2\u00d2"+
		"\u00d3\7t\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7i\2\2\u00d5\u00d6\7t\2\2"+
		"\u00d6\u00d7\7c\2\2\u00d7\u00d8\7o\2\2\u00d8H\3\2\2\2\u00d9\u00db\5Y-"+
		"\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00ddJ\3\2\2\2\u00de\u00e0\t\2\2\2\u00df\u00de\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e8\3\2\2\2\u00e1\u00e3\t\3\2\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\t\4\2\2\u00e8\u00e4\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\t\3\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00eeL\3\2\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2"+
		"\7t\2\2\u00f2\u00f3\7a\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2\u00f5"+
		"\u00f6\7r\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7v\2\2\u00f8N\3\2\2\2\u00f9"+
		"\u00fa\7n\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7r\2\2"+
		"\u00fdP\3\2\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7k\2"+
		"\2\u0101\u0102\7p\2\2\u0102\u0103\7v\2\2\u0103R\3\2\2\2\u0104\u0105\7"+
		"t\2\2\u0105\u0106\7g\2\2\u0106\u0107\7v\2\2\u0107\u0108\7w\2\2\u0108\u0109"+
		"\7t\2\2\u0109\u010a\7p\2\2\u010aT\3\2\2\2\u010b\u0115\t\5\2\2\u010c\u010e"+
		"\7a\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u0112\t\5\2\2\u0110\u0112\5Y-\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2"+
		"\2\u0112\u0114\3\2\2\2\u0113\u010d\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116V\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u011d\7$\2\2\u0119\u011c\5]/\2\u011a\u011c\13\2\2\2\u011b\u0119\3\2\2"+
		"\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011e\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7$\2\2\u0121"+
		"X\3\2\2\2\u0122\u0123\4\62;\2\u0123Z\3\2\2\2\u0124\u0126\t\6\2\2\u0125"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b.\2\2\u012a\\\3\2\2\2\u012b\u012c"+
		"\7^\2\2\u012c\u0130\7$\2\2\u012d\u012e\7^\2\2\u012e\u0130\7^\2\2\u012f"+
		"\u012b\3\2\2\2\u012f\u012d\3\2\2\2\u0130^\3\2\2\2\17\2\u00dc\u00df\u00e4"+
		"\u00e8\u00ed\u010d\u0111\u0115\u011b\u011d\u0127\u012f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}