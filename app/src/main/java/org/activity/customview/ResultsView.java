

package org.activity.customview;

import java.util.List;
import org.activity.classifier.Classifier.Recognition;

public interface ResultsView {
  public void setResults(final List<Recognition> results);
}
