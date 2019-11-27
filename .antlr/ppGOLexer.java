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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, FUNCTION=17, 
		LEFT_PAR=18, RIGHT_PAR=19, LEFT_BRACKET=20, RIGHT_BRACKET=21, LEFT_SBRACKET=22, 
		RIGHT_SBRACKET=23, PLUS=24, MINUS=25, TIMES=26, DIVISION=27, LESS_THAN=28, 
		GREATER_THAN=29, NOT_EQUAL=30, EQUAL_RELOP=31, GREATER_EQUAL=32, LESS_EQUAL=33, 
		EQUAL=34, SEP_COMMA=35, SEP_COLON=36, SEP_SEMICOLON=37, AND=38, OR=39, 
		IF=40, ELSE=41, ELSEIF=42, PROGRAM=43, VAR_INT=44, VAR_FLOAT=45, VAR_BOOL=46, 
		INPUT=47, LOOP=48, PRINT=49, RETURN=50, LITERAL=51, VAR_STRING=52, WHITESPACE=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "FUNCTION", 
		"LEFT_PAR", "RIGHT_PAR", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SBRACKET", 
		"RIGHT_SBRACKET", "PLUS", "MINUS", "TIMES", "DIVISION", "LESS_THAN", "GREATER_THAN", 
		"NOT_EQUAL", "EQUAL_RELOP", "GREATER_EQUAL", "LESS_EQUAL", "EQUAL", "SEP_COMMA", 
		"SEP_COLON", "SEP_SEMICOLON", "AND", "OR", "IF", "ELSE", "ELSEIF", "PROGRAM", 
		"VAR_INT", "VAR_FLOAT", "VAR_BOOL", "INPUT", "LOOP", "PRINT", "RETURN", 
		"LITERAL", "VAR_STRING", "DIGIT", "WHITESPACE", "ESC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'int'", "'float'", "'string'", "'bool'", "'midpoint'", 
		"'distance'", "'power'", "'sqrt'", "'length'", "'sort'", "'find'", "'trans'", 
		"'matSin'", "'matCos'", "'inverse'", "'func'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<>'", "'=='", 
		"'>='", "'<='", "'='", "','", "':'", "';'", "'AND'", "'OR'", "'if'", "'else'", 
		"'else if'", "'program'", null, null, null, "'usr_input'", "'loop'", "'print'", 
		"'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "FUNCTION", "LEFT_PAR", "RIGHT_PAR", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "PLUS", "MINUS", "TIMES", 
		"DIVISION", "LESS_THAN", "GREATER_THAN", "NOT_EQUAL", "EQUAL_RELOP", "GREATER_EQUAL", 
		"LESS_EQUAL", "EQUAL", "SEP_COMMA", "SEP_COLON", "SEP_SEMICOLON", "AND", 
		"OR", "IF", "ELSE", "ELSEIF", "PROGRAM", "VAR_INT", "VAR_FLOAT", "VAR_BOOL", 
		"INPUT", "LOOP", "PRINT", "RETURN", "LITERAL", "VAR_STRING", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0189\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3-\6-\u0128\n-\r-\16-\u0129\3.\5.\u012d\n.\3.\7"+
		".\u0130\n.\f.\16.\u0133\13.\3.\5.\u0136\n.\3.\6.\u0139\n.\r.\16.\u013a"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0146\n/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\5\64\u0166\n\64\3\64"+
		"\3\64\5\64\u016a\n\64\7\64\u016c\n\64\f\64\16\64\u016f\13\64\3\65\3\65"+
		"\3\65\7\65\u0174\n\65\f\65\16\65\u0177\13\65\3\65\3\65\3\66\3\66\3\67"+
		"\6\67\u017e\n\67\r\67\16\67\u017f\3\67\3\67\38\38\38\38\58\u0188\n8\3"+
		"\u0175\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\2m\67o\2\3\2\7\4\2--//\3\2\62;\3\2\60\60\4\2C\\c|\5\2\13\f\17\17"+
		"\"\"\2\u0193\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2m\3\2\2"+
		"\2\3q\3\2\2\2\5v\3\2\2\2\7z\3\2\2\2\t\u0080\3\2\2\2\13\u0087\3\2\2\2\r"+
		"\u008c\3\2\2\2\17\u0095\3\2\2\2\21\u009e\3\2\2\2\23\u00a4\3\2\2\2\25\u00a9"+
		"\3\2\2\2\27\u00b0\3\2\2\2\31\u00b5\3\2\2\2\33\u00ba\3\2\2\2\35\u00c0\3"+
		"\2\2\2\37\u00c7\3\2\2\2!\u00ce\3\2\2\2#\u00d6\3\2\2\2%\u00db\3\2\2\2\'"+
		"\u00dd\3\2\2\2)\u00df\3\2\2\2+\u00e1\3\2\2\2-\u00e3\3\2\2\2/\u00e5\3\2"+
		"\2\2\61\u00e7\3\2\2\2\63\u00e9\3\2\2\2\65\u00eb\3\2\2\2\67\u00ed\3\2\2"+
		"\29\u00ef\3\2\2\2;\u00f1\3\2\2\2=\u00f3\3\2\2\2?\u00f6\3\2\2\2A\u00f9"+
		"\3\2\2\2C\u00fc\3\2\2\2E\u00ff\3\2\2\2G\u0101\3\2\2\2I\u0103\3\2\2\2K"+
		"\u0105\3\2\2\2M\u0107\3\2\2\2O\u010b\3\2\2\2Q\u010e\3\2\2\2S\u0111\3\2"+
		"\2\2U\u0116\3\2\2\2W\u011e\3\2\2\2Y\u0127\3\2\2\2[\u012c\3\2\2\2]\u0145"+
		"\3\2\2\2_\u0147\3\2\2\2a\u0151\3\2\2\2c\u0156\3\2\2\2e\u015c\3\2\2\2g"+
		"\u0163\3\2\2\2i\u0170\3\2\2\2k\u017a\3\2\2\2m\u017d\3\2\2\2o\u0187\3\2"+
		"\2\2qr\7o\2\2rs\7c\2\2st\7k\2\2tu\7p\2\2u\4\3\2\2\2vw\7k\2\2wx\7p\2\2"+
		"xy\7v\2\2y\6\3\2\2\2z{\7h\2\2{|\7n\2\2|}\7q\2\2}~\7c\2\2~\177\7v\2\2\177"+
		"\b\3\2\2\2\u0080\u0081\7u\2\2\u0081\u0082\7v\2\2\u0082\u0083\7t\2\2\u0083"+
		"\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7i\2\2\u0086\n\3\2\2\2\u0087"+
		"\u0088\7d\2\2\u0088\u0089\7q\2\2\u0089\u008a\7q\2\2\u008a\u008b\7n\2\2"+
		"\u008b\f\3\2\2\2\u008c\u008d\7o\2\2\u008d\u008e\7k\2\2\u008e\u008f\7f"+
		"\2\2\u008f\u0090\7r\2\2\u0090\u0091\7q\2\2\u0091\u0092\7k\2\2\u0092\u0093"+
		"\7p\2\2\u0093\u0094\7v\2\2\u0094\16\3\2\2\2\u0095\u0096\7f\2\2\u0096\u0097"+
		"\7k\2\2\u0097\u0098\7u\2\2\u0098\u0099\7v\2\2\u0099\u009a\7c\2\2\u009a"+
		"\u009b\7p\2\2\u009b\u009c\7e\2\2\u009c\u009d\7g\2\2\u009d\20\3\2\2\2\u009e"+
		"\u009f\7r\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7y\2\2\u00a1\u00a2\7g\2\2"+
		"\u00a2\u00a3\7t\2\2\u00a3\22\3\2\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7"+
		"s\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7v\2\2\u00a8\24\3\2\2\2\u00a9\u00aa"+
		"\7n\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7i\2\2\u00ad"+
		"\u00ae\7v\2\2\u00ae\u00af\7j\2\2\u00af\26\3\2\2\2\u00b0\u00b1\7u\2\2\u00b1"+
		"\u00b2\7q\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7v\2\2\u00b4\30\3\2\2\2\u00b5"+
		"\u00b6\7h\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7f\2\2"+
		"\u00b9\32\3\2\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7"+
		"c\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7u\2\2\u00bf\34\3\2\2\2\u00c0\u00c1"+
		"\7o\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7U\2\2\u00c4"+
		"\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6\36\3\2\2\2\u00c7\u00c8\7o\2\2\u00c8"+
		"\u00c9\7c\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7E\2\2\u00cb\u00cc\7q\2\2"+
		"\u00cc\u00cd\7u\2\2\u00cd \3\2\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2"+
		"\2\u00d0\u00d1\7x\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4"+
		"\7u\2\2\u00d4\u00d5\7g\2\2\u00d5\"\3\2\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8"+
		"\7w\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7e\2\2\u00da$\3\2\2\2\u00db\u00dc"+
		"\7*\2\2\u00dc&\3\2\2\2\u00dd\u00de\7+\2\2\u00de(\3\2\2\2\u00df\u00e0\7"+
		"}\2\2\u00e0*\3\2\2\2\u00e1\u00e2\7\177\2\2\u00e2,\3\2\2\2\u00e3\u00e4"+
		"\7]\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7_\2\2\u00e6\60\3\2\2\2\u00e7\u00e8"+
		"\7-\2\2\u00e8\62\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea\64\3\2\2\2\u00eb\u00ec"+
		"\7,\2\2\u00ec\66\3\2\2\2\u00ed\u00ee\7\61\2\2\u00ee8\3\2\2\2\u00ef\u00f0"+
		"\7>\2\2\u00f0:\3\2\2\2\u00f1\u00f2\7@\2\2\u00f2<\3\2\2\2\u00f3\u00f4\7"+
		">\2\2\u00f4\u00f5\7@\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7\u00f8"+
		"\7?\2\2\u00f8@\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa\u00fb\7?\2\2\u00fbB\3"+
		"\2\2\2\u00fc\u00fd\7>\2\2\u00fd\u00fe\7?\2\2\u00feD\3\2\2\2\u00ff\u0100"+
		"\7?\2\2\u0100F\3\2\2\2\u0101\u0102\7.\2\2\u0102H\3\2\2\2\u0103\u0104\7"+
		"<\2\2\u0104J\3\2\2\2\u0105\u0106\7=\2\2\u0106L\3\2\2\2\u0107\u0108\7C"+
		"\2\2\u0108\u0109\7P\2\2\u0109\u010a\7F\2\2\u010aN\3\2\2\2\u010b\u010c"+
		"\7Q\2\2\u010c\u010d\7T\2\2\u010dP\3\2\2\2\u010e\u010f\7k\2\2\u010f\u0110"+
		"\7h\2\2\u0110R\3\2\2\2\u0111\u0112\7g\2\2\u0112\u0113\7n\2\2\u0113\u0114"+
		"\7u\2\2\u0114\u0115\7g\2\2\u0115T\3\2\2\2\u0116\u0117\7g\2\2\u0117\u0118"+
		"\7n\2\2\u0118\u0119\7u\2\2\u0119\u011a\7g\2\2\u011a\u011b\7\"\2\2\u011b"+
		"\u011c\7k\2\2\u011c\u011d\7h\2\2\u011dV\3\2\2\2\u011e\u011f\7r\2\2\u011f"+
		"\u0120\7t\2\2\u0120\u0121\7q\2\2\u0121\u0122\7i\2\2\u0122\u0123\7t\2\2"+
		"\u0123\u0124\7c\2\2\u0124\u0125\7o\2\2\u0125X\3\2\2\2\u0126\u0128\5k\66"+
		"\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012aZ\3\2\2\2\u012b\u012d\t\2\2\2\u012c\u012b\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u0135\3\2\2\2\u012e\u0130\t\3\2\2\u012f\u012e\3\2"+
		"\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136\t\4\2\2\u0135\u0131\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\t\3\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\\\3\2\2\2\u013c\u013d\7v\2\2\u013d\u013e\7t\2\2\u013e\u013f"+
		"\7w\2\2\u013f\u0146\7g\2\2\u0140\u0141\7h\2\2\u0141\u0142\7c\2\2\u0142"+
		"\u0143\7n\2\2\u0143\u0144\7u\2\2\u0144\u0146\7g\2\2\u0145\u013c\3\2\2"+
		"\2\u0145\u0140\3\2\2\2\u0146^\3\2\2\2\u0147\u0148\7w\2\2\u0148\u0149\7"+
		"u\2\2\u0149\u014a\7t\2\2\u014a\u014b\7a\2\2\u014b\u014c\7k\2\2\u014c\u014d"+
		"\7p\2\2\u014d\u014e\7r\2\2\u014e\u014f\7w\2\2\u014f\u0150\7v\2\2\u0150"+
		"`\3\2\2\2\u0151\u0152\7n\2\2\u0152\u0153\7q\2\2\u0153\u0154\7q\2\2\u0154"+
		"\u0155\7r\2\2\u0155b\3\2\2\2\u0156\u0157\7r\2\2\u0157\u0158\7t\2\2\u0158"+
		"\u0159\7k\2\2\u0159\u015a\7p\2\2\u015a\u015b\7v\2\2\u015bd\3\2\2\2\u015c"+
		"\u015d\7t\2\2\u015d\u015e\7g\2\2\u015e\u015f\7v\2\2\u015f\u0160\7w\2\2"+
		"\u0160\u0161\7t\2\2\u0161\u0162\7p\2\2\u0162f\3\2\2\2\u0163\u016d\t\5"+
		"\2\2\u0164\u0166\7a\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u016a\t\5\2\2\u0168\u016a\5k\66\2\u0169\u0167\3\2"+
		"\2\2\u0169\u0168\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0165\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016eh\3\2\2\2"+
		"\u016f\u016d\3\2\2\2\u0170\u0175\7$\2\2\u0171\u0174\5o8\2\u0172\u0174"+
		"\13\2\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2"+
		"\u0175\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u0179\7$\2\2\u0179j\3\2\2\2\u017a\u017b\4\62;\2\u017bl"+
		"\3\2\2\2\u017c\u017e\t\6\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\b\67"+
		"\2\2\u0182n\3\2\2\2\u0183\u0184\7^\2\2\u0184\u0188\7$\2\2\u0185\u0186"+
		"\7^\2\2\u0186\u0188\7^\2\2\u0187\u0183\3\2\2\2\u0187\u0185\3\2\2\2\u0188"+
		"p\3\2\2\2\20\2\u0129\u012c\u0131\u0135\u013a\u0145\u0165\u0169\u016d\u0173"+
		"\u0175\u017f\u0187\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}