// Generated from /Users/Pato/Desktop/ppGO/arbol/ppGO.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ppGOParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_modulo = 2, RULE_tipo = 3, RULE_args = 4, 
		RULE_body = 5, RULE_block = 6, RULE_varsDec = 7, RULE_assigment = 8, RULE_condition = 9, 
		RULE_elseif = 10, RULE_elsee = 11, RULE_expression = 12, RULE_expression1 = 13, 
		RULE_exp = 14, RULE_term = 15, RULE_factor = 16, RULE_loop = 17, RULE_funcCall = 18, 
		RULE_read = 19, RULE_print2 = 20, RULE_return2 = 21;
	public static final String[] ruleNames = {
		"program", "main", "modulo", "tipo", "args", "body", "block", "varsDec", 
		"assigment", "condition", "elseif", "elsee", "expression", "expression1", 
		"exp", "term", "factor", "loop", "funcCall", "read", "print2", "return2"
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

	@Override
	public String getGrammarFileName() { return "ppGO.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ppGOParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(ppGOParser.PROGRAM, 0); }
		public TerminalNode LITERAL() { return getToken(ppGOParser.LITERAL, 0); }
		public TerminalNode SEP_COLON() { return getToken(ppGOParser.SEP_COLON, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<VarsDecContext> varsDec() {
			return getRuleContexts(VarsDecContext.class);
		}
		public VarsDecContext varsDec(int i) {
			return getRuleContext(VarsDecContext.class,i);
		}
		public List<ModuloContext> modulo() {
			return getRuleContexts(ModuloContext.class);
		}
		public ModuloContext modulo(int i) {
			return getRuleContext(ModuloContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(PROGRAM);
			setState(45);
			match(LITERAL);
			setState(46);
			match(SEP_COLON);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					varsDec();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					modulo();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(59);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ppGOParser.FUNCTION, 0); }
		public TerminalNode LEFT_PAR() { return getToken(ppGOParser.LEFT_PAR, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(ppGOParser.RIGHT_PAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(FUNCTION);
			setState(62);
			match(T__0);
			setState(63);
			match(LEFT_PAR);
			setState(64);
			match(RIGHT_PAR);
			setState(65);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuloContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ppGOParser.FUNCTION, 0); }
		public TerminalNode LITERAL() { return getToken(ppGOParser.LITERAL, 0); }
		public TerminalNode LEFT_PAR() { return getToken(ppGOParser.LEFT_PAR, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(ppGOParser.RIGHT_PAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(67);
				tipo();
				}
			}

			setState(70);
			match(FUNCTION);
			setState(71);
			match(LITERAL);
			setState(72);
			match(LEFT_PAR);
			setState(73);
			args();
			setState(74);
			match(RIGHT_PAR);
			setState(75);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(ppGOParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(ppGOParser.LITERAL, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(79);
				tipo();
				setState(80);
				match(LITERAL);
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP_COMMA) {
					{
					{
					setState(82);
					match(SEP_COMMA);
					setState(83);
					tipo();
					setState(84);
					match(LITERAL);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(ppGOParser.LEFT_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ppGOParser.RIGHT_BRACKET, 0); }
		public List<VarsDecContext> varsDec() {
			return getRuleContexts(VarsDecContext.class);
		}
		public VarsDecContext varsDec(int i) {
			return getRuleContext(VarsDecContext.class,i);
		}
		public Return2Context return2() {
			return getRuleContext(Return2Context.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LEFT_BRACKET);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(94);
				varsDec();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			block();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(101);
				return2();
				}
			}

			setState(104);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<FuncCallContext> funcCall() {
			return getRuleContexts(FuncCallContext.class);
		}
		public FuncCallContext funcCall(int i) {
			return getRuleContext(FuncCallContext.class,i);
		}
		public List<AssigmentContext> assigment() {
			return getRuleContexts(AssigmentContext.class);
		}
		public AssigmentContext assigment(int i) {
			return getRuleContext(AssigmentContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<Print2Context> print2() {
			return getRuleContexts(Print2Context.class);
		}
		public Print2Context print2(int i) {
			return getRuleContext(Print2Context.class,i);
		}
		public List<ReadContext> read() {
			return getRuleContexts(ReadContext.class);
		}
		public ReadContext read(int i) {
			return getRuleContext(ReadContext.class,i);
		}
		public Return2Context return2() {
			return getRuleContext(Return2Context.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << INPUT) | (1L << LOOP) | (1L << PRINT) | (1L << LITERAL))) != 0)) {
				{
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(106);
					funcCall();
					}
					break;
				case 2:
					{
					setState(107);
					assigment();
					}
					break;
				case 3:
					{
					setState(108);
					condition();
					}
					break;
				case 4:
					{
					setState(109);
					loop();
					}
					break;
				case 5:
					{
					setState(110);
					print2();
					}
					break;
				case 6:
					{
					setState(111);
					read();
					}
					break;
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(117);
				return2();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsDecContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> LITERAL() { return getTokens(ppGOParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(ppGOParser.LITERAL, i);
		}
		public List<TerminalNode> SEP_COMMA() { return getTokens(ppGOParser.SEP_COMMA); }
		public TerminalNode SEP_COMMA(int i) {
			return getToken(ppGOParser.SEP_COMMA, i);
		}
		public List<TerminalNode> LEFT_SBRACKET() { return getTokens(ppGOParser.LEFT_SBRACKET); }
		public TerminalNode LEFT_SBRACKET(int i) {
			return getToken(ppGOParser.LEFT_SBRACKET, i);
		}
		public List<TerminalNode> RIGHT_SBRACKET() { return getTokens(ppGOParser.RIGHT_SBRACKET); }
		public TerminalNode RIGHT_SBRACKET(int i) {
			return getToken(ppGOParser.RIGHT_SBRACKET, i);
		}
		public List<TerminalNode> VAR_INT() { return getTokens(ppGOParser.VAR_INT); }
		public TerminalNode VAR_INT(int i) {
			return getToken(ppGOParser.VAR_INT, i);
		}
		public VarsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsDec; }
	}

	public final VarsDecContext varsDec() throws RecognitionException {
		VarsDecContext _localctx = new VarsDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varsDec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			tipo();
			setState(136); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(121);
					match(LITERAL);
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_SBRACKET) {
						{
						{
						setState(122);
						match(LEFT_SBRACKET);
						{
						setState(123);
						match(VAR_INT);
						}
						setState(124);
						match(RIGHT_SBRACKET);
						}
						setState(129);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LEFT_SBRACKET) {
							{
							setState(126);
							match(LEFT_SBRACKET);
							{
							setState(127);
							match(VAR_INT);
							}
							setState(128);
							match(RIGHT_SBRACKET);
							}
						}

						}
					}

					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEP_COMMA) {
						{
						setState(133);
						match(SEP_COMMA);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(138); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigmentContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(ppGOParser.LITERAL, 0); }
		public TerminalNode EQUAL() { return getToken(ppGOParser.EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEP_SEMICOLON() { return getToken(ppGOParser.SEP_SEMICOLON, 0); }
		public List<TerminalNode> LEFT_SBRACKET() { return getTokens(ppGOParser.LEFT_SBRACKET); }
		public TerminalNode LEFT_SBRACKET(int i) {
			return getToken(ppGOParser.LEFT_SBRACKET, i);
		}
		public List<TerminalNode> RIGHT_SBRACKET() { return getTokens(ppGOParser.RIGHT_SBRACKET); }
		public TerminalNode RIGHT_SBRACKET(int i) {
			return getToken(ppGOParser.RIGHT_SBRACKET, i);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assigment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(LITERAL);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_SBRACKET) {
				{
				{
				setState(141);
				match(LEFT_SBRACKET);
				{
				setState(142);
				expression();
				}
				setState(143);
				match(RIGHT_SBRACKET);
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_SBRACKET) {
					{
					setState(145);
					match(LEFT_SBRACKET);
					{
					setState(146);
					expression();
					}
					setState(147);
					match(RIGHT_SBRACKET);
					}
				}

				}
			}

			setState(153);
			match(EQUAL);
			setState(154);
			expression();
			setState(155);
			match(SEP_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ppGOParser.IF, 0); }
		public TerminalNode LEFT_PAR() { return getToken(ppGOParser.LEFT_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(ppGOParser.RIGHT_PAR, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(ppGOParser.LEFT_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ppGOParser.RIGHT_BRACKET, 0); }
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public ElseeContext elsee() {
			return getRuleContext(ElseeContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(IF);
			setState(158);
			match(LEFT_PAR);
			setState(159);
			expression();
			setState(160);
			match(RIGHT_PAR);
			setState(161);
			match(LEFT_BRACKET);
			setState(162);
			block();
			setState(163);
			match(RIGHT_BRACKET);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(164);
				elseif();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(170);
				elsee();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(ppGOParser.ELSEIF, 0); }
		public TerminalNode LEFT_PAR() { return getToken(ppGOParser.LEFT_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(ppGOParser.RIGHT_PAR, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(ppGOParser.LEFT_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ppGOParser.RIGHT_BRACKET, 0); }
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ELSEIF);
			setState(174);
			match(LEFT_PAR);
			setState(175);
			expression();
			setState(176);
			match(RIGHT_PAR);
			setState(177);
			match(LEFT_BRACKET);
			setState(178);
			block();
			setState(179);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseeContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ppGOParser.ELSE, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(ppGOParser.LEFT_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ppGOParser.RIGHT_BRACKET, 0); }
		public ElseeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsee; }
	}

	public final ElseeContext elsee() throws RecognitionException {
		ElseeContext _localctx = new ElseeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elsee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(ELSE);
			setState(182);
			match(LEFT_BRACKET);
			setState(183);
			block();
			setState(184);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public TerminalNode AND() { return getToken(ppGOParser.AND, 0); }
		public TerminalNode OR() { return getToken(ppGOParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			expression1();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND || _la==OR) {
				{
				setState(187);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(188);
				expression1();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression1Context extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(ppGOParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(ppGOParser.LESS_THAN, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(ppGOParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(ppGOParser.LESS_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(ppGOParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL_RELOP() { return getToken(ppGOParser.EQUAL_RELOP, 0); }
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
	}

	public final Expression1Context expression1() throws RecognitionException {
		Expression1Context _localctx = new Expression1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			exp();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << NOT_EQUAL) | (1L << EQUAL_RELOP) | (1L << GREATER_EQUAL) | (1L << LESS_EQUAL))) != 0)) {
				{
				setState(192);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << NOT_EQUAL) | (1L << EQUAL_RELOP) | (1L << GREATER_EQUAL) | (1L << LESS_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(193);
				exp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ppGOParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ppGOParser.MINUS, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			term();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(198);
				exp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(ppGOParser.TIMES, 0); }
		public TerminalNode DIVISION() { return getToken(ppGOParser.DIVISION, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			factor();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES || _la==DIVISION) {
				{
				setState(202);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIVISION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(203);
				term();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LEFT_PAR() { return getToken(ppGOParser.LEFT_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAR() { return getToken(ppGOParser.RIGHT_PAR, 0); }
		public TerminalNode LITERAL() { return getToken(ppGOParser.LITERAL, 0); }
		public List<TerminalNode> LEFT_SBRACKET() { return getTokens(ppGOParser.LEFT_SBRACKET); }
		public TerminalNode LEFT_SBRACKET(int i) {
			return getToken(ppGOParser.LEFT_SBRACKET, i);
		}
		public List<TerminalNode> RIGHT_SBRACKET() { return getTokens(ppGOParser.RIGHT_SBRACKET); }
		public TerminalNode RIGHT_SBRACKET(int i) {
			return getToken(ppGOParser.RIGHT_SBRACKET, i);
		}
		public TerminalNode VAR_INT() { return getToken(ppGOParser.VAR_INT, 0); }
		public TerminalNode VAR_FLOAT() { return getToken(ppGOParser.VAR_FLOAT, 0); }
		public TerminalNode VAR_BOOL() { return getToken(ppGOParser.VAR_BOOL, 0); }
		public TerminalNode VAR_STRING() { return getToken(ppGOParser.VAR_STRING, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		int _la;
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(LEFT_PAR);
				setState(207);
				expression();
				setState(208);
				match(RIGHT_PAR);
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(LITERAL);
				setState(234);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RIGHT_PAR:
				case RIGHT_BRACKET:
				case LEFT_SBRACKET:
				case RIGHT_SBRACKET:
				case PLUS:
				case MINUS:
				case TIMES:
				case DIVISION:
				case LESS_THAN:
				case GREATER_THAN:
				case NOT_EQUAL:
				case EQUAL_RELOP:
				case GREATER_EQUAL:
				case LESS_EQUAL:
				case SEP_COMMA:
				case SEP_SEMICOLON:
				case AND:
				case OR:
				case RETURN:
					{
					{
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_SBRACKET) {
						{
						{
						setState(211);
						match(LEFT_SBRACKET);
						{
						setState(212);
						expression();
						}
						setState(213);
						match(RIGHT_SBRACKET);
						}
						setState(219);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LEFT_SBRACKET) {
							{
							setState(215);
							match(LEFT_SBRACKET);
							{
							setState(216);
							expression();
							}
							setState(217);
							match(RIGHT_SBRACKET);
							}
						}

						}
					}

					}
					}
					break;
				case LEFT_PAR:
					{
					setState(223);
					match(LEFT_PAR);
					setState(224);
					expression();
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEP_COMMA) {
						{
						{
						setState(225);
						match(SEP_COMMA);
						setState(226);
						expression();
						}
						}
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(232);
					match(RIGHT_PAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case VAR_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(VAR_INT);
				}
				break;
			case VAR_FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(VAR_FLOAT);
				}
				break;
			case VAR_BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(VAR_BOOL);
				}
				break;
			case VAR_STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				match(VAR_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(ppGOParser.LOOP, 0); }
		public TerminalNode LEFT_PAR() { return getToken(ppGOParser.LEFT_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(ppGOParser.RIGHT_PAR, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(ppGOParser.LEFT_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ppGOParser.RIGHT_BRACKET, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(LOOP);
			setState(243);
			match(LEFT_PAR);
			setState(244);
			expression();
			setState(245);
			match(RIGHT_PAR);
			setState(246);
			match(LEFT_BRACKET);
			setState(247);
			block();
			setState(248);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(ppGOParser.LITERAL, 0); }
		public TerminalNode LEFT_PAR() { return getToken(ppGOParser.LEFT_PAR, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(ppGOParser.RIGHT_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(LITERAL);
			setState(251);
			match(LEFT_PAR);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAR) | (1L << VAR_INT) | (1L << VAR_FLOAT) | (1L << VAR_BOOL) | (1L << LITERAL) | (1L << VAR_STRING))) != 0)) {
				{
				{
				setState(252);
				expression();
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP_COMMA) {
					{
					{
					setState(253);
					match(SEP_COMMA);
					setState(254);
					expression();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(262);
			match(RIGHT_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(ppGOParser.INPUT, 0); }
		public TerminalNode LEFT_PAR() { return getToken(ppGOParser.LEFT_PAR, 0); }
		public TerminalNode LITERAL() { return getToken(ppGOParser.LITERAL, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(ppGOParser.RIGHT_PAR, 0); }
		public List<TerminalNode> LEFT_SBRACKET() { return getTokens(ppGOParser.LEFT_SBRACKET); }
		public TerminalNode LEFT_SBRACKET(int i) {
			return getToken(ppGOParser.LEFT_SBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHT_SBRACKET() { return getTokens(ppGOParser.RIGHT_SBRACKET); }
		public TerminalNode RIGHT_SBRACKET(int i) {
			return getToken(ppGOParser.RIGHT_SBRACKET, i);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(INPUT);
			setState(265);
			match(LEFT_PAR);
			{
			setState(266);
			match(LITERAL);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_SBRACKET) {
				{
				{
				setState(267);
				match(LEFT_SBRACKET);
				setState(268);
				expression();
				setState(269);
				match(RIGHT_SBRACKET);
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_SBRACKET) {
					{
					setState(271);
					match(LEFT_SBRACKET);
					setState(272);
					expression();
					setState(273);
					match(RIGHT_SBRACKET);
					}
				}

				}
			}

			setState(279);
			match(RIGHT_PAR);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print2Context extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ppGOParser.PRINT, 0); }
		public TerminalNode LEFT_PAR() { return getToken(ppGOParser.LEFT_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(ppGOParser.RIGHT_PAR, 0); }
		public Print2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print2; }
	}

	public final Print2Context print2() throws RecognitionException {
		Print2Context _localctx = new Print2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_print2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(PRINT);
			setState(282);
			match(LEFT_PAR);
			setState(283);
			expression();
			setState(284);
			match(RIGHT_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return2Context extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ppGOParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return2; }
	}

	public final Return2Context return2() throws RecognitionException {
		Return2Context _localctx = new Return2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_return2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(RETURN);
			setState(287);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0124\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\5\4G\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\5\6^\n\6\3\7\3\7\7\7b"+
		"\n\7\f\7\16\7e\13\7\3\7\3\7\5\7i\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\bs\n\b\f\b\16\bv\13\b\3\b\5\by\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0084\n\t\5\t\u0086\n\t\3\t\5\t\u0089\n\t\6\t\u008b\n\t\r\t\16"+
		"\t\u008c\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0098\n\n\5\n\u009a\n"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a8"+
		"\n\13\f\13\16\13\u00ab\13\13\3\13\5\13\u00ae\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00c0\n\16\3\17\3"+
		"\17\3\17\5\17\u00c5\n\17\3\20\3\20\3\20\5\20\u00ca\n\20\3\21\3\21\3\21"+
		"\5\21\u00cf\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00de\n\22\5\22\u00e0\n\22\3\22\3\22\3\22\3\22\7\22\u00e6"+
		"\n\22\f\22\16\22\u00e9\13\22\3\22\3\22\5\22\u00ed\n\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00f3\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u0102\n\24\f\24\16\24\u0105\13\24\5\24\u0107\n\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0116\n\25\5\25\u0118\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2"+
		"\7\3\2\4\7\3\2\35\36\3\2\23\30\3\2\17\20\3\2\21\22\2\u0134\2.\3\2\2\2"+
		"\4?\3\2\2\2\6F\3\2\2\2\bO\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16t\3\2\2\2\20"+
		"z\3\2\2\2\22\u008e\3\2\2\2\24\u009f\3\2\2\2\26\u00af\3\2\2\2\30\u00b7"+
		"\3\2\2\2\32\u00bc\3\2\2\2\34\u00c1\3\2\2\2\36\u00c6\3\2\2\2 \u00cb\3\2"+
		"\2\2\"\u00f2\3\2\2\2$\u00f4\3\2\2\2&\u00fc\3\2\2\2(\u010a\3\2\2\2*\u011b"+
		"\3\2\2\2,\u0120\3\2\2\2./\7\"\2\2/\60\7*\2\2\60\64\7\33\2\2\61\63\5\20"+
		"\t\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65:\3\2\2"+
		"\2\66\64\3\2\2\2\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2"+
		";=\3\2\2\2<:\3\2\2\2=>\5\4\3\2>\3\3\2\2\2?@\7\b\2\2@A\7\3\2\2AB\7\t\2"+
		"\2BC\7\n\2\2CD\5\f\7\2D\5\3\2\2\2EG\5\b\5\2FE\3\2\2\2FG\3\2\2\2GH\3\2"+
		"\2\2HI\7\b\2\2IJ\7*\2\2JK\7\t\2\2KL\5\n\6\2LM\7\n\2\2MN\5\f\7\2N\7\3\2"+
		"\2\2OP\t\2\2\2P\t\3\2\2\2QR\5\b\5\2RS\7*\2\2SZ\3\2\2\2TU\7\32\2\2UV\5"+
		"\b\5\2VW\7*\2\2WY\3\2\2\2XT\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3"+
		"\2\2\2\\Z\3\2\2\2]Q\3\2\2\2]^\3\2\2\2^\13\3\2\2\2_c\7\13\2\2`b\5\20\t"+
		"\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fh\5\16"+
		"\b\2gi\5,\27\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\f\2\2k\r\3\2\2\2ls\5"+
		"&\24\2ms\5\22\n\2ns\5\24\13\2os\5$\23\2ps\5*\26\2qs\5(\25\2rl\3\2\2\2"+
		"rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2"+
		"tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wy\5,\27\2xw\3\2\2\2xy\3\2\2\2y\17\3\2\2"+
		"\2z\u008a\5\b\5\2{\u0085\7*\2\2|}\7\r\2\2}~\7#\2\2~\177\7\16\2\2\177\u0083"+
		"\3\2\2\2\u0080\u0081\7\r\2\2\u0081\u0082\7#\2\2\u0082\u0084\7\16\2\2\u0083"+
		"\u0080\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085|\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\7\32\2\2\u0088\u0087"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a{\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\21\3\2\2"+
		"\2\u008e\u0099\7*\2\2\u008f\u0090\7\r\2\2\u0090\u0091\5\32\16\2\u0091"+
		"\u0092\7\16\2\2\u0092\u0097\3\2\2\2\u0093\u0094\7\r\2\2\u0094\u0095\5"+
		"\32\16\2\u0095\u0096\7\16\2\2\u0096\u0098\3\2\2\2\u0097\u0093\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u008f\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\31\2\2\u009c\u009d\5\32\16"+
		"\2\u009d\u009e\7\34\2\2\u009e\23\3\2\2\2\u009f\u00a0\7\37\2\2\u00a0\u00a1"+
		"\7\t\2\2\u00a1\u00a2\5\32\16\2\u00a2\u00a3\7\n\2\2\u00a3\u00a4\7\13\2"+
		"\2\u00a4\u00a5\5\16\b\2\u00a5\u00a9\7\f\2\2\u00a6\u00a8\5\26\f\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\5\30\r\2\u00ad"+
		"\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\25\3\2\2\2\u00af\u00b0\7!\2\2"+
		"\u00b0\u00b1\7\t\2\2\u00b1\u00b2\5\32\16\2\u00b2\u00b3\7\n\2\2\u00b3\u00b4"+
		"\7\13\2\2\u00b4\u00b5\5\16\b\2\u00b5\u00b6\7\f\2\2\u00b6\27\3\2\2\2\u00b7"+
		"\u00b8\7 \2\2\u00b8\u00b9\7\13\2\2\u00b9\u00ba\5\16\b\2\u00ba\u00bb\7"+
		"\f\2\2\u00bb\31\3\2\2\2\u00bc\u00bf\5\34\17\2\u00bd\u00be\t\3\2\2\u00be"+
		"\u00c0\5\34\17\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\33\3\2"+
		"\2\2\u00c1\u00c4\5\36\20\2\u00c2\u00c3\t\4\2\2\u00c3\u00c5\5\36\20\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\35\3\2\2\2\u00c6\u00c9\5 \21"+
		"\2\u00c7\u00c8\t\5\2\2\u00c8\u00ca\5\36\20\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\37\3\2\2\2\u00cb\u00ce\5\"\22\2\u00cc\u00cd\t\6\2"+
		"\2\u00cd\u00cf\5 \21\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf!"+
		"\3\2\2\2\u00d0\u00d1\7\t\2\2\u00d1\u00d2\5\32\16\2\u00d2\u00d3\7\n\2\2"+
		"\u00d3\u00f3\3\2\2\2\u00d4\u00ec\7*\2\2\u00d5\u00d6\7\r\2\2\u00d6\u00d7"+
		"\5\32\16\2\u00d7\u00d8\7\16\2\2\u00d8\u00dd\3\2\2\2\u00d9\u00da\7\r\2"+
		"\2\u00da\u00db\5\32\16\2\u00db\u00dc\7\16\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00d9\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00d5\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00ed\3\2\2\2\u00e1\u00e2\7\t\2\2\u00e2"+
		"\u00e7\5\32\16\2\u00e3\u00e4\7\32\2\2\u00e4\u00e6\5\32\16\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\n\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00df\3\2\2\2\u00ec\u00e1\3\2\2\2\u00ed\u00f3\3\2\2\2\u00ee"+
		"\u00f3\7#\2\2\u00ef\u00f3\7$\2\2\u00f0\u00f3\7%\2\2\u00f1\u00f3\7+\2\2"+
		"\u00f2\u00d0\3\2\2\2\u00f2\u00d4\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3#\3\2\2\2\u00f4"+
		"\u00f5\7\'\2\2\u00f5\u00f6\7\t\2\2\u00f6\u00f7\5\32\16\2\u00f7\u00f8\7"+
		"\n\2\2\u00f8\u00f9\7\13\2\2\u00f9\u00fa\5\16\b\2\u00fa\u00fb\7\f\2\2\u00fb"+
		"%\3\2\2\2\u00fc\u00fd\7*\2\2\u00fd\u0106\7\t\2\2\u00fe\u0103\5\32\16\2"+
		"\u00ff\u0100\7\32\2\2\u0100\u0102\5\32\16\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\7\n\2\2\u0109\'\3\2\2\2\u010a\u010b\7&\2\2"+
		"\u010b\u010c\7\t\2\2\u010c\u0117\7*\2\2\u010d\u010e\7\r\2\2\u010e\u010f"+
		"\5\32\16\2\u010f\u0110\7\16\2\2\u0110\u0115\3\2\2\2\u0111\u0112\7\r\2"+
		"\2\u0112\u0113\5\32\16\2\u0113\u0114\7\16\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0111\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u010d\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\n\2\2\u011a"+
		")\3\2\2\2\u011b\u011c\7(\2\2\u011c\u011d\7\t\2\2\u011d\u011e\5\32\16\2"+
		"\u011e\u011f\7\n\2\2\u011f+\3\2\2\2\u0120\u0121\7)\2\2\u0121\u0122\5\32"+
		"\16\2\u0122-\3\2\2\2!\64:FZ]chrtx\u0083\u0085\u0088\u008c\u0097\u0099"+
		"\u00a9\u00ad\u00bf\u00c4\u00c9\u00ce\u00dd\u00df\u00e7\u00ec\u00f2\u0103"+
		"\u0106\u0115\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}