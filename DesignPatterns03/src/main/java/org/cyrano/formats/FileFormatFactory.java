package org.cyrano.formats;

public interface FileFormatFactory {

  public FileFormat create();

  public String getExtensionName();
}
