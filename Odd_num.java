����   A 8  Odd_num  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 	LOdd_num; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   enter a number :
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I
 " , % - (I)V args [Ljava/lang/String; scanner Ljava/util/Scanner; n I i StackMapTable 
SourceFile Odd_num.java !               /     *� �    
                    	       �     6� Y� � L� � !+� '=>� p� � 
� � +����    
   & 	         
   #  &  - 
 5     *    6 . /    + 0 1    2 3    4 3  5    �    6    7