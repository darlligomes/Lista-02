����   > d
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;      makeConcatWithConstants (I)Ljava/lang/String;
      java/io/PrintStream println (Ljava/lang/String;)V
  ! " # nextInt ()I % java/lang/Exception ' "Valor inválido, tente novamente: 
  ) * + next ()Ljava/lang/String;  
  . / 0 
nextDouble ()D 2 %Valor inválido, tente com vírgula:   4  5 (IID)Ljava/lang/String; 7 Questao08_IdadeEAltura Code LineNumberTable LocalVariableTable this LQuestao08_IdadeEAltura; main ([Ljava/lang/String;)V e Ljava/lang/Exception; i I args [Ljava/lang/String; idade [I altura [D leitor Ljava/util/Scanner; StackMapTable D F H 
SourceFile Questao08_IdadeEAltura.java BootstrapMethods S
 T U V  W $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; Y "Digite a idade de indivíduo nº  [ #Digite a altura do indíviduo nº  ] *Indíviduo nº  com seus  e m de altura InnerClasses ` %java/lang/invoke/MethodHandles$Lookup b java/lang/invoke/MethodHandles Lookup ! 6           8   /     *� �    9        :        ; <   	 = >  8  �     ��
L�M� Y� 	� N6+�� a� `�   � +-�  O� :� &� -� (W��� `� ,  � ,-� -R� :� 1� -� (W������+�d6�  � `+.,1� 3  � �����  , 4 7 $ X ` c $  9   ^          	  
 ,  4  7  9  A  F  I  X  `  c  e  m  r  u 	 { # � $ � # � ' :   R  9  ? @  e  ? @   e A B  � " A B    � C D    � E F   � G H   � I J  K   , 
�   L M N   J $J $� � � !  O    P Q     R  X R  Z R  \ ^   
  _ a c 