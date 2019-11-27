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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, FUNCTION=20, LEFT_PAR=21, RIGHT_PAR=22, LEFT_BRACKET=23, 
		RIGHT_BRACKET=24, LEFT_SBRACKET=25, RIGHT_SBRACKET=26, PLUS=27, MINUS=28, 
		TIMES=29, DIVISION=30, LESS_THAN=31, GREATER_THAN=32, NOT_EQUAL=33, EQUAL_RELOP=34, 
		GREATER_EQUAL=35, LESS_EQUAL=36, EQUAL=37, SEP_COMMA=38, SEP_COLON=39, 
		SEP_SEMICOLON=40, AND=41, OR=42, IF=43, ELSE=44, ELSEIF=45, PROGRAM=46, 
		VAR_INT=47, VAR_FLOAT=48, VAR_BOOL=49, INPUT=50, LOOP=51, PRINT=52, RETURN=53, 
		LITERAL=54, VAR_STRING=55, WHITESPACE=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "FUNCTION", "LEFT_PAR", "RIGHT_PAR", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "PLUS", "MINUS", "TIMES", 
		"DIVISION", "LESS_THAN", "GREATER_THAN", "NOT_EQUAL", "EQUAL_RELOP", "GREATER_EQUAL", 
		"LESS_EQUAL", "EQUAL", "SEP_COMMA", "SEP_COLON", "SEP_SEMICOLON", "AND", 
		"OR", "IF", "ELSE", "ELSEIF", "PROGRAM", "VAR_INT", "VAR_FLOAT", "VAR_BOOL", 
		"INPUT", "LOOP", "PRINT", "RETURN", "LITERAL", "VAR_STRING", "DIGIT", 
		"WHITESPACE", "ESC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'int'", "'float'", "'string'", "'bool'", "'midpoint'", 
		"'distance'", "'power'", "'sqrt'", "'length'", "'sort'", "'find'", "'trans'", 
		"'matSin'", "'matCos'", "'inverse'", "'matmult'", "'matsum'", "'matsubs'", 
		"'func'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'+'", "'-'", "'*'", 
		"'/'", "'<'", "'>'", "'<>'", "'=='", "'>='", "'<='", "'='", "','", "':'", 
		"';'", "'AND'", "'OR'", "'if'", "'else'", "'else if'", "'program'", null, 
		null, null, "'usr_input'", "'loop'", "'print'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "FUNCTION", "LEFT_PAR", 
		"RIGHT_PAR", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", 
		"PLUS", "MINUS", "TIMES", "DIVISION", "LESS_THAN", "GREATER_THAN", "NOT_EQUAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01a6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3+\3+\3+\3,"+
		"\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3\60\6\60\u0145\n\60\r\60\16\60\u0146\3\61\5\61\u014a\n\61\3\61\7\61"+
		"\u014d\n\61\f\61\16\61\u0150\13\61\3\61\5\61\u0153\n\61\3\61\6\61\u0156"+
		"\n\61\r\61\16\61\u0157\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5"+
		"\62\u0163\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\5\67\u0183\n\67\3\67\3\67\5\67\u0187\n\67\7"+
		"\67\u0189\n\67\f\67\16\67\u018c\13\67\38\38\38\78\u0191\n8\f8\168\u0194"+
		"\138\38\38\39\39\3:\6:\u019b\n:\r:\16:\u019c\3:\3:\3;\3;\3;\3;\5;\u01a5"+
		"\n;\3\u0192\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q\2s:u\2\3\2\7\4\2--//\3\2\62;\3\2\60\60\4\2C\\c|\5\2\13"+
		"\f\17\17\"\"\2\u01b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2s\3\2\2\2\3w\3\2\2\2\5|\3\2\2\2\7\u0080"+
		"\3\2\2\2\t\u0086\3\2\2\2\13\u008d\3\2\2\2\r\u0092\3\2\2\2\17\u009b\3\2"+
		"\2\2\21\u00a4\3\2\2\2\23\u00aa\3\2\2\2\25\u00af\3\2\2\2\27\u00b6\3\2\2"+
		"\2\31\u00bb\3\2\2\2\33\u00c0\3\2\2\2\35\u00c6\3\2\2\2\37\u00cd\3\2\2\2"+
		"!\u00d4\3\2\2\2#\u00dc\3\2\2\2%\u00e4\3\2\2\2\'\u00eb\3\2\2\2)\u00f3\3"+
		"\2\2\2+\u00f8\3\2\2\2-\u00fa\3\2\2\2/\u00fc\3\2\2\2\61\u00fe\3\2\2\2\63"+
		"\u0100\3\2\2\2\65\u0102\3\2\2\2\67\u0104\3\2\2\29\u0106\3\2\2\2;\u0108"+
		"\3\2\2\2=\u010a\3\2\2\2?\u010c\3\2\2\2A\u010e\3\2\2\2C\u0110\3\2\2\2E"+
		"\u0113\3\2\2\2G\u0116\3\2\2\2I\u0119\3\2\2\2K\u011c\3\2\2\2M\u011e\3\2"+
		"\2\2O\u0120\3\2\2\2Q\u0122\3\2\2\2S\u0124\3\2\2\2U\u0128\3\2\2\2W\u012b"+
		"\3\2\2\2Y\u012e\3\2\2\2[\u0133\3\2\2\2]\u013b\3\2\2\2_\u0144\3\2\2\2a"+
		"\u0149\3\2\2\2c\u0162\3\2\2\2e\u0164\3\2\2\2g\u016e\3\2\2\2i\u0173\3\2"+
		"\2\2k\u0179\3\2\2\2m\u0180\3\2\2\2o\u018d\3\2\2\2q\u0197\3\2\2\2s\u019a"+
		"\3\2\2\2u\u01a4\3\2\2\2wx\7o\2\2xy\7c\2\2yz\7k\2\2z{\7p\2\2{\4\3\2\2\2"+
		"|}\7k\2\2}~\7p\2\2~\177\7v\2\2\177\6\3\2\2\2\u0080\u0081\7h\2\2\u0081"+
		"\u0082\7n\2\2\u0082\u0083\7q\2\2\u0083\u0084\7c\2\2\u0084\u0085\7v\2\2"+
		"\u0085\b\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t"+
		"\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7i\2\2\u008c\n"+
		"\3\2\2\2\u008d\u008e\7d\2\2\u008e\u008f\7q\2\2\u008f\u0090\7q\2\2\u0090"+
		"\u0091\7n\2\2\u0091\f\3\2\2\2\u0092\u0093\7o\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7f\2\2\u0095\u0096\7r\2\2\u0096\u0097\7q\2\2\u0097\u0098\7k\2\2"+
		"\u0098\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a\16\3\2\2\2\u009b\u009c\7"+
		"f\2\2\u009c\u009d\7k\2\2\u009d\u009e\7u\2\2\u009e\u009f\7v\2\2\u009f\u00a0"+
		"\7c\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\20\3\2\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7y\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7t\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7u\2\2\u00ab"+
		"\u00ac\7s\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7v\2\2\u00ae\24\3\2\2\2\u00af"+
		"\u00b0\7n\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7i\2\2"+
		"\u00b3\u00b4\7v\2\2\u00b4\u00b5\7j\2\2\u00b5\26\3\2\2\2\u00b6\u00b7\7"+
		"u\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7v\2\2\u00ba\30"+
		"\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be"+
		"\u00bf\7f\2\2\u00bf\32\3\2\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7u\2\2\u00c5\34\3\2\2\2\u00c6"+
		"\u00c7\7o\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7U\2\2"+
		"\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\36\3\2\2\2\u00cd\u00ce\7"+
		"o\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7E\2\2\u00d1\u00d2"+
		"\7q\2\2\u00d2\u00d3\7u\2\2\u00d3 \3\2\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6"+
		"\7p\2\2\u00d6\u00d7\7x\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7t\2\2\u00d9"+
		"\u00da\7u\2\2\u00da\u00db\7g\2\2\u00db\"\3\2\2\2\u00dc\u00dd\7o\2\2\u00dd"+
		"\u00de\7c\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7w\2\2"+
		"\u00e1\u00e2\7n\2\2\u00e2\u00e3\7v\2\2\u00e3$\3\2\2\2\u00e4\u00e5\7o\2"+
		"\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9"+
		"\7w\2\2\u00e9\u00ea\7o\2\2\u00ea&\3\2\2\2\u00eb\u00ec\7o\2\2\u00ec\u00ed"+
		"\7c\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7w\2\2\u00f0"+
		"\u00f1\7d\2\2\u00f1\u00f2\7u\2\2\u00f2(\3\2\2\2\u00f3\u00f4\7h\2\2\u00f4"+
		"\u00f5\7w\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7e\2\2\u00f7*\3\2\2\2\u00f8"+
		"\u00f9\7*\2\2\u00f9,\3\2\2\2\u00fa\u00fb\7+\2\2\u00fb.\3\2\2\2\u00fc\u00fd"+
		"\7}\2\2\u00fd\60\3\2\2\2\u00fe\u00ff\7\177\2\2\u00ff\62\3\2\2\2\u0100"+
		"\u0101\7]\2\2\u0101\64\3\2\2\2\u0102\u0103\7_\2\2\u0103\66\3\2\2\2\u0104"+
		"\u0105\7-\2\2\u01058\3\2\2\2\u0106\u0107\7/\2\2\u0107:\3\2\2\2\u0108\u0109"+
		"\7,\2\2\u0109<\3\2\2\2\u010a\u010b\7\61\2\2\u010b>\3\2\2\2\u010c\u010d"+
		"\7>\2\2\u010d@\3\2\2\2\u010e\u010f\7@\2\2\u010fB\3\2\2\2\u0110\u0111\7"+
		">\2\2\u0111\u0112\7@\2\2\u0112D\3\2\2\2\u0113\u0114\7?\2\2\u0114\u0115"+
		"\7?\2\2\u0115F\3\2\2\2\u0116\u0117\7@\2\2\u0117\u0118\7?\2\2\u0118H\3"+
		"\2\2\2\u0119\u011a\7>\2\2\u011a\u011b\7?\2\2\u011bJ\3\2\2\2\u011c\u011d"+
		"\7?\2\2\u011dL\3\2\2\2\u011e\u011f\7.\2\2\u011fN\3\2\2\2\u0120\u0121\7"+
		"<\2\2\u0121P\3\2\2\2\u0122\u0123\7=\2\2\u0123R\3\2\2\2\u0124\u0125\7C"+
		"\2\2\u0125\u0126\7P\2\2\u0126\u0127\7F\2\2\u0127T\3\2\2\2\u0128\u0129"+
		"\7Q\2\2\u0129\u012a\7T\2\2\u012aV\3\2\2\2\u012b\u012c\7k\2\2\u012c\u012d"+
		"\7h\2\2\u012dX\3\2\2\2\u012e\u012f\7g\2\2\u012f\u0130\7n\2\2\u0130\u0131"+
		"\7u\2\2\u0131\u0132\7g\2\2\u0132Z\3\2\2\2\u0133\u0134\7g\2\2\u0134\u0135"+
		"\7n\2\2\u0135\u0136\7u\2\2\u0136\u0137\7g\2\2\u0137\u0138\7\"\2\2\u0138"+
		"\u0139\7k\2\2\u0139\u013a\7h\2\2\u013a\\\3\2\2\2\u013b\u013c\7r\2\2\u013c"+
		"\u013d\7t\2\2\u013d\u013e\7q\2\2\u013e\u013f\7i\2\2\u013f\u0140\7t\2\2"+
		"\u0140\u0141\7c\2\2\u0141\u0142\7o\2\2\u0142^\3\2\2\2\u0143\u0145\5q9"+
		"\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147`\3\2\2\2\u0148\u014a\t\2\2\2\u0149\u0148\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u0152\3\2\2\2\u014b\u014d\t\3\2\2\u014c\u014b\3\2"+
		"\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\t\4\2\2\u0152\u014e\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0156\t\3\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158b\3\2\2\2\u0159\u015a\7v\2\2\u015a\u015b\7t\2\2\u015b\u015c"+
		"\7w\2\2\u015c\u0163\7g\2\2\u015d\u015e\7h\2\2\u015e\u015f\7c\2\2\u015f"+
		"\u0160\7n\2\2\u0160\u0161\7u\2\2\u0161\u0163\7g\2\2\u0162\u0159\3\2\2"+
		"\2\u0162\u015d\3\2\2\2\u0163d\3\2\2\2\u0164\u0165\7w\2\2\u0165\u0166\7"+
		"u\2\2\u0166\u0167\7t\2\2\u0167\u0168\7a\2\2\u0168\u0169\7k\2\2\u0169\u016a"+
		"\7p\2\2\u016a\u016b\7r\2\2\u016b\u016c\7w\2\2\u016c\u016d\7v\2\2\u016d"+
		"f\3\2\2\2\u016e\u016f\7n\2\2\u016f\u0170\7q\2\2\u0170\u0171\7q\2\2\u0171"+
		"\u0172\7r\2\2\u0172h\3\2\2\2\u0173\u0174\7r\2\2\u0174\u0175\7t\2\2\u0175"+
		"\u0176\7k\2\2\u0176\u0177\7p\2\2\u0177\u0178\7v\2\2\u0178j\3\2\2\2\u0179"+
		"\u017a\7t\2\2\u017a\u017b\7g\2\2\u017b\u017c\7v\2\2\u017c\u017d\7w\2\2"+
		"\u017d\u017e\7t\2\2\u017e\u017f\7p\2\2\u017fl\3\2\2\2\u0180\u018a\t\5"+
		"\2\2\u0181\u0183\7a\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0187\t\5\2\2\u0185\u0187\5q9\2\u0186\u0184\3\2\2"+
		"\2\u0186\u0185\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0182\3\2\2\2\u0189\u018c"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018bn\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u0192\7$\2\2\u018e\u0191\5u;\2\u018f\u0191\13\2\2"+
		"\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195"+
		"\u0196\7$\2\2\u0196p\3\2\2\2\u0197\u0198\4\62;\2\u0198r\3\2\2\2\u0199"+
		"\u019b\t\6\2\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\b:\2\2\u019f"+
		"t\3\2\2\2\u01a0\u01a1\7^\2\2\u01a1\u01a5\7$\2\2\u01a2\u01a3\7^\2\2\u01a3"+
		"\u01a5\7^\2\2\u01a4\u01a0\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5v\3\2\2\2\20"+
		"\2\u0146\u0149\u014e\u0152\u0157\u0162\u0182\u0186\u018a\u0190\u0192\u019c"+
		"\u01a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}