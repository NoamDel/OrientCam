

package org.activity.classifier;

import android.app.Activity;
import java.io.IOException;

/** This TensorFlow Lite classifier works with the quantized EfficientNet model. */
public class ClassifierQuantizedEfficientNet extends Classifier {

  /**
   * Initializes a {@code ClassifierQuantizedMobileNet}.
   *
   * @param device a {@link Device} object to configure the hardware accelerator
   * @param numThreads the number of threads during the inference
   * @throws IOException if the model is not loaded correctly
   */
  public ClassifierQuantizedEfficientNet(Activity activity, Device device, int numThreads)
      throws IOException {
    super(activity, device, numThreads);
  }

  @Override
  protected String getModelPath() {
    // you can download this file from
    // see build.gradle for where to obtain this file. It should be auto
    // downloaded into assets.
    return "efficientnet-lite0-int8.tflite";
  }
}
