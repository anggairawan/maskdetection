# Mask Detection Mobile App
  
This repository contains documents about machine learning implementation and model deployment in Android App as a final project of <a href='https://events.withgoogle.com/bangkit/'>Bangk!t Academy</a> contributed by
* [Angga Irawan,](https://github.com/anggairawan/)
* [Uswatun Hasanah.](https://github.com/hass-4n)

In this problem we work on binary classification case to classify image dataset into 'mask' or 'no-mask' class using deep learning. The Android App can work with input of static image or from live camera.  

### Dataset
We use [Mask Datasets V1](https://www.kaggle.com/ahmetfurkandemr/mask-datasets-v1/) containing datasets as follows
<p align="center"> <img src="https://github.com/anggairawan/maskdetection/blob/master/image/Screenshot%20from%202020-06-19%2016-49-15.png" alt="compositions" width="750"/> </p>

Some instances of datasets are shown as follows
<p align='center'> <img src = https://github.com/anggairawan/maskdetection/blob/master/image/Screenshot%20from%202020-06-18%2002-48-45.png width="750" alt="samples"> </p>

### Installation
The mask detection application can be used directly by installing this [APK](https://drive.google.com/drive/folders/1pwV0ALEyfCkVWgJ5fbQgEOKqmj6uroCf).

If one prefer to adapt the model and embed their own model to the APK, they could follow the following instruction.

#### Model Building
* [Baseline](https://github.com/anggairawan/maskdetection/blob/master/model/notebook/001-003-mask-baseline%20f.ipynb): A CNN model that consists of convolutional layers where in each layer it is followed by max-pooling and dropout layer. Image augmentation is also implemented here.  
* [Improved model using like MobileNetV2](https://github.com/anggairawan/maskdetection/blob/master/model/notebook/001.006%20mask-normed.ipynb): Same as baseline model but batch normalization is added in between the layer. 
* [Improved model using transfer learning (MobileNetV2)](https://github.com/anggairawan/maskdetection/blob/master/model/notebook/MaskV1_Improved2.ipynb): Transfer learning with MobileNetV2 as based model.  

NOTE: The first and second model is built in Kaggle Workspace directly while the last model is built in Google Colab. The difference is only at how the dataset is load into the notebook.

#### Embed the build model into APK

Make sure you already have [Android Studio](https://developer.android.com/studio) installed.

Clone this project to local repository

```
git clone https://github.com/anggairawan/maskdetection.git
```

Place the built model on this directory
```
..\maskdetection\app\src\main\assets
```

Change the `modelPath` and `labelPath` with your new  model and label filename

```kotlin
class ClassifierMask(
        activity: Activity?,
        device: Device?,
        numThreads: Int
) : Classifier(activity, device, numThreads) {
    override val modelPath: String
        get() = "modelbase.tflite"
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
```

Build your APK and your new model now is embedded to the APK.


### Demonstration
For model deployment we build machine learning application on mobile device by utilizing tflite model embedded in apk. 
The app is adapted from [this project](https://github.com/esafirm/bangkit-image-classifier-example).

<p align="center"> 
<img src='https://github.com/anggairawan/maskdetection/blob/master/image/WhatsApp%20Image%202020-06-19%20at%2016.35.59(4).jpeg' width="100">
<img src='https://github.com/anggairawan/maskdetection/blob/master/image/WhatsApp%20Image%202020-06-19%20at%2016.35.58(3).jpeg' width="100">
<img src='https://github.com/anggairawan/maskdetection/blob/master/image/WhatsApp%20Image%202020-06-19%20at%2016.35.59(1).jpeg' width="100">
<img src='https://github.com/anggairawan/maskdetection/blob/master/image/WhatsApp%20Image%202020-06-19%20at%2016.35.59(2).jpeg' width="100">
<img src='https://github.com/anggairawan/maskdetection/blob/master/image/WhatsApp%20Image%202020-06-19%20at%2016.35.58(1).jpeg' width="100">
<img src='https://github.com/anggairawan/maskdetection/blob/master/image/WhatsApp%20Image%202020-06-19%20at%2016.35.58.jpeg' width="100">
<img src='https://github.com/anggairawan/maskdetection/blob/master/image/WhatsApp%20Image%202020-06-19%20at%2016.35.58(2).jpeg' width="100">
</p>
