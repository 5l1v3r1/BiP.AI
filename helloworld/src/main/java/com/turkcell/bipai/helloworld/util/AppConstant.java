package com.turkcell.bipai.helloworld.util;

public interface AppConstant {
	
	// -------------------- Kullanıcı bilgileri --------------------

	public static final String 	USER 					= 	"user"; 			  // Bu alanı kendi BiP Developer API kullanıcı adınız ile değiştirin.
	public static final String 	PASS 					= 	"pass";    			  // Bu alanı kendi BiP Developer API şifreniz ile değiştirin.
	public static final	Integer USER_NUMBER_TYPE		=	0;				  	  // Servisiniz takipçilerin telefon numaralarını opaque(karıştırılmış) adres olarak
																			      // gördüğünü ifade eder. Varsayılan değerdir. Eğer servisiniz takipçinin 
																			      // Açık numarasını(MSISDN) yetkisi varsa bu değer 2 olmalı.

	// -------------------- API URI  bilgileri --------------------
	public static final String 	TES_BASE_URI 			= 	"https://tims.turkcell.com.tr/tes/rest/spi";
	public static final String 	SINGLE_USER 			= 	TES_BASE_URI + "/sendmsgserv";
	public static final String 	MULTI_USER 				= 	TES_BASE_URI + "/sendmultiusermulticontent";
	public static final String 	MULTI_USER_LIST 		= 	TES_BASE_URI + "/sendmsgservlist";
	public static final String 	FTS_URI					=	"http://timsac.turkcell.com.tr/fts/rest/file/upload";
	
	// -------------------- Medya Tip bilgileri --------------------
	public static final String	PHOTO_TYPE				=	"P";
	public static final String 	VIDEO_TYPE				=	"V";
	
	// -------------------- RMM Tip  bilgileri --------------------
	public static final Integer SINGLE_RMM				=	0;
	public static final Integer MULTI_RMM				=	1;
	public static final Integer POLL_RMM				=	2;
	
}
