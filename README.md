<p align="center"> <img src="https://github.com/anggairawan/maskdetection/blob/master/image/Screen%20Shot%202020-02-19%20at%2014.14.57.png width="750"></p>

# Mask Detection Mobile App
  
This repository contains documents about machine learning implementation and model deployment as a final project of <a href='https://events.withgoogle.com/bangkit/'>Bangk!t Academy</a> contributed by
* [Angga Irawan](https://github.com/anggairawan/)
* [Uswatun Hasanah](https://github.com/hass-4n)

In this problem we work on binary classification case to classify image dataset into 'mask' or 'no-mask' class using deep learning.

### Dataset
We use [Mask Datasets V1](https://www.kaggle.com/ahmetfurkandemr/mask-datasets-v1/) containing datasets as follow
<p align="center"> <img src="https://github.com/anggairawan/maskdetection/blob/master/image/Screenshot%20from%202020-06-19%2016-49-15.png" alt="compositions" width="750"/> </p>.

Some instances of datasets are shown as follows
<p align='center'> <img src = https://github.com/anggairawan/maskdetection/blob/master/image/Screenshot%20from%202020-06-18%2002-48-45.png width="750" alt="samples"> </p>

### Model Building
* [Baseline](https://colab.research.google.com/drive/1eslkolHfvmGBPteIXxl4_1BCPYx67nJx?usp=sharing)
* [Improved model using like MobileNetV2](https://colab.research.google.com/drive/1eslkolHfvmGBPteIXxl4_1BCPYx67nJx?usp=sharing)
* [Improved model using transfer learning (MobileNetV2)](https://colab.research.google.com/drive/1eslkolHfvmGBPteIXxl4_1BCPYx67nJx?usp=sharing)

### Demonstration
This app demonstrates how to build machine learning application on mobile device by utilising tflite model embedded in apk. 
The app is adapted from [this project](https://github.com/esafirm/bangkit-image-classifier-example).

The tflite model and label can be obtained by running this [notebook](https://colab.research.google.com/drive/1eslkolHfvmGBPteIXxl4_1BCPYx67nJx?usp=sharing)
