����   A G  Students  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 
LStudents; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  Student
  		     ! out Ljava/io/PrintStream; # Enter the name :
 % ' & java/io/PrintStream ( ) println (Ljava/lang/String;)V
  + , - nextLine ()Ljava/lang/String;	  / 0 1 name Ljava/lang/String; 3 Enter the age
  5 6 7 nextInt ()I	  9 : ; age I
  = >  studentdetails args [Ljava/lang/String; sc Ljava/util/Scanner; s1 	LStudent; 
SourceFile Students.java !               /     *� �    
                    	       �     8� Y� � L� Y� M� "� $,+� *� .� 2� $,+� 4� 8,� <�    
   "           #  +  3  7          8 ? @    - A B   % C D   E    F