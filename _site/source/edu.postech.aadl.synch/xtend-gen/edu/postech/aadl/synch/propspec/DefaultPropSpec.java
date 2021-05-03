package edu.postech.aadl.synch.propspec;

import java.util.Arrays;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.osate.aadl2.instance.SystemInstance;

@SuppressWarnings("all")
public class DefaultPropSpec {
  public static CharSequence deGenerate(final SystemInstance model, final IFile modelFile) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("name: ");
    String _name = model.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("model: ");
    CharSequence _escape = DefaultPropSpec.escape(model.getName());
    _builder.append(_escape);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("instance: \"");
    IPath _fullPath = modelFile.getFullPath();
    _builder.append(_fullPath);
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence escape(final String name) {
    CharSequence _xblockexpression = null;
    {
      List<String> namespace = Arrays.<String>asList(name.split("_"));
      StringConcatenation _builder = new StringConcatenation();
      String _get = namespace.get(0);
      _builder.append(_get);
      _builder.append("::");
      String _get_1 = namespace.get(0);
      _builder.append(_get_1);
      _builder.append(".");
      String _get_2 = namespace.get(1);
      _builder.append(_get_2);
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
