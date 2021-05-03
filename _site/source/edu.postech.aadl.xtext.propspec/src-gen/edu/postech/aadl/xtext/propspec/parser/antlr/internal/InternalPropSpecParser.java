package edu.postech.aadl.xtext.propspec.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.postech.aadl.xtext.propspec.services.PropSpecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPropSpecParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Reachability", "Proposition", "Classifier", "Invariant", "Reference", "Constant", "Instance", "Symbolic", "Applies", "Binding", "Compute", "Random", "Delta", "False", "Model", "Modes", "Name", "Time", "True", "PlusSignEqualsSignGreaterThanSign", "EqualsSignEqualsSignGreaterThanSign", "Abs", "And", "Not", "Xor", "ExclamationMarkEqualsSign", "FullStopFullStop", "ColonColon", "LessThanSignEqualsSign", "EqualsSignGreaterThanSign", "GreaterThanSignEqualsSign", "In", "Or", "To", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_REAL_LIT", "RULE_BASED_INTEGER", "RULE_INTEGER_LIT", "RULE_EXTENDED_DIGIT", "RULE_STRING", "RULE_ID", "RULE_WS"
    };
    public static final int Or=36;
    public static final int EqualsSignGreaterThanSign=33;
    public static final int True=22;
    public static final int False=17;
    public static final int LessThanSign=48;
    public static final int Name=20;
    public static final int RULE_INT_EXPONENT=60;
    public static final int PlusSignEqualsSignGreaterThanSign=23;
    public static final int LeftParenthesis=38;
    public static final int Random=15;
    public static final int FullStopFullStop=30;
    public static final int To=37;
    public static final int Applies=12;
    public static final int RULE_BASED_INTEGER=62;
    public static final int RightSquareBracket=53;
    public static final int Binding=13;
    public static final int GreaterThanSign=50;
    public static final int RULE_ID=66;
    public static final int RightParenthesis=39;
    public static final int RULE_DIGIT=58;
    public static final int Reachability=4;
    public static final int GreaterThanSignEqualsSign=34;
    public static final int ColonColon=31;
    public static final int Not=27;
    public static final int VerticalLine=55;
    public static final int And=26;
    public static final int PlusSign=41;
    public static final int Xor=28;
    public static final int LeftSquareBracket=52;
    public static final int Symbolic=11;
    public static final int RULE_INTEGER_LIT=63;
    public static final int Invariant=7;
    public static final int Instance=10;
    public static final int In=35;
    public static final int Constant=9;
    public static final int RULE_REAL_LIT=61;
    public static final int Time=21;
    public static final int RULE_STRING=65;
    public static final int Classifier=6;
    public static final int RULE_SL_COMMENT=57;
    public static final int Comma=42;
    public static final int EqualsSign=49;
    public static final int HyphenMinus=43;
    public static final int Abs=25;
    public static final int LessThanSignEqualsSign=32;
    public static final int Solidus=45;
    public static final int Colon=46;
    public static final int RightCurlyBracket=56;
    public static final int Proposition=5;
    public static final int EOF=-1;
    public static final int Asterisk=40;
    public static final int Modes=19;
    public static final int FullStop=44;
    public static final int RULE_WS=67;
    public static final int Reference=8;
    public static final int LeftCurlyBracket=54;
    public static final int Semicolon=47;
    public static final int RULE_EXPONENT=59;
    public static final int EqualsSignEqualsSignGreaterThanSign=24;
    public static final int Delta=16;
    public static final int QuestionMark=51;
    public static final int Compute=14;
    public static final int Model=18;
    public static final int RULE_EXTENDED_DIGIT=64;
    public static final int ExclamationMarkEqualsSign=29;

    // delegates
    // delegators


        public InternalPropSpecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPropSpecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPropSpecParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPropSpecParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     

    	private PropSpecGrammarAccess grammarAccess;
    	 	
    	public InternalPropSpecParser(TokenStream input, PropSpecGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "Top";	
    	} 
    	   	   	
    	@Override
    	protected PropSpecGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleTop"
    // InternalPropSpecParser.g:68:1: entryRuleTop returns [EObject current=null] : iv_ruleTop= ruleTop EOF ;
    public final EObject entryRuleTop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTop = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getTopAccess().getUnorderedGroup()
        		);
        	
        try {
            // InternalPropSpecParser.g:74:2: (iv_ruleTop= ruleTop EOF )
            // InternalPropSpecParser.g:75:2: iv_ruleTop= ruleTop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTop=ruleTop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTop; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTop"


    // $ANTLR start "ruleTop"
    // InternalPropSpecParser.g:85:1: ruleTop returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) ) ) ;
    public final EObject ruleTop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_path_11_0=null;
        Token otherlv_12=null;
        EObject lv_proposition_13_0 = null;

        EObject lv_property_14_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getTopAccess().getUnorderedGroup()
        		);
            
        try {
            // InternalPropSpecParser.g:91:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) ) ) )
            // InternalPropSpecParser.g:92:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) ) )
            {
            // InternalPropSpecParser.g:92:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) ) )
            // InternalPropSpecParser.g:94:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) )
            {
            // InternalPropSpecParser.g:94:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) ) )+ {...}?) )
            // InternalPropSpecParser.g:95:2: ( ( ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getTopAccess().getUnorderedGroup());
            // InternalPropSpecParser.g:98:2: ( ( ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) ) )+ {...}?)
            // InternalPropSpecParser.g:99:3: ( ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) ) )+ {...}?
            {
            // InternalPropSpecParser.g:99:3: ( ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=5;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == Model && getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == Instance && getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 == Proposition && getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 3) ) {
                    alt3=4;
                }
                else if ( LA3_0 == Reachability && getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 3) ) {
                    alt3=4;
                }
                else if ( LA3_0 == Invariant && getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 3) ) {
                    alt3=4;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPropSpecParser.g:101:4: ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) )
            	    {
            	    // InternalPropSpecParser.g:101:4: ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) )
            	    // InternalPropSpecParser.g:102:5: {...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalPropSpecParser.g:102:98: ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) )
            	    // InternalPropSpecParser.g:103:6: ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTopAccess().getUnorderedGroup(), 0);
            	    // InternalPropSpecParser.g:106:6: ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) )
            	    // InternalPropSpecParser.g:106:7: {...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTop", "true");
            	    }
            	    // InternalPropSpecParser.g:106:16: (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon )
            	    // InternalPropSpecParser.g:107:2: otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon
            	    {
            	    otherlv_1=(Token)match(input,Name,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTopAccess().getNameKeyword_0_0());
            	          
            	    }
            	    otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTopAccess().getColonKeyword_0_1());
            	          
            	    }
            	    // InternalPropSpecParser.g:116:1: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalPropSpecParser.g:117:1: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalPropSpecParser.g:117:1: (lv_name_3_0= RULE_ID )
            	    // InternalPropSpecParser.g:118:3: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_name_3_0, grammarAccess.getTopAccess().getNameIDTerminalRuleCall_0_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTopRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"name",
            	              		lv_name_3_0, 
            	              		"org.osate.xtext.aadl2.properties.Properties.ID");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,Semicolon,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getTopAccess().getSemicolonKeyword_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTopAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPropSpecParser.g:146:4: ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) )
            	    {
            	    // InternalPropSpecParser.g:146:4: ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) )
            	    // InternalPropSpecParser.g:147:5: {...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalPropSpecParser.g:147:98: ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) )
            	    // InternalPropSpecParser.g:148:6: ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTopAccess().getUnorderedGroup(), 1);
            	    // InternalPropSpecParser.g:151:6: ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) )
            	    // InternalPropSpecParser.g:151:7: {...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTop", "true");
            	    }
            	    // InternalPropSpecParser.g:151:16: (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon )
            	    // InternalPropSpecParser.g:152:2: otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon
            	    {
            	    otherlv_5=(Token)match(input,Model,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getTopAccess().getModelKeyword_1_0());
            	          
            	    }
            	    otherlv_6=(Token)match(input,Colon,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTopAccess().getColonKeyword_1_1());
            	          
            	    }
            	    // InternalPropSpecParser.g:161:1: ( ( ruleQCREF ) )
            	    // InternalPropSpecParser.g:162:1: ( ruleQCREF )
            	    {
            	    // InternalPropSpecParser.g:162:1: ( ruleQCREF )
            	    // InternalPropSpecParser.g:163:3: ruleQCREF
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTopRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTopAccess().getModelComponentClassifierCrossReference_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    ruleQCREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_8=(Token)match(input,Semicolon,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getTopAccess().getSemicolonKeyword_1_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTopAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPropSpecParser.g:192:4: ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) )
            	    {
            	    // InternalPropSpecParser.g:192:4: ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) )
            	    // InternalPropSpecParser.g:193:5: {...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalPropSpecParser.g:193:98: ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) )
            	    // InternalPropSpecParser.g:194:6: ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTopAccess().getUnorderedGroup(), 2);
            	    // InternalPropSpecParser.g:197:6: ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) )
            	    // InternalPropSpecParser.g:197:7: {...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTop", "true");
            	    }
            	    // InternalPropSpecParser.g:197:16: (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon )
            	    // InternalPropSpecParser.g:198:2: otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon
            	    {
            	    otherlv_9=(Token)match(input,Instance,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getTopAccess().getInstanceKeyword_2_0());
            	          
            	    }
            	    otherlv_10=(Token)match(input,Colon,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getTopAccess().getColonKeyword_2_1());
            	          
            	    }
            	    // InternalPropSpecParser.g:207:1: ( (lv_path_11_0= RULE_STRING ) )
            	    // InternalPropSpecParser.g:208:1: (lv_path_11_0= RULE_STRING )
            	    {
            	    // InternalPropSpecParser.g:208:1: (lv_path_11_0= RULE_STRING )
            	    // InternalPropSpecParser.g:209:3: lv_path_11_0= RULE_STRING
            	    {
            	    lv_path_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_path_11_0, grammarAccess.getTopAccess().getPathSTRINGTerminalRuleCall_2_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTopRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"path",
            	              		lv_path_11_0, 
            	              		"org.osate.xtext.aadl2.properties.Properties.STRING");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_12=(Token)match(input,Semicolon,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getTopAccess().getSemicolonKeyword_2_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTopAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPropSpecParser.g:237:4: ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) )
            	    {
            	    // InternalPropSpecParser.g:237:4: ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) )
            	    // InternalPropSpecParser.g:238:5: {...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTop", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalPropSpecParser.g:238:98: ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ )
            	    // InternalPropSpecParser.g:239:6: ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTopAccess().getUnorderedGroup(), 3);
            	    // InternalPropSpecParser.g:242:6: ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        switch ( input.LA(1) ) {
            	        case Proposition:
            	            {
            	            int LA2_2 = input.LA(2);

            	            if ( ((synpred5_InternalPropSpecParser()&&(true))) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;
            	        case Reachability:
            	            {
            	            int LA2_3 = input.LA(2);

            	            if ( ((synpred5_InternalPropSpecParser()&&(true))) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;
            	        case Invariant:
            	            {
            	            int LA2_4 = input.LA(2);

            	            if ( ((synpred5_InternalPropSpecParser()&&(true))) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalPropSpecParser.g:242:7: {...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleTop", "true");
            	    	    }
            	    	    // InternalPropSpecParser.g:242:16: ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) )
            	    	    int alt1=2;
            	    	    int LA1_0 = input.LA(1);

            	    	    if ( (LA1_0==Proposition) ) {
            	    	        alt1=1;
            	    	    }
            	    	    else if ( (LA1_0==Reachability||LA1_0==Invariant) ) {
            	    	        alt1=2;
            	    	    }
            	    	    else {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 1, 0, input);

            	    	        throw nvae;
            	    	    }
            	    	    switch (alt1) {
            	    	        case 1 :
            	    	            // InternalPropSpecParser.g:242:17: ( (lv_proposition_13_0= ruleProposition ) )
            	    	            {
            	    	            // InternalPropSpecParser.g:242:17: ( (lv_proposition_13_0= ruleProposition ) )
            	    	            // InternalPropSpecParser.g:243:1: (lv_proposition_13_0= ruleProposition )
            	    	            {
            	    	            // InternalPropSpecParser.g:243:1: (lv_proposition_13_0= ruleProposition )
            	    	            // InternalPropSpecParser.g:244:3: lv_proposition_13_0= ruleProposition
            	    	            {
            	    	            if ( state.backtracking==0 ) {
            	    	               
            	    	              	        newCompositeNode(grammarAccess.getTopAccess().getPropositionPropositionParserRuleCall_3_0_0()); 
            	    	              	    
            	    	            }
            	    	            pushFollow(FollowSets000.FOLLOW_6);
            	    	            lv_proposition_13_0=ruleProposition();

            	    	            state._fsp--;
            	    	            if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              	        if (current==null) {
            	    	              	            current = createModelElementForParent(grammarAccess.getTopRule());
            	    	              	        }
            	    	                     		add(
            	    	                     			current, 
            	    	                     			"proposition",
            	    	                      		lv_proposition_13_0, 
            	    	                      		"edu.postech.aadl.xtext.propspec.PropSpec.Proposition");
            	    	              	        afterParserOrEnumRuleCall();
            	    	              	    
            	    	            }

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalPropSpecParser.g:261:6: ( (lv_property_14_0= ruleProperty ) )
            	    	            {
            	    	            // InternalPropSpecParser.g:261:6: ( (lv_property_14_0= ruleProperty ) )
            	    	            // InternalPropSpecParser.g:262:1: (lv_property_14_0= ruleProperty )
            	    	            {
            	    	            // InternalPropSpecParser.g:262:1: (lv_property_14_0= ruleProperty )
            	    	            // InternalPropSpecParser.g:263:3: lv_property_14_0= ruleProperty
            	    	            {
            	    	            if ( state.backtracking==0 ) {
            	    	               
            	    	              	        newCompositeNode(grammarAccess.getTopAccess().getPropertyPropertyParserRuleCall_3_1_0()); 
            	    	              	    
            	    	            }
            	    	            pushFollow(FollowSets000.FOLLOW_6);
            	    	            lv_property_14_0=ruleProperty();

            	    	            state._fsp--;
            	    	            if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              	        if (current==null) {
            	    	              	            current = createModelElementForParent(grammarAccess.getTopRule());
            	    	              	        }
            	    	                     		add(
            	    	                     			current, 
            	    	                     			"property",
            	    	                      		lv_property_14_0, 
            	    	                      		"edu.postech.aadl.xtext.propspec.PropSpec.Property");
            	    	              	        afterParserOrEnumRuleCall();
            	    	              	    
            	    	            }

            	    	            }


            	    	            }


            	    	            }
            	    	            break;

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTopAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTopAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleTop", "getUnorderedGroupHelper().canLeave(grammarAccess.getTopAccess().getUnorderedGroup())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getTopAccess().getUnorderedGroup());

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTop"


    // $ANTLR start "entryRuleProperty"
    // InternalPropSpecParser.g:305:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalPropSpecParser.g:306:2: (iv_ruleProperty= ruleProperty EOF )
            // InternalPropSpecParser.g:307:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalPropSpecParser.g:314:1: ruleProperty returns [EObject current=null] : (this_Reachability_0= ruleReachability | this_Invariant_1= ruleInvariant ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Reachability_0 = null;

        EObject this_Invariant_1 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:317:28: ( (this_Reachability_0= ruleReachability | this_Invariant_1= ruleInvariant ) )
            // InternalPropSpecParser.g:318:1: (this_Reachability_0= ruleReachability | this_Invariant_1= ruleInvariant )
            {
            // InternalPropSpecParser.g:318:1: (this_Reachability_0= ruleReachability | this_Invariant_1= ruleInvariant )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Reachability) ) {
                alt4=1;
            }
            else if ( (LA4_0==Invariant) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPropSpecParser.g:319:2: this_Reachability_0= ruleReachability
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getReachabilityParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Reachability_0=ruleReachability();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Reachability_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:332:2: this_Invariant_1= ruleInvariant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getInvariantParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Invariant_1=ruleInvariant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Invariant_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleReachability"
    // InternalPropSpecParser.g:351:1: entryRuleReachability returns [EObject current=null] : iv_ruleReachability= ruleReachability EOF ;
    public final EObject entryRuleReachability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReachability = null;


        try {
            // InternalPropSpecParser.g:352:2: (iv_ruleReachability= ruleReachability EOF )
            // InternalPropSpecParser.g:353:2: iv_ruleReachability= ruleReachability EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReachabilityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReachability=ruleReachability();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReachability; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReachability"


    // $ANTLR start "ruleReachability"
    // InternalPropSpecParser.g:360:1: ruleReachability returns [EObject current=null] : (otherlv_0= Reachability otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )? ( (lv_goalCond_7_0= rulePSExpression ) ) otherlv_8= In otherlv_9= Time ( (lv_bound_10_0= ruleINTVALUE ) ) otherlv_11= Semicolon ) ;
    public final EObject ruleReachability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_initCond_5_0 = null;

        EObject lv_goalCond_7_0 = null;

        AntlrDatatypeRuleToken lv_bound_10_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:363:28: ( (otherlv_0= Reachability otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )? ( (lv_goalCond_7_0= rulePSExpression ) ) otherlv_8= In otherlv_9= Time ( (lv_bound_10_0= ruleINTVALUE ) ) otherlv_11= Semicolon ) )
            // InternalPropSpecParser.g:364:1: (otherlv_0= Reachability otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )? ( (lv_goalCond_7_0= rulePSExpression ) ) otherlv_8= In otherlv_9= Time ( (lv_bound_10_0= ruleINTVALUE ) ) otherlv_11= Semicolon )
            {
            // InternalPropSpecParser.g:364:1: (otherlv_0= Reachability otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )? ( (lv_goalCond_7_0= rulePSExpression ) ) otherlv_8= In otherlv_9= Time ( (lv_bound_10_0= ruleINTVALUE ) ) otherlv_11= Semicolon )
            // InternalPropSpecParser.g:365:2: otherlv_0= Reachability otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )? ( (lv_goalCond_7_0= rulePSExpression ) ) otherlv_8= In otherlv_9= Time ( (lv_bound_10_0= ruleINTVALUE ) ) otherlv_11= Semicolon
            {
            otherlv_0=(Token)match(input,Reachability,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReachabilityAccess().getReachabilityKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReachabilityAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalPropSpecParser.g:374:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalPropSpecParser.g:375:1: (lv_name_2_0= RULE_ID )
            {
            // InternalPropSpecParser.g:375:1: (lv_name_2_0= RULE_ID )
            // InternalPropSpecParser.g:376:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getReachabilityAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReachabilityRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReachabilityAccess().getRightSquareBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getReachabilityAccess().getColonKeyword_4());
                  
            }
            // InternalPropSpecParser.g:402:1: ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalPropSpecParser.g:402:2: ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign
                    {
                    // InternalPropSpecParser.g:402:2: ( (lv_initCond_5_0= rulePSExpression ) )
                    // InternalPropSpecParser.g:403:1: (lv_initCond_5_0= rulePSExpression )
                    {
                    // InternalPropSpecParser.g:403:1: (lv_initCond_5_0= rulePSExpression )
                    // InternalPropSpecParser.g:404:3: lv_initCond_5_0= rulePSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReachabilityAccess().getInitCondPSExpressionParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_initCond_5_0=rulePSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReachabilityRule());
                      	        }
                             		set(
                             			current, 
                             			"initCond",
                              		lv_initCond_5_0, 
                              		"edu.postech.aadl.xtext.propspec.PropSpec.PSExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,EqualsSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReachabilityAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_5_1());
                          
                    }

                    }
                    break;

            }

            // InternalPropSpecParser.g:425:3: ( (lv_goalCond_7_0= rulePSExpression ) )
            // InternalPropSpecParser.g:426:1: (lv_goalCond_7_0= rulePSExpression )
            {
            // InternalPropSpecParser.g:426:1: (lv_goalCond_7_0= rulePSExpression )
            // InternalPropSpecParser.g:427:3: lv_goalCond_7_0= rulePSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReachabilityAccess().getGoalCondPSExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_goalCond_7_0=rulePSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReachabilityRule());
              	        }
                     		set(
                     			current, 
                     			"goalCond",
                      		lv_goalCond_7_0, 
                      		"edu.postech.aadl.xtext.propspec.PropSpec.PSExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,In,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getReachabilityAccess().getInKeyword_7());
                  
            }
            otherlv_9=(Token)match(input,Time,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getReachabilityAccess().getTimeKeyword_8());
                  
            }
            // InternalPropSpecParser.g:453:1: ( (lv_bound_10_0= ruleINTVALUE ) )
            // InternalPropSpecParser.g:454:1: (lv_bound_10_0= ruleINTVALUE )
            {
            // InternalPropSpecParser.g:454:1: (lv_bound_10_0= ruleINTVALUE )
            // InternalPropSpecParser.g:455:3: lv_bound_10_0= ruleINTVALUE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReachabilityAccess().getBoundINTVALUEParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bound_10_0=ruleINTVALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReachabilityRule());
              	        }
                     		set(
                     			current, 
                     			"bound",
                      		lv_bound_10_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getReachabilityAccess().getSemicolonKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReachability"


    // $ANTLR start "entryRuleInvariant"
    // InternalPropSpecParser.g:484:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // InternalPropSpecParser.g:485:2: (iv_ruleInvariant= ruleInvariant EOF )
            // InternalPropSpecParser.g:486:2: iv_ruleInvariant= ruleInvariant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvariantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvariant; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvariant"


    // $ANTLR start "ruleInvariant"
    // InternalPropSpecParser.g:493:1: ruleInvariant returns [EObject current=null] : (otherlv_0= Invariant otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )? ( (lv_goalCond_7_0= rulePSExpression ) ) otherlv_8= In otherlv_9= Time ( (lv_bound_10_0= ruleINTVALUE ) ) otherlv_11= Semicolon ) ;
    public final EObject ruleInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_initCond_5_0 = null;

        EObject lv_goalCond_7_0 = null;

        AntlrDatatypeRuleToken lv_bound_10_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:496:28: ( (otherlv_0= Invariant otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )? ( (lv_goalCond_7_0= rulePSExpression ) ) otherlv_8= In otherlv_9= Time ( (lv_bound_10_0= ruleINTVALUE ) ) otherlv_11= Semicolon ) )
            // InternalPropSpecParser.g:497:1: (otherlv_0= Invariant otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )? ( (lv_goalCond_7_0= rulePSExpression ) ) otherlv_8= In otherlv_9= Time ( (lv_bound_10_0= ruleINTVALUE ) ) otherlv_11= Semicolon )
            {
            // InternalPropSpecParser.g:497:1: (otherlv_0= Invariant otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )? ( (lv_goalCond_7_0= rulePSExpression ) ) otherlv_8= In otherlv_9= Time ( (lv_bound_10_0= ruleINTVALUE ) ) otherlv_11= Semicolon )
            // InternalPropSpecParser.g:498:2: otherlv_0= Invariant otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )? ( (lv_goalCond_7_0= rulePSExpression ) ) otherlv_8= In otherlv_9= Time ( (lv_bound_10_0= ruleINTVALUE ) ) otherlv_11= Semicolon
            {
            otherlv_0=(Token)match(input,Invariant,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInvariantAccess().getInvariantKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInvariantAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalPropSpecParser.g:507:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalPropSpecParser.g:508:1: (lv_name_2_0= RULE_ID )
            {
            // InternalPropSpecParser.g:508:1: (lv_name_2_0= RULE_ID )
            // InternalPropSpecParser.g:509:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getInvariantAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInvariantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInvariantAccess().getRightSquareBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInvariantAccess().getColonKeyword_4());
                  
            }
            // InternalPropSpecParser.g:535:1: ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )?
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalPropSpecParser.g:535:2: ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign
                    {
                    // InternalPropSpecParser.g:535:2: ( (lv_initCond_5_0= rulePSExpression ) )
                    // InternalPropSpecParser.g:536:1: (lv_initCond_5_0= rulePSExpression )
                    {
                    // InternalPropSpecParser.g:536:1: (lv_initCond_5_0= rulePSExpression )
                    // InternalPropSpecParser.g:537:3: lv_initCond_5_0= rulePSExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInvariantAccess().getInitCondPSExpressionParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_initCond_5_0=rulePSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInvariantRule());
                      	        }
                             		set(
                             			current, 
                             			"initCond",
                              		lv_initCond_5_0, 
                              		"edu.postech.aadl.xtext.propspec.PropSpec.PSExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,EqualsSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInvariantAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_5_1());
                          
                    }

                    }
                    break;

            }

            // InternalPropSpecParser.g:558:3: ( (lv_goalCond_7_0= rulePSExpression ) )
            // InternalPropSpecParser.g:559:1: (lv_goalCond_7_0= rulePSExpression )
            {
            // InternalPropSpecParser.g:559:1: (lv_goalCond_7_0= rulePSExpression )
            // InternalPropSpecParser.g:560:3: lv_goalCond_7_0= rulePSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInvariantAccess().getGoalCondPSExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_goalCond_7_0=rulePSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInvariantRule());
              	        }
                     		set(
                     			current, 
                     			"goalCond",
                      		lv_goalCond_7_0, 
                      		"edu.postech.aadl.xtext.propspec.PropSpec.PSExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,In,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getInvariantAccess().getInKeyword_7());
                  
            }
            otherlv_9=(Token)match(input,Time,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getInvariantAccess().getTimeKeyword_8());
                  
            }
            // InternalPropSpecParser.g:586:1: ( (lv_bound_10_0= ruleINTVALUE ) )
            // InternalPropSpecParser.g:587:1: (lv_bound_10_0= ruleINTVALUE )
            {
            // InternalPropSpecParser.g:587:1: (lv_bound_10_0= ruleINTVALUE )
            // InternalPropSpecParser.g:588:3: lv_bound_10_0= ruleINTVALUE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInvariantAccess().getBoundINTVALUEParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bound_10_0=ruleINTVALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInvariantRule());
              	        }
                     		set(
                     			current, 
                     			"bound",
                      		lv_bound_10_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getInvariantAccess().getSemicolonKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvariant"


    // $ANTLR start "entryRuleProposition"
    // InternalPropSpecParser.g:617:1: entryRuleProposition returns [EObject current=null] : iv_ruleProposition= ruleProposition EOF ;
    public final EObject entryRuleProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposition = null;


        try {
            // InternalPropSpecParser.g:618:2: (iv_ruleProposition= ruleProposition EOF )
            // InternalPropSpecParser.g:619:2: iv_ruleProposition= ruleProposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropositionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProposition=ruleProposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProposition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProposition"


    // $ANTLR start "ruleProposition"
    // InternalPropSpecParser.g:626:1: ruleProposition returns [EObject current=null] : (otherlv_0= Proposition otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( (lv_expression_5_0= rulePSExpression ) ) otherlv_6= Semicolon ) ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:629:28: ( (otherlv_0= Proposition otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( (lv_expression_5_0= rulePSExpression ) ) otherlv_6= Semicolon ) )
            // InternalPropSpecParser.g:630:1: (otherlv_0= Proposition otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( (lv_expression_5_0= rulePSExpression ) ) otherlv_6= Semicolon )
            {
            // InternalPropSpecParser.g:630:1: (otherlv_0= Proposition otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( (lv_expression_5_0= rulePSExpression ) ) otherlv_6= Semicolon )
            // InternalPropSpecParser.g:631:2: otherlv_0= Proposition otherlv_1= LeftSquareBracket ( (lv_name_2_0= RULE_ID ) ) otherlv_3= RightSquareBracket otherlv_4= Colon ( (lv_expression_5_0= rulePSExpression ) ) otherlv_6= Semicolon
            {
            otherlv_0=(Token)match(input,Proposition,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropositionAccess().getPropositionKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropositionAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalPropSpecParser.g:640:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalPropSpecParser.g:641:1: (lv_name_2_0= RULE_ID )
            {
            // InternalPropSpecParser.g:641:1: (lv_name_2_0= RULE_ID )
            // InternalPropSpecParser.g:642:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getPropositionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropositionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPropositionAccess().getRightSquareBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,Colon,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPropositionAccess().getColonKeyword_4());
                  
            }
            // InternalPropSpecParser.g:668:1: ( (lv_expression_5_0= rulePSExpression ) )
            // InternalPropSpecParser.g:669:1: (lv_expression_5_0= rulePSExpression )
            {
            // InternalPropSpecParser.g:669:1: (lv_expression_5_0= rulePSExpression )
            // InternalPropSpecParser.g:670:3: lv_expression_5_0= rulePSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropositionAccess().getExpressionPSExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_expression_5_0=rulePSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropositionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"edu.postech.aadl.xtext.propspec.PropSpec.PSExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPropositionAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProposition"


    // $ANTLR start "entryRuleSYMBOLIC"
    // InternalPropSpecParser.g:701:1: entryRuleSYMBOLIC returns [EObject current=null] : iv_ruleSYMBOLIC= ruleSYMBOLIC EOF ;
    public final EObject entryRuleSYMBOLIC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSYMBOLIC = null;


        try {
            // InternalPropSpecParser.g:702:2: (iv_ruleSYMBOLIC= ruleSYMBOLIC EOF )
            // InternalPropSpecParser.g:703:2: iv_ruleSYMBOLIC= ruleSYMBOLIC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSYMBOLICRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSYMBOLIC=ruleSYMBOLIC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSYMBOLIC; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSYMBOLIC"


    // $ANTLR start "ruleSYMBOLIC"
    // InternalPropSpecParser.g:710:1: ruleSYMBOLIC returns [EObject current=null] : ( (lv_name_0_0= Symbolic ) ) ;
    public final EObject ruleSYMBOLIC() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:713:28: ( ( (lv_name_0_0= Symbolic ) ) )
            // InternalPropSpecParser.g:714:1: ( (lv_name_0_0= Symbolic ) )
            {
            // InternalPropSpecParser.g:714:1: ( (lv_name_0_0= Symbolic ) )
            // InternalPropSpecParser.g:715:1: (lv_name_0_0= Symbolic )
            {
            // InternalPropSpecParser.g:715:1: (lv_name_0_0= Symbolic )
            // InternalPropSpecParser.g:716:3: lv_name_0_0= Symbolic
            {
            lv_name_0_0=(Token)match(input,Symbolic,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getSYMBOLICAccess().getNameSymbolicKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSYMBOLICRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "symbolic");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSYMBOLIC"


    // $ANTLR start "entryRuleRANDOM"
    // InternalPropSpecParser.g:738:1: entryRuleRANDOM returns [EObject current=null] : iv_ruleRANDOM= ruleRANDOM EOF ;
    public final EObject entryRuleRANDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRANDOM = null;


        try {
            // InternalPropSpecParser.g:739:2: (iv_ruleRANDOM= ruleRANDOM EOF )
            // InternalPropSpecParser.g:740:2: iv_ruleRANDOM= ruleRANDOM EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRANDOMRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRANDOM=ruleRANDOM();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRANDOM; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRANDOM"


    // $ANTLR start "ruleRANDOM"
    // InternalPropSpecParser.g:747:1: ruleRANDOM returns [EObject current=null] : ( ( (lv_name_0_0= Random ) ) otherlv_1= LeftParenthesis ( (lv_seed_2_0= ruleINTVALUE ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleRANDOM() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_seed_2_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:750:28: ( ( ( (lv_name_0_0= Random ) ) otherlv_1= LeftParenthesis ( (lv_seed_2_0= ruleINTVALUE ) ) otherlv_3= RightParenthesis ) )
            // InternalPropSpecParser.g:751:1: ( ( (lv_name_0_0= Random ) ) otherlv_1= LeftParenthesis ( (lv_seed_2_0= ruleINTVALUE ) ) otherlv_3= RightParenthesis )
            {
            // InternalPropSpecParser.g:751:1: ( ( (lv_name_0_0= Random ) ) otherlv_1= LeftParenthesis ( (lv_seed_2_0= ruleINTVALUE ) ) otherlv_3= RightParenthesis )
            // InternalPropSpecParser.g:751:2: ( (lv_name_0_0= Random ) ) otherlv_1= LeftParenthesis ( (lv_seed_2_0= ruleINTVALUE ) ) otherlv_3= RightParenthesis
            {
            // InternalPropSpecParser.g:751:2: ( (lv_name_0_0= Random ) )
            // InternalPropSpecParser.g:752:1: (lv_name_0_0= Random )
            {
            // InternalPropSpecParser.g:752:1: (lv_name_0_0= Random )
            // InternalPropSpecParser.g:753:3: lv_name_0_0= Random
            {
            lv_name_0_0=(Token)match(input,Random,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getRANDOMAccess().getNameRandomKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRANDOMRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "random");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRANDOMAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalPropSpecParser.g:772:1: ( (lv_seed_2_0= ruleINTVALUE ) )
            // InternalPropSpecParser.g:773:1: (lv_seed_2_0= ruleINTVALUE )
            {
            // InternalPropSpecParser.g:773:1: (lv_seed_2_0= ruleINTVALUE )
            // InternalPropSpecParser.g:774:3: lv_seed_2_0= ruleINTVALUE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRANDOMAccess().getSeedINTVALUEParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_seed_2_0=ruleINTVALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRANDOMRule());
              	        }
                     		set(
                     			current, 
                     			"seed",
                      		lv_seed_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRANDOMAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRANDOM"


    // $ANTLR start "entryRulePSExpression"
    // InternalPropSpecParser.g:803:1: entryRulePSExpression returns [EObject current=null] : iv_rulePSExpression= rulePSExpression EOF ;
    public final EObject entryRulePSExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePSExpression = null;


        try {
            // InternalPropSpecParser.g:804:2: (iv_rulePSExpression= rulePSExpression EOF )
            // InternalPropSpecParser.g:805:2: iv_rulePSExpression= rulePSExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPSExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePSExpression=rulePSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePSExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePSExpression"


    // $ANTLR start "rulePSExpression"
    // InternalPropSpecParser.g:812:1: rulePSExpression returns [EObject current=null] : ( (this_ScopedExpression_0= ruleScopedExpression ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )* ) | (this_Relation_4= ruleRelation ( () ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) ) ( (lv_right_7_0= ruleRelation ) ) )* ) ) ;
    public final EObject rulePSExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_6_1=null;
        Token lv_op_6_2=null;
        Token lv_op_6_3=null;
        EObject this_ScopedExpression_0 = null;

        EObject lv_right_3_0 = null;

        EObject this_Relation_4 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:815:28: ( ( (this_ScopedExpression_0= ruleScopedExpression ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )* ) | (this_Relation_4= ruleRelation ( () ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) ) ( (lv_right_7_0= ruleRelation ) ) )* ) ) )
            // InternalPropSpecParser.g:816:1: ( (this_ScopedExpression_0= ruleScopedExpression ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )* ) | (this_Relation_4= ruleRelation ( () ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) ) ( (lv_right_7_0= ruleRelation ) ) )* ) )
            {
            // InternalPropSpecParser.g:816:1: ( (this_ScopedExpression_0= ruleScopedExpression ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )* ) | (this_Relation_4= ruleRelation ( () ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) ) ( (lv_right_7_0= ruleRelation ) ) )* ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalPropSpecParser.g:816:2: (this_ScopedExpression_0= ruleScopedExpression ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )* )
                    {
                    // InternalPropSpecParser.g:816:2: (this_ScopedExpression_0= ruleScopedExpression ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )* )
                    // InternalPropSpecParser.g:817:2: this_ScopedExpression_0= ruleScopedExpression ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPSExpressionAccess().getScopedExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
                    this_ScopedExpression_0=ruleScopedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ScopedExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalPropSpecParser.g:828:1: ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case And:
                            {
                            int LA8_2 = input.LA(2);

                            if ( (synpred12_InternalPropSpecParser()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case Or:
                            {
                            int LA8_3 = input.LA(2);

                            if ( (synpred12_InternalPropSpecParser()) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case Xor:
                            {
                            int LA8_4 = input.LA(2);

                            if ( (synpred12_InternalPropSpecParser()) ) {
                                alt8=1;
                            }


                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // InternalPropSpecParser.g:828:2: () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) )
                    	    {
                    	    // InternalPropSpecParser.g:828:2: ()
                    	    // InternalPropSpecParser.g:829:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getPSExpressionAccess().getBinaryExpressionLeftAction_0_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // InternalPropSpecParser.g:837:2: ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) )
                    	    // InternalPropSpecParser.g:838:1: ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) )
                    	    {
                    	    // InternalPropSpecParser.g:838:1: ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) )
                    	    // InternalPropSpecParser.g:839:1: (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor )
                    	    {
                    	    // InternalPropSpecParser.g:839:1: (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor )
                    	    int alt7=3;
                    	    switch ( input.LA(1) ) {
                    	    case And:
                    	        {
                    	        alt7=1;
                    	        }
                    	        break;
                    	    case Or:
                    	        {
                    	        alt7=2;
                    	        }
                    	        break;
                    	    case Xor:
                    	        {
                    	        alt7=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 7, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt7) {
                    	        case 1 :
                    	            // InternalPropSpecParser.g:840:3: lv_op_2_1= And
                    	            {
                    	            lv_op_2_1=(Token)match(input,And,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      newLeafNode(lv_op_2_1, grammarAccess.getPSExpressionAccess().getOpAndKeyword_0_1_1_0_0());
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getPSExpressionRule());
                    	              	        }
                    	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPropSpecParser.g:853:8: lv_op_2_2= Or
                    	            {
                    	            lv_op_2_2=(Token)match(input,Or,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      newLeafNode(lv_op_2_2, grammarAccess.getPSExpressionAccess().getOpOrKeyword_0_1_1_0_1());
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getPSExpressionRule());
                    	              	        }
                    	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalPropSpecParser.g:866:8: lv_op_2_3= Xor
                    	            {
                    	            lv_op_2_3=(Token)match(input,Xor,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      newLeafNode(lv_op_2_3, grammarAccess.getPSExpressionAccess().getOpXorKeyword_0_1_1_0_2());
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getPSExpressionRule());
                    	              	        }
                    	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // InternalPropSpecParser.g:882:2: ( (lv_right_3_0= rulePSExpression ) )
                    	    // InternalPropSpecParser.g:883:1: (lv_right_3_0= rulePSExpression )
                    	    {
                    	    // InternalPropSpecParser.g:883:1: (lv_right_3_0= rulePSExpression )
                    	    // InternalPropSpecParser.g:884:3: lv_right_3_0= rulePSExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPSExpressionAccess().getRightPSExpressionParserRuleCall_0_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_17);
                    	    lv_right_3_0=rulePSExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPSExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"right",
                    	              		lv_right_3_0, 
                    	              		"edu.postech.aadl.xtext.propspec.PropSpec.PSExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:901:6: (this_Relation_4= ruleRelation ( () ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) ) ( (lv_right_7_0= ruleRelation ) ) )* )
                    {
                    // InternalPropSpecParser.g:901:6: (this_Relation_4= ruleRelation ( () ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) ) ( (lv_right_7_0= ruleRelation ) ) )* )
                    // InternalPropSpecParser.g:902:2: this_Relation_4= ruleRelation ( () ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) ) ( (lv_right_7_0= ruleRelation ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPSExpressionAccess().getRelationParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
                    this_Relation_4=ruleRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Relation_4;
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalPropSpecParser.g:913:1: ( () ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) ) ( (lv_right_7_0= ruleRelation ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        alt10 = dfa10.predict(input);
                        switch (alt10) {
                    	case 1 :
                    	    // InternalPropSpecParser.g:913:2: () ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) ) ( (lv_right_7_0= ruleRelation ) )
                    	    {
                    	    // InternalPropSpecParser.g:913:2: ()
                    	    // InternalPropSpecParser.g:914:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getPSExpressionAccess().getBinaryExpressionLeftAction_1_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // InternalPropSpecParser.g:922:2: ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) )
                    	    // InternalPropSpecParser.g:923:1: ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) )
                    	    {
                    	    // InternalPropSpecParser.g:923:1: ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) )
                    	    // InternalPropSpecParser.g:924:1: (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor )
                    	    {
                    	    // InternalPropSpecParser.g:924:1: (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor )
                    	    int alt9=3;
                    	    switch ( input.LA(1) ) {
                    	    case And:
                    	        {
                    	        alt9=1;
                    	        }
                    	        break;
                    	    case Or:
                    	        {
                    	        alt9=2;
                    	        }
                    	        break;
                    	    case Xor:
                    	        {
                    	        alt9=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 9, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalPropSpecParser.g:925:3: lv_op_6_1= And
                    	            {
                    	            lv_op_6_1=(Token)match(input,And,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      newLeafNode(lv_op_6_1, grammarAccess.getPSExpressionAccess().getOpAndKeyword_1_1_1_0_0());
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getPSExpressionRule());
                    	              	        }
                    	                     		setWithLastConsumed(current, "op", lv_op_6_1, null);
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPropSpecParser.g:938:8: lv_op_6_2= Or
                    	            {
                    	            lv_op_6_2=(Token)match(input,Or,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      newLeafNode(lv_op_6_2, grammarAccess.getPSExpressionAccess().getOpOrKeyword_1_1_1_0_1());
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getPSExpressionRule());
                    	              	        }
                    	                     		setWithLastConsumed(current, "op", lv_op_6_2, null);
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalPropSpecParser.g:951:8: lv_op_6_3= Xor
                    	            {
                    	            lv_op_6_3=(Token)match(input,Xor,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      newLeafNode(lv_op_6_3, grammarAccess.getPSExpressionAccess().getOpXorKeyword_1_1_1_0_2());
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getPSExpressionRule());
                    	              	        }
                    	                     		setWithLastConsumed(current, "op", lv_op_6_3, null);
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // InternalPropSpecParser.g:967:2: ( (lv_right_7_0= ruleRelation ) )
                    	    // InternalPropSpecParser.g:968:1: (lv_right_7_0= ruleRelation )
                    	    {
                    	    // InternalPropSpecParser.g:968:1: (lv_right_7_0= ruleRelation )
                    	    // InternalPropSpecParser.g:969:3: lv_right_7_0= ruleRelation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPSExpressionAccess().getRightRelationParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_17);
                    	    lv_right_7_0=ruleRelation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPSExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"right",
                    	              		lv_right_7_0, 
                    	              		"edu.postech.aadl.xtext.propspec.PropSpec.Relation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePSExpression"


    // $ANTLR start "entryRuleRelation"
    // InternalPropSpecParser.g:993:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalPropSpecParser.g:994:2: (iv_ruleRelation= ruleRelation EOF )
            // InternalPropSpecParser.g:995:2: iv_ruleRelation= ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalPropSpecParser.g:1002:1: ruleRelation returns [EObject current=null] : ( (this_ModifiedExpression_0= ruleModifiedExpression ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleModifiedExpression ) ) )? ) | (otherlv_4= QuestionMark this_PropRef_5= rulePropRef ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        Token otherlv_4=null;
        EObject this_ModifiedExpression_0 = null;

        EObject lv_right_3_0 = null;

        EObject this_PropRef_5 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:1005:28: ( ( (this_ModifiedExpression_0= ruleModifiedExpression ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleModifiedExpression ) ) )? ) | (otherlv_4= QuestionMark this_PropRef_5= rulePropRef ) ) )
            // InternalPropSpecParser.g:1006:1: ( (this_ModifiedExpression_0= ruleModifiedExpression ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleModifiedExpression ) ) )? ) | (otherlv_4= QuestionMark this_PropRef_5= rulePropRef ) )
            {
            // InternalPropSpecParser.g:1006:1: ( (this_ModifiedExpression_0= ruleModifiedExpression ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleModifiedExpression ) ) )? ) | (otherlv_4= QuestionMark this_PropRef_5= rulePropRef ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==False||LA14_0==True||LA14_0==Abs||LA14_0==Not||LA14_0==LeftParenthesis||LA14_0==PlusSign||LA14_0==HyphenMinus||LA14_0==RULE_REAL_LIT||LA14_0==RULE_INTEGER_LIT||(LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            else if ( (LA14_0==QuestionMark) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPropSpecParser.g:1006:2: (this_ModifiedExpression_0= ruleModifiedExpression ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleModifiedExpression ) ) )? )
                    {
                    // InternalPropSpecParser.g:1006:2: (this_ModifiedExpression_0= ruleModifiedExpression ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleModifiedExpression ) ) )? )
                    // InternalPropSpecParser.g:1007:2: this_ModifiedExpression_0= ruleModifiedExpression ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleModifiedExpression ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationAccess().getModifiedExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    this_ModifiedExpression_0=ruleModifiedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ModifiedExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalPropSpecParser.g:1018:1: ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleModifiedExpression ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==ExclamationMarkEqualsSign||LA13_0==LessThanSignEqualsSign||LA13_0==GreaterThanSignEqualsSign||(LA13_0>=LessThanSign && LA13_0<=GreaterThanSign)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalPropSpecParser.g:1018:2: () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign ) ) ) ( (lv_right_3_0= ruleModifiedExpression ) )
                            {
                            // InternalPropSpecParser.g:1018:2: ()
                            // InternalPropSpecParser.g:1019:2: 
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getRelationAccess().getBinaryExpressionLeftAction_0_1_0(),
                                          current);
                                  
                            }

                            }

                            // InternalPropSpecParser.g:1027:2: ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign ) ) )
                            // InternalPropSpecParser.g:1028:1: ( (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign ) )
                            {
                            // InternalPropSpecParser.g:1028:1: ( (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign ) )
                            // InternalPropSpecParser.g:1029:1: (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign )
                            {
                            // InternalPropSpecParser.g:1029:1: (lv_op_2_1= EqualsSign | lv_op_2_2= ExclamationMarkEqualsSign | lv_op_2_3= LessThanSign | lv_op_2_4= LessThanSignEqualsSign | lv_op_2_5= GreaterThanSign | lv_op_2_6= GreaterThanSignEqualsSign )
                            int alt12=6;
                            switch ( input.LA(1) ) {
                            case EqualsSign:
                                {
                                alt12=1;
                                }
                                break;
                            case ExclamationMarkEqualsSign:
                                {
                                alt12=2;
                                }
                                break;
                            case LessThanSign:
                                {
                                alt12=3;
                                }
                                break;
                            case LessThanSignEqualsSign:
                                {
                                alt12=4;
                                }
                                break;
                            case GreaterThanSign:
                                {
                                alt12=5;
                                }
                                break;
                            case GreaterThanSignEqualsSign:
                                {
                                alt12=6;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 0, input);

                                throw nvae;
                            }

                            switch (alt12) {
                                case 1 :
                                    // InternalPropSpecParser.g:1030:3: lv_op_2_1= EqualsSign
                                    {
                                    lv_op_2_1=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_19); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_op_2_1, grammarAccess.getRelationAccess().getOpEqualsSignKeyword_0_1_1_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getRelationRule());
                                      	        }
                                             		setWithLastConsumed(current, "op", lv_op_2_1, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalPropSpecParser.g:1043:8: lv_op_2_2= ExclamationMarkEqualsSign
                                    {
                                    lv_op_2_2=(Token)match(input,ExclamationMarkEqualsSign,FollowSets000.FOLLOW_19); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_op_2_2, grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_0_1_1_0_1());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getRelationRule());
                                      	        }
                                             		setWithLastConsumed(current, "op", lv_op_2_2, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 3 :
                                    // InternalPropSpecParser.g:1056:8: lv_op_2_3= LessThanSign
                                    {
                                    lv_op_2_3=(Token)match(input,LessThanSign,FollowSets000.FOLLOW_19); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_op_2_3, grammarAccess.getRelationAccess().getOpLessThanSignKeyword_0_1_1_0_2());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getRelationRule());
                                      	        }
                                             		setWithLastConsumed(current, "op", lv_op_2_3, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 4 :
                                    // InternalPropSpecParser.g:1069:8: lv_op_2_4= LessThanSignEqualsSign
                                    {
                                    lv_op_2_4=(Token)match(input,LessThanSignEqualsSign,FollowSets000.FOLLOW_19); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_op_2_4, grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_0_1_1_0_3());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getRelationRule());
                                      	        }
                                             		setWithLastConsumed(current, "op", lv_op_2_4, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 5 :
                                    // InternalPropSpecParser.g:1082:8: lv_op_2_5= GreaterThanSign
                                    {
                                    lv_op_2_5=(Token)match(input,GreaterThanSign,FollowSets000.FOLLOW_19); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_op_2_5, grammarAccess.getRelationAccess().getOpGreaterThanSignKeyword_0_1_1_0_4());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getRelationRule());
                                      	        }
                                             		setWithLastConsumed(current, "op", lv_op_2_5, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 6 :
                                    // InternalPropSpecParser.g:1095:8: lv_op_2_6= GreaterThanSignEqualsSign
                                    {
                                    lv_op_2_6=(Token)match(input,GreaterThanSignEqualsSign,FollowSets000.FOLLOW_19); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_op_2_6, grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_0_1_1_0_5());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getRelationRule());
                                      	        }
                                             		setWithLastConsumed(current, "op", lv_op_2_6, null);
                                      	    
                                    }

                                    }
                                    break;

                            }


                            }


                            }

                            // InternalPropSpecParser.g:1111:2: ( (lv_right_3_0= ruleModifiedExpression ) )
                            // InternalPropSpecParser.g:1112:1: (lv_right_3_0= ruleModifiedExpression )
                            {
                            // InternalPropSpecParser.g:1112:1: (lv_right_3_0= ruleModifiedExpression )
                            // InternalPropSpecParser.g:1113:3: lv_right_3_0= ruleModifiedExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRelationAccess().getRightModifiedExpressionParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_right_3_0=ruleModifiedExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getRelationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"right",
                                      		lv_right_3_0, 
                                      		"edu.postech.aadl.xtext.propspec.PropSpec.ModifiedExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:1130:6: (otherlv_4= QuestionMark this_PropRef_5= rulePropRef )
                    {
                    // InternalPropSpecParser.g:1130:6: (otherlv_4= QuestionMark this_PropRef_5= rulePropRef )
                    // InternalPropSpecParser.g:1131:2: otherlv_4= QuestionMark this_PropRef_5= rulePropRef
                    {
                    otherlv_4=(Token)match(input,QuestionMark,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getQuestionMarkKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationAccess().getPropRefParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PropRef_5=rulePropRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_PropRef_5;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleModifiedExpression"
    // InternalPropSpecParser.g:1155:1: entryRuleModifiedExpression returns [EObject current=null] : iv_ruleModifiedExpression= ruleModifiedExpression EOF ;
    public final EObject entryRuleModifiedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiedExpression = null;


        try {
            // InternalPropSpecParser.g:1156:2: (iv_ruleModifiedExpression= ruleModifiedExpression EOF )
            // InternalPropSpecParser.g:1157:2: iv_ruleModifiedExpression= ruleModifiedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifiedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModifiedExpression=ruleModifiedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifiedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifiedExpression"


    // $ANTLR start "ruleModifiedExpression"
    // InternalPropSpecParser.g:1164:1: ruleModifiedExpression returns [EObject current=null] : (this_SimpleExpression_0= ruleSimpleExpression | ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_child_3_0= ruleSimpleExpression ) ) ) ) ;
    public final EObject ruleModifiedExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_SimpleExpression_0 = null;

        EObject lv_child_3_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:1167:28: ( (this_SimpleExpression_0= ruleSimpleExpression | ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_child_3_0= ruleSimpleExpression ) ) ) ) )
            // InternalPropSpecParser.g:1168:1: (this_SimpleExpression_0= ruleSimpleExpression | ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_child_3_0= ruleSimpleExpression ) ) ) )
            {
            // InternalPropSpecParser.g:1168:1: (this_SimpleExpression_0= ruleSimpleExpression | ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_child_3_0= ruleSimpleExpression ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==False||LA16_0==True||LA16_0==Abs||LA16_0==Not||LA16_0==LeftParenthesis||LA16_0==RULE_REAL_LIT||LA16_0==RULE_INTEGER_LIT||(LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            else if ( (LA16_0==PlusSign||LA16_0==HyphenMinus) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalPropSpecParser.g:1169:2: this_SimpleExpression_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getModifiedExpressionAccess().getSimpleExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SimpleExpression_0=ruleSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SimpleExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:1181:6: ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_child_3_0= ruleSimpleExpression ) ) )
                    {
                    // InternalPropSpecParser.g:1181:6: ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_child_3_0= ruleSimpleExpression ) ) )
                    // InternalPropSpecParser.g:1181:7: () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_child_3_0= ruleSimpleExpression ) )
                    {
                    // InternalPropSpecParser.g:1181:7: ()
                    // InternalPropSpecParser.g:1182:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getModifiedExpressionAccess().getUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalPropSpecParser.g:1190:2: ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
                    // InternalPropSpecParser.g:1191:1: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
                    {
                    // InternalPropSpecParser.g:1191:1: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
                    // InternalPropSpecParser.g:1192:1: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
                    {
                    // InternalPropSpecParser.g:1192:1: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==PlusSign) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==HyphenMinus) ) {
                        alt15=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalPropSpecParser.g:1193:3: lv_op_2_1= PlusSign
                            {
                            lv_op_2_1=(Token)match(input,PlusSign,FollowSets000.FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getModifiedExpressionAccess().getOpPlusSignKeyword_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getModifiedExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalPropSpecParser.g:1206:8: lv_op_2_2= HyphenMinus
                            {
                            lv_op_2_2=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getModifiedExpressionAccess().getOpHyphenMinusKeyword_1_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getModifiedExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalPropSpecParser.g:1222:2: ( (lv_child_3_0= ruleSimpleExpression ) )
                    // InternalPropSpecParser.g:1223:1: (lv_child_3_0= ruleSimpleExpression )
                    {
                    // InternalPropSpecParser.g:1223:1: (lv_child_3_0= ruleSimpleExpression )
                    // InternalPropSpecParser.g:1224:3: lv_child_3_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModifiedExpressionAccess().getChildSimpleExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_child_3_0=ruleSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModifiedExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"child",
                              		lv_child_3_0, 
                              		"edu.postech.aadl.xtext.propspec.PropSpec.SimpleExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifiedExpression"


    // $ANTLR start "entryRuleSimpleExpression"
    // InternalPropSpecParser.g:1248:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // InternalPropSpecParser.g:1249:2: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // InternalPropSpecParser.g:1250:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // InternalPropSpecParser.g:1257:1: ruleSimpleExpression returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Term_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:1260:28: ( (this_Term_0= ruleTerm ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleTerm ) ) )* ) )
            // InternalPropSpecParser.g:1261:1: (this_Term_0= ruleTerm ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleTerm ) ) )* )
            {
            // InternalPropSpecParser.g:1261:1: (this_Term_0= ruleTerm ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleTerm ) ) )* )
            // InternalPropSpecParser.g:1262:2: this_Term_0= ruleTerm ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleTerm ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleExpressionAccess().getTermParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_21);
            this_Term_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_Term_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalPropSpecParser.g:1273:1: ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleTerm ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==PlusSign||LA18_0==HyphenMinus) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPropSpecParser.g:1273:2: () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleTerm ) )
            	    {
            	    // InternalPropSpecParser.g:1273:2: ()
            	    // InternalPropSpecParser.g:1274:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSimpleExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalPropSpecParser.g:1282:2: ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
            	    // InternalPropSpecParser.g:1283:1: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            	    {
            	    // InternalPropSpecParser.g:1283:1: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            	    // InternalPropSpecParser.g:1284:1: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            	    {
            	    // InternalPropSpecParser.g:1284:1: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==PlusSign) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==HyphenMinus) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalPropSpecParser.g:1285:3: lv_op_2_1= PlusSign
            	            {
            	            lv_op_2_1=(Token)match(input,PlusSign,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getSimpleExpressionAccess().getOpPlusSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSimpleExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalPropSpecParser.g:1298:8: lv_op_2_2= HyphenMinus
            	            {
            	            lv_op_2_2=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getSimpleExpressionAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSimpleExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalPropSpecParser.g:1314:2: ( (lv_right_3_0= ruleTerm ) )
            	    // InternalPropSpecParser.g:1315:1: (lv_right_3_0= ruleTerm )
            	    {
            	    // InternalPropSpecParser.g:1315:1: (lv_right_3_0= ruleTerm )
            	    // InternalPropSpecParser.g:1316:3: lv_right_3_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getRightTermParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_right_3_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"edu.postech.aadl.xtext.propspec.PropSpec.Term");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleTerm"
    // InternalPropSpecParser.g:1340:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalPropSpecParser.g:1341:2: (iv_ruleTerm= ruleTerm EOF )
            // InternalPropSpecParser.g:1342:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalPropSpecParser.g:1349:1: ruleTerm returns [EObject current=null] : ( (this_Value_0= ruleValue ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= ruleValue ) ) )* ) | ( () ( ( (lv_op_5_1= Abs | lv_op_5_2= Not ) ) ) ( (lv_child_6_0= ruleValue ) ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_5_1=null;
        Token lv_op_5_2=null;
        EObject this_Value_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_child_6_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:1352:28: ( ( (this_Value_0= ruleValue ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= ruleValue ) ) )* ) | ( () ( ( (lv_op_5_1= Abs | lv_op_5_2= Not ) ) ) ( (lv_child_6_0= ruleValue ) ) ) ) )
            // InternalPropSpecParser.g:1353:1: ( (this_Value_0= ruleValue ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= ruleValue ) ) )* ) | ( () ( ( (lv_op_5_1= Abs | lv_op_5_2= Not ) ) ) ( (lv_child_6_0= ruleValue ) ) ) )
            {
            // InternalPropSpecParser.g:1353:1: ( (this_Value_0= ruleValue ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= ruleValue ) ) )* ) | ( () ( ( (lv_op_5_1= Abs | lv_op_5_2= Not ) ) ) ( (lv_child_6_0= ruleValue ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==False||LA22_0==True||LA22_0==LeftParenthesis||LA22_0==RULE_REAL_LIT||LA22_0==RULE_INTEGER_LIT||(LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            else if ( (LA22_0==Abs||LA22_0==Not) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPropSpecParser.g:1353:2: (this_Value_0= ruleValue ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= ruleValue ) ) )* )
                    {
                    // InternalPropSpecParser.g:1353:2: (this_Value_0= ruleValue ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= ruleValue ) ) )* )
                    // InternalPropSpecParser.g:1354:2: this_Value_0= ruleValue ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= ruleValue ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTermAccess().getValueParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    this_Value_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Value_0;
                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalPropSpecParser.g:1365:1: ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= ruleValue ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Asterisk||LA20_0==Solidus) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalPropSpecParser.g:1365:2: () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ( (lv_right_3_0= ruleValue ) )
                    	    {
                    	    // InternalPropSpecParser.g:1365:2: ()
                    	    // InternalPropSpecParser.g:1366:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getTermAccess().getBinaryExpressionLeftAction_0_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // InternalPropSpecParser.g:1374:2: ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) )
                    	    // InternalPropSpecParser.g:1375:1: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) )
                    	    {
                    	    // InternalPropSpecParser.g:1375:1: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) )
                    	    // InternalPropSpecParser.g:1376:1: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus )
                    	    {
                    	    // InternalPropSpecParser.g:1376:1: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus )
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==Asterisk) ) {
                    	        alt19=1;
                    	    }
                    	    else if ( (LA19_0==Solidus) ) {
                    	        alt19=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 19, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // InternalPropSpecParser.g:1377:3: lv_op_2_1= Asterisk
                    	            {
                    	            lv_op_2_1=(Token)match(input,Asterisk,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      newLeafNode(lv_op_2_1, grammarAccess.getTermAccess().getOpAsteriskKeyword_0_1_1_0_0());
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getTermRule());
                    	              	        }
                    	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPropSpecParser.g:1390:8: lv_op_2_2= Solidus
                    	            {
                    	            lv_op_2_2=(Token)match(input,Solidus,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                      newLeafNode(lv_op_2_2, grammarAccess.getTermAccess().getOpSolidusKeyword_0_1_1_0_1());
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getTermRule());
                    	              	        }
                    	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // InternalPropSpecParser.g:1406:2: ( (lv_right_3_0= ruleValue ) )
                    	    // InternalPropSpecParser.g:1407:1: (lv_right_3_0= ruleValue )
                    	    {
                    	    // InternalPropSpecParser.g:1407:1: (lv_right_3_0= ruleValue )
                    	    // InternalPropSpecParser.g:1408:3: lv_right_3_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTermAccess().getRightValueParserRuleCall_0_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_right_3_0=ruleValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"right",
                    	              		lv_right_3_0, 
                    	              		"edu.postech.aadl.xtext.propspec.PropSpec.Value");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:1425:6: ( () ( ( (lv_op_5_1= Abs | lv_op_5_2= Not ) ) ) ( (lv_child_6_0= ruleValue ) ) )
                    {
                    // InternalPropSpecParser.g:1425:6: ( () ( ( (lv_op_5_1= Abs | lv_op_5_2= Not ) ) ) ( (lv_child_6_0= ruleValue ) ) )
                    // InternalPropSpecParser.g:1425:7: () ( ( (lv_op_5_1= Abs | lv_op_5_2= Not ) ) ) ( (lv_child_6_0= ruleValue ) )
                    {
                    // InternalPropSpecParser.g:1425:7: ()
                    // InternalPropSpecParser.g:1426:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTermAccess().getUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalPropSpecParser.g:1434:2: ( ( (lv_op_5_1= Abs | lv_op_5_2= Not ) ) )
                    // InternalPropSpecParser.g:1435:1: ( (lv_op_5_1= Abs | lv_op_5_2= Not ) )
                    {
                    // InternalPropSpecParser.g:1435:1: ( (lv_op_5_1= Abs | lv_op_5_2= Not ) )
                    // InternalPropSpecParser.g:1436:1: (lv_op_5_1= Abs | lv_op_5_2= Not )
                    {
                    // InternalPropSpecParser.g:1436:1: (lv_op_5_1= Abs | lv_op_5_2= Not )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==Abs) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==Not) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalPropSpecParser.g:1437:3: lv_op_5_1= Abs
                            {
                            lv_op_5_1=(Token)match(input,Abs,FollowSets000.FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_5_1, grammarAccess.getTermAccess().getOpAbsKeyword_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTermRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_5_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalPropSpecParser.g:1450:8: lv_op_5_2= Not
                            {
                            lv_op_5_2=(Token)match(input,Not,FollowSets000.FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_5_2, grammarAccess.getTermAccess().getOpNotKeyword_1_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTermRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_5_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalPropSpecParser.g:1466:2: ( (lv_child_6_0= ruleValue ) )
                    // InternalPropSpecParser.g:1467:1: (lv_child_6_0= ruleValue )
                    {
                    // InternalPropSpecParser.g:1467:1: (lv_child_6_0= ruleValue )
                    // InternalPropSpecParser.g:1468:3: lv_child_6_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermAccess().getChildValueParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_child_6_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTermRule());
                      	        }
                             		set(
                             			current, 
                             			"child",
                              		lv_child_6_0, 
                              		"edu.postech.aadl.xtext.propspec.PropSpec.Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleValue"
    // InternalPropSpecParser.g:1492:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalPropSpecParser.g:1493:2: (iv_ruleValue= ruleValue EOF )
            // InternalPropSpecParser.g:1494:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalPropSpecParser.g:1501:1: ruleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleValueConstant ) ) ) | ( () ( (lv_value_3_0= ruleContainmentPath ) ) ) | (otherlv_4= LeftParenthesis this_PSExpression_5= rulePSExpression otherlv_6= RightParenthesis ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;

        EObject this_PSExpression_5 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:1504:28: ( ( ( () ( (lv_value_1_0= ruleValueConstant ) ) ) | ( () ( (lv_value_3_0= ruleContainmentPath ) ) ) | (otherlv_4= LeftParenthesis this_PSExpression_5= rulePSExpression otherlv_6= RightParenthesis ) ) )
            // InternalPropSpecParser.g:1505:1: ( ( () ( (lv_value_1_0= ruleValueConstant ) ) ) | ( () ( (lv_value_3_0= ruleContainmentPath ) ) ) | (otherlv_4= LeftParenthesis this_PSExpression_5= rulePSExpression otherlv_6= RightParenthesis ) )
            {
            // InternalPropSpecParser.g:1505:1: ( ( () ( (lv_value_1_0= ruleValueConstant ) ) ) | ( () ( (lv_value_3_0= ruleContainmentPath ) ) ) | (otherlv_4= LeftParenthesis this_PSExpression_5= rulePSExpression otherlv_6= RightParenthesis ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case False:
            case True:
            case RULE_REAL_LIT:
            case RULE_INTEGER_LIT:
            case RULE_STRING:
                {
                alt23=1;
                }
                break;
            case RULE_ID:
                {
                alt23=2;
                }
                break;
            case LeftParenthesis:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalPropSpecParser.g:1505:2: ( () ( (lv_value_1_0= ruleValueConstant ) ) )
                    {
                    // InternalPropSpecParser.g:1505:2: ( () ( (lv_value_1_0= ruleValueConstant ) ) )
                    // InternalPropSpecParser.g:1505:3: () ( (lv_value_1_0= ruleValueConstant ) )
                    {
                    // InternalPropSpecParser.g:1505:3: ()
                    // InternalPropSpecParser.g:1506:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getValueAccess().getValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalPropSpecParser.g:1514:2: ( (lv_value_1_0= ruleValueConstant ) )
                    // InternalPropSpecParser.g:1515:1: (lv_value_1_0= ruleValueConstant )
                    {
                    // InternalPropSpecParser.g:1515:1: (lv_value_1_0= ruleValueConstant )
                    // InternalPropSpecParser.g:1516:3: lv_value_1_0= ruleValueConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueAccess().getValueValueConstantParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_1_0=ruleValueConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValueRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"edu.postech.aadl.xtext.propspec.PropSpec.ValueConstant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:1533:6: ( () ( (lv_value_3_0= ruleContainmentPath ) ) )
                    {
                    // InternalPropSpecParser.g:1533:6: ( () ( (lv_value_3_0= ruleContainmentPath ) ) )
                    // InternalPropSpecParser.g:1533:7: () ( (lv_value_3_0= ruleContainmentPath ) )
                    {
                    // InternalPropSpecParser.g:1533:7: ()
                    // InternalPropSpecParser.g:1534:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getValueAccess().getValueAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalPropSpecParser.g:1542:2: ( (lv_value_3_0= ruleContainmentPath ) )
                    // InternalPropSpecParser.g:1543:1: (lv_value_3_0= ruleContainmentPath )
                    {
                    // InternalPropSpecParser.g:1543:1: (lv_value_3_0= ruleContainmentPath )
                    // InternalPropSpecParser.g:1544:3: lv_value_3_0= ruleContainmentPath
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueAccess().getValueContainmentPathParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_3_0=ruleContainmentPath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValueRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPropSpecParser.g:1561:6: (otherlv_4= LeftParenthesis this_PSExpression_5= rulePSExpression otherlv_6= RightParenthesis )
                    {
                    // InternalPropSpecParser.g:1561:6: (otherlv_4= LeftParenthesis this_PSExpression_5= rulePSExpression otherlv_6= RightParenthesis )
                    // InternalPropSpecParser.g:1562:2: otherlv_4= LeftParenthesis this_PSExpression_5= rulePSExpression otherlv_6= RightParenthesis
                    {
                    otherlv_4=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValueAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getPSExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
                    this_PSExpression_5=rulePSExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_PSExpression_5;
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getValueAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRulePropRef"
    // InternalPropSpecParser.g:1591:1: entryRulePropRef returns [EObject current=null] : iv_rulePropRef= rulePropRef EOF ;
    public final EObject entryRulePropRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropRef = null;


        try {
            // InternalPropSpecParser.g:1592:2: (iv_rulePropRef= rulePropRef EOF )
            // InternalPropSpecParser.g:1593:2: iv_rulePropRef= rulePropRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropRef=rulePropRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropRef"


    // $ANTLR start "rulePropRef"
    // InternalPropSpecParser.g:1600:1: rulePropRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulePropRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:1603:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPropSpecParser.g:1604:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPropSpecParser.g:1604:1: ( (otherlv_0= RULE_ID ) )
            // InternalPropSpecParser.g:1605:1: (otherlv_0= RULE_ID )
            {
            // InternalPropSpecParser.g:1605:1: (otherlv_0= RULE_ID )
            // InternalPropSpecParser.g:1606:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropRefRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPropRefAccess().getDefPropositionCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropRef"


    // $ANTLR start "entryRuleScopedExpression"
    // InternalPropSpecParser.g:1628:1: entryRuleScopedExpression returns [EObject current=null] : iv_ruleScopedExpression= ruleScopedExpression EOF ;
    public final EObject entryRuleScopedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopedExpression = null;


        try {
            // InternalPropSpecParser.g:1629:2: (iv_ruleScopedExpression= ruleScopedExpression EOF )
            // InternalPropSpecParser.g:1630:2: iv_ruleScopedExpression= ruleScopedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScopedExpression=ruleScopedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScopedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScopedExpression"


    // $ANTLR start "ruleScopedExpression"
    // InternalPropSpecParser.g:1637:1: ruleScopedExpression returns [EObject current=null] : ( ( (lv_path_0_0= ruleContainmentPath ) ) otherlv_1= VerticalLine ( (lv_expression_2_0= rulePSExpression ) ) ) ;
    public final EObject ruleScopedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:1640:28: ( ( ( (lv_path_0_0= ruleContainmentPath ) ) otherlv_1= VerticalLine ( (lv_expression_2_0= rulePSExpression ) ) ) )
            // InternalPropSpecParser.g:1641:1: ( ( (lv_path_0_0= ruleContainmentPath ) ) otherlv_1= VerticalLine ( (lv_expression_2_0= rulePSExpression ) ) )
            {
            // InternalPropSpecParser.g:1641:1: ( ( (lv_path_0_0= ruleContainmentPath ) ) otherlv_1= VerticalLine ( (lv_expression_2_0= rulePSExpression ) ) )
            // InternalPropSpecParser.g:1641:2: ( (lv_path_0_0= ruleContainmentPath ) ) otherlv_1= VerticalLine ( (lv_expression_2_0= rulePSExpression ) )
            {
            // InternalPropSpecParser.g:1641:2: ( (lv_path_0_0= ruleContainmentPath ) )
            // InternalPropSpecParser.g:1642:1: (lv_path_0_0= ruleContainmentPath )
            {
            // InternalPropSpecParser.g:1642:1: (lv_path_0_0= ruleContainmentPath )
            // InternalPropSpecParser.g:1643:3: lv_path_0_0= ruleContainmentPath
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScopedExpressionAccess().getPathContainmentPathParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_path_0_0=ruleContainmentPath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScopedExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"path",
                      		lv_path_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,VerticalLine,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getScopedExpressionAccess().getVerticalLineKeyword_1());
                  
            }
            // InternalPropSpecParser.g:1664:1: ( (lv_expression_2_0= rulePSExpression ) )
            // InternalPropSpecParser.g:1665:1: (lv_expression_2_0= rulePSExpression )
            {
            // InternalPropSpecParser.g:1665:1: (lv_expression_2_0= rulePSExpression )
            // InternalPropSpecParser.g:1666:3: lv_expression_2_0= rulePSExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScopedExpressionAccess().getExpressionPSExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_2_0=rulePSExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScopedExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"edu.postech.aadl.xtext.propspec.PropSpec.PSExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScopedExpression"


    // $ANTLR start "entryRuleValueConstant"
    // InternalPropSpecParser.g:1690:1: entryRuleValueConstant returns [EObject current=null] : iv_ruleValueConstant= ruleValueConstant EOF ;
    public final EObject entryRuleValueConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueConstant = null;


        try {
            // InternalPropSpecParser.g:1691:2: (iv_ruleValueConstant= ruleValueConstant EOF )
            // InternalPropSpecParser.g:1692:2: iv_ruleValueConstant= ruleValueConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueConstantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValueConstant=ruleValueConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueConstant; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueConstant"


    // $ANTLR start "ruleValueConstant"
    // InternalPropSpecParser.g:1699:1: ruleValueConstant returns [EObject current=null] : (this_StringTerm_0= ruleStringTerm | this_UnsignedRealTerm_1= ruleUnsignedRealTerm | this_UnsignedIntegerTerm_2= ruleUnsignedIntegerTerm | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleValueConstant() throws RecognitionException {
        EObject current = null;

        EObject this_StringTerm_0 = null;

        EObject this_UnsignedRealTerm_1 = null;

        EObject this_UnsignedIntegerTerm_2 = null;

        EObject this_BooleanLiteral_3 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:1702:28: ( (this_StringTerm_0= ruleStringTerm | this_UnsignedRealTerm_1= ruleUnsignedRealTerm | this_UnsignedIntegerTerm_2= ruleUnsignedIntegerTerm | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // InternalPropSpecParser.g:1703:1: (this_StringTerm_0= ruleStringTerm | this_UnsignedRealTerm_1= ruleUnsignedRealTerm | this_UnsignedIntegerTerm_2= ruleUnsignedIntegerTerm | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // InternalPropSpecParser.g:1703:1: (this_StringTerm_0= ruleStringTerm | this_UnsignedRealTerm_1= ruleUnsignedRealTerm | this_UnsignedIntegerTerm_2= ruleUnsignedIntegerTerm | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt24=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt24=1;
                }
                break;
            case RULE_REAL_LIT:
                {
                alt24=2;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt24=3;
                }
                break;
            case False:
            case True:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalPropSpecParser.g:1704:2: this_StringTerm_0= ruleStringTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueConstantAccess().getStringTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringTerm_0=ruleStringTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StringTerm_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:1717:2: this_UnsignedRealTerm_1= ruleUnsignedRealTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueConstantAccess().getUnsignedRealTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UnsignedRealTerm_1=ruleUnsignedRealTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_UnsignedRealTerm_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalPropSpecParser.g:1730:2: this_UnsignedIntegerTerm_2= ruleUnsignedIntegerTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueConstantAccess().getUnsignedIntegerTermParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UnsignedIntegerTerm_2=ruleUnsignedIntegerTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_UnsignedIntegerTerm_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalPropSpecParser.g:1743:2: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueConstantAccess().getBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanLiteral_3=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BooleanLiteral_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueConstant"


    // $ANTLR start "entryRuleUnsignedRealTerm"
    // InternalPropSpecParser.g:1762:1: entryRuleUnsignedRealTerm returns [EObject current=null] : iv_ruleUnsignedRealTerm= ruleUnsignedRealTerm EOF ;
    public final EObject entryRuleUnsignedRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnsignedRealTerm = null;


        try {
            // InternalPropSpecParser.g:1763:2: (iv_ruleUnsignedRealTerm= ruleUnsignedRealTerm EOF )
            // InternalPropSpecParser.g:1764:2: iv_ruleUnsignedRealTerm= ruleUnsignedRealTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnsignedRealTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnsignedRealTerm=ruleUnsignedRealTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnsignedRealTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsignedRealTerm"


    // $ANTLR start "ruleUnsignedRealTerm"
    // InternalPropSpecParser.g:1771:1: ruleUnsignedRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleUnsignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleUnsignedRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:1774:28: ( ( ( (lv_value_0_0= ruleUnsignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalPropSpecParser.g:1775:1: ( ( (lv_value_0_0= ruleUnsignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalPropSpecParser.g:1775:1: ( ( (lv_value_0_0= ruleUnsignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalPropSpecParser.g:1775:2: ( (lv_value_0_0= ruleUnsignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalPropSpecParser.g:1775:2: ( (lv_value_0_0= ruleUnsignedReal ) )
            // InternalPropSpecParser.g:1776:1: (lv_value_0_0= ruleUnsignedReal )
            {
            // InternalPropSpecParser.g:1776:1: (lv_value_0_0= ruleUnsignedReal )
            // InternalPropSpecParser.g:1777:3: lv_value_0_0= ruleUnsignedReal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnsignedRealTermAccess().getValueUnsignedRealParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_value_0_0=ruleUnsignedReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnsignedRealTermRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"edu.postech.aadl.xtext.propspec.PropSpec.UnsignedReal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalPropSpecParser.g:1793:2: ( (otherlv_1= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPropSpecParser.g:1794:1: (otherlv_1= RULE_ID )
                    {
                    // InternalPropSpecParser.g:1794:1: (otherlv_1= RULE_ID )
                    // InternalPropSpecParser.g:1795:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getUnsignedRealTermRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getUnsignedRealTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                      	
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsignedRealTerm"


    // $ANTLR start "entryRuleUnsignedIntegerTerm"
    // InternalPropSpecParser.g:1817:1: entryRuleUnsignedIntegerTerm returns [EObject current=null] : iv_ruleUnsignedIntegerTerm= ruleUnsignedIntegerTerm EOF ;
    public final EObject entryRuleUnsignedIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnsignedIntegerTerm = null;


        try {
            // InternalPropSpecParser.g:1818:2: (iv_ruleUnsignedIntegerTerm= ruleUnsignedIntegerTerm EOF )
            // InternalPropSpecParser.g:1819:2: iv_ruleUnsignedIntegerTerm= ruleUnsignedIntegerTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnsignedIntegerTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnsignedIntegerTerm=ruleUnsignedIntegerTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnsignedIntegerTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsignedIntegerTerm"


    // $ANTLR start "ruleUnsignedIntegerTerm"
    // InternalPropSpecParser.g:1826:1: ruleUnsignedIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleUnsignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleUnsignedIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:1829:28: ( ( ( (lv_value_0_0= ruleUnsignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalPropSpecParser.g:1830:1: ( ( (lv_value_0_0= ruleUnsignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalPropSpecParser.g:1830:1: ( ( (lv_value_0_0= ruleUnsignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalPropSpecParser.g:1830:2: ( (lv_value_0_0= ruleUnsignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalPropSpecParser.g:1830:2: ( (lv_value_0_0= ruleUnsignedInt ) )
            // InternalPropSpecParser.g:1831:1: (lv_value_0_0= ruleUnsignedInt )
            {
            // InternalPropSpecParser.g:1831:1: (lv_value_0_0= ruleUnsignedInt )
            // InternalPropSpecParser.g:1832:3: lv_value_0_0= ruleUnsignedInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnsignedIntegerTermAccess().getValueUnsignedIntParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_value_0_0=ruleUnsignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnsignedIntegerTermRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"edu.postech.aadl.xtext.propspec.PropSpec.UnsignedInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalPropSpecParser.g:1848:2: ( (otherlv_1= RULE_ID ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPropSpecParser.g:1849:1: (otherlv_1= RULE_ID )
                    {
                    // InternalPropSpecParser.g:1849:1: (otherlv_1= RULE_ID )
                    // InternalPropSpecParser.g:1850:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getUnsignedIntegerTermRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getUnsignedIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                      	
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsignedIntegerTerm"


    // $ANTLR start "entryRuleUnsignedReal"
    // InternalPropSpecParser.g:1872:1: entryRuleUnsignedReal returns [String current=null] : iv_ruleUnsignedReal= ruleUnsignedReal EOF ;
    public final String entryRuleUnsignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnsignedReal = null;


        try {
            // InternalPropSpecParser.g:1873:1: (iv_ruleUnsignedReal= ruleUnsignedReal EOF )
            // InternalPropSpecParser.g:1874:2: iv_ruleUnsignedReal= ruleUnsignedReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnsignedRealRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnsignedReal=ruleUnsignedReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnsignedReal.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsignedReal"


    // $ANTLR start "ruleUnsignedReal"
    // InternalPropSpecParser.g:1881:1: ruleUnsignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_REAL_LIT_0= RULE_REAL_LIT ;
    public final AntlrDatatypeRuleToken ruleUnsignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_REAL_LIT_0=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:1885:6: (this_REAL_LIT_0= RULE_REAL_LIT )
            // InternalPropSpecParser.g:1886:5: this_REAL_LIT_0= RULE_REAL_LIT
            {
            this_REAL_LIT_0=(Token)match(input,RULE_REAL_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_REAL_LIT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_REAL_LIT_0, grammarAccess.getUnsignedRealAccess().getREAL_LITTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsignedReal"


    // $ANTLR start "entryRuleUnsignedInt"
    // InternalPropSpecParser.g:1901:1: entryRuleUnsignedInt returns [String current=null] : iv_ruleUnsignedInt= ruleUnsignedInt EOF ;
    public final String entryRuleUnsignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnsignedInt = null;


        try {
            // InternalPropSpecParser.g:1902:1: (iv_ruleUnsignedInt= ruleUnsignedInt EOF )
            // InternalPropSpecParser.g:1903:2: iv_ruleUnsignedInt= ruleUnsignedInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnsignedIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnsignedInt=ruleUnsignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnsignedInt.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsignedInt"


    // $ANTLR start "ruleUnsignedInt"
    // InternalPropSpecParser.g:1910:1: ruleUnsignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleUnsignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:1914:6: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // InternalPropSpecParser.g:1915:5: this_INTEGER_LIT_0= RULE_INTEGER_LIT
            {
            this_INTEGER_LIT_0=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INTEGER_LIT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INTEGER_LIT_0, grammarAccess.getUnsignedIntAccess().getINTEGER_LITTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsignedInt"


    // $ANTLR start "entryRuleContainedPropertyAssociation"
    // InternalPropSpecParser.g:1932:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // InternalPropSpecParser.g:1933:2: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // InternalPropSpecParser.g:1934:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainedPropertyAssociationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContainedPropertyAssociation=ruleContainedPropertyAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainedPropertyAssociation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainedPropertyAssociation"


    // $ANTLR start "ruleContainedPropertyAssociation"
    // InternalPropSpecParser.g:1941:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) ;
    public final EObject ruleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_append_2_0=null;
        Token lv_constant_3_0=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_ownedValue_4_0 = null;

        EObject lv_ownedValue_6_0 = null;

        EObject lv_appliesTo_8_0 = null;

        EObject lv_appliesTo_10_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:1944:28: ( ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) )
            // InternalPropSpecParser.g:1945:1: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            {
            // InternalPropSpecParser.g:1945:1: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            // InternalPropSpecParser.g:1945:2: ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon
            {
            // InternalPropSpecParser.g:1945:2: ( ( ruleQPREF ) )
            // InternalPropSpecParser.g:1946:1: ( ruleQPREF )
            {
            // InternalPropSpecParser.g:1946:1: ( ruleQPREF )
            // InternalPropSpecParser.g:1947:3: ruleQPREF
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_26);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalPropSpecParser.g:1964:2: (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==EqualsSignGreaterThanSign) ) {
                alt27=1;
            }
            else if ( (LA27_0==PlusSignEqualsSignGreaterThanSign) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPropSpecParser.g:1965:2: otherlv_1= EqualsSignGreaterThanSign
                    {
                    otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:1970:6: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    {
                    // InternalPropSpecParser.g:1970:6: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    // InternalPropSpecParser.g:1971:1: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    {
                    // InternalPropSpecParser.g:1971:1: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    // InternalPropSpecParser.g:1972:3: lv_append_2_0= PlusSignEqualsSignGreaterThanSign
                    {
                    lv_append_2_0=(Token)match(input,PlusSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_append_2_0, grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      	        }
                             		setWithLastConsumed(current, "append", true, "+=>");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalPropSpecParser.g:1986:3: ( (lv_constant_3_0= Constant ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Constant) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPropSpecParser.g:1987:1: (lv_constant_3_0= Constant )
                    {
                    // InternalPropSpecParser.g:1987:1: (lv_constant_3_0= Constant )
                    // InternalPropSpecParser.g:1988:3: lv_constant_3_0= Constant
                    {
                    lv_constant_3_0=(Token)match(input,Constant,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_constant_3_0, grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      	        }
                             		setWithLastConsumed(current, "constant", true, "constant");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalPropSpecParser.g:2002:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // InternalPropSpecParser.g:2002:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // InternalPropSpecParser.g:2002:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // InternalPropSpecParser.g:2003:1: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // InternalPropSpecParser.g:2003:1: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // InternalPropSpecParser.g:2004:3: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_28);
            lv_ownedValue_4_0=ruleOptionalModalPropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
              	        }
                     		add(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_4_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalPropSpecParser.g:2020:2: (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Comma) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPropSpecParser.g:2021:2: otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	          
            	    }
            	    // InternalPropSpecParser.g:2025:1: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // InternalPropSpecParser.g:2026:1: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // InternalPropSpecParser.g:2026:1: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // InternalPropSpecParser.g:2027:3: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    lv_ownedValue_6_0=ruleOptionalModalPropertyValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedValue",
            	              		lv_ownedValue_6_0, 
            	              		"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            // InternalPropSpecParser.g:2043:5: ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Applies) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPropSpecParser.g:2044:2: ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToKeywordsParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    ruleAppliesToKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              afterParserOrEnumRuleCall();
                          
                    }
                    // InternalPropSpecParser.g:2054:1: ( (lv_appliesTo_8_0= ruleContainmentPath ) )
                    // InternalPropSpecParser.g:2055:1: (lv_appliesTo_8_0= ruleContainmentPath )
                    {
                    // InternalPropSpecParser.g:2055:1: (lv_appliesTo_8_0= ruleContainmentPath )
                    // InternalPropSpecParser.g:2056:3: lv_appliesTo_8_0= ruleContainmentPath
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_appliesTo_8_0=ruleContainmentPath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                      	        }
                             		add(
                             			current, 
                             			"appliesTo",
                              		lv_appliesTo_8_0, 
                              		"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalPropSpecParser.g:2072:2: (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==Comma) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalPropSpecParser.g:2073:2: otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalPropSpecParser.g:2077:1: ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    // InternalPropSpecParser.g:2078:1: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    {
                    	    // InternalPropSpecParser.g:2078:1: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    // InternalPropSpecParser.g:2079:3: lv_appliesTo_10_0= ruleContainmentPath
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_29);
                    	    lv_appliesTo_10_0=ruleContainmentPath();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"appliesTo",
                    	              		lv_appliesTo_10_0, 
                    	              		"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPropSpecParser.g:2095:6: ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==In) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPropSpecParser.g:2096:2: ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    ruleInBindingKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_12=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1());
                          
                    }
                    // InternalPropSpecParser.g:2111:1: ( ( ruleQCREF ) )
                    // InternalPropSpecParser.g:2112:1: ( ruleQCREF )
                    {
                    // InternalPropSpecParser.g:2112:1: ( ruleQCREF )
                    // InternalPropSpecParser.g:2113:3: ruleQCREF
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
                    ruleQCREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainedPropertyAssociation"


    // $ANTLR start "entryRuleContainmentPath"
    // InternalPropSpecParser.g:2152:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // InternalPropSpecParser.g:2153:2: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // InternalPropSpecParser.g:2154:2: iv_ruleContainmentPath= ruleContainmentPath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainmentPathRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContainmentPath=ruleContainmentPath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainmentPath; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainmentPath"


    // $ANTLR start "ruleContainmentPath"
    // InternalPropSpecParser.g:2161:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2164:28: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
            // InternalPropSpecParser.g:2165:1: ( (lv_path_0_0= ruleContainmentPathElement ) )
            {
            // InternalPropSpecParser.g:2165:1: ( (lv_path_0_0= ruleContainmentPathElement ) )
            // InternalPropSpecParser.g:2166:1: (lv_path_0_0= ruleContainmentPathElement )
            {
            // InternalPropSpecParser.g:2166:1: (lv_path_0_0= ruleContainmentPathElement )
            // InternalPropSpecParser.g:2167:3: lv_path_0_0= ruleContainmentPathElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContainmentPathAccess().getPathContainmentPathElementParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_path_0_0=ruleContainmentPathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContainmentPathRule());
              	        }
                     		set(
                     			current, 
                     			"path",
                      		lv_path_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainmentPath"


    // $ANTLR start "entryRuleOptionalModalPropertyValue"
    // InternalPropSpecParser.g:2193:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // InternalPropSpecParser.g:2194:2: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // InternalPropSpecParser.g:2195:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionalModalPropertyValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOptionalModalPropertyValue=ruleOptionalModalPropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionalModalPropertyValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionalModalPropertyValue"


    // $ANTLR start "ruleOptionalModalPropertyValue"
    // InternalPropSpecParser.g:2202:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) ;
    public final EObject ruleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_ownedValue_0_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2205:28: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) )
            // InternalPropSpecParser.g:2206:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            {
            // InternalPropSpecParser.g:2206:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            // InternalPropSpecParser.g:2206:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            {
            // InternalPropSpecParser.g:2206:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalPropSpecParser.g:2207:1: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalPropSpecParser.g:2207:1: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalPropSpecParser.g:2208:3: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_30);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOptionalModalPropertyValueRule());
              	        }
                     		set(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalPropSpecParser.g:2224:2: ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==In) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==Modes) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalPropSpecParser.g:2225:2: ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    ruleInModesKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // InternalPropSpecParser.g:2240:1: ( (otherlv_3= RULE_ID ) )
                    // InternalPropSpecParser.g:2241:1: (otherlv_3= RULE_ID )
                    {
                    // InternalPropSpecParser.g:2241:1: (otherlv_3= RULE_ID )
                    // InternalPropSpecParser.g:2242:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }

                    // InternalPropSpecParser.g:2256:2: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==Comma) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalPropSpecParser.g:2257:2: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
                    	          
                    	    }
                    	    // InternalPropSpecParser.g:2261:1: ( (otherlv_5= RULE_ID ) )
                    	    // InternalPropSpecParser.g:2262:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalPropSpecParser.g:2262:1: (otherlv_5= RULE_ID )
                    	    // InternalPropSpecParser.g:2263:3: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOptionalModalPropertyValueAccess().getRightParenthesisKeyword_1_4());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionalModalPropertyValue"


    // $ANTLR start "entryRulePropertyValue"
    // InternalPropSpecParser.g:2290:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalPropSpecParser.g:2291:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalPropSpecParser.g:2292:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalPropSpecParser.g:2299:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2302:28: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // InternalPropSpecParser.g:2303:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // InternalPropSpecParser.g:2303:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalPropSpecParser.g:2304:1: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalPropSpecParser.g:2304:1: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalPropSpecParser.g:2305:3: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyValueRule());
              	        }
                     		set(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRulePropertyExpression"
    // InternalPropSpecParser.g:2329:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // InternalPropSpecParser.g:2330:2: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // InternalPropSpecParser.g:2331:2: iv_rulePropertyExpression= rulePropertyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyExpression=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyExpression"


    // $ANTLR start "rulePropertyExpression"
    // InternalPropSpecParser.g:2338:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
    public final EObject rulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RecordTerm_0 = null;

        EObject this_ReferenceTerm_1 = null;

        EObject this_ComponentClassifierTerm_2 = null;

        EObject this_ComputedTerm_3 = null;

        EObject this_StringTerm_4 = null;

        EObject this_NumericRangeTerm_5 = null;

        EObject this_RealTerm_6 = null;

        EObject this_IntegerTerm_7 = null;

        EObject this_ListTerm_8 = null;

        EObject this_BooleanLiteral_9 = null;

        EObject this_LiteralorReferenceTerm_10 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2341:28: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // InternalPropSpecParser.g:2342:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // InternalPropSpecParser.g:2342:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt35=11;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalPropSpecParser.g:2343:2: this_RecordTerm_0= ruleRecordTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RecordTerm_0=ruleRecordTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_RecordTerm_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:2356:2: this_ReferenceTerm_1= ruleReferenceTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceTerm_1=ruleReferenceTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ReferenceTerm_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalPropSpecParser.g:2369:2: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ComponentClassifierTerm_2=ruleComponentClassifierTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ComponentClassifierTerm_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalPropSpecParser.g:2382:2: this_ComputedTerm_3= ruleComputedTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ComputedTerm_3=ruleComputedTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ComputedTerm_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalPropSpecParser.g:2395:2: this_StringTerm_4= ruleStringTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringTerm_4=ruleStringTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StringTerm_4;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalPropSpecParser.g:2408:2: this_NumericRangeTerm_5= ruleNumericRangeTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NumericRangeTerm_5=ruleNumericRangeTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_NumericRangeTerm_5;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalPropSpecParser.g:2421:2: this_RealTerm_6= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RealTerm_6=ruleRealTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_RealTerm_6;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalPropSpecParser.g:2434:2: this_IntegerTerm_7= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerTerm_7=ruleIntegerTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_IntegerTerm_7;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // InternalPropSpecParser.g:2447:2: this_ListTerm_8= ruleListTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ListTerm_8=ruleListTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ListTerm_8;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // InternalPropSpecParser.g:2460:2: this_BooleanLiteral_9= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanLiteral_9=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BooleanLiteral_9;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // InternalPropSpecParser.g:2473:2: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LiteralorReferenceTerm_10=ruleLiteralorReferenceTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralorReferenceTerm_10;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyExpression"


    // $ANTLR start "entryRuleLiteralorReferenceTerm"
    // InternalPropSpecParser.g:2492:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // InternalPropSpecParser.g:2493:2: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // InternalPropSpecParser.g:2494:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralorReferenceTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteralorReferenceTerm=ruleLiteralorReferenceTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralorReferenceTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralorReferenceTerm"


    // $ANTLR start "ruleLiteralorReferenceTerm"
    // InternalPropSpecParser.g:2501:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2504:28: ( ( ( ruleQPREF ) ) )
            // InternalPropSpecParser.g:2505:1: ( ( ruleQPREF ) )
            {
            // InternalPropSpecParser.g:2505:1: ( ( ruleQPREF ) )
            // InternalPropSpecParser.g:2506:1: ( ruleQPREF )
            {
            // InternalPropSpecParser.g:2506:1: ( ruleQPREF )
            // InternalPropSpecParser.g:2507:3: ruleQPREF
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralorReferenceTermRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralorReferenceTerm"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalPropSpecParser.g:2532:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalPropSpecParser.g:2533:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalPropSpecParser.g:2534:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalPropSpecParser.g:2541:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2544:28: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalPropSpecParser.g:2545:1: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalPropSpecParser.g:2545:1: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            // InternalPropSpecParser.g:2545:2: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            {
            // InternalPropSpecParser.g:2545:2: ()
            // InternalPropSpecParser.g:2546:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // InternalPropSpecParser.g:2554:2: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==True) ) {
                alt36=1;
            }
            else if ( (LA36_0==False) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalPropSpecParser.g:2554:3: ( (lv_value_1_0= True ) )
                    {
                    // InternalPropSpecParser.g:2554:3: ( (lv_value_1_0= True ) )
                    // InternalPropSpecParser.g:2555:1: (lv_value_1_0= True )
                    {
                    // InternalPropSpecParser.g:2555:1: (lv_value_1_0= True )
                    // InternalPropSpecParser.g:2556:3: lv_value_1_0= True
                    {
                    lv_value_1_0=(Token)match(input,True,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:2572:2: otherlv_2= False
                    {
                    otherlv_2=(Token)match(input,False,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleConstantValue"
    // InternalPropSpecParser.g:2584:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalPropSpecParser.g:2585:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalPropSpecParser.g:2586:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // InternalPropSpecParser.g:2593:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2596:28: ( ( ( ruleQPREF ) ) )
            // InternalPropSpecParser.g:2597:1: ( ( ruleQPREF ) )
            {
            // InternalPropSpecParser.g:2597:1: ( ( ruleQPREF ) )
            // InternalPropSpecParser.g:2598:1: ( ruleQPREF )
            {
            // InternalPropSpecParser.g:2598:1: ( ruleQPREF )
            // InternalPropSpecParser.g:2599:3: ruleQPREF
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantValueRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantCrossReference_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleReferenceTerm"
    // InternalPropSpecParser.g:2624:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // InternalPropSpecParser.g:2625:2: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // InternalPropSpecParser.g:2626:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceTerm=ruleReferenceTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceTerm"


    // $ANTLR start "ruleReferenceTerm"
    // InternalPropSpecParser.g:2633:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2636:28: ( (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) )
            // InternalPropSpecParser.g:2637:1: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            {
            // InternalPropSpecParser.g:2637:1: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            // InternalPropSpecParser.g:2638:2: otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Reference,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalPropSpecParser.g:2647:1: ( (lv_path_2_0= ruleContainmentPathElement ) )
            // InternalPropSpecParser.g:2648:1: (lv_path_2_0= ruleContainmentPathElement )
            {
            // InternalPropSpecParser.g:2648:1: (lv_path_2_0= ruleContainmentPathElement )
            // InternalPropSpecParser.g:2649:3: lv_path_2_0= ruleContainmentPathElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_path_2_0=ruleContainmentPathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceTermRule());
              	        }
                     		set(
                     			current, 
                     			"path",
                      		lv_path_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceTerm"


    // $ANTLR start "entryRuleRecordTerm"
    // InternalPropSpecParser.g:2678:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // InternalPropSpecParser.g:2679:2: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // InternalPropSpecParser.g:2680:2: iv_ruleRecordTerm= ruleRecordTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRecordTerm=ruleRecordTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordTerm"


    // $ANTLR start "ruleRecordTerm"
    // InternalPropSpecParser.g:2687:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2690:28: ( (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) )
            // InternalPropSpecParser.g:2691:1: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            {
            // InternalPropSpecParser.g:2691:1: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            // InternalPropSpecParser.g:2692:2: otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // InternalPropSpecParser.g:2696:1: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPropSpecParser.g:2697:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // InternalPropSpecParser.g:2697:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // InternalPropSpecParser.g:2698:3: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    lv_ownedFieldValue_1_0=ruleFieldPropertyAssociation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRecordTermRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedFieldValue",
            	              		lv_ownedFieldValue_1_0, 
            	              		"org.osate.xtext.aadl2.properties.Properties.FieldPropertyAssociation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_2=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRecordTermAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordTerm"


    // $ANTLR start "entryRuleComputedTerm"
    // InternalPropSpecParser.g:2729:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // InternalPropSpecParser.g:2730:2: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // InternalPropSpecParser.g:2731:2: iv_ruleComputedTerm= ruleComputedTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComputedTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComputedTerm=ruleComputedTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComputedTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComputedTerm"


    // $ANTLR start "ruleComputedTerm"
    // InternalPropSpecParser.g:2738:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2741:28: ( (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalPropSpecParser.g:2742:1: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalPropSpecParser.g:2742:1: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalPropSpecParser.g:2743:2: otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalPropSpecParser.g:2752:1: ( (lv_function_2_0= RULE_ID ) )
            // InternalPropSpecParser.g:2753:1: (lv_function_2_0= RULE_ID )
            {
            // InternalPropSpecParser.g:2753:1: (lv_function_2_0= RULE_ID )
            // InternalPropSpecParser.g:2754:3: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_function_2_0, grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getComputedTermRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"function",
                      		lv_function_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComputedTerm"


    // $ANTLR start "entryRuleComponentClassifierTerm"
    // InternalPropSpecParser.g:2783:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // InternalPropSpecParser.g:2784:2: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // InternalPropSpecParser.g:2785:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentClassifierTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComponentClassifierTerm=ruleComponentClassifierTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentClassifierTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentClassifierTerm"


    // $ANTLR start "ruleComponentClassifierTerm"
    // InternalPropSpecParser.g:2792:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2795:28: ( (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) )
            // InternalPropSpecParser.g:2796:1: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            {
            // InternalPropSpecParser.g:2796:1: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            // InternalPropSpecParser.g:2797:2: otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Classifier,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalPropSpecParser.g:2806:1: ( ( ruleQCREF ) )
            // InternalPropSpecParser.g:2807:1: ( ruleQCREF )
            {
            // InternalPropSpecParser.g:2807:1: ( ruleQCREF )
            // InternalPropSpecParser.g:2808:3: ruleQCREF
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentClassifierTermRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
            ruleQCREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentClassifierTerm"


    // $ANTLR start "entryRuleListTerm"
    // InternalPropSpecParser.g:2838:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // InternalPropSpecParser.g:2839:2: (iv_ruleListTerm= ruleListTerm EOF )
            // InternalPropSpecParser.g:2840:2: iv_ruleListTerm= ruleListTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleListTerm=ruleListTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListTerm"


    // $ANTLR start "ruleListTerm"
    // InternalPropSpecParser.g:2847:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2850:28: ( ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalPropSpecParser.g:2851:1: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalPropSpecParser.g:2851:1: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalPropSpecParser.g:2851:2: () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalPropSpecParser.g:2851:2: ()
            // InternalPropSpecParser.g:2852:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getListTermAccess().getListValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalPropSpecParser.g:2865:1: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Classifier||LA39_0==Reference||LA39_0==Compute||LA39_0==False||LA39_0==True||LA39_0==LeftParenthesis||LA39_0==PlusSign||LA39_0==HyphenMinus||LA39_0==LeftSquareBracket||LA39_0==RULE_REAL_LIT||LA39_0==RULE_INTEGER_LIT||(LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPropSpecParser.g:2865:2: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // InternalPropSpecParser.g:2865:2: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // InternalPropSpecParser.g:2866:1: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // InternalPropSpecParser.g:2866:1: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // InternalPropSpecParser.g:2867:3: lv_ownedListElement_2_0= rulePropertyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_ownedListElement_2_0=rulePropertyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListTermRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedListElement",
                              		lv_ownedListElement_2_0, 
                              		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalPropSpecParser.g:2883:2: (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==Comma) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalPropSpecParser.g:2884:2: otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // InternalPropSpecParser.g:2888:1: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // InternalPropSpecParser.g:2889:1: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // InternalPropSpecParser.g:2889:1: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // InternalPropSpecParser.g:2890:3: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_31);
                    	    lv_ownedListElement_4_0=rulePropertyExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getListTermRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedListElement",
                    	              		lv_ownedListElement_4_0, 
                    	              		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getListTermAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListTerm"


    // $ANTLR start "entryRuleFieldPropertyAssociation"
    // InternalPropSpecParser.g:2919:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // InternalPropSpecParser.g:2920:2: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // InternalPropSpecParser.g:2921:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldPropertyAssociationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFieldPropertyAssociation=ruleFieldPropertyAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldPropertyAssociation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldPropertyAssociation"


    // $ANTLR start "ruleFieldPropertyAssociation"
    // InternalPropSpecParser.g:2928:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2931:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) )
            // InternalPropSpecParser.g:2932:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            {
            // InternalPropSpecParser.g:2932:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            // InternalPropSpecParser.g:2932:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon
            {
            // InternalPropSpecParser.g:2932:2: ( (otherlv_0= RULE_ID ) )
            // InternalPropSpecParser.g:2933:1: (otherlv_0= RULE_ID )
            {
            // InternalPropSpecParser.g:2933:1: (otherlv_0= RULE_ID )
            // InternalPropSpecParser.g:2934:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // InternalPropSpecParser.g:2953:1: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // InternalPropSpecParser.g:2954:1: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // InternalPropSpecParser.g:2954:1: (lv_ownedValue_2_0= rulePropertyExpression )
            // InternalPropSpecParser.g:2955:3: lv_ownedValue_2_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_ownedValue_2_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldPropertyAssociationRule());
              	        }
                     		set(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldPropertyAssociation"


    // $ANTLR start "entryRuleContainmentPathElement"
    // InternalPropSpecParser.g:2984:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // InternalPropSpecParser.g:2985:2: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // InternalPropSpecParser.g:2986:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainmentPathElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContainmentPathElement=ruleContainmentPathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainmentPathElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainmentPathElement"


    // $ANTLR start "ruleContainmentPathElement"
    // InternalPropSpecParser.g:2993:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:2996:28: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) )
            // InternalPropSpecParser.g:2997:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            {
            // InternalPropSpecParser.g:2997:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            // InternalPropSpecParser.g:2997:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            {
            // InternalPropSpecParser.g:2997:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalPropSpecParser.g:2997:3: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalPropSpecParser.g:2997:3: ( (otherlv_0= RULE_ID ) )
            // InternalPropSpecParser.g:2998:1: (otherlv_0= RULE_ID )
            {
            // InternalPropSpecParser.g:2998:1: (otherlv_0= RULE_ID )
            // InternalPropSpecParser.g:2999:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContainmentPathElementRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0()); 
              	
            }

            }


            }

            // InternalPropSpecParser.g:3013:2: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LeftSquareBracket) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPropSpecParser.g:3014:1: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalPropSpecParser.g:3014:1: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalPropSpecParser.g:3015:3: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    lv_arrayRange_1_0=ruleArrayRange();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"arrayRange",
            	              		lv_arrayRange_1_0, 
            	              		"org.osate.xtext.aadl2.properties.Properties.ArrayRange");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            // InternalPropSpecParser.g:3031:4: (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==FullStop) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPropSpecParser.g:3032:2: otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
                          
                    }
                    // InternalPropSpecParser.g:3036:1: ( (lv_path_3_0= ruleContainmentPathElement ) )
                    // InternalPropSpecParser.g:3037:1: (lv_path_3_0= ruleContainmentPathElement )
                    {
                    // InternalPropSpecParser.g:3037:1: (lv_path_3_0= ruleContainmentPathElement )
                    // InternalPropSpecParser.g:3038:3: lv_path_3_0= ruleContainmentPathElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainmentPathElementAccess().getPathContainmentPathElementParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_path_3_0=ruleContainmentPathElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
                      	        }
                             		set(
                             			current, 
                             			"path",
                              		lv_path_3_0, 
                              		"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainmentPathElement"


    // $ANTLR start "entryRulePlusMinus"
    // InternalPropSpecParser.g:3064:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // InternalPropSpecParser.g:3065:1: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalPropSpecParser.g:3066:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusMinusRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusMinus.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalPropSpecParser.g:3073:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= HyphenMinus ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3077:6: ( (kw= PlusSign | kw= HyphenMinus ) )
            // InternalPropSpecParser.g:3078:1: (kw= PlusSign | kw= HyphenMinus )
            {
            // InternalPropSpecParser.g:3078:1: (kw= PlusSign | kw= HyphenMinus )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==PlusSign) ) {
                alt42=1;
            }
            else if ( (LA42_0==HyphenMinus) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalPropSpecParser.g:3079:2: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:3086:2: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleStringTerm"
    // InternalPropSpecParser.g:3099:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // InternalPropSpecParser.g:3100:2: (iv_ruleStringTerm= ruleStringTerm EOF )
            // InternalPropSpecParser.g:3101:2: iv_ruleStringTerm= ruleStringTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringTerm=ruleStringTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringTerm"


    // $ANTLR start "ruleStringTerm"
    // InternalPropSpecParser.g:3108:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3111:28: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // InternalPropSpecParser.g:3112:1: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // InternalPropSpecParser.g:3112:1: ( (lv_value_0_0= ruleNoQuoteString ) )
            // InternalPropSpecParser.g:3113:1: (lv_value_0_0= ruleNoQuoteString )
            {
            // InternalPropSpecParser.g:3113:1: (lv_value_0_0= ruleNoQuoteString )
            // InternalPropSpecParser.g:3114:3: lv_value_0_0= ruleNoQuoteString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_0_0=ruleNoQuoteString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringTermRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.NoQuoteString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringTerm"


    // $ANTLR start "entryRuleNoQuoteString"
    // InternalPropSpecParser.g:3138:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalPropSpecParser.g:3139:1: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalPropSpecParser.g:3140:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNoQuoteStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNoQuoteString=ruleNoQuoteString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNoQuoteString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoQuoteString"


    // $ANTLR start "ruleNoQuoteString"
    // InternalPropSpecParser.g:3147:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3151:6: (this_STRING_0= RULE_STRING )
            // InternalPropSpecParser.g:3152:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_0, grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoQuoteString"


    // $ANTLR start "entryRuleArrayRange"
    // InternalPropSpecParser.g:3167:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalPropSpecParser.g:3168:2: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalPropSpecParser.g:3169:2: iv_ruleArrayRange= ruleArrayRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArrayRange=ruleArrayRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayRange; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayRange"


    // $ANTLR start "ruleArrayRange"
    // InternalPropSpecParser.g:3176:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3179:28: ( ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) )
            // InternalPropSpecParser.g:3180:1: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            {
            // InternalPropSpecParser.g:3180:1: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            // InternalPropSpecParser.g:3180:2: () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket
            {
            // InternalPropSpecParser.g:3180:2: ()
            // InternalPropSpecParser.g:3181:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalPropSpecParser.g:3194:1: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // InternalPropSpecParser.g:3195:1: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // InternalPropSpecParser.g:3195:1: (lv_lowerBound_2_0= ruleINTVALUE )
            // InternalPropSpecParser.g:3196:3: lv_lowerBound_2_0= ruleINTVALUE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_lowerBound_2_0=ruleINTVALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayRangeRule());
              	        }
                     		set(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalPropSpecParser.g:3212:2: (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==FullStopFullStop) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPropSpecParser.g:3213:2: otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                          
                    }
                    // InternalPropSpecParser.g:3217:1: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // InternalPropSpecParser.g:3218:1: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // InternalPropSpecParser.g:3218:1: (lv_upperBound_4_0= ruleINTVALUE )
                    // InternalPropSpecParser.g:3219:3: lv_upperBound_4_0= ruleINTVALUE
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_upperBound_4_0=ruleINTVALUE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_4_0, 
                              		"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayRange"


    // $ANTLR start "entryRuleSignedConstant"
    // InternalPropSpecParser.g:3248:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // InternalPropSpecParser.g:3249:2: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // InternalPropSpecParser.g:3250:2: iv_ruleSignedConstant= ruleSignedConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedConstantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedConstant=ruleSignedConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedConstant; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedConstant"


    // $ANTLR start "ruleSignedConstant"
    // InternalPropSpecParser.g:3257:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3260:28: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // InternalPropSpecParser.g:3261:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // InternalPropSpecParser.g:3261:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // InternalPropSpecParser.g:3261:2: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // InternalPropSpecParser.g:3261:2: ( (lv_op_0_0= rulePlusMinus ) )
            // InternalPropSpecParser.g:3262:1: (lv_op_0_0= rulePlusMinus )
            {
            // InternalPropSpecParser.g:3262:1: (lv_op_0_0= rulePlusMinus )
            // InternalPropSpecParser.g:3263:3: lv_op_0_0= rulePlusMinus
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_37);
            lv_op_0_0=rulePlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignedConstantRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.PlusMinus");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalPropSpecParser.g:3279:2: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // InternalPropSpecParser.g:3280:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // InternalPropSpecParser.g:3280:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // InternalPropSpecParser.g:3281:3: lv_ownedPropertyExpression_1_0= ruleConstantValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedPropertyExpression_1_0=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignedConstantRule());
              	        }
                     		add(
                     			current, 
                     			"ownedPropertyExpression",
                      		lv_ownedPropertyExpression_1_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.ConstantValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedConstant"


    // $ANTLR start "entryRuleIntegerTerm"
    // InternalPropSpecParser.g:3305:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // InternalPropSpecParser.g:3306:2: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // InternalPropSpecParser.g:3307:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerTerm=ruleIntegerTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerTerm"


    // $ANTLR start "ruleIntegerTerm"
    // InternalPropSpecParser.g:3314:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3317:28: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalPropSpecParser.g:3318:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalPropSpecParser.g:3318:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalPropSpecParser.g:3318:2: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalPropSpecParser.g:3318:2: ( (lv_value_0_0= ruleSignedInt ) )
            // InternalPropSpecParser.g:3319:1: (lv_value_0_0= ruleSignedInt )
            {
            // InternalPropSpecParser.g:3319:1: (lv_value_0_0= ruleSignedInt )
            // InternalPropSpecParser.g:3320:3: lv_value_0_0= ruleSignedInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_value_0_0=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerTermRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.SignedInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalPropSpecParser.g:3336:2: ( (otherlv_1= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPropSpecParser.g:3337:1: (otherlv_1= RULE_ID )
                    {
                    // InternalPropSpecParser.g:3337:1: (otherlv_1= RULE_ID )
                    // InternalPropSpecParser.g:3338:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getIntegerTermRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                      	
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerTerm"


    // $ANTLR start "entryRuleSignedInt"
    // InternalPropSpecParser.g:3360:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalPropSpecParser.g:3361:1: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalPropSpecParser.g:3362:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedInt.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // InternalPropSpecParser.g:3369:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3373:6: ( ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // InternalPropSpecParser.g:3374:1: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // InternalPropSpecParser.g:3374:1: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // InternalPropSpecParser.g:3374:2: (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // InternalPropSpecParser.g:3374:2: (kw= PlusSign | kw= HyphenMinus )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==PlusSign) ) {
                alt45=1;
            }
            else if ( (LA45_0==HyphenMinus) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // InternalPropSpecParser.g:3375:2: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:3382:2: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_INTEGER_LIT_2=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INTEGER_LIT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INTEGER_LIT_2, grammarAccess.getSignedIntAccess().getINTEGER_LITTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleRealTerm"
    // InternalPropSpecParser.g:3402:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // InternalPropSpecParser.g:3403:2: (iv_ruleRealTerm= ruleRealTerm EOF )
            // InternalPropSpecParser.g:3404:2: iv_ruleRealTerm= ruleRealTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRealTerm=ruleRealTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealTerm"


    // $ANTLR start "ruleRealTerm"
    // InternalPropSpecParser.g:3411:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3414:28: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalPropSpecParser.g:3415:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalPropSpecParser.g:3415:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalPropSpecParser.g:3415:2: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalPropSpecParser.g:3415:2: ( (lv_value_0_0= ruleSignedReal ) )
            // InternalPropSpecParser.g:3416:1: (lv_value_0_0= ruleSignedReal )
            {
            // InternalPropSpecParser.g:3416:1: (lv_value_0_0= ruleSignedReal )
            // InternalPropSpecParser.g:3417:3: lv_value_0_0= ruleSignedReal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_value_0_0=ruleSignedReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRealTermRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.SignedReal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalPropSpecParser.g:3433:2: ( (otherlv_1= RULE_ID ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPropSpecParser.g:3434:1: (otherlv_1= RULE_ID )
                    {
                    // InternalPropSpecParser.g:3434:1: (otherlv_1= RULE_ID )
                    // InternalPropSpecParser.g:3435:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRealTermRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                      	
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealTerm"


    // $ANTLR start "entryRuleSignedReal"
    // InternalPropSpecParser.g:3457:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // InternalPropSpecParser.g:3458:1: (iv_ruleSignedReal= ruleSignedReal EOF )
            // InternalPropSpecParser.g:3459:2: iv_ruleSignedReal= ruleSignedReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedRealRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedReal=ruleSignedReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedReal.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedReal"


    // $ANTLR start "ruleSignedReal"
    // InternalPropSpecParser.g:3466:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3470:6: ( ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // InternalPropSpecParser.g:3471:1: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // InternalPropSpecParser.g:3471:1: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            // InternalPropSpecParser.g:3471:2: (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // InternalPropSpecParser.g:3471:2: (kw= PlusSign | kw= HyphenMinus )?
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==PlusSign) ) {
                alt47=1;
            }
            else if ( (LA47_0==HyphenMinus) ) {
                alt47=2;
            }
            switch (alt47) {
                case 1 :
                    // InternalPropSpecParser.g:3472:2: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:3479:2: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_REAL_LIT_2=(Token)match(input,RULE_REAL_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_REAL_LIT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_REAL_LIT_2, grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedReal"


    // $ANTLR start "entryRuleNumericRangeTerm"
    // InternalPropSpecParser.g:3499:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // InternalPropSpecParser.g:3500:2: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // InternalPropSpecParser.g:3501:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericRangeTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumericRangeTerm=ruleNumericRangeTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericRangeTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericRangeTerm"


    // $ANTLR start "ruleNumericRangeTerm"
    // InternalPropSpecParser.g:3508:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3511:28: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // InternalPropSpecParser.g:3512:1: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // InternalPropSpecParser.g:3512:1: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // InternalPropSpecParser.g:3512:2: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // InternalPropSpecParser.g:3512:2: ( (lv_minimum_0_0= ruleNumAlt ) )
            // InternalPropSpecParser.g:3513:1: (lv_minimum_0_0= ruleNumAlt )
            {
            // InternalPropSpecParser.g:3513:1: (lv_minimum_0_0= ruleNumAlt )
            // InternalPropSpecParser.g:3514:3: lv_minimum_0_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_39);
            lv_minimum_0_0=ruleNumAlt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
              	        }
                     		set(
                     			current, 
                     			"minimum",
                      		lv_minimum_0_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.NumAlt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
                  
            }
            // InternalPropSpecParser.g:3535:1: ( (lv_maximum_2_0= ruleNumAlt ) )
            // InternalPropSpecParser.g:3536:1: (lv_maximum_2_0= ruleNumAlt )
            {
            // InternalPropSpecParser.g:3536:1: (lv_maximum_2_0= ruleNumAlt )
            // InternalPropSpecParser.g:3537:3: lv_maximum_2_0= ruleNumAlt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_40);
            lv_maximum_2_0=ruleNumAlt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
              	        }
                     		set(
                     			current, 
                     			"maximum",
                      		lv_maximum_2_0, 
                      		"org.osate.xtext.aadl2.properties.Properties.NumAlt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalPropSpecParser.g:3553:2: (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Delta) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPropSpecParser.g:3554:2: otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,Delta,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                          
                    }
                    // InternalPropSpecParser.g:3558:1: ( (lv_delta_4_0= ruleNumAlt ) )
                    // InternalPropSpecParser.g:3559:1: (lv_delta_4_0= ruleNumAlt )
                    {
                    // InternalPropSpecParser.g:3559:1: (lv_delta_4_0= ruleNumAlt )
                    // InternalPropSpecParser.g:3560:3: lv_delta_4_0= ruleNumAlt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getDeltaNumAltParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_delta_4_0=ruleNumAlt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                      	        }
                             		set(
                             			current, 
                             			"delta",
                              		lv_delta_4_0, 
                              		"org.osate.xtext.aadl2.properties.Properties.NumAlt");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericRangeTerm"


    // $ANTLR start "entryRuleNumAlt"
    // InternalPropSpecParser.g:3584:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // InternalPropSpecParser.g:3585:2: (iv_ruleNumAlt= ruleNumAlt EOF )
            // InternalPropSpecParser.g:3586:2: iv_ruleNumAlt= ruleNumAlt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumAltRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumAlt=ruleNumAlt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumAlt; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumAlt"


    // $ANTLR start "ruleNumAlt"
    // InternalPropSpecParser.g:3593:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;


         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3596:28: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // InternalPropSpecParser.g:3597:1: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // InternalPropSpecParser.g:3597:1: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt49=4;
            switch ( input.LA(1) ) {
            case PlusSign:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt49=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt49=3;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt49=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }

                }
                break;
            case HyphenMinus:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt49=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt49=3;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt49=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REAL_LIT:
                {
                alt49=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt49=2;
                }
                break;
            case RULE_ID:
                {
                alt49=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalPropSpecParser.g:3598:2: this_RealTerm_0= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RealTerm_0=ruleRealTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_RealTerm_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalPropSpecParser.g:3611:2: this_IntegerTerm_1= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerTerm_1=ruleIntegerTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_IntegerTerm_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalPropSpecParser.g:3624:2: this_SignedConstant_2= ruleSignedConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SignedConstant_2=ruleSignedConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SignedConstant_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalPropSpecParser.g:3637:2: this_ConstantValue_3= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ConstantValue_3=ruleConstantValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ConstantValue_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumAlt"


    // $ANTLR start "entryRuleAppliesToKeywords"
    // InternalPropSpecParser.g:3656:1: entryRuleAppliesToKeywords returns [String current=null] : iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF ;
    public final String entryRuleAppliesToKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAppliesToKeywords = null;


        try {
            // InternalPropSpecParser.g:3657:1: (iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF )
            // InternalPropSpecParser.g:3658:2: iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliesToKeywordsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAppliesToKeywords=ruleAppliesToKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliesToKeywords.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppliesToKeywords"


    // $ANTLR start "ruleAppliesToKeywords"
    // InternalPropSpecParser.g:3665:1: ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Applies kw= To ) ;
    public final AntlrDatatypeRuleToken ruleAppliesToKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3669:6: ( (kw= Applies kw= To ) )
            // InternalPropSpecParser.g:3670:1: (kw= Applies kw= To )
            {
            // InternalPropSpecParser.g:3670:1: (kw= Applies kw= To )
            // InternalPropSpecParser.g:3671:2: kw= Applies kw= To
            {
            kw=(Token)match(input,Applies,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0()); 
                  
            }
            kw=(Token)match(input,To,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getToKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppliesToKeywords"


    // $ANTLR start "entryRuleInBindingKeywords"
    // InternalPropSpecParser.g:3690:1: entryRuleInBindingKeywords returns [String current=null] : iv_ruleInBindingKeywords= ruleInBindingKeywords EOF ;
    public final String entryRuleInBindingKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInBindingKeywords = null;


        try {
            // InternalPropSpecParser.g:3691:1: (iv_ruleInBindingKeywords= ruleInBindingKeywords EOF )
            // InternalPropSpecParser.g:3692:2: iv_ruleInBindingKeywords= ruleInBindingKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInBindingKeywordsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInBindingKeywords=ruleInBindingKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInBindingKeywords.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInBindingKeywords"


    // $ANTLR start "ruleInBindingKeywords"
    // InternalPropSpecParser.g:3699:1: ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Binding ) ;
    public final AntlrDatatypeRuleToken ruleInBindingKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3703:6: ( (kw= In kw= Binding ) )
            // InternalPropSpecParser.g:3704:1: (kw= In kw= Binding )
            {
            // InternalPropSpecParser.g:3704:1: (kw= In kw= Binding )
            // InternalPropSpecParser.g:3705:2: kw= In kw= Binding
            {
            kw=(Token)match(input,In,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getInKeyword_0()); 
                  
            }
            kw=(Token)match(input,Binding,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getBindingKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInBindingKeywords"


    // $ANTLR start "entryRuleInModesKeywords"
    // InternalPropSpecParser.g:3724:1: entryRuleInModesKeywords returns [String current=null] : iv_ruleInModesKeywords= ruleInModesKeywords EOF ;
    public final String entryRuleInModesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInModesKeywords = null;


        try {
            // InternalPropSpecParser.g:3725:1: (iv_ruleInModesKeywords= ruleInModesKeywords EOF )
            // InternalPropSpecParser.g:3726:2: iv_ruleInModesKeywords= ruleInModesKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInModesKeywordsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInModesKeywords=ruleInModesKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInModesKeywords.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInModesKeywords"


    // $ANTLR start "ruleInModesKeywords"
    // InternalPropSpecParser.g:3733:1: ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Modes ) ;
    public final AntlrDatatypeRuleToken ruleInModesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3737:6: ( (kw= In kw= Modes ) )
            // InternalPropSpecParser.g:3738:1: (kw= In kw= Modes )
            {
            // InternalPropSpecParser.g:3738:1: (kw= In kw= Modes )
            // InternalPropSpecParser.g:3739:2: kw= In kw= Modes
            {
            kw=(Token)match(input,In,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getInKeyword_0()); 
                  
            }
            kw=(Token)match(input,Modes,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getModesKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInModesKeywords"


    // $ANTLR start "entryRuleINTVALUE"
    // InternalPropSpecParser.g:3758:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // InternalPropSpecParser.g:3759:1: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // InternalPropSpecParser.g:3760:2: iv_ruleINTVALUE= ruleINTVALUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTVALUERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleINTVALUE=ruleINTVALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTVALUE.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTVALUE"


    // $ANTLR start "ruleINTVALUE"
    // InternalPropSpecParser.g:3767:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3771:6: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // InternalPropSpecParser.g:3772:5: this_INTEGER_LIT_0= RULE_INTEGER_LIT
            {
            this_INTEGER_LIT_0=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INTEGER_LIT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INTEGER_LIT_0, grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTVALUE"


    // $ANTLR start "entryRuleQPREF"
    // InternalPropSpecParser.g:3789:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // InternalPropSpecParser.g:3790:1: (iv_ruleQPREF= ruleQPREF EOF )
            // InternalPropSpecParser.g:3791:2: iv_ruleQPREF= ruleQPREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQPREFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQPREF=ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQPREF.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQPREF"


    // $ANTLR start "ruleQPREF"
    // InternalPropSpecParser.g:3798:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3802:6: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) )
            // InternalPropSpecParser.g:3803:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            {
            // InternalPropSpecParser.g:3803:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            // InternalPropSpecParser.g:3803:6: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalPropSpecParser.g:3810:1: (kw= ColonColon this_ID_2= RULE_ID )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ColonColon) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPropSpecParser.g:3811:2: kw= ColonColon this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); 
                          
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQPREF"


    // $ANTLR start "entryRuleQCREF"
    // InternalPropSpecParser.g:3831:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // InternalPropSpecParser.g:3832:1: (iv_ruleQCREF= ruleQCREF EOF )
            // InternalPropSpecParser.g:3833:2: iv_ruleQCREF= ruleQCREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQCREFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQCREF=ruleQCREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQCREF.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQCREF"


    // $ANTLR start "ruleQCREF"
    // InternalPropSpecParser.g:3840:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3844:6: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) )
            // InternalPropSpecParser.g:3845:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            {
            // InternalPropSpecParser.g:3845:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            // InternalPropSpecParser.g:3845:2: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )?
            {
            // InternalPropSpecParser.g:3845:2: (this_ID_0= RULE_ID kw= ColonColon )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    int LA51_1 = input.LA(2);

                    if ( (LA51_1==ColonColon) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // InternalPropSpecParser.g:3845:7: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); 
            	          
            	    }
            	    kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // InternalPropSpecParser.g:3865:1: (kw= FullStop this_ID_4= RULE_ID )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==FullStop) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPropSpecParser.g:3866:2: kw= FullStop this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,FullStop,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQCREFAccess().getFullStopKeyword_2_0()); 
                          
                    }
                    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_4, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQCREF"


    // $ANTLR start "entryRuleSTAR"
    // InternalPropSpecParser.g:3886:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // InternalPropSpecParser.g:3887:1: (iv_ruleSTAR= ruleSTAR EOF )
            // InternalPropSpecParser.g:3888:2: iv_ruleSTAR= ruleSTAR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSTARRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSTAR=ruleSTAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSTAR.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTAR"


    // $ANTLR start "ruleSTAR"
    // InternalPropSpecParser.g:3895:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalPropSpecParser.g:3899:6: (kw= Asterisk )
            // InternalPropSpecParser.g:3901:2: kw= Asterisk
            {
            kw=(Token)match(input,Asterisk,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSTARAccess().getAsteriskKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTAR"

    // $ANTLR start synpred1_InternalPropSpecParser
    public final void synpred1_InternalPropSpecParser_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

        // InternalPropSpecParser.g:101:4: ( ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) ) )
        // InternalPropSpecParser.g:101:4: ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) )
        {
        // InternalPropSpecParser.g:101:4: ({...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) ) )
        // InternalPropSpecParser.g:102:5: {...}? => ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred1_InternalPropSpecParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 0)");
        }
        // InternalPropSpecParser.g:102:98: ( ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ) )
        // InternalPropSpecParser.g:103:6: ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTopAccess().getUnorderedGroup(), 0);
        // InternalPropSpecParser.g:106:6: ({...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon ) )
        // InternalPropSpecParser.g:106:7: {...}? => (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred1_InternalPropSpecParser", "true");
        }
        // InternalPropSpecParser.g:106:16: (otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon )
        // InternalPropSpecParser.g:107:2: otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Semicolon
        {
        otherlv_1=(Token)match(input,Name,FollowSets000.FOLLOW_3); if (state.failed) return ;
        otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalPropSpecParser.g:116:1: ( (lv_name_3_0= RULE_ID ) )
        // InternalPropSpecParser.g:117:1: (lv_name_3_0= RULE_ID )
        {
        // InternalPropSpecParser.g:117:1: (lv_name_3_0= RULE_ID )
        // InternalPropSpecParser.g:118:3: lv_name_3_0= RULE_ID
        {
        lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalPropSpecParser

    // $ANTLR start synpred2_InternalPropSpecParser
    public final void synpred2_InternalPropSpecParser_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

        // InternalPropSpecParser.g:146:4: ( ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) ) )
        // InternalPropSpecParser.g:146:4: ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) )
        {
        // InternalPropSpecParser.g:146:4: ({...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) ) )
        // InternalPropSpecParser.g:147:5: {...}? => ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalPropSpecParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 1)");
        }
        // InternalPropSpecParser.g:147:98: ( ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) ) )
        // InternalPropSpecParser.g:148:6: ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTopAccess().getUnorderedGroup(), 1);
        // InternalPropSpecParser.g:151:6: ({...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon ) )
        // InternalPropSpecParser.g:151:7: {...}? => (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalPropSpecParser", "true");
        }
        // InternalPropSpecParser.g:151:16: (otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon )
        // InternalPropSpecParser.g:152:2: otherlv_5= Model otherlv_6= Colon ( ( ruleQCREF ) ) otherlv_8= Semicolon
        {
        otherlv_5=(Token)match(input,Model,FollowSets000.FOLLOW_3); if (state.failed) return ;
        otherlv_6=(Token)match(input,Colon,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalPropSpecParser.g:161:1: ( ( ruleQCREF ) )
        // InternalPropSpecParser.g:162:1: ( ruleQCREF )
        {
        // InternalPropSpecParser.g:162:1: ( ruleQCREF )
        // InternalPropSpecParser.g:163:3: ruleQCREF
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        pushFollow(FollowSets000.FOLLOW_5);
        ruleQCREF();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_8=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalPropSpecParser

    // $ANTLR start synpred3_InternalPropSpecParser
    public final void synpred3_InternalPropSpecParser_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_path_11_0=null;
        Token otherlv_12=null;

        // InternalPropSpecParser.g:192:4: ( ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) ) )
        // InternalPropSpecParser.g:192:4: ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) )
        {
        // InternalPropSpecParser.g:192:4: ({...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) ) )
        // InternalPropSpecParser.g:193:5: {...}? => ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalPropSpecParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 2)");
        }
        // InternalPropSpecParser.g:193:98: ( ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) ) )
        // InternalPropSpecParser.g:194:6: ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTopAccess().getUnorderedGroup(), 2);
        // InternalPropSpecParser.g:197:6: ({...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon ) )
        // InternalPropSpecParser.g:197:7: {...}? => (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalPropSpecParser", "true");
        }
        // InternalPropSpecParser.g:197:16: (otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon )
        // InternalPropSpecParser.g:198:2: otherlv_9= Instance otherlv_10= Colon ( (lv_path_11_0= RULE_STRING ) ) otherlv_12= Semicolon
        {
        otherlv_9=(Token)match(input,Instance,FollowSets000.FOLLOW_3); if (state.failed) return ;
        otherlv_10=(Token)match(input,Colon,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalPropSpecParser.g:207:1: ( (lv_path_11_0= RULE_STRING ) )
        // InternalPropSpecParser.g:208:1: (lv_path_11_0= RULE_STRING )
        {
        // InternalPropSpecParser.g:208:1: (lv_path_11_0= RULE_STRING )
        // InternalPropSpecParser.g:209:3: lv_path_11_0= RULE_STRING
        {
        lv_path_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return ;

        }


        }

        otherlv_12=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalPropSpecParser

    // $ANTLR start synpred5_InternalPropSpecParser
    public final void synpred5_InternalPropSpecParser_fragment() throws RecognitionException {   
        EObject lv_proposition_13_0 = null;

        EObject lv_property_14_0 = null;


        // InternalPropSpecParser.g:242:7: ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )
        // InternalPropSpecParser.g:242:7: {...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalPropSpecParser", "true");
        }
        // InternalPropSpecParser.g:242:16: ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) )
        int alt53=2;
        int LA53_0 = input.LA(1);

        if ( (LA53_0==Proposition) ) {
            alt53=1;
        }
        else if ( (LA53_0==Reachability||LA53_0==Invariant) ) {
            alt53=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 53, 0, input);

            throw nvae;
        }
        switch (alt53) {
            case 1 :
                // InternalPropSpecParser.g:242:17: ( (lv_proposition_13_0= ruleProposition ) )
                {
                // InternalPropSpecParser.g:242:17: ( (lv_proposition_13_0= ruleProposition ) )
                // InternalPropSpecParser.g:243:1: (lv_proposition_13_0= ruleProposition )
                {
                // InternalPropSpecParser.g:243:1: (lv_proposition_13_0= ruleProposition )
                // InternalPropSpecParser.g:244:3: lv_proposition_13_0= ruleProposition
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getTopAccess().getPropositionPropositionParserRuleCall_3_0_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_proposition_13_0=ruleProposition();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalPropSpecParser.g:261:6: ( (lv_property_14_0= ruleProperty ) )
                {
                // InternalPropSpecParser.g:261:6: ( (lv_property_14_0= ruleProperty ) )
                // InternalPropSpecParser.g:262:1: (lv_property_14_0= ruleProperty )
                {
                // InternalPropSpecParser.g:262:1: (lv_property_14_0= ruleProperty )
                // InternalPropSpecParser.g:263:3: lv_property_14_0= ruleProperty
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getTopAccess().getPropertyPropertyParserRuleCall_3_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_property_14_0=ruleProperty();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred5_InternalPropSpecParser

    // $ANTLR start synpred6_InternalPropSpecParser
    public final void synpred6_InternalPropSpecParser_fragment() throws RecognitionException {   
        EObject lv_proposition_13_0 = null;

        EObject lv_property_14_0 = null;


        // InternalPropSpecParser.g:237:4: ( ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) ) )
        // InternalPropSpecParser.g:237:4: ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) )
        {
        // InternalPropSpecParser.g:237:4: ({...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ ) )
        // InternalPropSpecParser.g:238:5: {...}? => ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalPropSpecParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopAccess().getUnorderedGroup(), 3)");
        }
        // InternalPropSpecParser.g:238:98: ( ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+ )
        // InternalPropSpecParser.g:239:6: ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+
        {
        getUnorderedGroupHelper().select(grammarAccess.getTopAccess().getUnorderedGroup(), 3);
        // InternalPropSpecParser.g:242:6: ({...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) ) )+
        int cnt55=0;
        loop55:
        do {
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Proposition) && ((true))) {
                alt55=1;
            }
            else if ( (LA55_0==Reachability) && ((true))) {
                alt55=1;
            }
            else if ( (LA55_0==Invariant) && ((true))) {
                alt55=1;
            }


            switch (alt55) {
        	case 1 :
        	    // InternalPropSpecParser.g:242:7: {...}? => ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) )
        	    {
        	    if ( !((true)) ) {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        throw new FailedPredicateException(input, "synpred6_InternalPropSpecParser", "true");
        	    }
        	    // InternalPropSpecParser.g:242:16: ( ( (lv_proposition_13_0= ruleProposition ) ) | ( (lv_property_14_0= ruleProperty ) ) )
        	    int alt54=2;
        	    int LA54_0 = input.LA(1);

        	    if ( (LA54_0==Proposition) ) {
        	        alt54=1;
        	    }
        	    else if ( (LA54_0==Reachability||LA54_0==Invariant) ) {
        	        alt54=2;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        NoViableAltException nvae =
        	            new NoViableAltException("", 54, 0, input);

        	        throw nvae;
        	    }
        	    switch (alt54) {
        	        case 1 :
        	            // InternalPropSpecParser.g:242:17: ( (lv_proposition_13_0= ruleProposition ) )
        	            {
        	            // InternalPropSpecParser.g:242:17: ( (lv_proposition_13_0= ruleProposition ) )
        	            // InternalPropSpecParser.g:243:1: (lv_proposition_13_0= ruleProposition )
        	            {
        	            // InternalPropSpecParser.g:243:1: (lv_proposition_13_0= ruleProposition )
        	            // InternalPropSpecParser.g:244:3: lv_proposition_13_0= ruleProposition
        	            {
        	            if ( state.backtracking==0 ) {
        	               
        	              	        newCompositeNode(grammarAccess.getTopAccess().getPropositionPropositionParserRuleCall_3_0_0()); 
        	              	    
        	            }
        	            pushFollow(FollowSets000.FOLLOW_6);
        	            lv_proposition_13_0=ruleProposition();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }


        	            }


        	            }
        	            break;
        	        case 2 :
        	            // InternalPropSpecParser.g:261:6: ( (lv_property_14_0= ruleProperty ) )
        	            {
        	            // InternalPropSpecParser.g:261:6: ( (lv_property_14_0= ruleProperty ) )
        	            // InternalPropSpecParser.g:262:1: (lv_property_14_0= ruleProperty )
        	            {
        	            // InternalPropSpecParser.g:262:1: (lv_property_14_0= ruleProperty )
        	            // InternalPropSpecParser.g:263:3: lv_property_14_0= ruleProperty
        	            {
        	            if ( state.backtracking==0 ) {
        	               
        	              	        newCompositeNode(grammarAccess.getTopAccess().getPropertyPropertyParserRuleCall_3_1_0()); 
        	              	    
        	            }
        	            pushFollow(FollowSets000.FOLLOW_6);
        	            lv_property_14_0=ruleProperty();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }


        	            }


        	            }
        	            break;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt55 >= 1 ) break loop55;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(55, input);
                    throw eee;
            }
            cnt55++;
        } while (true);


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalPropSpecParser

    // $ANTLR start synpred8_InternalPropSpecParser
    public final void synpred8_InternalPropSpecParser_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_initCond_5_0 = null;


        // InternalPropSpecParser.g:402:2: ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )
        // InternalPropSpecParser.g:402:2: ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign
        {
        // InternalPropSpecParser.g:402:2: ( (lv_initCond_5_0= rulePSExpression ) )
        // InternalPropSpecParser.g:403:1: (lv_initCond_5_0= rulePSExpression )
        {
        // InternalPropSpecParser.g:403:1: (lv_initCond_5_0= rulePSExpression )
        // InternalPropSpecParser.g:404:3: lv_initCond_5_0= rulePSExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getReachabilityAccess().getInitCondPSExpressionParserRuleCall_5_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_initCond_5_0=rulePSExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,EqualsSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalPropSpecParser

    // $ANTLR start synpred9_InternalPropSpecParser
    public final void synpred9_InternalPropSpecParser_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_initCond_5_0 = null;


        // InternalPropSpecParser.g:535:2: ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )
        // InternalPropSpecParser.g:535:2: ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign
        {
        // InternalPropSpecParser.g:535:2: ( (lv_initCond_5_0= rulePSExpression ) )
        // InternalPropSpecParser.g:536:1: (lv_initCond_5_0= rulePSExpression )
        {
        // InternalPropSpecParser.g:536:1: (lv_initCond_5_0= rulePSExpression )
        // InternalPropSpecParser.g:537:3: lv_initCond_5_0= rulePSExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getInvariantAccess().getInitCondPSExpressionParserRuleCall_5_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_initCond_5_0=rulePSExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,EqualsSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalPropSpecParser

    // $ANTLR start synpred12_InternalPropSpecParser
    public final void synpred12_InternalPropSpecParser_fragment() throws RecognitionException {   
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject lv_right_3_0 = null;


        // InternalPropSpecParser.g:828:2: ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )
        // InternalPropSpecParser.g:828:2: () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) )
        {
        // InternalPropSpecParser.g:828:2: ()
        // InternalPropSpecParser.g:829:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // InternalPropSpecParser.g:837:2: ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) )
        // InternalPropSpecParser.g:838:1: ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) )
        {
        // InternalPropSpecParser.g:838:1: ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) )
        // InternalPropSpecParser.g:839:1: (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor )
        {
        // InternalPropSpecParser.g:839:1: (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor )
        int alt56=3;
        switch ( input.LA(1) ) {
        case And:
            {
            alt56=1;
            }
            break;
        case Or:
            {
            alt56=2;
            }
            break;
        case Xor:
            {
            alt56=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 56, 0, input);

            throw nvae;
        }

        switch (alt56) {
            case 1 :
                // InternalPropSpecParser.g:840:3: lv_op_2_1= And
                {
                lv_op_2_1=(Token)match(input,And,FollowSets000.FOLLOW_10); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalPropSpecParser.g:853:8: lv_op_2_2= Or
                {
                lv_op_2_2=(Token)match(input,Or,FollowSets000.FOLLOW_10); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalPropSpecParser.g:866:8: lv_op_2_3= Xor
                {
                lv_op_2_3=(Token)match(input,Xor,FollowSets000.FOLLOW_10); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalPropSpecParser.g:882:2: ( (lv_right_3_0= rulePSExpression ) )
        // InternalPropSpecParser.g:883:1: (lv_right_3_0= rulePSExpression )
        {
        // InternalPropSpecParser.g:883:1: (lv_right_3_0= rulePSExpression )
        // InternalPropSpecParser.g:884:3: lv_right_3_0= rulePSExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPSExpressionAccess().getRightPSExpressionParserRuleCall_0_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=rulePSExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalPropSpecParser

    // $ANTLR start synpred13_InternalPropSpecParser
    public final void synpred13_InternalPropSpecParser_fragment() throws RecognitionException {   
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ScopedExpression_0 = null;

        EObject lv_right_3_0 = null;


        // InternalPropSpecParser.g:816:2: ( (this_ScopedExpression_0= ruleScopedExpression ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )* ) )
        // InternalPropSpecParser.g:816:2: (this_ScopedExpression_0= ruleScopedExpression ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )* )
        {
        // InternalPropSpecParser.g:816:2: (this_ScopedExpression_0= ruleScopedExpression ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )* )
        // InternalPropSpecParser.g:817:2: this_ScopedExpression_0= ruleScopedExpression ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )*
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_17);
        this_ScopedExpression_0=ruleScopedExpression();

        state._fsp--;
        if (state.failed) return ;
        // InternalPropSpecParser.g:828:1: ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )*
        loop58:
        do {
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==And||LA58_0==Xor||LA58_0==Or) ) {
                alt58=1;
            }


            switch (alt58) {
        	case 1 :
        	    // InternalPropSpecParser.g:828:2: () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) )
        	    {
        	    // InternalPropSpecParser.g:828:2: ()
        	    // InternalPropSpecParser.g:829:2: 
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	  /* */ 
        	      	
        	    }

        	    }

        	    // InternalPropSpecParser.g:837:2: ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) )
        	    // InternalPropSpecParser.g:838:1: ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) )
        	    {
        	    // InternalPropSpecParser.g:838:1: ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) )
        	    // InternalPropSpecParser.g:839:1: (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor )
        	    {
        	    // InternalPropSpecParser.g:839:1: (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor )
        	    int alt57=3;
        	    switch ( input.LA(1) ) {
        	    case And:
        	        {
        	        alt57=1;
        	        }
        	        break;
        	    case Or:
        	        {
        	        alt57=2;
        	        }
        	        break;
        	    case Xor:
        	        {
        	        alt57=3;
        	        }
        	        break;
        	    default:
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        NoViableAltException nvae =
        	            new NoViableAltException("", 57, 0, input);

        	        throw nvae;
        	    }

        	    switch (alt57) {
        	        case 1 :
        	            // InternalPropSpecParser.g:840:3: lv_op_2_1= And
        	            {
        	            lv_op_2_1=(Token)match(input,And,FollowSets000.FOLLOW_10); if (state.failed) return ;

        	            }
        	            break;
        	        case 2 :
        	            // InternalPropSpecParser.g:853:8: lv_op_2_2= Or
        	            {
        	            lv_op_2_2=(Token)match(input,Or,FollowSets000.FOLLOW_10); if (state.failed) return ;

        	            }
        	            break;
        	        case 3 :
        	            // InternalPropSpecParser.g:866:8: lv_op_2_3= Xor
        	            {
        	            lv_op_2_3=(Token)match(input,Xor,FollowSets000.FOLLOW_10); if (state.failed) return ;

        	            }
        	            break;

        	    }


        	    }


        	    }

        	    // InternalPropSpecParser.g:882:2: ( (lv_right_3_0= rulePSExpression ) )
        	    // InternalPropSpecParser.g:883:1: (lv_right_3_0= rulePSExpression )
        	    {
        	    // InternalPropSpecParser.g:883:1: (lv_right_3_0= rulePSExpression )
        	    // InternalPropSpecParser.g:884:3: lv_right_3_0= rulePSExpression
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getPSExpressionAccess().getRightPSExpressionParserRuleCall_0_1_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_17);
        	    lv_right_3_0=rulePSExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop58;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred13_InternalPropSpecParser

    // $ANTLR start synpred16_InternalPropSpecParser
    public final void synpred16_InternalPropSpecParser_fragment() throws RecognitionException {   
        Token lv_op_6_1=null;
        Token lv_op_6_2=null;
        Token lv_op_6_3=null;
        EObject lv_right_7_0 = null;


        // InternalPropSpecParser.g:913:2: ( () ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) ) ( (lv_right_7_0= ruleRelation ) ) )
        // InternalPropSpecParser.g:913:2: () ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) ) ( (lv_right_7_0= ruleRelation ) )
        {
        // InternalPropSpecParser.g:913:2: ()
        // InternalPropSpecParser.g:914:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // InternalPropSpecParser.g:922:2: ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) )
        // InternalPropSpecParser.g:923:1: ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) )
        {
        // InternalPropSpecParser.g:923:1: ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) )
        // InternalPropSpecParser.g:924:1: (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor )
        {
        // InternalPropSpecParser.g:924:1: (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor )
        int alt59=3;
        switch ( input.LA(1) ) {
        case And:
            {
            alt59=1;
            }
            break;
        case Or:
            {
            alt59=2;
            }
            break;
        case Xor:
            {
            alt59=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 59, 0, input);

            throw nvae;
        }

        switch (alt59) {
            case 1 :
                // InternalPropSpecParser.g:925:3: lv_op_6_1= And
                {
                lv_op_6_1=(Token)match(input,And,FollowSets000.FOLLOW_10); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalPropSpecParser.g:938:8: lv_op_6_2= Or
                {
                lv_op_6_2=(Token)match(input,Or,FollowSets000.FOLLOW_10); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalPropSpecParser.g:951:8: lv_op_6_3= Xor
                {
                lv_op_6_3=(Token)match(input,Xor,FollowSets000.FOLLOW_10); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalPropSpecParser.g:967:2: ( (lv_right_7_0= ruleRelation ) )
        // InternalPropSpecParser.g:968:1: (lv_right_7_0= ruleRelation )
        {
        // InternalPropSpecParser.g:968:1: (lv_right_7_0= ruleRelation )
        // InternalPropSpecParser.g:969:3: lv_right_7_0= ruleRelation
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPSExpressionAccess().getRightRelationParserRuleCall_1_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_7_0=ruleRelation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalPropSpecParser

    // Delegated rules

    public final boolean synpred1_InternalPropSpecParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalPropSpecParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalPropSpecParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalPropSpecParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalPropSpecParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalPropSpecParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalPropSpecParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalPropSpecParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalPropSpecParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalPropSpecParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalPropSpecParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalPropSpecParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalPropSpecParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalPropSpecParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalPropSpecParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalPropSpecParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalPropSpecParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalPropSpecParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalPropSpecParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalPropSpecParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\21\14\0\2\uffff";
    static final String dfa_3s = "\1\102\14\0\2\uffff";
    static final String dfa_4s = "\15\uffff\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\4\uffff\1\5\2\uffff\1\10\1\uffff\1\11\12\uffff\1\7\2\uffff\1\12\1\uffff\1\13\7\uffff\1\14\11\uffff\1\3\1\uffff\1\4\1\uffff\1\2\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "402:1: ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_1 = input.LA(1);

                         
                        int index5_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_2 = input.LA(1);

                         
                        int index5_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index5_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_3 = input.LA(1);

                         
                        int index5_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index5_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_4 = input.LA(1);

                         
                        int index5_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index5_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_5 = input.LA(1);

                         
                        int index5_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index5_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_6 = input.LA(1);

                         
                        int index5_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index5_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA5_7 = input.LA(1);

                         
                        int index5_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index5_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA5_8 = input.LA(1);

                         
                        int index5_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index5_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA5_9 = input.LA(1);

                         
                        int index5_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index5_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA5_10 = input.LA(1);

                         
                        int index5_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index5_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA5_11 = input.LA(1);

                         
                        int index5_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index5_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA5_12 = input.LA(1);

                         
                        int index5_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index5_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "535:1: ( ( (lv_initCond_5_0= rulePSExpression ) ) otherlv_6= EqualsSignEqualsSignGreaterThanSign )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_5 = input.LA(1);

                         
                        int index6_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_6 = input.LA(1);

                         
                        int index6_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_7 = input.LA(1);

                         
                        int index6_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA6_8 = input.LA(1);

                         
                        int index6_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA6_9 = input.LA(1);

                         
                        int index6_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA6_10 = input.LA(1);

                         
                        int index6_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA6_11 = input.LA(1);

                         
                        int index6_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA6_12 = input.LA(1);

                         
                        int index6_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\21\1\0\14\uffff";
    static final String dfa_9s = "\1\102\1\0\14\uffff";
    static final String dfa_10s = "\2\uffff\1\2\12\uffff\1\1";
    static final String dfa_11s = "\1\uffff\1\0\14\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\4\uffff\1\2\2\uffff\1\2\1\uffff\1\2\12\uffff\1\2\2\uffff\1\2\1\uffff\1\2\7\uffff\1\2\11\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "816:1: ( (this_ScopedExpression_0= ruleScopedExpression ( () ( ( (lv_op_2_1= And | lv_op_2_2= Or | lv_op_2_3= Xor ) ) ) ( (lv_right_3_0= rulePSExpression ) ) )* ) | (this_Relation_4= ruleRelation ( () ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) ) ( (lv_right_7_0= ruleRelation ) ) )* ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalPropSpecParser()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\12\uffff";
    static final String dfa_14s = "\1\1\11\uffff";
    static final String dfa_15s = "\1\30\4\uffff\3\0\2\uffff";
    static final String dfa_16s = "\1\57\4\uffff\3\0\2\uffff";
    static final String dfa_17s = "\1\uffff\1\2\7\uffff\1\1";
    static final String dfa_18s = "\5\uffff\1\0\1\1\1\2\2\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\1\uffff\1\5\1\uffff\1\7\6\uffff\1\1\1\6\2\uffff\1\1\7\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 913:1: ( () ( ( (lv_op_6_1= And | lv_op_6_2= Or | lv_op_6_3= Xor ) ) ) ( (lv_right_7_0= ruleRelation ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalPropSpecParser()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalPropSpecParser()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalPropSpecParser()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\25\uffff";
    static final String dfa_21s = "\10\uffff\1\17\1\21\1\23\3\uffff\1\17\1\uffff\1\21\3\uffff\1\23";
    static final String dfa_22s = "\1\6\5\uffff\2\75\3\14\3\uffff\1\14\1\uffff\1\14\1\uffff\1\102\1\uffff\1\14";
    static final String dfa_23s = "\1\102\5\uffff\4\102\1\57\3\uffff\1\57\1\uffff\1\57\1\uffff\1\102\1\uffff\1\57";
    static final String dfa_24s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\11\1\12\1\6\1\uffff\1\7\1\uffff\1\10\1\uffff\1\13\1\uffff";
    static final String dfa_25s = "\25\uffff}>";
    static final String[] dfa_26s = {
            "\1\3\1\uffff\1\2\5\uffff\1\4\2\uffff\1\14\4\uffff\1\14\17\uffff\1\13\2\uffff\1\6\1\uffff\1\7\10\uffff\1\1\10\uffff\1\10\1\uffff\1\11\1\uffff\1\5\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\uffff\1\11\2\uffff\1\15",
            "\1\10\1\uffff\1\11\2\uffff\1\15",
            "\1\17\21\uffff\1\15\4\uffff\1\17\3\uffff\1\17\2\uffff\1\17\4\uffff\1\17\22\uffff\1\16",
            "\1\21\21\uffff\1\15\4\uffff\1\21\3\uffff\1\21\2\uffff\1\21\4\uffff\1\21\22\uffff\1\20",
            "\1\23\21\uffff\1\15\1\22\3\uffff\1\23\3\uffff\1\23\2\uffff\1\23\4\uffff\1\23",
            "",
            "",
            "",
            "\1\17\21\uffff\1\15\4\uffff\1\17\3\uffff\1\17\2\uffff\1\17\4\uffff\1\17",
            "",
            "\1\21\21\uffff\1\15\4\uffff\1\21\3\uffff\1\21\2\uffff\1\21\4\uffff\1\21",
            "",
            "\1\24",
            "",
            "\1\23\21\uffff\1\15\4\uffff\1\23\3\uffff\1\23\2\uffff\1\23\4\uffff\1\23"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2342:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001404B2L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xA0080A400A420000L,0x0000000000000006L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001014000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0007000520000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xA0000A400A420000L,0x0000000000000006L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xA00000400A420000L,0x0000000000000006L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000A0000000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000210000000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xA000004000420000L,0x0000000000000006L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200800000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xA0100A4000424340L,0x0000000000000006L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000840800001000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000840800000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000048000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xA0100AC000424340L,0x0000000000000006L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010100000000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000040000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xA0000A0000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000002L});
    }


}