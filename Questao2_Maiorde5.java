����   > f
      java/lang/Object <init> ()V  java/util/ArrayList
  	      java/lang/System out Ljava/io/PrintStream;  Insira 5 números!
      java/io/PrintStream println (Ljava/lang/String;)V  java/util/Scanner	     in Ljava/io/InputStream;
      (Ljava/io/InputStream;)V
  " # $ nextInt ()I
 & ' ( ) * java/lang/Integer valueOf (I)Ljava/lang/Integer;
  , - . add (Ljava/lang/Object;)Z
 0 1 2 3 4 java/util/Collections reverseOrder ()Ljava/util/Comparator;
 0 6 7 8 sort )(Ljava/util/List;Ljava/util/Comparator;)V
  : ; < get (I)Ljava/lang/Object;   > ? @ makeConcatWithConstants &(Ljava/lang/Object;)Ljava/lang/String; B Questao2_Maiorde5 Code LineNumberTable LocalVariableTable this LQuestao2_Maiorde5; main ([Ljava/lang/String;)V i I args [Ljava/lang/String; lista Ljava/util/ArrayList; leitor Ljava/util/Scanner; LocalVariableTypeTable *Ljava/util/ArrayList<Ljava/lang/Integer;>; StackMapTable 
SourceFile Questao2_Maiorde5.java BootstrapMethods Y
 Z [ \ ? ] $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; _ O maior número dos 5 é:  InnerClasses b %java/lang/invoke/MethodHandles$Lookup d java/lang/invoke/MethodHandles Lookup ! A           C   /     *� �    D        E        F G   	 H I  C   �     L� Y� 	L� 
� � Y� � M>� +,� !� %� +W����+� /� 5� 
+� 9� =  � �    D   & 	   
       "  .  4  ;  K  E   *    J K    L L M    D N O   1 P Q  R      D N S  T    �   �   U    V W     X  ^ `   
  a c e 