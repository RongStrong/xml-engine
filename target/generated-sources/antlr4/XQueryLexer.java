// Generated from XQuery.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, LANGLE=6, RANGLE=7, LBRACE=8, 
		RBRACE=9, JOIN=10, IN=11, LET=12, FOR=13, WHERE=14, RETURN=15, EMPTY=16, 
		SOME=17, SATISFIES=18, StringConstant=19, NOT=20, OR=21, AND=22, IS=23, 
		DEQUAL=24, EQUAL=25, CEQUAL=26, TEXT=27, LPAREN=28, RPAREN=29, LBRACKET=30, 
		RBRACKET=31, SLASH=32, STAR=33, DSLASH=34, DOT=35, DDOT=36, AT=37, COMMA=38, 
		NAME=39, FILENAME=40, WHITESPACE=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "LANGLE", "RANGLE", "LBRACE", 
		"RBRACE", "JOIN", "IN", "LET", "FOR", "WHERE", "RETURN", "EMPTY", "SOME", 
		"SATISFIES", "StringConstant", "NOT", "OR", "AND", "IS", "DEQUAL", "EQUAL", 
		"CEQUAL", "TEXT", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "SLASH", 
		"STAR", "DSLASH", "DOT", "DDOT", "AT", "COMMA", "NAME", "FILENAME", "WHITESPACE"
	};


	public XQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u00f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\6\24\u00a5\n\24\r\24\16\24\u00a6\3\24\6\24\u00aa\n\24\r\24\16\24\u00ab"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3"+
		"$\3%\3%\3%\3&\3&\3\'\3\'\3(\6(\u00e4\n(\r(\16(\u00e5\3)\6)\u00e9\n)\r"+
		")\16)\u00ea\3)\3)\3)\3)\3)\3*\6*\u00f3\n*\r*\16*\u00f4\3*\3*\2\2+\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+\3\2\6\n\2\"$)).\60\62;==AAC\\c|\7\2//\62;C\\aa"+
		"c|\6\2\60;C\\aac|\5\2\13\f\17\17\"\"\u00fc\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5X\3\2\2\2\7Z\3\2"+
		"\2\2\t\\\3\2\2\2\13e\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2\23o\3"+
		"\2\2\2\25q\3\2\2\2\27v\3\2\2\2\31y\3\2\2\2\33}\3\2\2\2\35\u0081\3\2\2"+
		"\2\37\u0087\3\2\2\2!\u008e\3\2\2\2#\u0094\3\2\2\2%\u0099\3\2\2\2\'\u00a4"+
		"\3\2\2\2)\u00af\3\2\2\2+\u00b3\3\2\2\2-\u00b6\3\2\2\2/\u00ba\3\2\2\2\61"+
		"\u00bd\3\2\2\2\63\u00c0\3\2\2\2\65\u00c2\3\2\2\2\67\u00c5\3\2\2\29\u00ca"+
		"\3\2\2\2;\u00cc\3\2\2\2=\u00ce\3\2\2\2?\u00d0\3\2\2\2A\u00d2\3\2\2\2C"+
		"\u00d4\3\2\2\2E\u00d6\3\2\2\2G\u00d9\3\2\2\2I\u00db\3\2\2\2K\u00de\3\2"+
		"\2\2M\u00e0\3\2\2\2O\u00e3\3\2\2\2Q\u00e8\3\2\2\2S\u00f2\3\2\2\2UV\7<"+
		"\2\2VW\7?\2\2W\4\3\2\2\2XY\7$\2\2Y\6\3\2\2\2Z[\7&\2\2[\b\3\2\2\2\\]\7"+
		"f\2\2]^\7q\2\2^_\7e\2\2_`\7w\2\2`a\7o\2\2ab\7g\2\2bc\7p\2\2cd\7v\2\2d"+
		"\n\3\2\2\2ef\7f\2\2fg\7q\2\2gh\7e\2\2h\f\3\2\2\2ij\7>\2\2j\16\3\2\2\2"+
		"kl\7@\2\2l\20\3\2\2\2mn\7}\2\2n\22\3\2\2\2op\7\177\2\2p\24\3\2\2\2qr\7"+
		"l\2\2rs\7q\2\2st\7k\2\2tu\7p\2\2u\26\3\2\2\2vw\7k\2\2wx\7p\2\2x\30\3\2"+
		"\2\2yz\7n\2\2z{\7g\2\2{|\7v\2\2|\32\3\2\2\2}~\7h\2\2~\177\7q\2\2\177\u0080"+
		"\7t\2\2\u0080\34\3\2\2\2\u0081\u0082\7y\2\2\u0082\u0083\7j\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\36\3\2\2\2\u0087\u0088"+
		"\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7v\2\2\u008a\u008b\7w\2\2\u008b"+
		"\u008c\7t\2\2\u008c\u008d\7p\2\2\u008d \3\2\2\2\u008e\u008f\7g\2\2\u008f"+
		"\u0090\7o\2\2\u0090\u0091\7r\2\2\u0091\u0092\7v\2\2\u0092\u0093\7{\2\2"+
		"\u0093\"\3\2\2\2\u0094\u0095\7u\2\2\u0095\u0096\7q\2\2\u0096\u0097\7o"+
		"\2\2\u0097\u0098\7g\2\2\u0098$\3\2\2\2\u0099\u009a\7u\2\2\u009a\u009b"+
		"\7c\2\2\u009b\u009c\7v\2\2\u009c\u009d\7k\2\2\u009d\u009e\7u\2\2\u009e"+
		"\u009f\7h\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7u\2\2"+
		"\u00a2&\3\2\2\2\u00a3\u00a5\7$\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00aa\t\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7$\2\2\u00ae"+
		"(\3\2\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"*\3\2\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7t\2\2\u00b5,\3\2\2\2\u00b6\u00b7"+
		"\7c\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7f\2\2\u00b9.\3\2\2\2\u00ba\u00bb"+
		"\7k\2\2\u00bb\u00bc\7u\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7?\2\2\u00be\u00bf"+
		"\7?\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\7?\2\2\u00c1\64\3\2\2\2\u00c2\u00c3"+
		"\7g\2\2\u00c3\u00c4\7s\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7"+
		"\7g\2\2\u00c7\u00c8\7z\2\2\u00c8\u00c9\7v\2\2\u00c98\3\2\2\2\u00ca\u00cb"+
		"\7*\2\2\u00cb:\3\2\2\2\u00cc\u00cd\7+\2\2\u00cd<\3\2\2\2\u00ce\u00cf\7"+
		"]\2\2\u00cf>\3\2\2\2\u00d0\u00d1\7_\2\2\u00d1@\3\2\2\2\u00d2\u00d3\7\61"+
		"\2\2\u00d3B\3\2\2\2\u00d4\u00d5\7,\2\2\u00d5D\3\2\2\2\u00d6\u00d7\7\61"+
		"\2\2\u00d7\u00d8\7\61\2\2\u00d8F\3\2\2\2\u00d9\u00da\7\60\2\2\u00daH\3"+
		"\2\2\2\u00db\u00dc\7\60\2\2\u00dc\u00dd\7\60\2\2\u00ddJ\3\2\2\2\u00de"+
		"\u00df\7B\2\2\u00dfL\3\2\2\2\u00e0\u00e1\7.\2\2\u00e1N\3\2\2\2\u00e2\u00e4"+
		"\t\3\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6P\3\2\2\2\u00e7\u00e9\t\4\2\2\u00e8\u00e7\3\2\2\2"+
		"\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ed\7\60\2\2\u00ed\u00ee\7z\2\2\u00ee\u00ef\7o\2\2\u00ef"+
		"\u00f0\7n\2\2\u00f0R\3\2\2\2\u00f1\u00f3\t\5\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f7\b*\2\2\u00f7T\3\2\2\2\b\2\u00a6\u00ab\u00e5\u00ea\u00f4"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}