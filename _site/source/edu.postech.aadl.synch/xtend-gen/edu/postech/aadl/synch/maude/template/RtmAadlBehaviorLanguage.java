package edu.postech.aadl.synch.maude.template;

import com.google.common.base.Objects;
import com.google.common.collect.SetMultimap;
import edu.postech.aadl.synch.maude.contspec.ContFunc;
import edu.postech.aadl.synch.maude.contspec.ContSpec;
import edu.postech.aadl.synch.maude.contspec.ContSpecItem;
import edu.postech.aadl.synch.maude.contspec.ODE;
import edu.postech.aadl.synch.maude.template.RtmAadlIdentifier;
import edu.postech.aadl.synch.maude.template.RtmAadlProperty;
import java.util.Arrays;
import java.util.Iterator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.osate.aadl2.DataPort;
import org.osate.aadl2.Element;
import org.osate.aadl2.Port;
import org.osate.aadl2.Property;
import org.osate.aadl2.PropertyExpression;
import org.osate.aadl2.PropertyValue;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.ba.aadlba.AssignmentAction;
import org.osate.ba.aadlba.BehaviorAction;
import org.osate.ba.aadlba.BehaviorActionBlock;
import org.osate.ba.aadlba.BehaviorActionCollection;
import org.osate.ba.aadlba.BehaviorActionSequence;
import org.osate.ba.aadlba.BehaviorActionSet;
import org.osate.ba.aadlba.BehaviorActions;
import org.osate.ba.aadlba.BehaviorBooleanLiteral;
import org.osate.ba.aadlba.BehaviorCondition;
import org.osate.ba.aadlba.BehaviorElement;
import org.osate.ba.aadlba.BehaviorIntegerLiteral;
import org.osate.ba.aadlba.BehaviorPropertyConstant;
import org.osate.ba.aadlba.BehaviorRealLiteral;
import org.osate.ba.aadlba.BehaviorStringLiteral;
import org.osate.ba.aadlba.BehaviorTime;
import org.osate.ba.aadlba.BehaviorTransition;
import org.osate.ba.aadlba.BehaviorVariableHolder;
import org.osate.ba.aadlba.BinaryAddingOperator;
import org.osate.ba.aadlba.DataPortHolder;
import org.osate.ba.aadlba.DataSubcomponentHolder;
import org.osate.ba.aadlba.DispatchCondition;
import org.osate.ba.aadlba.ElseStatement;
import org.osate.ba.aadlba.ExecuteCondition;
import org.osate.ba.aadlba.ExecutionTimeoutCatch;
import org.osate.ba.aadlba.Factor;
import org.osate.ba.aadlba.IfStatement;
import org.osate.ba.aadlba.IndexableElement;
import org.osate.ba.aadlba.LogicalOperator;
import org.osate.ba.aadlba.MultiplyingOperator;
import org.osate.ba.aadlba.Otherwise;
import org.osate.ba.aadlba.ParameterHolder;
import org.osate.ba.aadlba.ParameterLabel;
import org.osate.ba.aadlba.PortCountValue;
import org.osate.ba.aadlba.PortFreshValue;
import org.osate.ba.aadlba.PortSendAction;
import org.osate.ba.aadlba.PropertySetPropertyReference;
import org.osate.ba.aadlba.Relation;
import org.osate.ba.aadlba.SimpleExpression;
import org.osate.ba.aadlba.SubprogramCallAction;
import org.osate.ba.aadlba.Target;
import org.osate.ba.aadlba.Term;
import org.osate.ba.aadlba.UnaryAddingOperator;
import org.osate.ba.aadlba.Value;
import org.osate.ba.aadlba.ValueConstant;
import org.osate.ba.aadlba.ValueExpression;
import org.osate.ba.aadlba.ValueVariable;
import org.osate.ba.aadlba.WhileOrDoUntilStatement;

@SuppressWarnings("all")
public class RtmAadlBehaviorLanguage extends RtmAadlIdentifier {
  public RtmAadlBehaviorLanguage(final AnalysisErrorReporterManager errMgr, final SetMultimap<String, String> opTable) {
    super(errMgr, opTable);
  }
  
  public CharSequence compileTransition(final BehaviorTransition t) {
    CharSequence _xblockexpression = null;
    {
      long _priority = t.getPriority();
      boolean _lessThan = (_priority < 0);
      this.check(t, _lessThan, "transition priorities are not supported");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      String _id = this.id(t.getSourceState(), "Location");
      _builder.append(_id);
      _builder.append(" -[ ");
      CharSequence _compileTransitionGuard = this.compileTransitionGuard(t);
      _builder.append(_compileTransitionGuard);
      _builder.append(" ]-> ");
      String _id_1 = this.id(t.getDestinationState(), "Location");
      _builder.append(_id_1);
      _builder.append(" ");
      CharSequence _compileTransitionAction = this.compileTransitionAction(t);
      _builder.append(_compileTransitionAction);
      _builder.append(")");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  /**
   * Behavior conditions
   */
  private CharSequence compileTransitionGuard(final BehaviorTransition t) {
    CharSequence _elvis = null;
    BehaviorCondition _condition = t.getCondition();
    CharSequence _compileCondition = null;
    if (_condition!=null) {
      _compileCondition=this.compileCondition(_condition);
    }
    if (_compileCondition != null) {
      _elvis = _compileCondition;
    } else {
      _elvis = "[[true]]";
    }
    return _elvis;
  }
  
  private CharSequence _compileCondition(final DispatchCondition dc) {
    String _xblockexpression = null;
    {
      this.check(dc, (Objects.equal(dc.getDispatchTriggerCondition(), null) && (!dc.isSetFrozenPorts())), "Unsupported dispatch conditions");
      _xblockexpression = "on dispatch";
    }
    return _xblockexpression;
  }
  
  private CharSequence _compileCondition(final ExecuteCondition cd) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (cd instanceof Otherwise) {
      _matched=true;
      _switchResult = "otherwise";
    }
    if (!_matched) {
      if (cd instanceof ValueExpression) {
        _matched=true;
        _switchResult = this.compileExpression(cd);
      }
    }
    if (!_matched) {
      if (cd instanceof ExecutionTimeoutCatch) {
        _matched=true;
        final Procedure1<String> _function = (String it) -> {
          this.check(cd, false, "Unsupported execute conditions");
        };
        _switchResult = ObjectExtensions.<String>operator_doubleArrow(null, _function);
      }
    }
    return _switchResult;
  }
  
  /**
   * Behavior actions
   */
  private CharSequence compileTransitionAction(final BehaviorTransition t) {
    CharSequence _elvis = null;
    BehaviorActionBlock _actionBlock = t.getActionBlock();
    CharSequence _compileAction = null;
    if (_actionBlock!=null) {
      _compileAction=this.compileAction(_actionBlock);
    }
    if (_compileAction != null) {
      _elvis = _compileAction;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("skip");
      _builder.newLine();
      _builder.append("}");
      _elvis = _builder.toString();
    }
    return _elvis;
  }
  
  private CharSequence _compileAction(final BehaviorActionBlock a) {
    CharSequence _xblockexpression = null;
    {
      BehaviorTime _timeout = a.getTimeout();
      boolean _equals = Objects.equal(_timeout, null);
      this.check(a, _equals, "timeout action not supported");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _compileAction = this.compileAction(a.getContent());
      _builder.append(_compileAction, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence _compileAction(final BehaviorActionCollection a) {
    CharSequence _xblockexpression = null;
    {
      String _switchResult = null;
      boolean _matched = false;
      if (a instanceof BehaviorActionSequence) {
        _matched=true;
        _switchResult = " ;\n";
      }
      if (!_matched) {
        if (a instanceof BehaviorActionSet) {
          _matched=true;
          _switchResult = " &\n";
        }
      }
      final String del = _switchResult;
      final Function1<BehaviorAction, CharSequence> _function = (BehaviorAction it) -> {
        return this.compileAction(it);
      };
      _xblockexpression = RtmAadlIdentifier.join(IterableExtensions.<CharSequence>filterNull(ListExtensions.<BehaviorAction, CharSequence>map(a.getActions(), _function)), del, "skip");
    }
    return _xblockexpression;
  }
  
  private CharSequence _compileAction(final IfStatement a) {
    CharSequence _xifexpression = null;
    boolean _isElif = a.isElif();
    if (_isElif) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(elsif (");
      CharSequence _compileExpression = this.compileExpression(a.getLogicalValueExpression());
      _builder.append(_compileExpression);
      _builder.append("){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _compileAction = this.compileAction(a.getBehaviorActions());
      _builder.append(_compileAction, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("})");
      _builder.newLine();
      {
        ElseStatement _elseStatement = a.getElseStatement();
        if ((_elseStatement instanceof IfStatement)) {
        } else {
          _builder.append(")");
        }
      }
      _builder.newLineIfNotEmpty();
      ElseStatement _elseStatement_1 = a.getElseStatement();
      CharSequence _compileAction_1 = null;
      if (_elseStatement_1!=null) {
        _compileAction_1=this.compileAction(_elseStatement_1);
      }
      _builder.append(_compileAction_1);
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("if (");
      CharSequence _compileExpression_1 = this.compileExpression(a.getLogicalValueExpression());
      _builder_1.append(_compileExpression_1);
      _builder_1.append("){");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      CharSequence _compileAction_2 = this.compileAction(a.getBehaviorActions());
      _builder_1.append(_compileAction_2, "\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("}");
      _builder_1.newLine();
      {
        ElseStatement _elseStatement_2 = a.getElseStatement();
        if ((_elseStatement_2 instanceof IfStatement)) {
          _builder_1.append("(");
        }
      }
      _builder_1.newLineIfNotEmpty();
      ElseStatement _elseStatement_3 = a.getElseStatement();
      CharSequence _compileAction_3 = null;
      if (_elseStatement_3!=null) {
        _compileAction_3=this.compileAction(_elseStatement_3);
      }
      _builder_1.append(_compileAction_3);
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("end if");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  private CharSequence _compileAction(final ElseStatement a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _compileAction = this.compileAction(a.getBehaviorActions());
    _builder.append(_compileAction, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  private CharSequence _compileAction(final WhileOrDoUntilStatement a) {
    CharSequence _xifexpression = null;
    boolean _isDoUntil = a.isDoUntil();
    if (_isDoUntil) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("do{");
      _builder.newLine();
      _builder.append("\t");
      CharSequence _compileAction = this.compileAction(a.getBehaviorActions());
      _builder.append(_compileAction, "\t");
      _builder.append("}");
      _builder.newLineIfNotEmpty();
      _builder.append("until (");
      CharSequence _compileExpression = this.compileExpression(a.getLogicalValueExpression());
      _builder.append(_compileExpression);
      _builder.append(")");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("while (");
      CharSequence _compileExpression_1 = this.compileExpression(a.getLogicalValueExpression());
      _builder_1.append(_compileExpression_1);
      _builder_1.append(") {");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      CharSequence _compileAction_1 = this.compileAction(a.getBehaviorActions());
      _builder_1.append(_compileAction_1, "\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("}");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  private CharSequence _compileAction(final AssignmentAction a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _compileTarget = this.compileTarget(a.getTarget());
    _builder.append(_compileTarget);
    _builder.append(" := ");
    CharSequence _compileExpression = this.compileExpression(a.getValueExpression());
    _builder.append(_compileExpression);
    _builder.append(")");
    return _builder;
  }
  
  private CharSequence _compileAction(final SubprogramCallAction a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _qualifiedId = this.qualifiedId(a.getSubprogram().getElement(), "ClassifierId");
    _builder.append(_qualifiedId);
    _builder.append(" !");
    {
      boolean _isSetParameterLabels = a.isSetParameterLabels();
      if (_isSetParameterLabels) {
        _builder.append(" (");
        final Function1<ParameterLabel, CharSequence> _function = (ParameterLabel it) -> {
          return this.compileParameter(it);
        };
        String _join = IterableExtensions.join(IterableExtensions.<CharSequence>filterNull(ListExtensions.<ParameterLabel, CharSequence>map(a.getParameterLabels(), _function)), " , ");
        _builder.append(_join);
        _builder.append(")");
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  private CharSequence _compileAction(final PortSendAction a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _escape = RtmAadlIdentifier.escape(a.getPort().getPort().getName());
    _builder.append(_escape);
    _builder.append(" !");
    {
      ValueExpression _valueExpression = a.getValueExpression();
      boolean _equals = Objects.equal(_valueExpression, null);
      if (_equals) {
      } else {
        _builder.append("(");
        CharSequence _compileExpression = this.compileExpression(a.getValueExpression());
        _builder.append(_compileExpression);
        _builder.append(")");
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  private CharSequence _compileAction(final BehaviorActions a) {
    Object _xblockexpression = null;
    {
      String _name = a.getClass().getName();
      String _plus = ("Unsupported action: " + _name);
      this.check(a, false, _plus);
      _xblockexpression = null;
    }
    return ((CharSequence)_xblockexpression);
  }
  
  private String compileTarget(final Target t) {
    String _xblockexpression = null;
    {
      this.check(t, ((!(t instanceof IndexableElement)) || (!((IndexableElement) t).isSetArrayIndexes())), "arrays not supported");
      String _switchResult = null;
      boolean _matched = false;
      if (t instanceof BehaviorVariableHolder) {
        _matched=true;
        String _escape = RtmAadlIdentifier.escape(((BehaviorVariableHolder)t).getBehaviorVariable().getName());
        String _plus = ("v{" + _escape);
        _switchResult = (_plus + "}");
      }
      if (!_matched) {
        if (t instanceof DataPortHolder) {
          _matched=true;
          String _escape = RtmAadlIdentifier.escape(((DataPortHolder)t).getDataPort().getName());
          String _plus = ("f{" + _escape);
          _switchResult = (_plus + "}");
        }
      }
      if (!_matched) {
        if (t instanceof DataSubcomponentHolder) {
          _matched=true;
          String _escape = RtmAadlIdentifier.escape(((DataSubcomponentHolder)t).getDataSubcomponent().getName());
          String _plus = ("c{" + _escape);
          _switchResult = (_plus + "}");
        }
      }
      if (!_matched) {
        if (t instanceof ParameterHolder) {
          _matched=true;
          String _escape = RtmAadlIdentifier.escape(((ParameterHolder)t).getParameter().getName());
          String _plus = ("p{" + _escape);
          _switchResult = (_plus + "}");
        }
      }
      if (!_matched) {
        final Procedure1<String> _function = (String it) -> {
          String _name = t.getClass().getName();
          String _plus = ("Unsupported action reference: " + _name);
          this.check(t, false, _plus);
        };
        _switchResult = ObjectExtensions.<String>operator_doubleArrow(null, _function);
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  private CharSequence compileParameter(final ParameterLabel p) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (p instanceof ValueExpression) {
      _matched=true;
      _switchResult = this.compileExpression(p);
    }
    if (!_matched) {
      if (p instanceof Target) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("[[");
        String _compileTarget = this.compileTarget(((Target)p));
        _builder.append(_compileTarget);
        _builder.append("]]");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  /**
   * Behavior expressions
   */
  private CharSequence _compileExpression(final ValueExpression e) {
    final Iterator<Relation> itRel = e.getRelations().iterator();
    CharSequence result = this.compileExpression(itRel.next());
    boolean _isSetLogicalOperators = e.isSetLogicalOperators();
    if (_isSetLogicalOperators) {
      final Iterator<LogicalOperator> itOp = e.getLogicalOperators().iterator();
      while (itRel.hasNext()) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        _builder.append(result);
        _builder.append(" ");
        String _literal = itOp.next().getLiteral();
        _builder.append(_literal);
        _builder.append(" ");
        CharSequence _compileExpression = this.compileExpression(itRel.next());
        _builder.append(_compileExpression);
        _builder.append(")");
        result = _builder;
      }
    }
    return result;
  }
  
  private CharSequence _compileExpression(final Relation e) {
    CharSequence _xifexpression = null;
    SimpleExpression _secondExpression = e.getSecondExpression();
    boolean _tripleEquals = (_secondExpression == null);
    if (_tripleEquals) {
      _xifexpression = this.compileExpression(e.getFirstExpression());
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      CharSequence _compileExpression = this.compileExpression(e.getFirstExpression());
      _builder.append(_compileExpression);
      _builder.append(" ");
      String _literal = e.getRelationalOperator().getLiteral();
      _builder.append(_literal);
      _builder.append(" ");
      CharSequence _compileExpression_1 = this.compileExpression(e.getSecondExpression());
      _builder.append(_compileExpression_1);
      _builder.append(")");
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  private CharSequence _compileExpression(final SimpleExpression e) {
    final Iterator<Term> itTerm = e.getTerms().iterator();
    CharSequence result = this.compileExpression(itTerm.next());
    boolean _isSetBinaryAddingOperators = e.isSetBinaryAddingOperators();
    if (_isSetBinaryAddingOperators) {
      final Iterator<BinaryAddingOperator> itOp = e.getBinaryAddingOperators().iterator();
      while (itTerm.hasNext()) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        _builder.append(result);
        _builder.append(" ");
        String _literal = itOp.next().getLiteral();
        _builder.append(_literal);
        _builder.append(" ");
        CharSequence _compileExpression = this.compileExpression(itTerm.next());
        _builder.append(_compileExpression);
        _builder.append(")");
        result = _builder;
      }
    }
    CharSequence _xifexpression = null;
    boolean _isSetUnaryAddingOperator = e.isSetUnaryAddingOperator();
    if (_isSetUnaryAddingOperator) {
      StringConcatenation _builder = new StringConcatenation();
      String _compileUnaryAddingOperator = this.compileUnaryAddingOperator(e.getUnaryAddingOperator());
      _builder.append(_compileUnaryAddingOperator);
      _builder.append("(");
      _builder.append(result);
      _builder.append(")");
      _xifexpression = _builder;
    } else {
      _xifexpression = result;
    }
    return _xifexpression;
  }
  
  private String compileUnaryAddingOperator(final UnaryAddingOperator u) {
    String _switchResult = null;
    int _value = u.getValue();
    switch (_value) {
      case UnaryAddingOperator.NONE_VALUE:
        _switchResult = "";
        break;
      case UnaryAddingOperator.PLUS_VALUE:
        _switchResult = "plus";
        break;
      case UnaryAddingOperator.MINUS_VALUE:
        _switchResult = "minus";
        break;
    }
    return _switchResult;
  }
  
  private CharSequence _compileExpression(final Term e) {
    final Iterator<Factor> itFact = e.getFactors().iterator();
    CharSequence result = this.compileExpression(itFact.next());
    boolean _isSetMultiplyingOperators = e.isSetMultiplyingOperators();
    if (_isSetMultiplyingOperators) {
      final Iterator<MultiplyingOperator> itOp = e.getMultiplyingOperators().iterator();
      while (itFact.hasNext()) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        _builder.append(result);
        _builder.append(" ");
        String _literal = itOp.next().getLiteral();
        _builder.append(_literal);
        _builder.append(" ");
        CharSequence _compileExpression = this.compileExpression(itFact.next());
        _builder.append(_compileExpression);
        _builder.append(")");
        result = _builder;
      }
    }
    return result;
  }
  
  private CharSequence _compileExpression(final Factor e) {
    CharSequence _xifexpression = null;
    boolean _isSetUnaryNumericOperator = e.isSetUnaryNumericOperator();
    if (_isSetUnaryNumericOperator) {
      StringConcatenation _builder = new StringConcatenation();
      String _literal = e.getUnaryNumericOperator().getLiteral();
      _builder.append(_literal);
      _builder.append("(");
      CharSequence _compileExpression = this.compileExpression(e.getFirstValue());
      _builder.append(_compileExpression);
      _builder.append(")");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _isSetUnaryBooleanOperator = e.isSetUnaryBooleanOperator();
      if (_isSetUnaryBooleanOperator) {
        StringConcatenation _builder_1 = new StringConcatenation();
        String _literal_1 = e.getUnaryBooleanOperator().getLiteral();
        _builder_1.append(_literal_1);
        _builder_1.append("(");
        CharSequence _compileExpression_1 = this.compileExpression(e.getFirstValue());
        _builder_1.append(_compileExpression_1);
        _builder_1.append(")");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        boolean _isSetBinaryNumericOperator = e.isSetBinaryNumericOperator();
        if (_isSetBinaryNumericOperator) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("(");
          CharSequence _compileExpression_2 = this.compileExpression(e.getFirstValue());
          _builder_2.append(_compileExpression_2);
          _builder_2.append(" ");
          String _literal_2 = e.getBinaryNumericOperator().getLiteral();
          _builder_2.append(_literal_2);
          _builder_2.append(" ");
          CharSequence _compileExpression_3 = this.compileExpression(e.getSecondValue());
          _builder_2.append(_compileExpression_3);
          _builder_2.append(")");
          _xifexpression_2 = _builder_2;
        } else {
          _xifexpression_2 = this.compileExpression(e.getFirstValue());
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private CharSequence _compileExpression(final Value e) {
    Object _xblockexpression = null;
    {
      String _name = e.getClass().getName();
      String _plus = ("Unsupported expression: " + _name);
      this.check(e, false, _plus);
      _xblockexpression = null;
    }
    return ((CharSequence)_xblockexpression);
  }
  
  private CharSequence _compileExpression(final ValueVariable e) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (e instanceof BehaviorVariableHolder) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("v[");
      String _escape = RtmAadlIdentifier.escape(((BehaviorVariableHolder)e).getBehaviorVariable().getName());
      _builder.append(_escape);
      _builder.append("]");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (e instanceof DataPortHolder) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("f[");
        String _escape = RtmAadlIdentifier.escape(((DataPortHolder)e).getDataPort().getName());
        _builder.append(_escape);
        _builder.append("]");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof DataSubcomponentHolder) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("c[");
        String _escape = RtmAadlIdentifier.escape(((DataSubcomponentHolder)e).getDataSubcomponent().getName());
        _builder.append(_escape);
        _builder.append("]");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof ParameterHolder) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("p[");
        String _escape = RtmAadlIdentifier.escape(((ParameterHolder)e).getParameter().getName());
        _builder.append(_escape);
        _builder.append("]");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof PortCountValue) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("count(");
        String _escape = RtmAadlIdentifier.escape(((PortCountValue)e).getPort().getName());
        _builder.append(_escape);
        _builder.append(")");
        final Procedure1<String> _function = (String it) -> {
          Port _port = ((PortCountValue)e).getPort();
          this.check(e, (_port instanceof DataPort), "only data port supported");
        };
        _switchResult = ObjectExtensions.<String>operator_doubleArrow(_builder.toString(), _function);
      }
    }
    if (!_matched) {
      if (e instanceof PortFreshValue) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("fresh(");
        String _escape = RtmAadlIdentifier.escape(((PortFreshValue)e).getPort().getName());
        _builder.append(_escape);
        _builder.append(")");
        final Procedure1<String> _function = (String it) -> {
          Port _port = ((PortFreshValue)e).getPort();
          this.check(e, (_port instanceof DataPort), "only data port supported");
        };
        _switchResult = ObjectExtensions.<String>operator_doubleArrow(_builder.toString(), _function);
      }
    }
    if (!_matched) {
      final Procedure1<CharSequence> _function = (CharSequence it) -> {
        String _name = e.getClass().getName();
        String _plus = ("Unsupported expression reference: " + _name);
        this.check(e, false, _plus);
      };
      _switchResult = ObjectExtensions.<CharSequence>operator_doubleArrow(null, _function);
    }
    return _switchResult;
  }
  
  private CharSequence _compileExpression(final ValueConstant e) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (e instanceof BehaviorBooleanLiteral) {
      _matched=true;
      String _xifexpression = null;
      boolean _isValue = ((BehaviorBooleanLiteral)e).isValue();
      if (_isValue) {
        _xifexpression = "[[true]]";
      } else {
        _xifexpression = "[[false]]";
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      if (e instanceof BehaviorStringLiteral) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("[[\"");
        String _value = ((BehaviorStringLiteral)e).getValue();
        _builder.append(_value);
        _builder.append("\"]]");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof BehaviorRealLiteral) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("[[");
        double _value = ((BehaviorRealLiteral)e).getValue();
        _builder.append(_value);
        _builder.append("]]");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof BehaviorIntegerLiteral) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("[[");
        long _value = ((BehaviorIntegerLiteral)e).getValue();
        _builder.append(_value);
        _builder.append("]]");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (e instanceof PropertySetPropertyReference) {
        _matched=true;
        _switchResult = this.compilePropertySetPropertyReference(((PropertySetPropertyReference)e));
      }
    }
    if (!_matched) {
      if (e instanceof BehaviorPropertyConstant) {
        _matched=true;
        _switchResult = this.compilePropertyConstant(((BehaviorPropertyConstant)e));
      }
    }
    if (!_matched) {
      final Procedure1<CharSequence> _function = (CharSequence it) -> {
        String _name = e.getClass().getName();
        String _plus = ("Unsupported expression constant: " + _name);
        this.check(e, false, _plus);
      };
      _switchResult = ObjectExtensions.<CharSequence>operator_doubleArrow(null, _function);
    }
    return _switchResult;
  }
  
  private CharSequence compilePropertySetPropertyReference(final PropertySetPropertyReference c) {
    CharSequence _xblockexpression = null;
    {
      final Element value = c.getProperties().get(0).getProperty().getElement();
      CharSequence _xifexpression = null;
      if ((value instanceof Property)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("[[");
        String _escape = RtmAadlIdentifier.escape(((Property)value).getQualifiedName());
        _builder.append(_escape);
        _builder.append("]]");
        _xifexpression = _builder;
      } else {
        final Procedure1<CharSequence> _function = (CharSequence it) -> {
          String _name = c.getClass().getName();
          String _plus = ("Unsupported property reference : " + _name);
          this.check(c, false, _plus);
        };
        _xifexpression = ObjectExtensions.<CharSequence>operator_doubleArrow(
          null, _function);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private CharSequence compilePropertyConstant(final BehaviorPropertyConstant c) {
    CharSequence _xblockexpression = null;
    {
      final PropertyExpression value = c.getProperty().getConstantValue();
      CharSequence _xifexpression = null;
      if ((value instanceof PropertyValue)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("[[");
        CharSequence _compilePropertyValue = RtmAadlProperty.compilePropertyValue(((PropertyValue) value));
        _builder.append(_compilePropertyValue);
        _builder.append("]]");
        _xifexpression = _builder;
      } else {
        final Procedure1<CharSequence> _function = (CharSequence it) -> {
          String _name = c.getClass().getName();
          String _plus = ("Unsupported property constant: " + _name);
          this.check(c, false, _plus);
        };
        _xifexpression = ObjectExtensions.<CharSequence>operator_doubleArrow(
          null, _function);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Continuous Dynamics expressions
   */
  public CharSequence compileContSpec(final ContSpec spec) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<ContSpecItem, CharSequence> _function = (ContSpecItem it) -> {
      return this.compileContSpecItem(it);
    };
    String _join = IterableExtensions.join(IterableExtensions.<CharSequence>filterNull(ListExtensions.<ContSpecItem, CharSequence>map(spec.getItems(), _function)), " ; ");
    _builder.append(_join);
    return _builder;
  }
  
  private CharSequence _compileContSpecItem(final ODE item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(d/dt[");
    ValueVariable _target = item.getTarget();
    String _escape = RtmAadlIdentifier.escape(((DataSubcomponentHolder) _target).getDataSubcomponent().getName());
    _builder.append(_escape);
    _builder.append("] = ");
    CharSequence _compileExpression = this.compileExpression(item.getExpression());
    _builder.append(_compileExpression);
    _builder.append(")");
    return _builder;
  }
  
  private CharSequence _compileContSpecItem(final ContFunc item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    ValueVariable _target = item.getTarget();
    String _escape = RtmAadlIdentifier.escape(((DataSubcomponentHolder) _target).getDataSubcomponent().getName());
    _builder.append(_escape);
    _builder.append("(");
    ValueVariable _param = item.getParam();
    String _escape_1 = RtmAadlIdentifier.escape(((BehaviorVariableHolder) _param).getBehaviorVariable().getName());
    _builder.append(_escape_1);
    _builder.append(") = ");
    CharSequence _compileExpression = this.compileExpression(item.getExpression());
    _builder.append(_compileExpression);
    _builder.append(")");
    return _builder;
  }
  
  private CharSequence compileCondition(final BehaviorCondition dc) {
    if (dc instanceof DispatchCondition) {
      return _compileCondition((DispatchCondition)dc);
    } else if (dc instanceof ExecuteCondition) {
      return _compileCondition((ExecuteCondition)dc);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(dc).toString());
    }
  }
  
  private CharSequence compileAction(final BehaviorActions a) {
    if (a instanceof IfStatement) {
      return _compileAction((IfStatement)a);
    } else if (a instanceof PortSendAction) {
      return _compileAction((PortSendAction)a);
    } else if (a instanceof SubprogramCallAction) {
      return _compileAction((SubprogramCallAction)a);
    } else if (a instanceof WhileOrDoUntilStatement) {
      return _compileAction((WhileOrDoUntilStatement)a);
    } else if (a instanceof AssignmentAction) {
      return _compileAction((AssignmentAction)a);
    } else if (a instanceof ElseStatement) {
      return _compileAction((ElseStatement)a);
    } else if (a instanceof BehaviorActionBlock) {
      return _compileAction((BehaviorActionBlock)a);
    } else if (a instanceof BehaviorActionCollection) {
      return _compileAction((BehaviorActionCollection)a);
    } else if (a != null) {
      return _compileAction(a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a).toString());
    }
  }
  
  private CharSequence compileExpression(final BehaviorElement e) {
    if (e instanceof ValueExpression) {
      return _compileExpression((ValueExpression)e);
    } else if (e instanceof ValueConstant) {
      return _compileExpression((ValueConstant)e);
    } else if (e instanceof ValueVariable) {
      return _compileExpression((ValueVariable)e);
    } else if (e instanceof Factor) {
      return _compileExpression((Factor)e);
    } else if (e instanceof Relation) {
      return _compileExpression((Relation)e);
    } else if (e instanceof SimpleExpression) {
      return _compileExpression((SimpleExpression)e);
    } else if (e instanceof Term) {
      return _compileExpression((Term)e);
    } else if (e instanceof Value) {
      return _compileExpression((Value)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
  
  private CharSequence compileContSpecItem(final ContSpecItem item) {
    if (item instanceof ContFunc) {
      return _compileContSpecItem((ContFunc)item);
    } else if (item instanceof ODE) {
      return _compileContSpecItem((ODE)item);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(item).toString());
    }
  }
}
