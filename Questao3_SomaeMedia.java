����   > i
      java/lang/Object <init> ()V  java/util/ArrayList
    java/util/Scanner	      java/lang/System in Ljava/io/InputStream;
 
    (Ljava/io/InputStream;)V
 
    nextInt ()I
      java/lang/Integer valueOf (I)Ljava/lang/Integer;
    ! " add (Ljava/lang/Object;)Z
  $ % & get (I)Ljava/lang/Object;
  ( )  intValue	  + , - out Ljava/io/PrintStream;   / 0 1 makeConcatWithConstants (I)Ljava/lang/String;
 3 4 5 6 7 java/io/PrintStream println (Ljava/lang/String;)V
  9 :  size  < 0 = (D)Ljava/lang/String; ? Questao3_SomaeMedia Code LineNumberTable LocalVariableTable this LQuestao3_SomaeMedia; main ([Ljava/lang/String;)V i I args [Ljava/lang/String; valores Ljava/util/ArrayList; soma leitor Ljava/util/Scanner; media D LocalVariableTypeTable *Ljava/util/ArrayList<Ljava/lang/Integer;>; StackMapTable J 
SourceFile Questao3_SomaeMedia.java BootstrapMethods Z
 [ \ ] 0 ^ $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; ` O valor da soma é:  b O valor da média é:  InnerClasses e %java/lang/invoke/MethodHandles$Lookup g java/lang/invoke/MethodHandles Lookup ! >           @   /     *� �    A        B        C D   	 E F  @       c� Y� 	L=� 
Y� � N6� $+-� � � W+� #� � '`=���ܲ *� .  � 2�+� 8�o9� *� ;  � 2�    A   .      	 
 
     *  9  ?  K  U  b  B   >   ' G H    c I J    [ K L  
 Y M H   N N O  U  P Q  R      [ K S  T    �   U  
  � &  V    W X     Y  _ Y  a c   
  d f h 