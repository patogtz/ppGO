// Generated from /Users/Pato/Desktop/ppGO/Compiler/ppGO.g4 by ANTLR 4.7.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, FUNCTION=6, LEFT_PAR=7, RIGHT_PAR=8, 
		LEFT_BRACKET=9, RIGHT_BRACKET=10, LEFT_SBRACKET=11, RIGHT_SBRACKET=12, 
		PLUS=13, MINUS=14, TIMES=15, DIVISION=16, LESS_THAN=17, GREATER_THAN=18, 
		NOT_EQUAL=19, EQUAL_RELOP=20, GREATER_EQUAL=21, LESS_EQUAL=22, EQUAL=23, 
		SEP_COMMA=24, SEP_COLON=25, SEP_SEMICOLON=26, AND=27, OR=28, IF=29, ELSE=30, 
		ELSEIF=31, PROGRAM=32, VAR_INT=33, VAR_FLOAT=34, VAR_BOOL=35, INPUT=36, 
		LOOP=37, PRINT=38, RETURN=39, LITERAL=40, VAR_STRING=41, WHITESPACE=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "FUNCTION", "LEFT_PAR", "RIGHT_PAR", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "PLUS", 
		"MINUS", "TIMES", "DIVISION", "LESS_THAN", "GREATER_THAN", "NOT_EQUAL", 
		"EQUAL_RELOP", "GREATER_EQUAL", "LESS_EQUAL", "EQUAL", "SEP_COMMA", "SEP_COLON", 
		"SEP_SEMICOLON", "AND", "OR", "IF", "ELSE", "ELSEIF", "PROGRAM", "VAR_INT", 
		"VAR_FLOAT", "VAR_BOOL", "INPUT", "LOOP", "PRINT", "RETURN", "LITERAL", 
		"VAR_STRING", "DIGIT", "WHITESPACE", "ESC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'int'", "'float'", "'string'", "'bool'", "'func'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'<'", 
		"'>'", "'<>'", "'=='", "'>='", "'<='", "'='", "','", "':'", "';'", "'AND'", 
		"'OR'", "'if'", "'else'", "'else if'", "'program'", null, null, null, 
		"'usr_input'", "'loop'", "'print'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "FUNCTION", "LEFT_PAR", "RIGHT_PAR", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "PLUS", 
		"MINUS", "TIMES", "DIVISION", "LESS_THAN", "GREATER_THAN", "NOT_EQUAL", 
		"EQUAL_RELOP", "GREATER_EQUAL", "LESS_EQUAL", "EQUAL", "SEP_COMMA", "SEP_COLON", 
		"SEP_SEMICOLON", "AND", "OR", "IF", "ELSE", "ELSEIF", "PROGRAM", "VAR_INT", 
		"VAR_FLOAT", "VAR_BOOL", "INPUT", "LOOP", "PRINT", "RETURN", "LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0129\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\6\"\u00c8\n\""+
		"\r\"\16\"\u00c9\3#\5#\u00cd\n#\3#\7#\u00d0\n#\f#\16#\u00d3\13#\3#\5#\u00d6"+
		"\n#\3#\6#\u00d9\n#\r#\16#\u00da\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00e6\n"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\5)\u0106\n)\3)\3)\5)\u010a\n)\7)\u010c\n)"+
		"\f)\16)\u010f\13)\3*\3*\3*\7*\u0114\n*\f*\16*\u0117\13*\3*\3*\3+\3+\3"+
		",\6,\u011e\n,\r,\16,\u011f\3,\3,\3-\3-\3-\3-\5-\u0128\n-\3\u0115\2.\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W,Y\2\3\2\7\4\2--//\3\2\62;\3\2\60\60\4\2"+
		"C\\c|\5\2\13\f\17\17\"\"\2\u0133\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2W\3\2\2\2\3[\3\2\2\2\5`\3\2\2\2\7d\3\2"+
		"\2\2\tj\3\2\2\2\13q\3\2\2\2\rv\3\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\177"+
		"\3\2\2\2\25\u0081\3\2\2\2\27\u0083\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3"+
		"\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2\2!\u008d\3\2\2\2#\u008f\3\2\2\2"+
		"%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0096\3\2\2\2+\u0099\3\2\2\2-\u009c\3"+
		"\2\2\2/\u009f\3\2\2\2\61\u00a1\3\2\2\2\63\u00a3\3\2\2\2\65\u00a5\3\2\2"+
		"\2\67\u00a7\3\2\2\29\u00ab\3\2\2\2;\u00ae\3\2\2\2=\u00b1\3\2\2\2?\u00b6"+
		"\3\2\2\2A\u00be\3\2\2\2C\u00c7\3\2\2\2E\u00cc\3\2\2\2G\u00e5\3\2\2\2I"+
		"\u00e7\3\2\2\2K\u00f1\3\2\2\2M\u00f6\3\2\2\2O\u00fc\3\2\2\2Q\u0103\3\2"+
		"\2\2S\u0110\3\2\2\2U\u011a\3\2\2\2W\u011d\3\2\2\2Y\u0127\3\2\2\2[\\\7"+
		"o\2\2\\]\7c\2\2]^\7k\2\2^_\7p\2\2_\4\3\2\2\2`a\7k\2\2ab\7p\2\2bc\7v\2"+
		"\2c\6\3\2\2\2de\7h\2\2ef\7n\2\2fg\7q\2\2gh\7c\2\2hi\7v\2\2i\b\3\2\2\2"+
		"jk\7u\2\2kl\7v\2\2lm\7t\2\2mn\7k\2\2no\7p\2\2op\7i\2\2p\n\3\2\2\2qr\7"+
		"d\2\2rs\7q\2\2st\7q\2\2tu\7n\2\2u\f\3\2\2\2vw\7h\2\2wx\7w\2\2xy\7p\2\2"+
		"yz\7e\2\2z\16\3\2\2\2{|\7*\2\2|\20\3\2\2\2}~\7+\2\2~\22\3\2\2\2\177\u0080"+
		"\7}\2\2\u0080\24\3\2\2\2\u0081\u0082\7\177\2\2\u0082\26\3\2\2\2\u0083"+
		"\u0084\7]\2\2\u0084\30\3\2\2\2\u0085\u0086\7_\2\2\u0086\32\3\2\2\2\u0087"+
		"\u0088\7-\2\2\u0088\34\3\2\2\2\u0089\u008a\7/\2\2\u008a\36\3\2\2\2\u008b"+
		"\u008c\7,\2\2\u008c \3\2\2\2\u008d\u008e\7\61\2\2\u008e\"\3\2\2\2\u008f"+
		"\u0090\7>\2\2\u0090$\3\2\2\2\u0091\u0092\7@\2\2\u0092&\3\2\2\2\u0093\u0094"+
		"\7>\2\2\u0094\u0095\7@\2\2\u0095(\3\2\2\2\u0096\u0097\7?\2\2\u0097\u0098"+
		"\7?\2\2\u0098*\3\2\2\2\u0099\u009a\7@\2\2\u009a\u009b\7?\2\2\u009b,\3"+
		"\2\2\2\u009c\u009d\7>\2\2\u009d\u009e\7?\2\2\u009e.\3\2\2\2\u009f\u00a0"+
		"\7?\2\2\u00a0\60\3\2\2\2\u00a1\u00a2\7.\2\2\u00a2\62\3\2\2\2\u00a3\u00a4"+
		"\7<\2\2\u00a4\64\3\2\2\2\u00a5\u00a6\7=\2\2\u00a6\66\3\2\2\2\u00a7\u00a8"+
		"\7C\2\2\u00a8\u00a9\7P\2\2\u00a9\u00aa\7F\2\2\u00aa8\3\2\2\2\u00ab\u00ac"+
		"\7Q\2\2\u00ac\u00ad\7T\2\2\u00ad:\3\2\2\2\u00ae\u00af\7k\2\2\u00af\u00b0"+
		"\7h\2\2\u00b0<\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4"+
		"\7u\2\2\u00b4\u00b5\7g\2\2\u00b5>\3\2\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8"+
		"\7n\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7\"\2\2\u00bb"+
		"\u00bc\7k\2\2\u00bc\u00bd\7h\2\2\u00bd@\3\2\2\2\u00be\u00bf\7r\2\2\u00bf"+
		"\u00c0\7t\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7i\2\2\u00c2\u00c3\7t\2\2"+
		"\u00c3\u00c4\7c\2\2\u00c4\u00c5\7o\2\2\u00c5B\3\2\2\2\u00c6\u00c8\5U+"+
		"\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00caD\3\2\2\2\u00cb\u00cd\t\2\2\2\u00cc\u00cb\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00d5\3\2\2\2\u00ce\u00d0\t\3\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\t\4\2\2\u00d5\u00d1\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d9\t\3\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00dbF\3\2\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7t\2\2\u00de\u00df"+
		"\7w\2\2\u00df\u00e6\7g\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7c\2\2\u00e2"+
		"\u00e3\7n\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e6\7g\2\2\u00e5\u00dc\3\2\2"+
		"\2\u00e5\u00e0\3\2\2\2\u00e6H\3\2\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7"+
		"u\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7a\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed"+
		"\7p\2\2\u00ed\u00ee\7r\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7v\2\2\u00f0"+
		"J\3\2\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7q\2\2\u00f4"+
		"\u00f5\7r\2\2\u00f5L\3\2\2\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7t\2\2\u00f8"+
		"\u00f9\7k\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7v\2\2\u00fbN\3\2\2\2\u00fc"+
		"\u00fd\7t\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7w\2\2"+
		"\u0100\u0101\7t\2\2\u0101\u0102\7p\2\2\u0102P\3\2\2\2\u0103\u010d\t\5"+
		"\2\2\u0104\u0106\7a\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u010a\t\5\2\2\u0108\u010a\5U+\2\u0109\u0107\3\2\2"+
		"\2\u0109\u0108\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0105\3\2\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010eR\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0115\7$\2\2\u0111\u0114\5Y-\2\u0112\u0114\13\2\2"+
		"\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u0119\7$\2\2\u0119T\3\2\2\2\u011a\u011b\4\62;\2\u011bV\3\2\2\2\u011c"+
		"\u011e\t\6\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b,\2\2\u0122"+
		"X\3\2\2\2\u0123\u0124\7^\2\2\u0124\u0128\7$\2\2\u0125\u0126\7^\2\2\u0126"+
		"\u0128\7^\2\2\u0127\u0123\3\2\2\2\u0127\u0125\3\2\2\2\u0128Z\3\2\2\2\20"+
		"\2\u00c9\u00cc\u00d1\u00d5\u00da\u00e5\u0105\u0109\u010d\u0113\u0115\u011f"+
		"\u0127\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}