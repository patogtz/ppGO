// Generated from /Users/Pato/Desktop/ppGO/ppGO.g4 by ANTLR 4.7.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FUNCTION=8, LEFT_PAR=9, 
		RIGHT_PAR=10, LEFT_BRACKET=11, RIGHT_BRACKET=12, LEFT_SBRACKET=13, RIGHT_SBRACKET=14, 
		PLUS=15, MINUS=16, TIMES=17, DIVISION=18, LESS_THAN=19, GREATER_THAN=20, 
		NOT_EQUAL=21, EQUAL_RELOP=22, GREATER_EQUAL=23, LESS_EQUAL=24, EQUAL=25, 
		SEP_COMMA=26, SEP_COLON=27, SEP_SEMICOLON=28, AND=29, OR=30, IF=31, ELSE=32, 
		ELSEIF=33, VAR=34, PROGRAM=35, VAR_INT=36, VAR_FLOAT=37, INPUT=38, LOOP=39, 
		PRINT=40, RETURN=41, LITERAL=42, VAR_STRING=43, WHITESPACE=44;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_modulo = 2, RULE_tipo = 3, RULE_args = 4, 
		RULE_body = 5, RULE_block = 6, RULE_varsDec = 7, RULE_assigment = 8, RULE_condition = 9, 
		RULE_expression = 10, RULE_expression1 = 11, RULE_exp = 12, RULE_term = 13, 
		RULE_factor = 14, RULE_var_cte = 15, RULE_loop = 16, RULE_funcCall = 17, 
		RULE_read = 18, RULE_print2 = 19, RULE_return2 = 20;
	public static final String[] ruleNames = {
		"program", "main", "modulo", "tipo", "args", "body", "block", "varsDec", 
		"assigment", "condition", "expression", "expression1", "exp", "term", 
		"factor", "var_cte", "loop", "funcCall", "read", "print2", "return2"
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
		public VarsDecContext varsDec() {
			return getRuleContext(VarsDecContext.class,0);
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
			setState(42);
			match(PROGRAM);
			setState(43);
			match(LITERAL);
			setState(44);
			match(SEP_COLON);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(45);
				varsDec();
				}
			}

			setState(48);
			main();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << FUNCTION))) != 0)) {
				{
				{
				setState(49);
				modulo();
				}
				}
				setState(54);
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
			setState(55);
			match(FUNCTION);
			setState(56);
			match(T__0);
			setState(57);
			match(LEFT_PAR);
			setState(58);
			match(RIGHT_PAR);
			setState(59);
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
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(61);
				tipo();
				}
			}

			setState(64);
			match(FUNCTION);
			setState(65);
			match(LITERAL);
			setState(66);
			match(LEFT_PAR);
			setState(67);
			args();
			setState(68);
			match(RIGHT_PAR);
			setState(69);
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
			setState(71);
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
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(73);
				tipo();
				setState(74);
				match(LITERAL);
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP_COMMA) {
					{
					{
					setState(76);
					match(SEP_COMMA);
					setState(77);
					tipo();
					setState(78);
					match(LITERAL);
					}
					}
					setState(84);
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
			setState(87);
			match(LEFT_BRACKET);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(88);
				varsDec();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			block();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(95);
				return2();
				}
			}

			setState(98);
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
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << INPUT) | (1L << LOOP) | (1L << PRINT) | (1L << LITERAL))) != 0)) {
				{
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(100);
					funcCall();
					}
					break;
				case 2:
					{
					setState(101);
					assigment();
					}
					break;
				case 3:
					{
					setState(102);
					condition();
					}
					break;
				case 4:
					{
					setState(103);
					loop();
					}
					break;
				case 5:
					{
					setState(104);
					print2();
					}
					break;
				case 6:
					{
					setState(105);
					read();
					}
					break;
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(111);
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
			setState(114);
			tipo();
			setState(130); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(115);
					match(LITERAL);
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_SBRACKET) {
						{
						{
						setState(116);
						match(LEFT_SBRACKET);
						{
						setState(117);
						match(VAR_INT);
						}
						setState(118);
						match(RIGHT_SBRACKET);
						}
						setState(123);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LEFT_SBRACKET) {
							{
							setState(120);
							match(LEFT_SBRACKET);
							{
							setState(121);
							match(VAR_INT);
							}
							setState(122);
							match(RIGHT_SBRACKET);
							}
						}

						}
					}

					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEP_COMMA) {
						{
						setState(127);
						match(SEP_COMMA);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(132); 
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
			setState(134);
			match(LITERAL);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_SBRACKET) {
				{
				{
				setState(135);
				match(LEFT_SBRACKET);
				{
				setState(136);
				expression();
				}
				setState(137);
				match(RIGHT_SBRACKET);
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_SBRACKET) {
					{
					setState(139);
					match(LEFT_SBRACKET);
					{
					setState(140);
					expression();
					}
					setState(141);
					match(RIGHT_SBRACKET);
					}
				}

				}
			}

			setState(147);
			match(EQUAL);
			setState(148);
			expression();
			setState(149);
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
		public List<TerminalNode> LEFT_PAR() { return getTokens(ppGOParser.LEFT_PAR); }
		public TerminalNode LEFT_PAR(int i) {
			return getToken(ppGOParser.LEFT_PAR, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHT_PAR() { return getTokens(ppGOParser.RIGHT_PAR); }
		public TerminalNode RIGHT_PAR(int i) {
			return getToken(ppGOParser.RIGHT_PAR, i);
		}
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(ppGOParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(ppGOParser.LEFT_BRACKET, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(ppGOParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(ppGOParser.RIGHT_BRACKET, i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(ppGOParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(ppGOParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(ppGOParser.ELSE, 0); }
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
			setState(151);
			match(IF);
			setState(152);
			match(LEFT_PAR);
			setState(153);
			expression();
			setState(154);
			match(RIGHT_PAR);
			setState(155);
			match(LEFT_BRACKET);
			setState(156);
			block();
			setState(157);
			match(RIGHT_BRACKET);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(158);
				match(ELSEIF);
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
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(171);
				match(ELSE);
				setState(172);
				match(LEFT_BRACKET);
				setState(173);
				block();
				setState(174);
				match(RIGHT_BRACKET);
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
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			expression1();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND || _la==OR) {
				{
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
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
		enterRule(_localctx, 22, RULE_expression1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			exp();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << NOT_EQUAL) | (1L << EQUAL_RELOP) | (1L << GREATER_EQUAL) | (1L << LESS_EQUAL))) != 0)) {
				{
				setState(184);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << NOT_EQUAL) | (1L << EQUAL_RELOP) | (1L << GREATER_EQUAL) | (1L << LESS_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
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
		enterRule(_localctx, 24, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			term();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
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
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			factor();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES || _la==DIVISION) {
				{
				setState(194);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIVISION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
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
		enterRule(_localctx, 28, RULE_factor);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(LEFT_PAR);
				setState(199);
				expression();
				setState(200);
				match(RIGHT_PAR);
				}
				break;
			case T__5:
			case T__6:
			case VAR_INT:
			case VAR_FLOAT:
			case LITERAL:
			case VAR_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				var_cte();
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(203);
					match(PLUS);
					setState(204);
					factor();
					}
					break;
				case 2:
					{
					setState(205);
					match(MINUS);
					setState(206);
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
		public TerminalNode VAR_STRING() { return getToken(ppGOParser.VAR_STRING, 0); }
		public Var_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_cte; }
	}

	public final Var_cteContext var_cte() throws RecognitionException {
		Var_cteContext _localctx = new Var_cteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var_cte);
		int _la;
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(LITERAL);
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_SBRACKET) {
						{
						{
						setState(212);
						match(LEFT_SBRACKET);
						{
						setState(213);
						expression();
						}
						setState(214);
						match(RIGHT_SBRACKET);
						}
						setState(220);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LEFT_SBRACKET) {
							{
							setState(216);
							match(LEFT_SBRACKET);
							{
							setState(217);
							expression();
							}
							setState(218);
							match(RIGHT_SBRACKET);
							}
						}

						}
					}

					}
					break;
				case 2:
					{
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_PAR) {
						{
						setState(224);
						match(LEFT_PAR);
						setState(233);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << LEFT_PAR) | (1L << VAR_INT) | (1L << VAR_FLOAT) | (1L << LITERAL) | (1L << VAR_STRING))) != 0)) {
							{
							setState(225);
							expression();
							setState(230);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==SEP_COMMA) {
								{
								{
								setState(226);
								match(SEP_COMMA);
								setState(227);
								expression();
								}
								}
								setState(232);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(235);
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
				setState(240);
				match(VAR_INT);
				}
				break;
			case VAR_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(VAR_FLOAT);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				match(T__6);
				}
				break;
			case VAR_STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
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
		enterRule(_localctx, 32, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(LOOP);
			setState(248);
			match(LEFT_PAR);
			setState(249);
			expression();
			setState(250);
			match(RIGHT_PAR);
			setState(251);
			match(LEFT_BRACKET);
			setState(252);
			block();
			setState(253);
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
		enterRule(_localctx, 34, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(LITERAL);
			setState(256);
			match(LEFT_PAR);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << LEFT_PAR) | (1L << VAR_INT) | (1L << VAR_FLOAT) | (1L << LITERAL) | (1L << VAR_STRING))) != 0)) {
				{
				{
				setState(257);
				expression();
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP_COMMA) {
					{
					{
					setState(258);
					match(SEP_COMMA);
					setState(259);
					expression();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(267);
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
		enterRule(_localctx, 36, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(INPUT);
			setState(270);
			match(LEFT_PAR);
			{
			setState(271);
			match(LITERAL);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_SBRACKET) {
				{
				{
				setState(272);
				match(LEFT_SBRACKET);
				setState(273);
				expression();
				setState(274);
				match(RIGHT_SBRACKET);
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_SBRACKET) {
					{
					setState(276);
					match(LEFT_SBRACKET);
					setState(277);
					expression();
					setState(278);
					match(RIGHT_SBRACKET);
					}
				}

				}
			}

			setState(284);
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
		enterRule(_localctx, 38, RULE_print2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(PRINT);
			setState(287);
			match(LEFT_PAR);
			setState(288);
			expression();
			setState(289);
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
		enterRule(_localctx, 40, RULE_return2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(RETURN);
			setState(292);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\5\2\61\n\2\3"+
		"\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\5\4A\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6S"+
		"\n\6\f\6\16\6V\13\6\5\6X\n\6\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7"+
		"\5\7c\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\3\b"+
		"\5\bs\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\5\t\u0080\n\t\3"+
		"\t\5\t\u0083\n\t\6\t\u0085\n\t\r\t\16\t\u0086\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0092\n\n\5\n\u0094\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a9"+
		"\n\13\f\13\16\13\u00ac\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b3\n\13"+
		"\3\f\3\f\3\f\5\f\u00b8\n\f\3\r\3\r\3\r\5\r\u00bd\n\r\3\16\3\16\3\16\5"+
		"\16\u00c2\n\16\3\17\3\17\3\17\5\17\u00c7\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00d2\n\20\5\20\u00d4\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u00df\n\21\5\21\u00e1\n\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00e7\n\21\f\21\16\21\u00ea\13\21\5\21\u00ec\n\21\3\21"+
		"\5\21\u00ef\n\21\5\21\u00f1\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f8\n"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7"+
		"\23\u0107\n\23\f\23\16\23\u010a\13\23\5\23\u010c\n\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011b\n\24\5\24"+
		"\u011d\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\2\2"+
		"\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\7\3\2\4\7\3\2\37 "+
		"\3\2\25\32\3\2\21\22\3\2\23\24\2\u013f\2,\3\2\2\2\49\3\2\2\2\6@\3\2\2"+
		"\2\bI\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16n\3\2\2\2\20t\3\2\2\2\22\u0088\3"+
		"\2\2\2\24\u0099\3\2\2\2\26\u00b4\3\2\2\2\30\u00b9\3\2\2\2\32\u00be\3\2"+
		"\2\2\34\u00c3\3\2\2\2\36\u00d3\3\2\2\2 \u00f7\3\2\2\2\"\u00f9\3\2\2\2"+
		"$\u0101\3\2\2\2&\u010f\3\2\2\2(\u0120\3\2\2\2*\u0125\3\2\2\2,-\7%\2\2"+
		"-.\7,\2\2.\60\7\35\2\2/\61\5\20\t\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3"+
		"\2\2\2\62\66\5\4\3\2\63\65\5\6\4\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2"+
		"\2\2\66\67\3\2\2\2\67\3\3\2\2\28\66\3\2\2\29:\7\n\2\2:;\7\3\2\2;<\7\13"+
		"\2\2<=\7\f\2\2=>\5\f\7\2>\5\3\2\2\2?A\5\b\5\2@?\3\2\2\2@A\3\2\2\2AB\3"+
		"\2\2\2BC\7\n\2\2CD\7,\2\2DE\7\13\2\2EF\5\n\6\2FG\7\f\2\2GH\5\f\7\2H\7"+
		"\3\2\2\2IJ\t\2\2\2J\t\3\2\2\2KL\5\b\5\2LM\7,\2\2MT\3\2\2\2NO\7\34\2\2"+
		"OP\5\b\5\2PQ\7,\2\2QS\3\2\2\2RN\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2"+
		"UX\3\2\2\2VT\3\2\2\2WK\3\2\2\2WX\3\2\2\2X\13\3\2\2\2Y]\7\r\2\2Z\\\5\20"+
		"\t\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`b\5"+
		"\16\b\2ac\5*\26\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\16\2\2e\r\3\2\2\2"+
		"fm\5$\23\2gm\5\22\n\2hm\5\24\13\2im\5\"\22\2jm\5(\25\2km\5&\24\2lf\3\2"+
		"\2\2lg\3\2\2\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2"+
		"\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qs\5*\26\2rq\3\2\2\2rs\3\2\2\2s\17\3"+
		"\2\2\2t\u0084\5\b\5\2u\177\7,\2\2vw\7\17\2\2wx\7&\2\2xy\7\20\2\2y}\3\2"+
		"\2\2z{\7\17\2\2{|\7&\2\2|~\7\20\2\2}z\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2"+
		"\177v\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\u0083\7\34\2"+
		"\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084u"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\21\3\2\2\2\u0088\u0093\7,\2\2\u0089\u008a\7\17\2\2\u008a\u008b\5\26\f"+
		"\2\u008b\u008c\7\20\2\2\u008c\u0091\3\2\2\2\u008d\u008e\7\17\2\2\u008e"+
		"\u008f\5\26\f\2\u008f\u0090\7\20\2\2\u0090\u0092\3\2\2\2\u0091\u008d\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0089\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\33\2\2\u0096\u0097\5"+
		"\26\f\2\u0097\u0098\7\36\2\2\u0098\23\3\2\2\2\u0099\u009a\7!\2\2\u009a"+
		"\u009b\7\13\2\2\u009b\u009c\5\26\f\2\u009c\u009d\7\f\2\2\u009d\u009e\7"+
		"\r\2\2\u009e\u009f\5\16\b\2\u009f\u00aa\7\16\2\2\u00a0\u00a1\7#\2\2\u00a1"+
		"\u00a2\7\13\2\2\u00a2\u00a3\5\26\f\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\7"+
		"\r\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7\7\16\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a0\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00b2\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\"\2\2\u00ae"+
		"\u00af\7\r\2\2\u00af\u00b0\5\16\b\2\u00b0\u00b1\7\16\2\2\u00b1\u00b3\3"+
		"\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\25\3\2\2\2\u00b4"+
		"\u00b7\5\30\r\2\u00b5\u00b6\t\3\2\2\u00b6\u00b8\5\30\r\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\27\3\2\2\2\u00b9\u00bc\5\32\16\2\u00ba"+
		"\u00bb\t\4\2\2\u00bb\u00bd\5\32\16\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3"+
		"\2\2\2\u00bd\31\3\2\2\2\u00be\u00c1\5\34\17\2\u00bf\u00c0\t\5\2\2\u00c0"+
		"\u00c2\5\32\16\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\33\3\2"+
		"\2\2\u00c3\u00c6\5\36\20\2\u00c4\u00c5\t\6\2\2\u00c5\u00c7\5\34\17\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\35\3\2\2\2\u00c8\u00c9\7\13\2"+
		"\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb\7\f\2\2\u00cb\u00d4\3\2\2\2\u00cc"+
		"\u00d1\5 \21\2\u00cd\u00ce\7\21\2\2\u00ce\u00d2\5\36\20\2\u00cf\u00d0"+
		"\7\22\2\2\u00d0\u00d2\5\36\20\2\u00d1\u00cd\3\2\2\2\u00d1\u00cf\3\2\2"+
		"\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00c8\3\2\2\2\u00d3\u00cc"+
		"\3\2\2\2\u00d4\37\3\2\2\2\u00d5\u00f0\7,\2\2\u00d6\u00d7\7\17\2\2\u00d7"+
		"\u00d8\5\26\f\2\u00d8\u00d9\7\20\2\2\u00d9\u00de\3\2\2\2\u00da\u00db\7"+
		"\17\2\2\u00db\u00dc\5\26\f\2\u00dc\u00dd\7\20\2\2\u00dd\u00df\3\2\2\2"+
		"\u00de\u00da\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00d6"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00f1\3\2\2\2\u00e2\u00eb\7\13\2\2"+
		"\u00e3\u00e8\5\26\f\2\u00e4\u00e5\7\34\2\2\u00e5\u00e7\5\26\f\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\7\f\2\2\u00ee\u00e2\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00e0\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f8\3\2\2\2\u00f2\u00f8\7&\2\2\u00f3\u00f8\7\'"+
		"\2\2\u00f4\u00f8\7\b\2\2\u00f5\u00f8\7\t\2\2\u00f6\u00f8\7-\2\2\u00f7"+
		"\u00d5\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8!\3\2\2\2\u00f9\u00fa"+
		"\7)\2\2\u00fa\u00fb\7\13\2\2\u00fb\u00fc\5\26\f\2\u00fc\u00fd\7\f\2\2"+
		"\u00fd\u00fe\7\r\2\2\u00fe\u00ff\5\16\b\2\u00ff\u0100\7\16\2\2\u0100#"+
		"\3\2\2\2\u0101\u0102\7,\2\2\u0102\u010b\7\13\2\2\u0103\u0108\5\26\f\2"+
		"\u0104\u0105\7\34\2\2\u0105\u0107\5\26\f\2\u0106\u0104\3\2\2\2\u0107\u010a"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u0103\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010e\7\f\2\2\u010e%\3\2\2\2\u010f\u0110\7(\2\2\u0110\u0111"+
		"\7\13\2\2\u0111\u011c\7,\2\2\u0112\u0113\7\17\2\2\u0113\u0114\5\26\f\2"+
		"\u0114\u0115\7\20\2\2\u0115\u011a\3\2\2\2\u0116\u0117\7\17\2\2\u0117\u0118"+
		"\5\26\f\2\u0118\u0119\7\20\2\2\u0119\u011b\3\2\2\2\u011a\u0116\3\2\2\2"+
		"\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0112\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\f\2\2\u011f\'\3\2\2\2\u0120"+
		"\u0121\7*\2\2\u0121\u0122\7\13\2\2\u0122\u0123\5\26\f\2\u0123\u0124\7"+
		"\f\2\2\u0124)\3\2\2\2\u0125\u0126\7+\2\2\u0126\u0127\5\26\f\2\u0127+\3"+
		"\2\2\2%\60\66@TW]blnr}\177\u0082\u0086\u0091\u0093\u00aa\u00b2\u00b7\u00bc"+
		"\u00c1\u00c6\u00d1\u00d3\u00de\u00e0\u00e8\u00eb\u00ee\u00f0\u00f7\u0108"+
		"\u010b\u011a\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}