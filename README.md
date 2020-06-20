# Mask Detection Mobile App
  
This repository contains documents about machine learning implementation and model deployment in Android App as a final project of <a href='https://events.withgoogle.com/bangkit/'>Bangk!t Academy</a> contributed by
* [Angga Irawan,](https://github.com/anggairawan/)
* [Uswatun Hasanah.](https://github.com/hass-4n)

In this problem we work on binary classification case to classify image dataset into 'mask' or 'no-mask' class using deep learning.

### Dataset
We use [Mask Datasets V1](https://www.kaggle.com/ahmetfurkandemr/mask-datasets-v1/) containing datasets as follows
<p align="center"> <img src="https://github.com/anggairawan/maskdetection/blob/master/image/Screenshot%20from%202020-06-19%2016-49-15.png" alt="compositions" width="750"/> </p>.

Some instances of datasets are shown as follows
<p align='center'> <img src = https://github.com/anggairawan/maskdetection/blob/master/image/Screenshot%20from%202020-06-18%2002-48-45.png width="750" alt="samples"> </p>

### Model Building
* [Baseline](https://colab.research.google.com/drive/1eslkolHfvmGBPteIXxl4_1BCPYx67nJx?usp=sharing)
* [Improved model using like MobileNetV2](https://colab.research.google.com/drive/1eslkolHfvmGBPteIXxl4_1BCPYx67nJx?usp=sharing)
* [Improved model using transfer learning (MobileNetV2)](https://colab.research.google.com/drive/1eslkolHfvmGBPteIXxl4_1BCPYx67nJx?usp=sharing)
<br>The tflite model using MobileNetV2 can be obtained by running this [notebook](https://colab.research.google.com/drive/1eslkolHfvmGBPteIXxl4_1BCPYx67nJx?usp=sharing).

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
