// Generated from /Users/Pato/Desktop/ppGO/Compiler/ppGO.g4 by ANTLR 4.7.1
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
		RULE_exp = 14, RULE_term = 15, RULE_factor = 16, RULE_var_cte = 17, RULE_loop = 18, 
		RULE_funcCall = 19, RULE_read = 20, RULE_print2 = 21, RULE_return2 = 22;
	public static final String[] ruleNames = {
		"program", "main", "modulo", "tipo", "args", "body", "block", "varsDec", 
		"assigment", "condition", "elseif", "elsee", "expression", "expression1", 
		"exp", "term", "factor", "var_cte", "loop", "funcCall", "read", "print2", 
		"return2"
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(PROGRAM);
			setState(47);
			match(LITERAL);
			setState(48);
			match(SEP_COLON);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(49);
				varsDec();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			main();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << FUNCTION))) != 0)) {
				{
				{
				setState(56);
				modulo();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			setState(62);
			match(FUNCTION);
			setState(63);
			match(T__0);
			setState(64);
			match(LEFT_PAR);
			setState(65);
			match(RIGHT_PAR);
			setState(66);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(68);
				tipo();
				}
			}

			setState(71);
			match(FUNCTION);
			setState(72);
			match(LITERAL);
			setState(73);
			match(LEFT_PAR);
			setState(74);
			args();
			setState(75);
			match(RIGHT_PAR);
			setState(76);
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
			setState(78);
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
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(80);
				tipo();
				setState(81);
				match(LITERAL);
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP_COMMA) {
					{
					{
					setState(83);
					match(SEP_COMMA);
					setState(84);
					tipo();
					setState(85);
					match(LITERAL);
					}
					}
					setState(91);
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
			setState(94);
			match(LEFT_BRACKET);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(95);
				varsDec();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			block();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(102);
				return2();
				}
			}

			setState(105);
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << INPUT) | (1L << LOOP) | (1L << PRINT) | (1L << LITERAL))) != 0)) {
				{
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(107);
					funcCall();
					}
					break;
				case 2:
					{
					setState(108);
					assigment();
					}
					break;
				case 3:
					{
					setState(109);
					condition();
					}
					break;
				case 4:
					{
					setState(110);
					loop();
					}
					break;
				case 5:
					{
					setState(111);
					print2();
					}
					break;
				case 6:
					{
					setState(112);
					read();
					}
					break;
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(118);
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
			setState(121);
			tipo();
			setState(137); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(122);
					match(LITERAL);
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_SBRACKET) {
						{
						{
						setState(123);
						match(LEFT_SBRACKET);
						{
						setState(124);
						match(VAR_INT);
						}
						setState(125);
						match(RIGHT_SBRACKET);
						}
						setState(130);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LEFT_SBRACKET) {
							{
							setState(127);
							match(LEFT_SBRACKET);
							{
							setState(128);
							match(VAR_INT);
							}
							setState(129);
							match(RIGHT_SBRACKET);
							}
						}

						}
					}

					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEP_COMMA) {
						{
						setState(134);
						match(SEP_COMMA);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139); 
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
			setState(141);
			match(LITERAL);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_SBRACKET) {
				{
				{
				setState(142);
				match(LEFT_SBRACKET);
				{
				setState(143);
				expression();
				}
				setState(144);
				match(RIGHT_SBRACKET);
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_SBRACKET) {
					{
					setState(146);
					match(LEFT_SBRACKET);
					{
					setState(147);
					expression();
					}
					setState(148);
					match(RIGHT_SBRACKET);
					}
				}

				}
			}

			setState(154);
			match(EQUAL);
			setState(155);
			expression();
			setState(156);
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
			setState(158);
			match(IF);
			setState(159);
			match(LEFT_PAR);
			setState(160);
			expression();
			setState(161);
			match(RIGHT_PAR);
			setState(162);
			match(LEFT_BRACKET);
			setState(163);
			block();
			setState(164);
			match(RIGHT_BRACKET);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(165);
				elseif();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(171);
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
			setState(174);
			match(ELSEIF);
			setState(175);
			match(LEFT_PAR);
			setState(176);
			expression();
			setState(177);
			match(RIGHT_PAR);
			setState(178);
			match(LEFT_BRACKET);
			setState(179);
			block();
			setState(180);
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
			setState(182);
			match(ELSE);
			setState(183);
			match(LEFT_BRACKET);
			setState(184);
			block();
			setState(185);
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
			setState(187);
			expression1();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND || _la==OR) {
				{
				setState(188);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189);
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
			setState(192);
			exp();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << NOT_EQUAL) | (1L << EQUAL_RELOP) | (1L << GREATER_EQUAL) | (1L << LESS_EQUAL))) != 0)) {
				{
				setState(193);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << NOT_EQUAL) | (1L << EQUAL_RELOP) | (1L << GREATER_EQUAL) | (1L << LESS_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
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
			setState(197);
			term();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(198);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
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
			setState(202);
			factor();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES || _la==DIVISION) {
				{
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIVISION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(ppGOParser.RIGHT_PAR, 0); }
		public Var_cteContext var_cte() {
			return getRuleContext(Var_cteContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ppGOParser.PLUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ppGOParser.MINUS, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(LEFT_PAR);
				setState(208);
				expression();
				setState(209);
				match(RIGHT_PAR);
				}
				break;
			case VAR_INT:
			case VAR_FLOAT:
			case VAR_BOOL:
			case LITERAL:
			case VAR_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				var_cte();
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(212);
					match(PLUS);
					setState(213);
					factor();
					}
					break;
				case 2:
					{
					setState(214);
					match(MINUS);
					setState(215);
					factor();
					}
					break;
				}
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

	public static class Var_cteContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(ppGOParser.LITERAL, 0); }
		public TerminalNode LEFT_PAR() { return getToken(ppGOParser.LEFT_PAR, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(ppGOParser.RIGHT_PAR, 0); }
		public List<TerminalNode> LEFT_SBRACKET() { return getTokens(ppGOParser.LEFT_SBRACKET); }
		public TerminalNode LEFT_SBRACKET(int i) {
			return getToken(ppGOParser.LEFT_SBRACKET, i);
		}
		public List<TerminalNode> RIGHT_SBRACKET() { return getTokens(ppGOParser.RIGHT_SBRACKET); }
		public TerminalNode RIGHT_SBRACKET(int i) {
			return getToken(ppGOParser.RIGHT_SBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode VAR_INT() { return getToken(ppGOParser.VAR_INT, 0); }
		public TerminalNode VAR_FLOAT() { return getToken(ppGOParser.VAR_FLOAT, 0); }
		public TerminalNode VAR_BOOL() { return getToken(ppGOParser.VAR_BOOL, 0); }
		public TerminalNode VAR_STRING() { return getToken(ppGOParser.VAR_STRING, 0); }
		public Var_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_cte; }
	}

	public final Var_cteContext var_cte() throws RecognitionException {
		Var_cteContext _localctx = new Var_cteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_var_cte);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(LITERAL);
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_SBRACKET) {
						{
						{
						setState(221);
						match(LEFT_SBRACKET);
						{
						setState(222);
						expression();
						}
						setState(223);
						match(RIGHT_SBRACKET);
						}
						setState(229);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LEFT_SBRACKET) {
							{
							setState(225);
							match(LEFT_SBRACKET);
							{
							setState(226);
							expression();
							}
							setState(227);
							match(RIGHT_SBRACKET);
							}
						}

						}
					}

					}
					break;
				case 2:
					{
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_PAR) {
						{
						setState(233);
						match(LEFT_PAR);
						setState(242);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAR) | (1L << VAR_INT) | (1L << VAR_FLOAT) | (1L << VAR_BOOL) | (1L << LITERAL) | (1L << VAR_STRING))) != 0)) {
							{
							setState(234);
							expression();
							setState(239);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==SEP_COMMA) {
								{
								{
								setState(235);
								match(SEP_COMMA);
								setState(236);
								expression();
								}
								}
								setState(241);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(244);
						match(RIGHT_PAR);
						}
					}

					}
					break;
				}
				}
				break;
			case VAR_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(VAR_INT);
				}
				break;
			case VAR_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(VAR_FLOAT);
				}
				break;
			case VAR_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(VAR_BOOL);
				}
				break;
			case VAR_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
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
		enterRule(_localctx, 36, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(LOOP);
			setState(256);
			match(LEFT_PAR);
			setState(257);
			expression();
			setState(258);
			match(RIGHT_PAR);
			setState(259);
			match(LEFT_BRACKET);
			setState(260);
			block();
			setState(261);
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
		enterRule(_localctx, 38, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LITERAL);
			setState(264);
			match(LEFT_PAR);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAR) | (1L << VAR_INT) | (1L << VAR_FLOAT) | (1L << VAR_BOOL) | (1L << LITERAL) | (1L << VAR_STRING))) != 0)) {
				{
				{
				setState(265);
				expression();
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP_COMMA) {
					{
					{
					setState(266);
					match(SEP_COMMA);
					setState(267);
					expression();
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(275);
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
		enterRule(_localctx, 40, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(INPUT);
			setState(278);
			match(LEFT_PAR);
			{
			setState(279);
			match(LITERAL);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_SBRACKET) {
				{
				{
				setState(280);
				match(LEFT_SBRACKET);
				setState(281);
				expression();
				setState(282);
				match(RIGHT_SBRACKET);
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_SBRACKET) {
					{
					setState(284);
					match(LEFT_SBRACKET);
					setState(285);
					expression();
					setState(286);
					match(RIGHT_SBRACKET);
					}
				}

				}
			}

			setState(292);
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
		enterRule(_localctx, 42, RULE_print2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(PRINT);
			setState(295);
			match(LEFT_PAR);
			setState(296);
			expression();
			setState(297);
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
		enterRule(_localctx, 44, RULE_return2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(RETURN);
			setState(300);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0131\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\5\4H\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\5\6_\n\6\3\7\3\7\7"+
		"\7c\n\7\f\7\16\7f\13\7\3\7\3\7\5\7j\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\bt\n\b\f\b\16\bw\13\b\3\b\5\bz\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0085\n\t\5\t\u0087\n\t\3\t\5\t\u008a\n\t\6\t\u008c\n\t\r\t"+
		"\16\t\u008d\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0099\n\n\5\n\u009b"+
		"\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a9"+
		"\n\13\f\13\16\13\u00ac\13\13\3\13\5\13\u00af\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00c1\n\16\3\17\3"+
		"\17\3\17\5\17\u00c6\n\17\3\20\3\20\3\20\5\20\u00cb\n\20\3\21\3\21\3\21"+
		"\5\21\u00d0\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00db"+
		"\n\22\5\22\u00dd\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00e8\n\23\5\23\u00ea\n\23\3\23\3\23\3\23\3\23\7\23\u00f0\n\23\f\23\16"+
		"\23\u00f3\13\23\5\23\u00f5\n\23\3\23\5\23\u00f8\n\23\5\23\u00fa\n\23\3"+
		"\23\3\23\3\23\3\23\5\23\u0100\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u010f\n\25\f\25\16\25\u0112\13\25"+
		"\5\25\u0114\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0123\n\26\5\26\u0125\n\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\2\7\3\2\4\7\3\2\35\36\3\2\23\30\3\2\17\20\3\2\21\22\2\u0144"+
		"\2\60\3\2\2\2\4@\3\2\2\2\6G\3\2\2\2\bP\3\2\2\2\n^\3\2\2\2\f`\3\2\2\2\16"+
		"u\3\2\2\2\20{\3\2\2\2\22\u008f\3\2\2\2\24\u00a0\3\2\2\2\26\u00b0\3\2\2"+
		"\2\30\u00b8\3\2\2\2\32\u00bd\3\2\2\2\34\u00c2\3\2\2\2\36\u00c7\3\2\2\2"+
		" \u00cc\3\2\2\2\"\u00dc\3\2\2\2$\u00ff\3\2\2\2&\u0101\3\2\2\2(\u0109\3"+
		"\2\2\2*\u0117\3\2\2\2,\u0128\3\2\2\2.\u012d\3\2\2\2\60\61\7\"\2\2\61\62"+
		"\7*\2\2\62\66\7\33\2\2\63\65\5\20\t\2\64\63\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29=\5\4\3\2:<\5\6\4\2;:\3"+
		"\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?=\3\2\2\2@A\7\b\2\2AB"+
		"\7\3\2\2BC\7\t\2\2CD\7\n\2\2DE\5\f\7\2E\5\3\2\2\2FH\5\b\5\2GF\3\2\2\2"+
		"GH\3\2\2\2HI\3\2\2\2IJ\7\b\2\2JK\7*\2\2KL\7\t\2\2LM\5\n\6\2MN\7\n\2\2"+
		"NO\5\f\7\2O\7\3\2\2\2PQ\t\2\2\2Q\t\3\2\2\2RS\5\b\5\2ST\7*\2\2T[\3\2\2"+
		"\2UV\7\32\2\2VW\5\b\5\2WX\7*\2\2XZ\3\2\2\2YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2"+
		"\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^R\3\2\2\2^_\3\2\2\2_\13\3\2\2\2`d\7"+
		"\13\2\2ac\5\20\t\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2f"+
		"d\3\2\2\2gi\5\16\b\2hj\5.\30\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\f\2\2"+
		"l\r\3\2\2\2mt\5(\25\2nt\5\22\n\2ot\5\24\13\2pt\5&\24\2qt\5,\27\2rt\5*"+
		"\26\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2tw\3"+
		"\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xz\5.\30\2yx\3\2\2\2yz\3"+
		"\2\2\2z\17\3\2\2\2{\u008b\5\b\5\2|\u0086\7*\2\2}~\7\r\2\2~\177\7#\2\2"+
		"\177\u0080\7\16\2\2\u0080\u0084\3\2\2\2\u0081\u0082\7\r\2\2\u0082\u0083"+
		"\7#\2\2\u0083\u0085\7\16\2\2\u0084\u0081\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086}\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2"+
		"\u0088\u008a\7\32\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c"+
		"\3\2\2\2\u008b|\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\21\3\2\2\2\u008f\u009a\7*\2\2\u0090\u0091\7\r\2\2"+
		"\u0091\u0092\5\32\16\2\u0092\u0093\7\16\2\2\u0093\u0098\3\2\2\2\u0094"+
		"\u0095\7\r\2\2\u0095\u0096\5\32\16\2\u0096\u0097\7\16\2\2\u0097\u0099"+
		"\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0090\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\31"+
		"\2\2\u009d\u009e\5\32\16\2\u009e\u009f\7\34\2\2\u009f\23\3\2\2\2\u00a0"+
		"\u00a1\7\37\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5\32\16\2\u00a3\u00a4"+
		"\7\n\2\2\u00a4\u00a5\7\13\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00aa\7\f\2\2"+
		"\u00a7\u00a9\5\26\f\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00af\5\30\r\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\25\3\2\2"+
		"\2\u00b0\u00b1\7!\2\2\u00b1\u00b2\7\t\2\2\u00b2\u00b3\5\32\16\2\u00b3"+
		"\u00b4\7\n\2\2\u00b4\u00b5\7\13\2\2\u00b5\u00b6\5\16\b\2\u00b6\u00b7\7"+
		"\f\2\2\u00b7\27\3\2\2\2\u00b8\u00b9\7 \2\2\u00b9\u00ba\7\13\2\2\u00ba"+
		"\u00bb\5\16\b\2\u00bb\u00bc\7\f\2\2\u00bc\31\3\2\2\2\u00bd\u00c0\5\34"+
		"\17\2\u00be\u00bf\t\3\2\2\u00bf\u00c1\5\34\17\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\33\3\2\2\2\u00c2\u00c5\5\36\20\2\u00c3\u00c4\t\4"+
		"\2\2\u00c4\u00c6\5\36\20\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\35\3\2\2\2\u00c7\u00ca\5 \21\2\u00c8\u00c9\t\5\2\2\u00c9\u00cb\5\36\20"+
		"\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\37\3\2\2\2\u00cc\u00cf"+
		"\5\"\22\2\u00cd\u00ce\t\6\2\2\u00ce\u00d0\5 \21\2\u00cf\u00cd\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0!\3\2\2\2\u00d1\u00d2\7\t\2\2\u00d2\u00d3\5"+
		"\32\16\2\u00d3\u00d4\7\n\2\2\u00d4\u00dd\3\2\2\2\u00d5\u00da\5$\23\2\u00d6"+
		"\u00d7\7\17\2\2\u00d7\u00db\5\"\22\2\u00d8\u00d9\7\20\2\2\u00d9\u00db"+
		"\5\"\22\2\u00da\u00d6\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00dd\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dd#\3"+
		"\2\2\2\u00de\u00f9\7*\2\2\u00df\u00e0\7\r\2\2\u00e0\u00e1\5\32\16\2\u00e1"+
		"\u00e2\7\16\2\2\u00e2\u00e7\3\2\2\2\u00e3\u00e4\7\r\2\2\u00e4\u00e5\5"+
		"\32\16\2\u00e5\u00e6\7\16\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e3\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00fa\3\2\2\2\u00eb\u00f4\7\t\2\2\u00ec\u00f1\5\32\16\2"+
		"\u00ed\u00ee\7\32\2\2\u00ee\u00f0\5\32\16\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f8\7\n\2\2\u00f7\u00eb\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00e9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u0100\3\2\2\2\u00fb\u0100\7#\2\2\u00fc\u0100\7$\2\2\u00fd\u0100\7%\2"+
		"\2\u00fe\u0100\7+\2\2\u00ff\u00de\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100%\3\2\2\2\u0101"+
		"\u0102\7\'\2\2\u0102\u0103\7\t\2\2\u0103\u0104\5\32\16\2\u0104\u0105\7"+
		"\n\2\2\u0105\u0106\7\13\2\2\u0106\u0107\5\16\b\2\u0107\u0108\7\f\2\2\u0108"+
		"\'\3\2\2\2\u0109\u010a\7*\2\2\u010a\u0113\7\t\2\2\u010b\u0110\5\32\16"+
		"\2\u010c\u010d\7\32\2\2\u010d\u010f\5\32\16\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0113\u010b\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\7\n\2\2\u0116)\3\2\2\2\u0117\u0118\7&\2\2\u0118"+
		"\u0119\7\t\2\2\u0119\u0124\7*\2\2\u011a\u011b\7\r\2\2\u011b\u011c\5\32"+
		"\16\2\u011c\u011d\7\16\2\2\u011d\u0122\3\2\2\2\u011e\u011f\7\r\2\2\u011f"+
		"\u0120\5\32\16\2\u0120\u0121\7\16\2\2\u0121\u0123\3\2\2\2\u0122\u011e"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u011a\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7\n\2\2\u0127+\3\2\2\2"+
		"\u0128\u0129\7(\2\2\u0129\u012a\7\t\2\2\u012a\u012b\5\32\16\2\u012b\u012c"+
		"\7\n\2\2\u012c-\3\2\2\2\u012d\u012e\7)\2\2\u012e\u012f\5\32\16\2\u012f"+
		"/\3\2\2\2%\66=G[^disuy\u0084\u0086\u0089\u008d\u0098\u009a\u00aa\u00ae"+
		"\u00c0\u00c5\u00ca\u00cf\u00da\u00dc\u00e7\u00e9\u00f1\u00f4\u00f7\u00f9"+
		"\u00ff\u0110\u0113\u0122\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}