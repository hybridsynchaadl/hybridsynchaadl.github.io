package edu.postech.aadl.synch.maude.template;

import com.google.common.collect.SetMultimap;
import java.util.List;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;

@SuppressWarnings("all")
public class RtmAadlIdentifier {
  private final AnalysisErrorReporterManager errMgr;
  
  private final SetMultimap<String, String> opTable;
  
  public RtmAadlIdentifier(final AnalysisErrorReporterManager errMgr, final SetMultimap<String, String> opTable) {
    this.errMgr = errMgr;
    this.opTable = opTable;
  }
  
  public CharSequence generateIds() {
    StringConcatenation _builder = new StringConcatenation();
    {
      Set<String> _keySet = this.opTable.keySet();
      for(final String key : _keySet) {
        _builder.append("ops ");
        String _join = IterableExtensions.join(this.opTable.get(key), " ");
        _builder.append(_join);
        _builder.append(" : -> ");
        _builder.append(key);
        _builder.append(" [ctor] .");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("ops loopBoundNum transBoundNum : -> Nat .");
    _builder.newLine();
    return _builder;
  }
  
  public Set<String> getIdsOfType(final String sort) {
    return this.opTable.get(sort);
  }
  
  public Boolean check(final Element obj, final boolean cond, final String msg) {
    final Procedure1<Boolean> _function = (Boolean it) -> {
      if ((!cond)) {
        this.errMgr.error(obj, msg);
      }
    };
    return ObjectExtensions.<Boolean>operator_doubleArrow(Boolean.valueOf(cond), _function);
  }
  
  public String id(final String id, final String sort) {
    String _escape = RtmAadlIdentifier.escape(id);
    final Procedure1<String> _function = (String it) -> {
      this.opTable.put(sort, it);
    };
    return ObjectExtensions.<String>operator_doubleArrow(_escape, _function);
  }
  
  public String id(final NamedElement ne, final String sort) {
    return this.id(ne.getName(), sort);
  }
  
  public String qualifiedId(final NamedElement ne, final String sort) {
    return this.id(ne.getQualifiedName(), sort);
  }
  
  /**
   * static auxiliary methods
   */
  public static String escape(final String name) {
    return name.replaceAll("_", "");
  }
  
  public static String path(final String path, final Function1<? super String, ? extends String> esp) {
    final Function1<String, String> _function = (String it) -> {
      return esp.apply(it);
    };
    return IterableExtensions.join(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(path.split("\\."))), _function), " . ");
  }
  
  public static CharSequence join(final Iterable<?> iterable, final CharSequence separator, final CharSequence empty) {
    CharSequence _xifexpression = null;
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(iterable);
    if (_isNullOrEmpty) {
      _xifexpression = empty;
    } else {
      _xifexpression = IterableExtensions.join(iterable, separator);
    }
    return _xifexpression;
  }
  
  public boolean isVarId(final String vid) {
    Set<String> _get = this.opTable.get("VarId");
    for (final String v : _get) {
      boolean _equals = vid.equals(v);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
}
