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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FUNCTION=7, LEFT_PAR=8, 
		RIGHT_PAR=9, LEFT_BRACKET=10, RIGHT_BRACKET=11, LEFT_SBRACKET=12, RIGHT_SBRACKET=13, 
		PLUS=14, MINUS=15, TIMES=16, DIVISION=17, LESS_THAN=18, GREATER_THAN=19, 
		NOT_EQUAL=20, EQUAL_RELOP=21, GREATER_EQUAL=22, LESS_EQUAL=23, EQUAL=24, 
		SEP_COMMA=25, SEP_COLON=26, SEP_SEMICOLON=27, AND=28, OR=29, IF=30, ELSE=31, 
		ELSEIF=32, PROGRAM=33, VAR_INT=34, VAR_FLOAT=35, VAR_BOOL=36, INPUT=37, 
		LOOP=38, PRINT=39, RETURN=40, LITERAL=41, VAR_STRING=42, WHITESPACE=43;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_modulo = 2, RULE_tipo = 3, RULE_args = 4, 
		RULE_body = 5, RULE_block = 6, RULE_varsDec = 7, RULE_array = 8, RULE_assigment = 9, 
		RULE_condition = 10, RULE_elseif = 11, RULE_elsee = 12, RULE_expression = 13, 
		RULE_expression1 = 14, RULE_exp = 15, RULE_term = 16, RULE_factor = 17, 
		RULE_loop = 18, RULE_funcCall = 19, RULE_read = 20, RULE_print2 = 21, 
		RULE_return2 = 22, RULE_matrixMult = 23;
	public static final String[] ruleNames = {
		"program", "main", "modulo", "tipo", "args", "body", "block", "varsDec", 
		"array", "assigment", "condition", "elseif", "elsee", "expression", "expression1", 
		"exp", "term", "factor", "loop", "funcCall", "read", "print2", "return2", 
		"matrixMult"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'int'", "'float'", "'string'", "'bool'", "'matMult'", 
		"'func'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'+'", "'-'", "'*'", 
		"'/'", "'<'", "'>'", "'<>'", "'=='", "'>='", "'<='", "'='", "','", "':'", 
		"';'", "'AND'", "'OR'", "'if'", "'else'", "'else if'", "'program'", null, 
		null, null, "'usr_input'", "'loop'", "'print'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "FUNCTION", "LEFT_PAR", "RIGHT_PAR", 
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
			setState(48);
			match(PROGRAM);
			setState(49);
			match(LITERAL);
			setState(50);
			match(SEP_COLON);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					varsDec();
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					modulo();
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(63);
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
			setState(65);
			match(FUNCTION);
			setState(66);
			match(T__0);
			setState(67);
			match(LEFT_PAR);
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
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(71);
				tipo();
				}
			}

			setState(74);
			match(FUNCTION);
			setState(75);
			match(LITERAL);
			setState(76);
			match(LEFT_PAR);
			setState(77);
			args();
			setState(78);
			match(RIGHT_PAR);
			setState(79);
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
			setState(81);
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(83);
				tipo();
				setState(84);
				match(LITERAL);
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP_COMMA) {
					{
					{
					setState(86);
					match(SEP_COMMA);
					setState(87);
					tipo();
					setState(88);
					match(LITERAL);
					}
					}
					setState(94);
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
			setState(97);
			match(LEFT_BRACKET);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(98);
				varsDec();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			block();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(105);
				return2();
				}
			}

			setState(108);
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
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << INPUT) | (1L << LOOP) | (1L << PRINT) | (1L << LITERAL))) != 0)) {
				{
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(110);
					funcCall();
					}
					break;
				case 2:
					{
					setState(111);
					assigment();
					}
					break;
				case 3:
					{
					setState(112);
					condition();
					}
					break;
				case 4:
					{
					setState(113);
					loop();
					}
					break;
				case 5:
					{
					setState(114);
					print2();
					}
					break;
				case 6:
					{
					setState(115);
					read();
					}
					break;
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(121);
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
			setState(124);
			tipo();
			setState(140); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(125);
					match(LITERAL);
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_SBRACKET) {
						{
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
						setState(133);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LEFT_SBRACKET) {
							{
							setState(130);
							match(LEFT_SBRACKET);
							{
							setState(131);
							match(VAR_INT);
							}
							setState(132);
							match(RIGHT_SBRACKET);
							}
						}

						}
					}

					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEP_COMMA) {
						{
						setState(137);
						match(SEP_COMMA);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(142); 
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(ppGOParser.LITERAL, 0); }
		public List<TerminalNode> LEFT_SBRACKET() { return getTokens(ppGOParser.LEFT_SBRACKET); }
		public TerminalNode LEFT_SBRACKET(int i) {
			return getToken(ppGOParser.LEFT_SBRACKET, i);
		}
		public List<TerminalNode> RIGHT_SBRACKET() { return getTokens(ppGOParser.RIGHT_SBRACKET); }
		public TerminalNode RIGHT_SBRACKET(int i) {
			return getToken(ppGOParser.RIGHT_SBRACKET, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(LITERAL);
			setState(145);
			match(LEFT_SBRACKET);
			{
			setState(146);
			exp();
			}
			setState(147);
			match(RIGHT_SBRACKET);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_SBRACKET) {
				{
				setState(148);
				match(LEFT_SBRACKET);
				{
				setState(149);
				exp();
				}
				setState(150);
				match(RIGHT_SBRACKET);
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

	public static class AssigmentContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ppGOParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEP_SEMICOLON() { return getToken(ppGOParser.SEP_SEMICOLON, 0); }
		public TerminalNode LITERAL() { return getToken(ppGOParser.LITERAL, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(154);
				match(LITERAL);
				}
				break;
			case 2:
				{
				setState(155);
				array();
				}
				break;
			}
			setState(158);
			match(EQUAL);
			setState(159);
			expression();
			setState(160);
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
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(IF);
			setState(163);
			match(LEFT_PAR);
			setState(164);
			expression();
			setState(165);
			match(RIGHT_PAR);
			setState(166);
			match(LEFT_BRACKET);
			setState(167);
			block();
			setState(168);
			match(RIGHT_BRACKET);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(169);
				elseif();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(175);
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
		enterRule(_localctx, 22, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ELSEIF);
			setState(179);
			match(LEFT_PAR);
			setState(180);
			expression();
			setState(181);
			match(RIGHT_PAR);
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
		enterRule(_localctx, 24, RULE_elsee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ELSE);
			setState(187);
			match(LEFT_BRACKET);
			setState(188);
			block();
			setState(189);
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
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			expression1();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND || _la==OR) {
				{
				setState(192);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(193);
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
		enterRule(_localctx, 28, RULE_expression1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			exp();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << NOT_EQUAL) | (1L << EQUAL_RELOP) | (1L << GREATER_EQUAL) | (1L << LESS_EQUAL))) != 0)) {
				{
				setState(197);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << NOT_EQUAL) | (1L << EQUAL_RELOP) | (1L << GREATER_EQUAL) | (1L << LESS_EQUAL))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			term();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(202);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(203);
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
		enterRule(_localctx, 32, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			factor();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES || _la==DIVISION) {
				{
				setState(207);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIVISION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(208);
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
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
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
		enterRule(_localctx, 34, RULE_factor);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(LEFT_PAR);
				setState(212);
				expression();
				setState(213);
				match(RIGHT_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(LITERAL);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAR) {
					{
					setState(216);
					match(LEFT_PAR);
					setState(217);
					expression();
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEP_COMMA) {
						{
						{
						setState(218);
						match(SEP_COMMA);
						setState(219);
						expression();
						}
						}
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(225);
					match(RIGHT_PAR);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(VAR_INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(VAR_FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				match(VAR_BOOL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				match(VAR_STRING);
				}
				break;
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
			setState(236);
			match(LOOP);
			setState(237);
			match(LEFT_PAR);
			setState(238);
			expression();
			setState(239);
			match(RIGHT_PAR);
			setState(240);
			match(LEFT_BRACKET);
			setState(241);
			block();
			setState(242);
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
			setState(244);
			match(LITERAL);
			setState(245);
			match(LEFT_PAR);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_PAR) | (1L << VAR_INT) | (1L << VAR_FLOAT) | (1L << VAR_BOOL) | (1L << LITERAL) | (1L << VAR_STRING))) != 0)) {
				{
				{
				setState(246);
				expression();
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP_COMMA) {
					{
					{
					setState(247);
					match(SEP_COMMA);
					setState(248);
					expression();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(256);
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
			setState(258);
			match(INPUT);
			setState(259);
			match(LEFT_PAR);
			{
			setState(260);
			match(LITERAL);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_SBRACKET) {
				{
				{
				setState(261);
				match(LEFT_SBRACKET);
				setState(262);
				expression();
				setState(263);
				match(RIGHT_SBRACKET);
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_SBRACKET) {
					{
					setState(265);
					match(LEFT_SBRACKET);
					setState(266);
					expression();
					setState(267);
					match(RIGHT_SBRACKET);
					}
				}

				}
			}

			setState(273);
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
		public TerminalNode RIGHT_PAR() { return getToken(ppGOParser.RIGHT_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
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
			setState(275);
			match(PRINT);
			setState(276);
			match(LEFT_PAR);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(277);
				expression();
				}
				break;
			case 2:
				{
				setState(278);
				array();
				}
				break;
			}
			setState(281);
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
			setState(283);
			match(RETURN);
			setState(284);
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

	public static class MatrixMultContext extends ParserRuleContext {
		public TerminalNode LEFT_PAR() { return getToken(ppGOParser.LEFT_PAR, 0); }
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public TerminalNode SEP_COMMA() { return getToken(ppGOParser.SEP_COMMA, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(ppGOParser.RIGHT_BRACKET, 0); }
		public MatrixMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixMult; }
	}

	public final MatrixMultContext matrixMult() throws RecognitionException {
		MatrixMultContext _localctx = new MatrixMultContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_matrixMult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__5);
			setState(287);
			match(LEFT_PAR);
			setState(288);
			array();
			setState(289);
			match(SEP_COMMA);
			setState(290);
			array();
			setState(291);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0128\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\5\4K\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\5\6b"+
		"\n\6\3\7\3\7\7\7f\n\7\f\7\16\7i\13\7\3\7\3\7\5\7m\n\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\bw\n\b\f\b\16\bz\13\b\3\b\5\b}\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0088\n\t\5\t\u008a\n\t\3\t\5\t\u008d\n\t\6\t"+
		"\u008f\n\t\r\t\16\t\u0090\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009b\n"+
		"\n\3\13\3\13\5\13\u009f\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00ad\n\f\f\f\16\f\u00b0\13\f\3\f\5\f\u00b3\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17"+
		"\u00c5\n\17\3\20\3\20\3\20\5\20\u00ca\n\20\3\21\3\21\3\21\5\21\u00cf\n"+
		"\21\3\22\3\22\3\22\5\22\u00d4\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00df\n\23\f\23\16\23\u00e2\13\23\3\23\3\23\5\23\u00e6"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ed\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u00fc\n\25\f\25\16\25\u00ff"+
		"\13\25\5\25\u0101\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0110\n\26\5\26\u0112\n\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\5\27\u011a\n\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\2\7\3\2\4\7\3\2\36\37\3\2\24\31\3\2\20\21\3\2\22\23\2\u0136"+
		"\2\62\3\2\2\2\4C\3\2\2\2\6J\3\2\2\2\bS\3\2\2\2\na\3\2\2\2\fc\3\2\2\2\16"+
		"x\3\2\2\2\20~\3\2\2\2\22\u0092\3\2\2\2\24\u009e\3\2\2\2\26\u00a4\3\2\2"+
		"\2\30\u00b4\3\2\2\2\32\u00bc\3\2\2\2\34\u00c1\3\2\2\2\36\u00c6\3\2\2\2"+
		" \u00cb\3\2\2\2\"\u00d0\3\2\2\2$\u00ec\3\2\2\2&\u00ee\3\2\2\2(\u00f6\3"+
		"\2\2\2*\u0104\3\2\2\2,\u0115\3\2\2\2.\u011d\3\2\2\2\60\u0120\3\2\2\2\62"+
		"\63\7#\2\2\63\64\7+\2\2\648\7\34\2\2\65\67\5\20\t\2\66\65\3\2\2\2\67:"+
		"\3\2\2\28\66\3\2\2\289\3\2\2\29>\3\2\2\2:8\3\2\2\2;=\5\6\4\2<;\3\2\2\2"+
		"=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\5\4\3\2B\3\3\2\2"+
		"\2CD\7\t\2\2DE\7\3\2\2EF\7\n\2\2FG\7\13\2\2GH\5\f\7\2H\5\3\2\2\2IK\5\b"+
		"\5\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\t\2\2MN\7+\2\2NO\7\n\2\2OP\5\n"+
		"\6\2PQ\7\13\2\2QR\5\f\7\2R\7\3\2\2\2ST\t\2\2\2T\t\3\2\2\2UV\5\b\5\2VW"+
		"\7+\2\2W^\3\2\2\2XY\7\33\2\2YZ\5\b\5\2Z[\7+\2\2[]\3\2\2\2\\X\3\2\2\2]"+
		"`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aU\3\2\2\2ab\3\2\2\2"+
		"b\13\3\2\2\2cg\7\f\2\2df\5\20\t\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2"+
		"\2\2hj\3\2\2\2ig\3\2\2\2jl\5\16\b\2km\5.\30\2lk\3\2\2\2lm\3\2\2\2mn\3"+
		"\2\2\2no\7\r\2\2o\r\3\2\2\2pw\5(\25\2qw\5\24\13\2rw\5\26\f\2sw\5&\24\2"+
		"tw\5,\27\2uw\5*\26\2vp\3\2\2\2vq\3\2\2\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2"+
		"vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{}\5.\30\2"+
		"|{\3\2\2\2|}\3\2\2\2}\17\3\2\2\2~\u008e\5\b\5\2\177\u0089\7+\2\2\u0080"+
		"\u0081\7\16\2\2\u0081\u0082\7$\2\2\u0082\u0083\7\17\2\2\u0083\u0087\3"+
		"\2\2\2\u0084\u0085\7\16\2\2\u0085\u0086\7$\2\2\u0086\u0088\7\17\2\2\u0087"+
		"\u0084\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0080\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\7\33\2\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\177\3\2\2"+
		"\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\21"+
		"\3\2\2\2\u0092\u0093\7+\2\2\u0093\u0094\7\16\2\2\u0094\u0095\5 \21\2\u0095"+
		"\u009a\7\17\2\2\u0096\u0097\7\16\2\2\u0097\u0098\5 \21\2\u0098\u0099\7"+
		"\17\2\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\23\3\2\2\2\u009c\u009f\7+\2\2\u009d\u009f\5\22\n\2\u009e\u009c\3\2\2"+
		"\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\32\2\2\u00a1"+
		"\u00a2\5\34\17\2\u00a2\u00a3\7\35\2\2\u00a3\25\3\2\2\2\u00a4\u00a5\7 "+
		"\2\2\u00a5\u00a6\7\n\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\7\13\2\2\u00a8"+
		"\u00a9\7\f\2\2\u00a9\u00aa\5\16\b\2\u00aa\u00ae\7\r\2\2\u00ab\u00ad\5"+
		"\30\r\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\5\32"+
		"\16\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\27\3\2\2\2\u00b4\u00b5"+
		"\7\"\2\2\u00b5\u00b6\7\n\2\2\u00b6\u00b7\5\34\17\2\u00b7\u00b8\7\13\2"+
		"\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba\5\16\b\2\u00ba\u00bb\7\r\2\2\u00bb"+
		"\31\3\2\2\2\u00bc\u00bd\7!\2\2\u00bd\u00be\7\f\2\2\u00be\u00bf\5\16\b"+
		"\2\u00bf\u00c0\7\r\2\2\u00c0\33\3\2\2\2\u00c1\u00c4\5\36\20\2\u00c2\u00c3"+
		"\t\3\2\2\u00c3\u00c5\5\36\20\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2"+
		"\u00c5\35\3\2\2\2\u00c6\u00c9\5 \21\2\u00c7\u00c8\t\4\2\2\u00c8\u00ca"+
		"\5 \21\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\37\3\2\2\2\u00cb"+
		"\u00ce\5\"\22\2\u00cc\u00cd\t\5\2\2\u00cd\u00cf\5 \21\2\u00ce\u00cc\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf!\3\2\2\2\u00d0\u00d3\5$\23\2\u00d1\u00d2"+
		"\t\6\2\2\u00d2\u00d4\5\"\22\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4#\3\2\2\2\u00d5\u00d6\7\n\2\2\u00d6\u00d7\5\34\17\2\u00d7\u00d8"+
		"\7\13\2\2\u00d8\u00ed\3\2\2\2\u00d9\u00e5\7+\2\2\u00da\u00db\7\n\2\2\u00db"+
		"\u00e0\5\34\17\2\u00dc\u00dd\7\33\2\2\u00dd\u00df\5\34\17\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\13\2\2\u00e4\u00e6\3"+
		"\2\2\2\u00e5\u00da\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ed\3\2\2\2\u00e7"+
		"\u00ed\5\22\n\2\u00e8\u00ed\7$\2\2\u00e9\u00ed\7%\2\2\u00ea\u00ed\7&\2"+
		"\2\u00eb\u00ed\7,\2\2\u00ec\u00d5\3\2\2\2\u00ec\u00d9\3\2\2\2\u00ec\u00e7"+
		"\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed%\3\2\2\2\u00ee\u00ef\7(\2\2\u00ef\u00f0\7\n\2\2\u00f0"+
		"\u00f1\5\34\17\2\u00f1\u00f2\7\13\2\2\u00f2\u00f3\7\f\2\2\u00f3\u00f4"+
		"\5\16\b\2\u00f4\u00f5\7\r\2\2\u00f5\'\3\2\2\2\u00f6\u00f7\7+\2\2\u00f7"+
		"\u0100\7\n\2\2\u00f8\u00fd\5\34\17\2\u00f9\u00fa\7\33\2\2\u00fa\u00fc"+
		"\5\34\17\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u00f8"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\13\2\2"+
		"\u0103)\3\2\2\2\u0104\u0105\7\'\2\2\u0105\u0106\7\n\2\2\u0106\u0111\7"+
		"+\2\2\u0107\u0108\7\16\2\2\u0108\u0109\5\34\17\2\u0109\u010a\7\17\2\2"+
		"\u010a\u010f\3\2\2\2\u010b\u010c\7\16\2\2\u010c\u010d\5\34\17\2\u010d"+
		"\u010e\7\17\2\2\u010e\u0110\3\2\2\2\u010f\u010b\3\2\2\2\u010f\u0110\3"+
		"\2\2\2\u0110\u0112\3\2\2\2\u0111\u0107\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\7\13\2\2\u0114+\3\2\2\2\u0115\u0116\7)\2\2"+
		"\u0116\u0119\7\n\2\2\u0117\u011a\5\34\17\2\u0118\u011a\5\22\n\2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\13"+
		"\2\2\u011c-\3\2\2\2\u011d\u011e\7*\2\2\u011e\u011f\5\34\17\2\u011f/\3"+
		"\2\2\2\u0120\u0121\7\b\2\2\u0121\u0122\7\n\2\2\u0122\u0123\5\22\n\2\u0123"+
		"\u0124\7\33\2\2\u0124\u0125\5\22\n\2\u0125\u0126\7\r\2\2\u0126\61\3\2"+
		"\2\2 8>J^aglvx|\u0087\u0089\u008c\u0090\u009a\u009e\u00ae\u00b2\u00c4"+
		"\u00c9\u00ce\u00d3\u00e0\u00e5\u00ec\u00fd\u0100\u010f\u0111\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}