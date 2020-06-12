package com.google.firebase.ml.md.kotlin.tflite

import android.app.Activity
import org.tensorflow.lite.support.common.TensorOperator
import org.tensorflow.lite.support.common.ops.NormalizeOp

class ClassifierMask(
        activity: Activity?,
        device: Device?,
        numThreads: Int
) : Classifier(activity, device, numThreads) {
    override val modelPath: String
        get() = "modelsoftmax30epoch.tflite"
    override val labelPath: String
        get() = "labelssoftmax.txt"
    override val preprocessNormalizeOp: TensorOperator
        get() = NormalizeOp(IMAGE_MEAN, IMAGE_STD)

    override val postprocessNormalizeOp: TensorOperator
        get() = NormalizeOp(PROBABILITY_MEAN, PROBABILITY_STD)

    companion object {

        private const val IMAGE_MEAN = 127.0f
        private const val IMAGE_STD = 128.0f

        private const val PROBABILITY_MEAN = 0.0f
        private const val PROBABILITY_STD = 1.0f
    }
}