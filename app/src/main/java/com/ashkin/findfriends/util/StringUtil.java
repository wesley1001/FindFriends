package com.ashkin.findfriends.util;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 * String Util
 * 字符串工具类
 */
public class StringUtil {

    private static final String TAG = "StringUtil";
    private static final String ALGORITHM = "RSA";
    private static final int KEY_SIZE = 1024;

    private static StringUtil instance = null;

    /**
     * KeyPairGenerator类用于生成公钥和私钥对
     */
    private KeyPairGenerator mKeyPairGenerator = null;
    /**
     * 密钥对
     */
    private KeyPair mKeyPair;
    /**
     * 私钥
     */
    private RSAPrivateKey mRsaPrivateKey;
    /**
     * 公钥
     */
    private RSAPublicKey mRsaPublicKey;

    private StringUtil() {
        try {
            /** 根据 ALGORITHM = RSA 创建密钥对生成器 */
            mKeyPairGenerator = KeyPairGenerator.getInstance(ALGORITHM);
            /** 初始化密钥对生成器，密钥大小为 1024 位 */
            mKeyPairGenerator.initialize(KEY_SIZE);
            /** 生成密钥对 */
            mKeyPair = mKeyPairGenerator.generateKeyPair();
            /** 得到公钥 */
            mRsaPublicKey = (RSAPublicKey) mKeyPair.getPublic();
            /** 得到私钥 */
            mRsaPrivateKey = (RSAPrivateKey) mKeyPair.getPrivate();
        } catch (NoSuchAlgorithmException e) {
            LogUtil.e(TAG, "StringUtil : ALGORITHM is not available");
        } catch (NullPointerException e) {
            LogUtil.e(TAG, "StringUtil : ALGORITHM is null");
        }
    }

    public static StringUtil getInstance() {
        if (instance == null) {
            instance = new StringUtil();
        }
        return instance;
    }

    /**
     * 加密
     *
     * @param str 需要加密的字符串
     * @return 加密后的字符串
     */
    public String encrypt(String str) {
        /** 加密后的字符串 */
        String encString = null;

        if (mRsaPublicKey != null) {
            try {
                /** Cipher 负责完成加密和解密工作，基于 RSA */
                Cipher cipher = Cipher.getInstance(ALGORITHM);
                /** 根据公钥，对 Cipher 对象进行初始化 */
                cipher.init(Cipher.ENCRYPT_MODE, mRsaPublicKey);
                byte[] encBytes = cipher.doFinal(str.getBytes());
                /** 将字节数组转换，在进行输出，不经过转换会解密失败。 */
                encString = bytesToString(encBytes);

                LogUtil.i(TAG, "encrypt : encString = " + encString);
                return encString;
            } catch (NoSuchAlgorithmException e) {
                LogUtil.e(TAG, "encrypt : ALGORITHM is not available");
            } catch (NoSuchPaddingException e) {
                LogUtil.e(TAG, "encrypt : no provide the padding scheme");
            } catch (InvalidKeyException e) {
                LogUtil.e(TAG, "encrypt : the specified key can not be used to initialize this cipher instance.");
            } catch (IllegalBlockSizeException e) {
                LogUtil.e(TAG, "encrypt : the size of the resulting bytes is not a multiple of the cipher block size.");
            } catch (BadPaddingException e) {
                LogUtil.e(TAG, "encrypt : the padding of the data does not match the padding scheme.");
            } catch (IllegalStateException e) {
                LogUtil.e(TAG, "encrypt : this cipher instance is not initialized for encryption or decryption.");
            }
        }

        LogUtil.e(TAG, "encrypt : publicKey is null");
        return encString;
    }

    /**
     * 解密
     *
     * @param str 需要解密的字符串
     * @return 解密后的字符串
     */
    public String decrypt(String str) {
        String decString = null;

        if (mRsaPrivateKey != null) {
            try {
                /** Cipher 负责完成加密和解密工作，基于 RSA */
                Cipher cipher = Cipher.getInstance(ALGORITHM);
                /** 根据公钥，对 Cipher 对象进行初始化 */
                cipher.init(Cipher.DECRYPT_MODE, mRsaPrivateKey);
                /** 先将 str 进行转换，再进行解码，不经过转换会解密失败 */
                byte[] encBytes = cipher.doFinal(stringToBytes(str));
                decString = new String(encBytes);

                LogUtil.i(TAG, "decrypt : encString = " + decString);
                return decString;
            } catch (NoSuchAlgorithmException e) {
                LogUtil.e(TAG, "decrypt : ALGORITHM is not available");
            } catch (NoSuchPaddingException e) {
                LogUtil.e(TAG, "decrypt : no provide the padding scheme");
            } catch (InvalidKeyException e) {
                LogUtil.e(TAG, "decrypt : the specified key can not be used to initialize this cipher instance.");
            } catch (IllegalBlockSizeException e) {
                LogUtil.e(TAG, "decrypt : the size of the resulting bytes is not a multiple of the cipher block size.");
            } catch (BadPaddingException e) {
                LogUtil.e(TAG, "decrypt : the padding of the data does not match the padding scheme.");
            } catch (IllegalStateException e) {
                LogUtil.e(TAG, "decrypt : this cipher instance is not initialized for encryption or decryption.");
            }
        }

        LogUtil.e(TAG, "decrypt : privateKey is null");
        return decString;
    }

    /**
     * 将字节数组的每个字节之间都添加一个空格，并转成字符串输出
     *
     * @param encrytpByte 需要转化的字节数组
     * @return 转化后的字符串
     */
    private String bytesToString(byte[] encrytpByte) {
        String result = "";

        for (Byte b : encrytpByte) {
            result += b.toString() + " ";
        }

        return result;
    }

    /**
     * 将每个字节之间带有空格的字符串转成字符数组
     *
     * @param decryptString 需要转化的字符串
     * @return 转化后的字节数组
     */
    private byte[] stringToBytes(String decryptString) {
        String[] strArr = decryptString.split(" ");

        byte[] result = new byte[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            result[i] = Byte.parseByte(strArr[i]);
        }

        return result;
    }
}
